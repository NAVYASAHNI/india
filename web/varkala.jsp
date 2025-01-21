<%-- 
    Document   : varkala
    Created on : 15 Jan, 2025, 4:04:47 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tourist Places in Varkala</title>
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
            <h1>Tourist Places in Varkala</h1>
            <p>Discover the stunning beaches and spiritual places in Varkala</p>
        </div>
        
        <div class="place-card">
            <h2>Varkala Beach</h2>
            <img src="images/varkala-beach.jpg" alt="Varkala Beach" class="place-image">
            <p>Varkala Beach is known for its cliffs that rise dramatically over the Arabian Sea, offering panoramic views and a peaceful atmosphere for visitors.</p>
            <div class="details">
                <p><strong>Timings:</strong> Open throughout the day</p>
                <p><strong>Entry Fee:</strong> Free</p>
                <p><strong>Address:</strong> Varkala, Kerala</p>
                <p><strong>Best Time to Visit:</strong> November to March</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Visit early in the morning or evening for the best views</li>
                    <li>Don't forget sunscreen, as the beach can get hot during the day</li>
                    <li>Enjoy the seafood at one of the local beachside shacks</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Sree Janardhana Swamy Temple</h2>
            <img src="images/janardhana-temple.jpg" alt="Sree Janardhana Swamy Temple" class="place-image">
            <p>This ancient temple, dedicated to Lord Vishnu, is a major spiritual attraction in Varkala, known for its peaceful ambiance and beautiful surroundings.</p>
            <div class="details">
                <p><strong>Timings:</strong> 5:00 AM - 12:00 PM & 4:00 PM - 8:00 PM</p>
                <p><strong>Entry Fee:</strong> Free</p>
                <p><strong>Address:</strong> Janardhanapuram, Varkala, Kerala</p>
                <p><strong>Best Time to Visit:</strong> Morning or evening</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Dress modestly as it is a temple</li>
                    <li>Participate in the evening aarti for a tranquil experience</li>
                    <li>Visit the temple during the festival season for special rituals</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Papanasam Beach</h2>
            <img src="images/papanasam-beach.jpg" alt="Papanasam Beach" class="place-image">
            <p>Papanasam Beach, located near the Janardhana Swamy Temple, is known for its clean sands and serene environment. It is also considered a sacred site for rituals.</p>
            <div class="details">
                <p><strong>Timings:</strong> Open throughout the day</p>
                <p><strong>Entry Fee:</strong> Free</p>
                <p><strong>Address:</strong> Papanasam Beach, Varkala, Kerala</p>
                <p><strong>Best Time to Visit:</strong> November to February</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Ideal for taking a dip, as the waters are considered purifying</li>
                    <li>It’s a peaceful place for meditation or relaxation</li>
                    <li>Explore nearby shops selling traditional Kerala handicrafts</li>
                </ul>
            </div>
        </div>
        
        <!-- Add more place cards as needed -->
        
    </body>
</html>
