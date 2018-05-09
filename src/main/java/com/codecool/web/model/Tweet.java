package com.codecool.web.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class Tweet {

    private String timestamp;
    private String poster;
    private String content;


    public Tweet(String poster, String content) {
        this.timestamp = getFormattedDate();
        this.poster = poster;
        this.content = content;
    }

    private String getFormattedDate() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy. MM. dd. HH:mm:ss");
        return dateFormat.format(date);

    }

    public Tweet() {
    }

    public String getPoster() {
        return poster;
    }

    public String getContent() {
        return content;
    }

    public String getTimestamp() {
        return timestamp;
    }


    @Override
    public String toString() {
        return "Tweet by " + poster + '\'' +
                ", at" + timestamp + '\'' +
                " Content:" + content + '\'';
    }
}
