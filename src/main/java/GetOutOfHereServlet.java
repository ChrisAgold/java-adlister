import javax.servlet.annotation.WebServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet(name = "GetOutOfHereServlet", urlPatterns = "/get-out")
public class GetOutOfHereServlet extends HttpServlet {

    // redirects to google, good for when user logs out so they go to website homepage
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
//        resp.sendRedirect("http://www.google.com");
        resp.sendRedirect("/hello-world");
    }
}








