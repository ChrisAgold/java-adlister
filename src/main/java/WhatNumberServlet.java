import javax.servlet.annotation.WebServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(name = "WhatNumberServlet", urlPatterns = "/what-num")
public class WhatNumberServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String userNum = req.getParameter("num");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        if (userNum != null) {
            out.println("<h1>User number was: " + userNum + "</h1>");
        } else {
            out.println("<h1>You're no fun, you know?</h1>");
        }
    }
}
