<%-- 
    Document   : jaipur
    Created on : 15 Jan, 2025, 3:22:50 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tourist Places in Jaipur</title>
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
            
            .place-card {
                background-color: white;
                border-radius: 10px;
                padding: 20px;
                margin: 20px auto;
                max-width: 800px;
                box-shadow: 0 2px 5px rgba(0,0,0,0.1);
            }
            
            .place-card h2 {
                color: #ff6633;
                margin-top: 0;
            }
            
            .place-image {
                width: 100%;
                height: 400px;
                object-fit: cover;
                border-radius: 8px;
                margin: 10px 0;
            }
            
            .details {
                margin: 15px 0;
                padding: 15px;
                background-color: #fff9f9;
                border-radius: 5px;
            }
            
            .back-button {
                display: inline-block;
                padding: 10px 20px;
                background-color: #ff9966;
                color: white;
                text-decoration: none;
                border-radius: 5px;
                margin: 20px 0;
            }
            
            .back-button:hover {
                background-color: #ff8844;
            }
       
        </style>
    </head>
    <body>
        <a href="jai.jsp" class="back-button">← Back to Regions</a>
        
        <div class="header">
            <h1>Tourist Places in Jaipur</h1>
            <p>Discover the Pink City's most famous attractions</p>
        </div>
        
        <div class="place-card">
            <h2>Hawa Mahal</h2>
            <div id="imageContainer">
                <img id="placeImage" class="place-image" src="h.jpg" alt="Qila Mubarak">
            </div>
            <p>Known as Palace of Winds, built in 1799. Famous for its unique honeycomb-like structure with 953 windows.</p>
            <div class="details">
                <p><strong>Timings:</strong> 9:00 AM - 4:30 PM</p>
                <p><strong>Entry Fee:</strong> ₹50 for Indians, ₹200 for foreigners</p>
                <p><strong>Address:</strong> Hawa Mahal Rd, Badi Choupad, J.D.A. Market, Pink City, Jaipur</p>
                <p><strong>Best Time to Visit:</strong> Early morning to avoid crowds and get the best photos</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Visit during sunrise for the best photography opportunities</li>
                    <li>The view from the opposite café is spectacular</li>
                    <li>Hire a local guide to learn about the historical significance</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Amber Fort</h2>
           <div id="imageContainer">
                <img id="placeImage" class="place-image" src="am.jpg" alt="Qila Mubarak">
            </div>
            <p>UNESCO World Heritage site built in 1592. Known for its artistic Hindu style elements and large ramparts.</p>
            <div class="details">
                <p><strong>Timings:</strong> 8:00 AM - 5:30 PM</p>
                <p><strong>Entry Fee:</strong> ₹100 for Indians, ₹500 for foreigners</p>
                <p><strong>Address:</strong> Devisinghpura, Amer, Jaipur</p>
                <p><strong>Best Time to Visit:</strong> Early morning or late afternoon</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Book an elephant ride in advance during peak season</li>
                    <li>Light and sound show in the evening is recommended</li>
                    <li>Wear comfortable walking shoes</li>
                </ul>
            </div>
        </div>
        
      
        
    </body>
</html>