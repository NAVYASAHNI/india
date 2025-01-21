<%-- 
    Document   : pushkar
    Created on : 15 Jan, 2025, 3:42:00 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tourist Places in Pushkar</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #fff8e1;
                margin: 0;
                padding: 20px;
            }
            
            .header {
                text-align: center;
                color: #8b4500;
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
                color: #cc6600;
                margin-top: 0;
            }
            
            .place-image {
                width: 100%;
                height: 300px;
                object-fit: cover;
                border-radius: 8px;
                margin: 10px 0;
            }
            
            .details {
                margin: 15px 0;
                padding: 15px;
                background-color: #fffaf0;
                border-radius: 5px;
            }
            
            .back-button {
                display: inline-block;
                padding: 10px 20px;
                background-color: #ffbb33;
                color: white;
                text-decoration: none;
                border-radius: 5px;
                margin: 20px 0;
            }
            
            .back-button:hover {
                background-color: #ffaa22;
            }
        </style>
    </head>
    <body>
        <a href="jai.jsp" class="back-button">← Back to Regions</a>
        
        <div class="header">
            <h1>Tourist Places in Pushkar</h1>
            <p>Explore the spiritual and cultural wonders of Pushkar</p>
        </div>
        
        <div class="place-card">
            <h2>Pushkar Lake</h2>
            <img src="images/pushkar-lake.jpg" alt="Pushkar Lake" class="place-image">
            <p>A sacred lake surrounded by 52 ghats, believed to have healing properties and religious significance in Hindu mythology.</p>
            <div class="details">
                <p><strong>Timings:</strong> Open 24 hours</p>
                <p><strong>Entry Fee:</strong> Free</p>
                <p><strong>Address:</strong> Pushkar, Rajasthan</p>
                <p><strong>Best Time to Visit:</strong> Early morning or evening for serenity and rituals</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Participate in the evening aarti for a spiritual experience</li>
                    <li>Avoid taking photos without permission during rituals</li>
                    <li>Try boating to enjoy the scenic beauty of the lake</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Brahma Temple</h2>
            <img src="images/brahma-temple.jpg" alt="Brahma Temple" class="place-image">
            <p>One of the few temples dedicated to Lord Brahma, this 14th-century temple is a prominent pilgrimage site in Pushkar.</p>
            <div class="details">
                <p><strong>Timings:</strong> 6:00 AM - 8:00 PM</p>
                <p><strong>Entry Fee:</strong> Free</p>
                <p><strong>Address:</strong> Brahma Temple Rd, Pushkar, Rajasthan</p>
                <p><strong>Best Time to Visit:</strong> Early morning for prayers</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Respect the temple's dress code and customs</li>
                    <li>Visit during the Pushkar Fair for a vibrant experience</li>
                    <li>Hire a guide to learn about the temple's history</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Pushkar Camel Fair</h2>
            <img src="images/pushkar-camel-fair.jpg" alt="Pushkar Camel Fair" class="place-image">
            <p>An annual fair held in November, featuring camel trading, cultural performances, and competitions, attracting tourists from around the world.</p>
            <div class="details">
                <p><strong>Timings:</strong> All day (during the fair)</p>
                <p><strong>Entry Fee:</strong> Free</p>
                <p><strong>Address:</strong> Pushkar, Rajasthan</p>
                <p><strong>Best Time to Visit:</strong> During the fair in November</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Plan your trip in advance as accommodations fill up quickly</li>
                    <li>Try the local Rajasthani food at the fair</li>
                    <li>Capture the vibrant scenes of the camel trading and cultural events</li>
                </ul>
            </div>
        </div>
        
        <!-- Add more place cards as needed -->
        
    </body>
</html>
