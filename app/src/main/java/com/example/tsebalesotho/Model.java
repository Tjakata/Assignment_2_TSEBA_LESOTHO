package com.example.tsebalesotho;

public class Model {
    private String title, description;
    private int image;

    public Model (int imageResource, String text1, String text2){
        image = imageResource;
        title = text1;
        description = text2;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

}
