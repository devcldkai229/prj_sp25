package devcldkai.lab3.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false); // false có ý nghĩa là nếu chưa có session thì cũng
        // không tạo ra
        if (session != null) {
            session.removeAttribute("user");
            session.invalidate();
            request.getRequestDispatcher("/landingpage.jsp").forward(request, response);
        }
    }
}
