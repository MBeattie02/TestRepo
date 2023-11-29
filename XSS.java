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

