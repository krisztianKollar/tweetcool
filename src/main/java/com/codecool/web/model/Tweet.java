package com.codecool.web.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class Tweet {

    private String id;
    private String poster;
    private String content;


    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    private String timestamp = dateFormat.format(new Date());



    public Tweet(String id, String timestamp, String poster, String content) {
        this.id = id;
        this.timestamp = timestamp;
        this.poster = poster;
        this.content = content;
    }

    public String getPoster() {
        return poster;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "poster='" + poster + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
