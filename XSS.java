import javax.servlet.http.*;
import java.io.*;

public class UnsafeServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userInput = request.getParameter("input");

        PrintWriter out = response.getWriter();
        // Unsafe output of user input directly into the response
        // This would be detected by the XSSChecker as a potential XSS vulnerability
        out.println("<html><body>");
        out.println("<h1>Your input was: " + userInput + "</h1>");
        out.println("</body></html>");
    }
}

