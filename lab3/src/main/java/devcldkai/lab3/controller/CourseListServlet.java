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

@WebServlet("/CourseListServlet")
public class CourseListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Courses> coursesList = CoursesDao.getInstance().getAllCourses();
        request.setAttribute("coursesList", coursesList);
        // chỉ để lấy dữ liệu xử lí dữ liệu sau đó thì sẽ gửi request đến jsp hien thị
        request.getRequestDispatcher("/courseslist.jsp").forward(request, response);
    }


}
