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

@WebServlet("/courseInactive")
public class CourseInactiveServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Courses> coursesList = CoursesDao.getInstance().getCoursesByInactiveStatus();
        request.setAttribute("coursesList", coursesList); // đây là những courses có status bằng 0

        request.getRequestDispatcher("/courseInactive.jsp").forward(request, response);
    }
}
