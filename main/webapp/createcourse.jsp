<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/7/2025
  Time: 9:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
    <form action="/createCourse" method="POST">
        <input type="text" name="id" value="Id...>" />
        <input type="text" name="name" value="Name...>" />
        <input type="text" name="description" value="Description..." />
        <input type="number" name="duration"/>
        <input type="number" name="fee" />
        <input type="submit" value="Create" />
    </form>
</body>
</html>
