<%-- 
    Document   : jaisalmer
    Created on : 15 Jan, 2025, 3:41:06 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tourist Places in Jaisalmer</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #fff4e6;
                margin: 0;
                padding: 20px;
            }
            
            .header {
                text-align: center;
                color: #cc8400;
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
                color: #e68a00;
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
                background-color: #fff8f2;
                border-radius: 5px;
            }
            
            .back-button {
                display: inline-block;
                padding: 10px 20px;
                background-color: #ffcc66;
                color: white;
                text-decoration: none;
                border-radius: 5px;
                margin: 20px 0;
            }
            
            .back-button:hover {
                background-color: #ffb84d;
            }
        </style>
    </head>
    <body>
        <a href="jai.jsp" class="back-button">← Back to Regions</a>
        
        <div class="header">
            <h1>Tourist Places in Jaisalmer</h1>
            <p>Experience the Golden City's rich heritage and desert charm</p>
        </div>
        
        <div class="place-card">
            <h2>Jaisalmer Fort</h2>
            <img src="images/jaisalmer-fort.jpg" alt="Jaisalmer Fort" class="place-image">
            <p>Known as Sonar Quila (Golden Fort), this living fort built in 1156 is a UNESCO World Heritage site, famous for its stunning architecture and sandstone walls.</p>
            <div class="details">
                <p><strong>Timings:</strong> Open 24 hours</p>
                <p><strong>Entry Fee:</strong> Free (additional charges for museum)</p>
                <p><strong>Address:</strong> Fort Rd, Near Gopa Chowk, Jaisalmer, Rajasthan</p>
                <p><strong>Best Time to Visit:</strong> Early morning or sunset for spectacular views</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Explore the narrow lanes filled with shops and eateries</li>
                    <li>Visit the Jain temples within the fort</li>
                    <li>Stay overnight in one of the heritage accommodations</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Sam Sand Dunes</h2>
            <img src="images/sam-sand-dunes.jpg" alt="Sam Sand Dunes" class="place-image">
            <p>A must-visit for an authentic desert experience, featuring camel safaris, jeep rides, and cultural performances under the starry sky.</p>
            <div class="details">
                <p><strong>Timings:</strong> Open 24 hours</p>
                <p><strong>Entry Fee:</strong> Free (charges for activities)</p>
                <p><strong>Address:</strong> Sam, Jaisalmer, Rajasthan (42 km from the city)</p>
                <p><strong>Best Time to Visit:</strong> Evening for sunsets and night for cultural shows</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Book your desert camp in advance during peak season</li>
                    <li>Carry warm clothes as it gets chilly at night</li>
                    <li>Try the Rajasthani traditional food served at the camps</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Patwon Ki Haveli</h2>
            <img src="images/patwon-ki-haveli.jpg" alt="Patwon Ki Haveli" class="place-image">
            <p>A cluster of five havelis built in 1805, showcasing intricate architecture and beautiful frescoes, it is the oldest haveli in Jaisalmer.</p>
            <div class="details">
                <p><strong>Timings:</strong> 9:00 AM - 5:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹20 for Indians, ₹100 for foreigners</p>
                <p><strong>Address:</strong> Near Patwa Complex, Jaisalmer, Rajasthan</p>
                <p><strong>Best Time to Visit:</strong> Morning for good lighting and fewer crowds</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Hire a guide to learn about the history of the havelis</li>
                    <li>Don’t miss the museum inside the haveli</li>
                    <li>Capture the intricate carvings on the sandstone walls</li>
                </ul>
            </div>
        </div>
        
        <!-- Add more place cards as needed -->
        
    </body>
</html>
