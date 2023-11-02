import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/greet")
public class GreetingServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // User input is retrieved from the request
        String username = request.getParameter("username");

        // User input is directly used in the HTML response without sanitization
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hello, " + username + "!</h1>"); // Potential XSS vulnerability
        out.println("</body>");
        out.println("</html>");
    }

    // ... other methods ...
}
