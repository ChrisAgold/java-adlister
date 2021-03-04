import javax.servlet.annotation.WebServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(name = "WhatNumberServlet", urlPatterns = "/what-say")
public class WhatDidYouSayServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String userSay = req.getParameter("said");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        if (userSay != null) {
            out.println("<h1>User said was: " + userSay + "</h1>");
        } else {
            out.println("<h1>You're no fun, you know?</h1>");
        }
    }
}
