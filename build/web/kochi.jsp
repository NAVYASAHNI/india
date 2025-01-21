<%-- 
    Document   : kochi
    Created on : 15 Jan, 2025, 3:56:53 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tourist Places in Kochi</title>
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
                height: 300px;
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
        <a href="kerela.jsp" class="back-button">← Back to Regions</a>
        
        <div class="header">
            <h1>Tourist Places in Kochi</h1>
            <p>Explore the rich culture and attractions of Kochi</p>
        </div>
        
        <div class="place-card">
            <h2>Fort Kochi</h2>
            <img src="images/fort-kochi.jpg" alt="Fort Kochi" class="place-image">
            <p>Fort Kochi is a historic area known for its colonial architecture, vibrant street art, and scenic beaches.</p>
            <div class="details">
                <p><strong>Timings:</strong> Open 24 hours (Best to visit in the morning and evening)</p>
                <p><strong>Entry Fee:</strong> Free</p>
                <p><strong>Address:</strong> Fort Kochi, Kochi</p>
                <p><strong>Best Time to Visit:</strong> November to February</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Don't miss the famous Chinese fishing nets at the beach</li>
                    <li>Explore the local markets for souvenirs</li>
                    <li>Visit the local cafes for authentic Kerala cuisine</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Mattancherry Palace</h2>
            <img src="images/mattancherry-palace.jpg" alt="Mattancherry Palace" class="place-image">
            <p>Built by the Portuguese in 1555, this palace features Kerala murals and artifacts from the region's royal past.</p>
            <div class="details">
                <p><strong>Timings:</strong> 10:00 AM - 5:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹5 for Indians, ₹50 for foreigners</p>
                <p><strong>Address:</strong> Mattancherry, Kochi</p>
                <p><strong>Best Time to Visit:</strong> Anytime, but avoid peak afternoon heat</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Make sure to visit the museum inside the palace</li>
                    <li>Learn about Kochi's royal history and traditions</li>
                    <li>Ideal for history buffs and art lovers</li>
                </ul>
            </div>
        </div>

        <div class="place-card">
            <h2>Jewish Synagogue</h2>
            <img src="images/jewish-synagogue.jpg" alt="Jewish Synagogue" class="place-image">
            <p>Built in 1568, this synagogue is one of the oldest in India, known for its beautiful hand-painted tiles and chandeliers.</p>
            <div class="details">
                <p><strong>Timings:</strong> 10:00 AM - 12:00 PM, 3:00 PM - 5:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹5 for Indians, ₹10 for foreigners</p>
                <p><strong>Address:</strong> Jew Town, Mattancherry, Kochi</p>
                <p><strong>Best Time to Visit:</strong> Morning for less crowd</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Respect the place's religious significance</li>
                    <li>Visit the nearby antique shops in Jew Town</li>
                    <li>Carry a camera for beautiful architecture shots</li>
                </ul>
            </div>
        </div>
        
        <!-- Add more place cards as needed -->
        
    </body>
</html>
