// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

// import javax.servlet.http.HttpServletRequest;

// public class XSS {

//     public String generateDynamicPage(HttpServletRequest request) {
//         // User input is directly obtained from the request
//         String userInput = request.getParameter("userContent");

//         // This line is vulnerable to XSS, as it directly injects user input into HTML
//         return "<html><body>User Content: " + userInput + "</body></html>";
//     }
// }

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XSS {

    public void renderResponse(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String userInput = request.getParameter("userInput");

        // This line could potentially lead to an XSS vulnerability
        // because it directly uses user input in 'document.write'
        String script = "<script>document.write('" + userInput + "');</script>";
        response.getWriter().write(script);
    }

    public void safeRenderResponse(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String userInput = request.getParameter("userInput");

        // Here, userInput is sanitized before being used, which is a safer approach
        String safeUserInput = sanitize(userInput);
        String script = "<script>document.write('" + safeUserInput + "');</script>";
        response.getWriter().write(script);
    }

    private String sanitize(String input) {
        // Implementation of input sanitization to prevent XSS
        // This would include escaping HTML, JavaScript, or other relevant entities
        return input.replaceAll("<", "&lt;").replaceAll(">", "&gt;");
    }
}

