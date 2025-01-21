<%-- 
    Document   : login
    Created on : 13 Jan, 2025, 6:59:15 PM
    Author     : DELL
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login System</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f4;
                margin: 0;
                padding: 20px;
            }
            .container {
                max-width: 400px;
                margin: 100px auto;
                padding: 20px;
                background: white;
                border-radius: 5px;
                box-shadow: 0 0 10px rgba(0,0,0,0.1);
            }
            .form-group {
                margin-bottom: 15px;
            }
            .form-group label {
                display: block;
                margin-bottom: 5px;
            }
            .form-group input {
                width: 100%;
                padding: 8px;
                border: 1px solid #ddd;
                border-radius: 4px;
                box-sizing: border-box;
            }
            .btn-group {
                display: flex;
                gap: 10px;
                margin-top: 20px;
            }
            .btn {
                padding: 10px 15px;
                border: none;
                border-radius: 4px;
                cursor: pointer;
                flex: 1;
                font-size: 14px;
            }
            .btn-primary {
                background-color: #4CAF50;
                color: white;
            }
            .btn-secondary {
                background-color: #2196F3;
                color: white;
            }
            .error {
                color: #dc3545;
                background-color: #f8d7da;
                padding: 10px;
                border-radius: 4px;
                margin-bottom: 15px;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h2 style="text-align: center;">Login System</h2>
            
            <% if(request.getAttribute("error") != null) { %>
                <div class="error">
                    <%= request.getAttribute("error") %>
                </div>
            <% } %>
            
            <form id="loginForm" action="LoginServlet" method="POST">
                <div class="form-group">
                    <label for="username">Username:</label>
                    <input type="text" id="username" name="username" required>
                </div>
                
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password" required>
                </div>
                
                <div class="btn-group">
                    <button type="submit" name="action" value="login" class="btn btn-primary">Sign In</button>
                    <button type="button" onclick="window.location.href='register.jsp'" class="btn btn-secondary">Register</button>
                </div>
            </form>
        </div>
    </body>
</html>