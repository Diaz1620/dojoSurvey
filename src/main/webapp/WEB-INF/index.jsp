<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
</head>
<body>
    <form action="/survey" method="POST">

        <label name="name">Your Name:</label>
        <input type="text" name="name">
        <br>
        <label>Dojo Location:</label>
        <select name="selectLocation">
            <option value="San Jose">San Jose</option>
            <option value="Schitt's Creek">Schitt's Creek</option>
            <option value="The Moon">The Moon</option>
        </select>
        <br>
        <label>Language you hate the least:</label>
        <select name="selectLang">
            <option value="Java">Java</option>
            <option value="Mern">Mern</option>
            <option value="Python">Python</option>
        </select>
        <br>
        <label>Comment (optional)</label>
        <br>
        <textarea name="comment" id="" cols="30" rows="10"></textarea>
        <br>
        <button>Send It!</button>
    </form>
</body>
</html>