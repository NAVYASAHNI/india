package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.security.MessageDigest;
import java.sql.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Employee Registration</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color: #f5f5f5;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            max-width: 500px;\n");
      out.write("            margin: 0 auto;\n");
      out.write("            background: white;\n");
      out.write("            padding: 20px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            box-shadow: 0 2px 5px rgba(0,0,0,0.1);\n");
      out.write("        }\n");
      out.write("        .form-title {\n");
      out.write("            text-align: center;\n");
      out.write("            color: #333;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        .form-group {\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("        }\n");
      out.write("        label {\n");
      out.write("            display: block;\n");
      out.write("            margin-bottom: 5px;\n");
      out.write("            color: #555;\n");
      out.write("        }\n");
      out.write("        input[type=\"text\"],\n");
      out.write("        input[type=\"password\"] {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 8px;\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"] {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            background-color: #4CAF50;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #45a049;\n");
      out.write("        }\n");
      out.write("        .error-message {\n");
      out.write("            color: #ff0000;\n");
      out.write("            margin-bottom: 15px;\n");
      out.write("            padding: 10px;\n");
      out.write("            background-color: #ffebee;\n");
      out.write("            border-radius: 4px;\n");
      out.write("        }\n");
      out.write("        .password-requirements {\n");
      out.write("            font-size: 12px;\n");
      out.write("            color: #666;\n");
      out.write("            margin-top: 5px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2 class=\"form-title\">Employee Registration</h2>\n");
      out.write("<!--        \n");
      out.write("       \n");
      out.write("        -->\n");
      out.write("        <form name=\"registrationForm\" method=\"POST\" onsubmit=\"return validateForm()\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"txtname\">Full Name:</label>\n");
      out.write("                <input type=\"text\" id=\"txtname\" name=\"txtname\" required \n");
      out.write("                       pattern=\".{2,50}\" title=\"Name must be between 2 and 50 characters\"/>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"txtstate\">State:</label>\n");
      out.write("                <input type=\"text\" id=\"txtstate\" name=\"txtstate\" required\n");
      out.write("                       pattern=\".{2,50}\" title=\"State must be between 2 and 50 characters\"/>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"txtphone\">Phone Number:</label>\n");
      out.write("                <input type=\"text\" id=\"txtphone\" name=\"txtphone\" required\n");
      out.write("                       pattern=\"\\d{10}\" title=\"Please enter a valid 10-digit phone number\"/>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"txtpassword\">Password:</label>\n");
      out.write("                <input type=\"password\" id=\"txtpassword\" name=\"txtpassword\" required\n");
      out.write("                       minlength=\"6\" title=\"Password must be at least 6 characters long\"/>\n");
      out.write("                <div class=\"password-requirements\">Password must be at least 6 characters long</div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"txtconfirmpassword\">Confirm Password:</label>\n");
      out.write("                <input type=\"password\" id=\"txtconfirmpassword\" name=\"txtconfirmpassword\" required/>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input type=\"submit\" value=\"Register\" name=\"b3\" />\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        function validateForm() {\n");
      out.write("            var name = document.getElementById(\"txtname\").value.trim();\n");
      out.write("            var phone = document.getElementById(\"txtphone\").value.trim();\n");
      out.write("            var state = document.getElementById(\"txtstate\").value.trim();\n");
      out.write("            var password = document.getElementById(\"txtpassword\").value;\n");
      out.write("            var confirmPassword = document.getElementById(\"txtconfirmpassword\").value;\n");
      out.write("            \n");
      out.write("            if (name.length < 2 || name.length > 50) {\n");
      out.write("                alert(\"Name must be between 2 and 50 characters\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            if (!phone.match(/^\\d{10}$/)) {\n");
      out.write("                alert(\"Please enter a valid 10-digit phone number\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            if (state.length < 2 || state.length > 50) {\n");
      out.write("                alert(\"State must be between 2 and 50 characters\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            if (password.length < 6) {\n");
      out.write("                alert(\"Password must be at least 6 characters long\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            if (password !== confirmPassword) {\n");
      out.write("                alert(\"Passwords do not match\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            return true;\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");

    String errorMessage = "";
    if (request.getParameter("b3") != null) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try {
            // Input validation
            String name = request.getParameter("txtname").trim();
            String phone = request.getParameter("txtphone").trim();
            String state = request.getParameter("txtstate").trim();
            String password = request.getParameter("txtpassword").trim();
            String confirmPassword = request.getParameter("txtconfirmpassword").trim();
            
            if (name.length() < 2 || name.length() > 50) {
                throw new Exception("Name must be between 2 and 50 characters");
            }
            
            if (!phone.matches("\\d{10}")) {
                throw new Exception("Phone number must be 10 digits");
            }
            
            if (state.length() < 2 || state.length() > 50) {
                throw new Exception("State must be between 2 and 50 characters");
            }
            
            if (!password.equals(confirmPassword)) {
                throw new Exception("Passwords do not match");
            }
            
            if (password.length() < 6) {
                throw new Exception("Password must be at least 6 characters long");
            }
            
            // Hash the password using a simple hex encoding
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());
            StringBuilder hashedPasswordStr = new StringBuilder();
            for (byte b : hashedBytes) {
                hashedPasswordStr.append(String.format("%02x", b));
            }
            String hashedPassword = hashedPasswordStr.toString();
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/project", "project", "project");
            conn.setAutoCommit(false); // Start transaction
            
            // Check if phone number already exists
            String checkQuery = "SELECT phone FROM Register WHERE phone = ?";
            pstmt = conn.prepareStatement(checkQuery);
            pstmt.setString(1, phone);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                throw new Exception("Phone number already registered");
            }
            
            // Insert into Register table
            String registerQuery = "INSERT INTO Register (name, phone, state, password) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(registerQuery);
            pstmt.setString(1, name);
            pstmt.setString(2, phone);
            pstmt.setString(3, state);
            pstmt.setString(4, hashedPassword);
            pstmt.executeUpdate();
            
            // Insert into Login table
            String loginQuery = "INSERT INTO Login (uid, pwd) VALUES (?, ?)";
            pstmt = conn.prepareStatement(loginQuery);
            pstmt.setString(1, phone);
            pstmt.setString(2, hashedPassword);
            pstmt.executeUpdate();
            
            conn.commit(); // Commit transaction
            response.sendRedirect("login.jsp");
            return;
            
        } catch (Exception ex) {
            if (conn != null) {
                try {
                    conn.rollback(); // Rollback on error
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
            errorMessage = "Error: " + ex.getMessage();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) {
                    conn.setAutoCommit(true);
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

      out.write("\n");
      out.write("<!-- Rest of the HTML remains the same -->\n");
      out.write("<!-- Rest of the HTML remains the same -->");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
