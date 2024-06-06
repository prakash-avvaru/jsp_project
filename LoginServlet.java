// LoginServlet.java
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Validate login details using JDBC (connect to your database)
        // ...

        if (loginSuccessful) {
            // Redirect to home page (home.jsp)
            response.sendRedirect("home.jsp");
        } else {
            // Redirect back to login page
            response.sendRedirect("index.html");
        }
    }
}
 