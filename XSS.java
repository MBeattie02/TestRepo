import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpServletRequest;

public class XSS {

    public String generateDynamicPage(HttpServletRequest request) {
        // User input is directly obtained from the request
        String userInput = request.getParameter("userContent");

        // This line is vulnerable to XSS, as it directly injects user input into HTML
        return "<html><body>User Content: " + userInput + "</body></html>";
    }
}

