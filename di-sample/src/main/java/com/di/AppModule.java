package com.di;

import com.google.inject.AbstractModule;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        // Вказуємо, як повинні бути впроваджені залежності
        bind(RecommendationEngine.class).toInstance(new RecommendationEngine());
        bind(ContentManagementSystem.class).toInstance(new ContentManagementSystem());
    }
}
