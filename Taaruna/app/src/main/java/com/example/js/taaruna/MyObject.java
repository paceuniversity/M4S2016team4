package com.example.js.taaruna;

import android.content.Context;

/**
 * Created by ADMIN on 11/08/2016.
 */

public class MyObject {
    private String text;
    private String imageUrl;
    private String rubrique;

    public MyObject(String text, String imageUrl, String rubrique) {
        this.text = text;
        this.imageUrl = imageUrl;
        this.rubrique=rubrique;
    }

    public String getText() {
        return text;
    }
    public String getRubrique() {
        return rubrique;
    }

    public void setRubrique(String rubrique) {
        this.rubrique = rubrique;
    }


    public void setText(String text) {
        this.text = text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public int getImageResourceId(Context context) {
        return context.getResources().getIdentifier(this.text, "drawable", context.getPackageName());
    }

}
