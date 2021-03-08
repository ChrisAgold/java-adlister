import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "ViewCountServlet", urlPatterns = "/view-count")
public class ViewCountServlet extends HttpServlet {

    private int hitCount;

    public void init() {
        hitCount = 0;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String reset = req.getParameter("reset");
        resp.setContentType("text/html");
        hitCount++;
        PrintWriter out = resp.getWriter();
        if (reset != null) {
            init();
            out.println("<h1>Count has been reset!</h1>");
        } else {
            out.println("<h1>You are guest number: " + hitCount + "!</h1>");
        }
    }

}