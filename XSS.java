import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Retrieving user input from the request
        String userInput = request.getParameter("userMessage");

        // Direct concatenation of user input into HTML content
        String responseContent = "<html><body><h1>Welcome!</h1><p>" + userInput + "</p></body></html>";

        // Sending the response back to the client
        response.getWriter().write(responseContent);
    }
}
