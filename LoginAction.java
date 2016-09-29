package com.infy.Login;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Sakshi Kukreti on 29-09-2016.
 */
@WebServlet(name = "LoginAction")
public class LoginAction extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname=request.getParameter("username");
        String passwd=request.getParameter("password");

        if(uname.equals("admin") && passwd.equals("admin"))
        {

            response.sendRedirect("Login_Success.jsp");
            return;
        }
        else
        {
            response.sendRedirect("Login.jsp");
            return;
        }
    }
}
