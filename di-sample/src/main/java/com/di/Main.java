package com.di;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення залежностей
        ContentManagementSystem cms = new ContentManagementSystem();
        RecommendationEngine recommendationEngine = new RecommendationEngine();

        // Впровадження залежностей через конструктор
        Producer producer = new Producer(cms);
        producer.setUsername("Producer1");

        Viewer viewer = new Viewer(recommendationEngine);
        viewer.setUsername("Viewer1");

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
