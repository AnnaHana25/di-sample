package com.di;

import java.util.ArrayList;
import java.util.List;

public class RecommendationEngine {
    public List<Video> generateRecommendations(Viewer viewer) {
        // Simulated recommendations
        List<Video> recommendations = new ArrayList<>();
        recommendations.add(new Video() {{
            setTitle("Recommended Video 1");
        }});
        recommendations.add(new Video() {{
            setTitle("Recommended Video 2");
        }});
        return recommendations;
    }
}
