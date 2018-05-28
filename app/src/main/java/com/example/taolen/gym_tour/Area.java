package com.example.taolen.gym_tour;

/**
 * Created by taoLen on 5/28/2018.
 */

public class Area {
    private String title;
    private String description;
    private int imageResourceId;
    public Area (String title, String description, int imageResourceId) {
        this.title = title;
        this.description = description;
        this.imageResourceId = imageResourceId;}
    public String getTitle() {return title;}
    public String getDescription() {return description;}
    public int getImageResourceId() {return imageResourceId;}
}
