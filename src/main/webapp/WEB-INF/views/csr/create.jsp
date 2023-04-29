<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/static/reset.css"/>" rel="stylesheet">
    <script
            src="https://code.jquery.com/jquery-3.6.4.min.js"
            integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8="
            crossorigin="anonymous"></script>
    <link href="<c:url value="/static/board/board.css"/>" rel="stylesheet">
    <script src="<c:url value="/static/board/create.js"/>"></script>
    <title>Title</title>
</head>
<body>
    <header>
        <h1>Board</h1>
    </header>
    <main>
        <form id="form">
            <label for="title">제목:</label>
            <input type="text" id="title" name="title"><br>

            <label for="writer">작성자:</label>
            <input type="text" id="writer" name="writer"><br>

            <label for="content">내용:</label>
            <textarea id="content" name="content"></textarea><br>

            <input type="submit" value="작성">
            <input type="reset" value="취소">
        </form>
    </main>
</body>
</html>
