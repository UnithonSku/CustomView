package com.example.student.customview;

import android.graphics.drawable.Drawable;

/**
 * Created by student on 2018-01-15.
 */

public class ItemDTO {
    String title,writer;
    Drawable icon;
    public void setTitle(String title){
        this.title = title;
    }

    public void setIcon(Drawable icon){
        this.icon = icon;
    }

    public void setWriter(String writer){
        this.writer = writer;
    }
    public String getTitle(){
        return title;
    }
    public String getWriter(){
        return writer;
    }
    public Drawable getIcon(){
        return icon;
    }
}
