package com.di;

import com.google.inject.Inject;

public class Producer extends User {
    private ContentManagementSystem cms;

    // Закоментуваний конструктор
    // public Producer(ContentManagementSystem cms) {
    //     this.cms = cms;
    // }

    // Закоментуваний конструктор впроваджений через Guice
    // @Inject
    // public Producer(ContentManagementSystem cms) {
    //     this.cms = cms;
    // }

    // Доданий setter для впровадження залежності
    @Inject
    public void setContentManagementSystem(ContentManagementSystem cms) {
        this.cms = cms;
    }

    @Override
    public void displayInfo() {
        System.out.println("Producer: " + username);
    }

    public void uploadVideo(Video video) {
        System.out.println(username + " uploaded a new video: " + video.getTitle());
    }

    public void editVideoMetadata(Video video, String newTitle) {
        video.setTitle(newTitle);
        System.out.println(username + " edited the video title to: " + newTitle);
    }

    public void manageContent() {
        cms.manageContent();
    }
}
