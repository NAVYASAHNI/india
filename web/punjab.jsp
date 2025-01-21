<%-- 
    Document   : punjab
    Created on : 15 Jan, 2025, 4:10:29 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Explore Punjab</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #fff5e6;
                margin: 0;
                padding: 20px;
            }
            
            .header {
                text-align: center;
                color: #b3003b;
                margin-bottom: 30px;
            }
            
            .flashcards-container {
                display: flex;
                flex-wrap: wrap;
                gap: 20px;
                justify-content: center;
            }
            
            .flashcard {
                width: 300px;
                height: 200px;
                background-color: #ffcc80; /* Light orange color */
                border-radius: 10px;
                cursor: pointer;
                display: flex;
                align-items: center;
                justify-content: center;
                color: white;
                font-size: 24px;
                font-weight: bold;
                transition: transform 0.3s;
                box-shadow: 0 4px 8px rgba(0,0,0,0.1);
                text-decoration: none;
            }
            
            .flashcard:hover {
                transform: translateY(-5px);
            }
        </style>
    </head>
    <body>
        <div class="header">
            <h1>Explore Punjab</h1>
            <p>Click on a region to discover its tourist destinations</p>
        </div>
        
        <div class="flashcards-container">
            <a href="amritsar.jsp" class="flashcard">Amritsar</a>
            <a href="chandigarh.jsp" class="flashcard">Chandigarh</a>
            <a href="patiala.jsp" class="flashcard">Patiala</a>
            <a href="jalandhar.jsp" class="flashcard">Jalandhar</a>
            <a href="ludhiana.jsp" class="flashcard">Ludhiana</a>
            <a href="bathinda.jsp" class="flashcard">Bathinda</a>
        </div>
    </body>
</html>

