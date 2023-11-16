public class UserServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String userInput = request.getParameter("userMessage");
        String responseContent = "<html><body><h1>Welcome!</h1><p>" + userInput + "</p></body></html>";
        response.getWriter().write(responseContent);
    }
}
