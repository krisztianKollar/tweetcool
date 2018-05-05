package com.codecool.web.service;


import com.codecool.web.model.Tweet;

import java.util.ArrayList;
import java.util.List;

public final class TweetingService {

    private static final TweetingService Instance = new TweetingService();
    private List<Tweet> tweets = new ArrayList<>();

    public List<Tweet> getTweets() {
        return tweets;
    }

    public Tweet getTweet(String id, String timestamp, String poster, String content) {
        return new Tweet(id, timestamp, poster, content);
    }


}
