package devcldkai.lab3.controller;

import devcldkai.lab3.dao.impl.UsersDao;
import devcldkai.lab3.model.Users;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Base64;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("txtUsername");
        String password = request.getParameter("txtPassword"); // password user nhập chưa có mã hóa ...
        PrintWriter out = response.getWriter();

        Users loadedUser = UsersDao.getInstance().getByUsername(username);
        if(loadedUser==null) {
            out.print("Username or password incorrect!");
            out.flush();
            out.close();
        }

        String passwordInDBEncode = loadedUser.getPassword(); // password chưa được giải van ở dạng chuỗi encode
        byte[] passwordInDB = Base64.getDecoder().decode(passwordInDBEncode.getBytes());
        String passwordInDBDecode = new String(passwordInDB);
        if(!password.equals(passwordInDBDecode)){
            out.print("Username or password incorrect!");
            out.flush();
            out.close();
        }
        String roleName = loadedUser.getRole();
        HttpSession session = request.getSession(true);
        session.setAttribute("user", loadedUser);
        if(roleName.equals("ADMIN")){
            request.getRequestDispatcher("/landingpageAdmin.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("/landingpage.jsp").forward(request, response);
        }
    }
}
