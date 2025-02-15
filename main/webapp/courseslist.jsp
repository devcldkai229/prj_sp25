<%@ page import="devcldkai.lab3.model.Courses" %>
<%@ page import="java.util.List" %>
<%@ page import="devcldkai.lab3.dao.impl.CoursesDao" %><%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/19/2025
  Time: 9:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Courses | All</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>

    <div class="container">
        <table class="table caption-top table-hover">
            <caption style="color: orangered">List of course</caption>
            <thead>
            <tr>
                <th scope="col">Name</th>
                <th scope="col">Description</th>
                <th scope="col">Duration (s)</th>
                <th scope="col">Fee ($)</th>
                <th scope="col">Action</th>
            </tr>
            </thead>
            <tbody>
            <%List<Courses> coursesList = (List<Courses>) request.getAttribute("coursesList");%>
            <%for(Courses course: coursesList){%>
                <tr>
                    <form action="/updateCourse" method="POST">
                        <td><input type="text" name="name" value="<%= course.getName()%>" /></td>
                        <td><input type="text" name="description" value="<%= course.getDescription()%>" /></td>
                        <td><input type="number" name="duration" value="<%= course.getDuration()%>" /></td>
                        <td><input type="number" name="fee" value="<%= course.getFee()%>" /></td>
                        <input type="hidden" name="id" value="<%= course.getId()%>"/>
                        <input type="hidden" name="action" value="UpdateCourses" />
                        <td><input type="submit" value="Update" /></td>
                    </form>
                </tr>
                <%}%>
            </tbody>
            <a href="/createcourse.jsp" style="color: orangered">+ Add new course</a>
        </table>
    </div>


</body>
</html>
