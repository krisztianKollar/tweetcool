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
<h2>Tweets on Tweetcool Beta</h2>
<c:forEach var="tweet" items="${tweets}">
    <p><c:out value="${tweet.poster}"/>: <c:out value="${tweet.content}"/><p>
</c:forEach>

<a href="index.html">Go back to the <em>tweet</em> page.</a>
</body>
</html>
