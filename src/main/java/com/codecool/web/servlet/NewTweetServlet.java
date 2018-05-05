package com.codecool.web.servlet;

import com.codecool.web.model.Tweet;
import com.codecool.web.service.TweetingService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/joskapista")
public class NewTweetServlet extends HttpServlet {

    private final TweetingService service = new TweetingService(); //service.getInstance
    private List<Tweet> tweets = service.getTweets();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("tweets", tweets);

        Tweet newTweet;
        newTweet = service.getTweet(req.getParameter("id"), req.getParameter("timestamp"), req.getParameter("poster"), req.getParameter("content"));
        service.getTweets().add(newTweet);
        if (req.getParameter("poster").equals("") || req.getParameter("content").equals("")) {
            req.setAttribute("message", "Content or poster cannot be empty!");
        } else {
            req.setAttribute("message", "Your tweet has been created");
        }
        req.getRequestDispatcher("/tweet.jsp").forward(req, resp);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("tweets", tweets);
        req.getRequestDispatcher("/tweet.jsp").forward(req, resp);
    }
}
