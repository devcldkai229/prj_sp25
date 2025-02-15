package devcldkai.lab3.controller;

import devcldkai.lab3.dao.impl.CoursesDao;
import devcldkai.lab3.model.Courses;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/SearchingCourseServlet")
public class SearchingCourseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String courseName = request.getParameter("txtCourseName");

        List<Courses> list = CoursesDao.getInstance().getCoursesByName(courseName);
            request.setAttribute("coursesByName", list);
            request.getRequestDispatcher("coursessearch.jsp").forward(request, response);

    }
}
