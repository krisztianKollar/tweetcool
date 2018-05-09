package com.codecool.web.service;


import com.codecool.web.model.Tweet;

import java.util.ArrayList;
import java.util.List;

public final class TweetingService {

    private static final TweetingService Instance = new TweetingService();
    private List<Tweet> tweets = new ArrayList<>();
    private Tweet myTweet = new Tweet();

    public List<Tweet> getTweets() {
        return tweets;
    }

    public Tweet getTweet(String poster, String content) {
        return new Tweet(poster, content);
    }

    public Tweet createTweet(String poster, String content) throws TweetException {
        getTweet(poster, content);

        System.out.println(poster);
        System.out.println(content);

        if (poster.equals("") || content.equals("")) {
            throw new TweetException("Poster or content cannot be empty!");
        } else {
            return new Tweet(poster, content);
        }
    }

    public void addTweet() {
        tweets.add(myTweet);
    }

    public static TweetingService getInstance() {
        return Instance;
    }
}
