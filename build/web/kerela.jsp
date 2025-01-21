<%-- 
    Document   : kerela
    Created on : 15 Jan, 2025, 3:54:10 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Explore Kerala</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #fff5e6;
                margin: 0;
                padding: 20px;
            }
            
            .header {
                text-align: center;
                color:  #FFFFFF;
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
                background-color: #4caf50;
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
            .background-container {
            position: fixed;
            top: 0;
            left: 0;
            width: 100%;
            height: 100vh;
            /* Gradient background instead of image */
            background: linear-gradient(135deg, 
                #FF9933, /* Saffron */
                #FFFFFF, /* White */
                 #FFFFFF  /* Green */
            );
            opacity: 0.8;
            z-index: -1;
          background: linear-gradient(rgba(0, 0, 0, 0.3), rgba(0, 0, 0, 0.3)), 
                        url('kb.jpeg');
            background-size: cover;
            background-position: center;
        }
        </style>
    </head>
    <body>
          <div class="background-container"></div>
   
        <div class="header">
            <h1>Explore Kerala</h1>
            <p>Click on a region to discover its tourist destinations</p>
        </div>
        
        <div class="flashcards-container">
            <a href="kochi.jsp" class="flashcard"> Kochi</a>
            <a href="munnar.jsp" class="flashcard">Munnar</a>
            <a href="alleppey.jsp" class="flashcard">Alleppey</a>
            <a href="thekkady.jsp" class="flashcard">Thekkady</a>
            <a href="kumarakom.jsp" class="flashcard">Kumarakom</a>
            <a href="varkala.jsp" class="flashcard">Varkala</a>
        </div>
    </body>
</html>
