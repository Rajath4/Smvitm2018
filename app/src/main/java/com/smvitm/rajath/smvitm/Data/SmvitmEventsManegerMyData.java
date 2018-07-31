package com.smvitm.rajath.smvitm.Data;


public class SmvitmEventsManegerMyData {

    private int id;
    private String description,image_link,title;

    public SmvitmEventsManegerMyData(int id, String title, String description, String image_link) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.image_link = image_link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage_link() {
        return image_link;
    }

    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
