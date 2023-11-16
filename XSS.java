import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserContentController {

    public void generateUserPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userInput = request.getParameter("userContent");
        
        // This is a simplistic example of an unsafe operation that could lead to XSS.
        // The method directly injects user input into HTML content without sanitization.
        String htmlContent = "<div>" + userInput + "</div>";

        response.setContentType("text/html");
        response.getWriter().write(htmlContent);
    }
}
