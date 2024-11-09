package com.di;

import java.util.List;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        // Створення модуля для Guice
        Injector injector = Guice.createInjector(new AppModule());

        // Отримання об'єктів через Guice
        Producer producer = injector.getInstance(Producer.class);
        producer.setUsername("Producer1");

        Viewer viewer = injector.getInstance(Viewer.class);
        viewer.setUsername("Viewer1");

        // Впровадження залежностей через метод setter
        producer.setContentManagementSystem(injector.getInstance(ContentManagementSystem.class));
        viewer.setRecommendationEngine(injector.getInstance(RecommendationEngine.class));

        Video video = new Video();
        video.setTitle("My First Video");

        // Використання методів
        producer.uploadVideo(video);
        viewer.watchVideo(video);
        viewer.evaluateVideo(video, 5);
        producer.editVideoMetadata(video, "My First Video - Edited");

        List<Video> recommendations = viewer.getRecommendations();
        System.out.println("Recommendations for Viewer:");
        for (Video rec : recommendations) {
            System.out.println(rec.getTitle());
        }

        // Використання класу ContentManagementSystem
        producer.manageContent();
    }
}
