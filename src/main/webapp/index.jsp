<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Index</title>
</head>
<body>
<h2>Hi there! This is TweetCool Beta!</h2>

<p> Do you want to make a tweet?</p>
<div class="center">
    <form action="new-tweet" method="post">
        <input type="text" id="poster" name="poster" placeholder="Please enter your name"><br><br>
        <input type="text" id="content" name="content" placeholder="Please enter your tweet here"><br><br>
        <input type="submit" value="SEND"><br><br>
    </form>

    <c:if test="${tweet.poster == '' || tweet.content == ''}">
        <p>Poster or content cannot be empty! Please try again!</p>
        <br>
    </c:if>
    <a href="new-tweet">Go to read the <em>tweets</em>.</a>
</div>
</body>
</html>
