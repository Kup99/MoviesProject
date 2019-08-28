<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="Genre" class="my.movies.project.config.GenreValuesConfig"/>
<html>
<head>
</head>
<body>

        <form method="post" action="/addMovie">
            <h2>Add Movie</h2>
            <p><input type="text" placeholder="name" name="name"></p>
            <p><input type="text" placeholder="director" name="director"></p>
            <p><input type="number" placeholder="year" name="year"></p>
            <select name="genre" id="genre">
                <c:forEach items="${Genre.values}" var="genre">
                    <option value="${genre}">${genre}</option>
                </c:forEach>
            </select>
            <input type="submit" value="save">
        </form>

</body>
</html>