import javax.servlet.annotation.WebServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(name = "WhatNumberServlet", urlPatterns = "/helloname")
public class HelloNameServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        if (name != null) {
            out.println("<h1>Hello " + name + "</h1>");
        } else {
            out.println("<h1>Hello, World!</h1>");
        }
    }
}
