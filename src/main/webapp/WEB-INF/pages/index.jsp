<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>


<html>
<head>
    <title>boxes</title>
</head>
<body>
<table border="1">
    <th>Name</th>
    <th>Year</th>
    <th>Director</th>
    <th>Genre</th>

<c:forEach items="${allMovies}" var="movies">
    <tr>
    <td>${movies.name}</td>
    <td>${movies.year}</td>
    <td>${movies.director}</td>
    <td>${movies.genre}</td>
        <td>
            <a href="/updateMovie/${movies.id}">Edit</a>

            <a href="/deleteMovie/${movies.id}">Delete</a>
        </td>
    </tr>
</c:forEach>
</table>

<form method="get" action="/addMovie">
    <p><input type="submit" value="Add Movie">
</form>

</body>
</html>
