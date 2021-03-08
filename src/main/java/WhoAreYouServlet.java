import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "WhoAreYouServlet", urlPatterns = "/who-are-you")
public class WhoAreYouServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        request.setAttribute("name", name);
        request.getRequestDispatcher("who-are-you.jsp").forward(request, response);
    }
}



