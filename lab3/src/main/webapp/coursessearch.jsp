<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="devcldkai.lab3.model.Courses" %>
<%@ page import="java.util.List" %>
<%@ page import="devcldkai.lab3.dao.impl.CoursesDao" %><%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/19/2025
  Time: 10:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Courses | Search</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <form action="SearchingCourseServlet" method="get">
        <div class="mb-3">
            <label for="exampleInputName" class="form-label">Enter name</label>
            <input type="text" name="txtCourseName" class="form-control" id="exampleInputName" aria-describedby="nameCourse">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>

    <div class="container">
        <table class="table caption-top table-hover">
            <thead>
            <tr>
                <th scope="col">Id</th>
                <th scope="col">Name</th>
                <th scope="col">Description</th>
                <th scope="col">Duration (s)</th>
                <th scope="col">Fee ($)</th>
            </tr>
            </thead>
            <tbody>
                <c:forEach var="course" items="${coursesByName}">
                    <tr>
                        <td>${course.getId()}</td>
                        <td>${course.getName()}</td>
                        <td>${course.getDescription()}</td>
                        <td>${course.getDuration()}</td>
                        <td>${course.getFee()}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
