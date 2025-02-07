package devcldkai.lab3.controller;

import devcldkai.lab3.dao.impl.CoursesDao;
import devcldkai.lab3.model.Courses;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/createCourse")
public class CreateCourseServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        int duration = Integer.parseInt(request.getParameter("duration"));
        float fee = Float.parseFloat(request.getParameter("fee"));

        CoursesDao.getInstance().addCourse(new Courses(id, name, description, duration, fee));
        response.getWriter().write("added ");
    }
}
