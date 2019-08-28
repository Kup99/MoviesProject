<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="Genre" class="my.movies.project.config.GenreValuesConfig"/>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Edit Movie</title>
</head>
<body>
<div align="center">
    <h1>Edit Movie</h1>
    <form:form action="/updateMovie" method="post" modelAttribute="movie">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td><form:input path="name"/></td>
            </tr>
            <tr>
                <td>Year:</td>
                <td><form:input path="year"/></td>
            </tr>
            <tr>
                <td>Genre:</td>
                <select name="genre" id="genre">
                    <c:forEach items="${Genre.values}" var="genre">
                        <option value="${genre}">${genre}</option>
                    </c:forEach>
                </select>
            </tr>
            <tr>
                <td>Director:</td>
                <td><form:input path="director"/></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>