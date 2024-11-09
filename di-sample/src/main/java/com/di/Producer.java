package com.di;

public class Producer extends User {
    private final ContentManagementSystem cms;

    // Впровадження залежності через конструктор
    public Producer(ContentManagementSystem cms) {
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
