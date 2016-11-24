package com.example.s2012059.to_do_list;

/**
 * Created by s2012059 on 19/11/2016.
 */
public class ToDoItem {
    private String text;
    private String date;

    public ToDoItem(String text, String date) {
        this.text = text;
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
