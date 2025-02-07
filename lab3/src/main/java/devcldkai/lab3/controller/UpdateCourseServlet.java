package devcldkai.lab3.controller;

import devcldkai.lab3.dao.impl.CoursesDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name="UpdateCourseServlet", value="/updateCourse")
public class UpdateCourseServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        int duration = Integer.parseInt(request.getParameter("duration"));
        float fee = Float.parseFloat(request.getParameter("fee"));

        if(!name.matches("[A-Za-z\\s]+")){
            response.getWriter().write("dcm name sai roii kia");
            return;
        }

        CoursesDao.getInstance().updateName(name, id);
        CoursesDao.getInstance().updateDescription(description, id);
        CoursesDao.getInstance().updateDuration(duration, id);
        CoursesDao.getInstance().updateFee(fee, id);

        response.getWriter().write("update success");
    }
}
