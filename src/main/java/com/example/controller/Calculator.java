package com.example.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.net.HttpCookie;

@WebServlet("/calculator")
public class Calculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int a = 2;
        int b = 2;
        int res = a+b;
        Cookie[] coockie = req.getCookies();
        for(Cookie c:coockie){
            System.out.println(c.getName()+": "+c.getValue());
        }
        HttpSession session = req.getSession();
        session.setAttribute("result",5);
        req.setAttribute("result",res);
        req.setAttribute("coockies", coockie);
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/temp.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
