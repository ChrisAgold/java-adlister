import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaServlet", urlPatterns = "/pizza-order")
public class PizzaServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("pizza-order.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String crustType = request.getParameter("crust_types");
        String sauceType = request.getParameter("sauce_types");
        String pizzaSize = request.getParameter("size");

//        if (crustType != null && sauceType != null && pizzaSize != null && toppings != null && userAddress != null) {
//            System.out.println(crustType);
//            System.out.println(sauceType);
//            System.out.println(pizzaSize);
//
//            // select multiple toppings
//            String[] toppings = request.getParameterValues("toppings");
//            for (int i = 0; i <= toppings.length - 1; i++) {
//                System.out.println(toppings[i]);
//            } else{
//                System.out.println("User did not fill in all forms.");
//            }


        System.out.println(crustType);
        System.out.println(sauceType);
        System.out.println(pizzaSize);

        // select multiple toppings
        String[] toppings = request.getParameterValues("toppings");
        for (int i = 0; i <= toppings.length - 1; i++) {
            System.out.println(toppings[i]);
        }

        // get users address
        String usersAddress = request.getParameter("address");
        System.out.println(usersAddress);
    }
}



