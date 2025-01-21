<%-- 
    Document   : a
    Created on : 14 Jan, 2025, 4:40:31 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tourist Destinations</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        header {
            background-color: #4caf50;
            color: white;
            padding: 10px 20px;
            text-align: center;
        }

        .container {
            margin: 20px;
        }

        .search-bar {
            display: flex;
            justify-content: center;
            margin-bottom: 20px;
        }

        .search-bar input {
            width: 300px;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        .search-bar button {
            padding: 10px 20px;
            background-color: #4caf50;
            color: white;
            border: none;
            border-radius: 4px;
            margin-left: 10px;
            cursor: pointer;
        }

        .search-bar button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <header>
        <h1>Explore Tourist Destinations in India</h1>
    </header>
    <div class="container">
        <div class="search-bar">
            <form action="result.jsp" method="GET">
                <input type="text" name="state" placeholder="Enter a state (e.g., Rajasthan)" required>
                <button type="submit">Search</button>
            </form>
        </div>
    </div>
</body>
</html>

