package com.di;

public class Video implements IPlayable {
    private String title = "";
    private int rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + title);
    }

    @Override
    public void rate(int rating) {
        this.rating = rating;
        System.out.println("Video rated with " + rating + " stars.");
    }

    public int getRating() {
        return rating;
    }
}
