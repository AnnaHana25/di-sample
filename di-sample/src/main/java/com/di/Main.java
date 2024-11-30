package com.di;

import java.util.List;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    
        public static void main(String[] args) {
            // Створення модуля для Guice
            Injector injector = Guice.createInjector(new AppModule());
    
            // Створення продюсера та глядача через Guice
            Producer producer = injector.getInstance(Producer.class);
            producer.setUsername("Producer1");
    
            Viewer viewer = injector.getInstance(Viewer.class);
            viewer.setUsername("Viewer1");
    
            // Налаштування залежностей
            producer.setContentManagementSystem(injector.getInstance(ContentManagementSystem.class));
            viewer.setRecommendationEngine(injector.getInstance(RecommendationEngine.class));
    

            // Завантаження та перегляд відео
            Video video = new Video();
            video.setTitle("My First Video");
            producer.uploadVideo(video);
            producer.paycheck(
                new Paycheck(1000.0, "2024-11-30")
            );
            viewer.watchVideo(video);
    
            // Глядач оцінює відео
            viewer.evaluateVideo(video, 5);
    
            // Продюсер редагує метадані відео
            producer.editVideoMetadata(video, "My First Video - Edited");
    
            // Вивід рекомендацій для глядача
            List<Video> recommendations = viewer.getRecommendations();
            System.out.println("Recommendations for Viewer:");
            for (Video rec : recommendations) {
                System.out.println(rec.getTitle());
            }
    
            producer.manageContent();
        }
        }
