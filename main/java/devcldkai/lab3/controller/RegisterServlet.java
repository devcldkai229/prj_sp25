package devcldkai.lab3.controller;

import devcldkai.lab3.dao.impl.UsersDao;
import devcldkai.lab3.model.Users;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Base64;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("txtUsername");
        String password = request.getParameter("txtPassword");
        String passwordAgain = request.getParameter("txtPasswordAgain");
        PrintWriter out = response.getWriter();

        if(!password.equals(passwordAgain)){
            out.print("Passwords do not match");
            out.flush();
            out.close();
            return;
        }
        String encodePassword = Base64.getEncoder().encodeToString(password.getBytes());

        Users newUser = new Users(username, encodePassword);
        UsersDao.getInstance().save(newUser);
        request.getRequestDispatcher("/landingpage.jsp").forward(request, response);
    }
}
