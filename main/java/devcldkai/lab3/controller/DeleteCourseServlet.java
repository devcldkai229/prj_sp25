package devcldkai.lab3.controller;

import devcldkai.lab3.dao.impl.CoursesDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/deleteCourse")
public class DeleteCourseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // xử lí dữ liệu
        String courseId = request.getParameter("courseId");
        //CoursesDao.getInstance().deleteCourse(courseId); dành cho các idol muốn xóa luôn course
        CoursesDao.getInstance().setStatusInactiveCourse(courseId);

        response.getWriter().write("delete success");
    }
}
