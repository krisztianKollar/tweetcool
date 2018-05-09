<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tweets</title>
</head>
<body>
<h2>Tweets on TweetCool Beta</h2>

<c:choose>
    <c:when test="${tweets.size() == 0}">
        We have no tweets. You can create one on the previous page.
        <br />
    </c:when>
    <c:otherwise>
        <c:forEach var="tweet" items="${tweets}">
            <p>Posted by <c:out value="${tweet.poster}"/><br>at <c:out value="${tweet.timestamp}" /><br>Content: <c:out value="${tweet.content}"/><br><p>
        </c:forEach>
        <br />
    </c:otherwise>
</c:choose>


<p> If you want to filter the tweets, please type your filter (name/content)</p>
<div class="center">
    <form action="filtered-tweet" method="get">

        You can filter by a chosen poster:<br>
        <input type="text" id="filter" name="filter" placeholder="Please enter your filter"><br><br>
        <input type="submit" value="FILTER"><br><br>
    </form>
</div>

<a href="index.jsp">Go back to the <em>tweet</em> page.</a>
</body>
</html>
