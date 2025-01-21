<%-- 
    Document   : welcome
    Created on : 18 Jan, 2025, 11:57:47 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f4;
                margin: 0;
                padding: 20px;
            }
            .welcome-container {
                max-width: 600px;
                margin: 100px auto;
                padding: 20px;
                background: white;
                border-radius: 5px;
                box-shadow: 0 0 10px rgba(0,0,0,0.1);
                text-align: center;
            }
            .logout-btn {
                background-color: #f44336;
                color: white;
                padding: 14px 20px;
                text-decoration: none;
                border-radius: 4px;
                display: inline-block;
                margin-top: 20px;
            }
            .logout-btn:hover {
                background-color: #da190b;
            }
        </style>
    </head>
    <body>
        <%
            String username = (String) session.getAttribute("username");
            if (username == null) {
                response.sendRedirect("index.jsp");
                return;
            }
        %>
        <div class="welcome-container">
            <h2>Welcome, <%= username %>!</h2>
            <p>You have successfully logged in.</p>
            <a href="login.jsp" class="logout-btn">Logout</a>
        </div>
    </body>
</html>
