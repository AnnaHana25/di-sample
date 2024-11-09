package com.di;

import java.util.List;

public class Viewer extends User {
    private final RecommendationEngine recommendationEngine;

    // Впровадження залежності через конструктор
    public Viewer(RecommendationEngine recommendationEngine) {
        this.recommendationEngine = recommendationEngine;
    }

    @Override
    public void displayInfo() {
        System.out.println("Viewer: " + username);
    }

    public void watchVideo(Video video) {
        video.play();
        System.out.println(username + " is watching the video.");
    }

    public void evaluateVideo(Video video, int rating) {
        video.rate(rating);
        System.out.println(username + " rated the video with " + rating + " stars.");
    }

    public List<Video> getRecommendations() {
        return recommendationEngine.generateRecommendations(this);
    }
}