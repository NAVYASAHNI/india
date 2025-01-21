<%-- 
    Document   : alleppey
    Created on : 15 Jan, 2025, 4:00:01 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tourist Places in Alleppey</title>
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
            <h1>Tourist Places in Alleppey</h1>
            <p>Explore the serene backwaters and natural beauty of Alleppey</p>
        </div>
        
        <div class="place-card">
            <h2>Alleppey Backwaters</h2>
             <div class="imageContainer">
                <img id="placeImage" class="place-image" src="aaa (1).jpg" alt="Qila Mubarak">
            </div>
            <p>Alleppey is famous for its backwaters, houseboat cruises, and picturesque views of canals and lagoons.</p>
            <div class="details">
                <p><strong>Timings:</strong> Open 24 hours (Best for houseboat cruises in the daytime)</p>
                <p><strong>Entry Fee:</strong> Free (Houseboat cruise prices vary)</p>
                <p><strong>Address:</strong> Alleppey, Kerala</p>
                <p><strong>Best Time to Visit:</strong> November to February for pleasant weather</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Book a houseboat in advance during peak season</li>
                    <li>Carry sun protection and comfortable clothing</li>
                    <li>Be sure to enjoy the local cuisine served on houseboats</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Alleppey Beach</h2>
            <div class="imageContainer">
                <img id="placeImage" class="place-image" src="ap.jpg" alt="Qila Mubarak">
            </div>
            <p>Alleppey Beach is a peaceful and beautiful destination, offering a serene atmosphere and lovely sunset views.</p>
            <div class="details">
                <p><strong>Timings:</strong> 9:00 AM - 6:00 PM</p>
                <p><strong>Entry Fee:</strong> Free</p>
                <p><strong>Address:</strong> Alleppey, Kerala</p>
                <p><strong>Best Time to Visit:</strong> Early morning or late evening</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Take a walk along the beach and enjoy the cool breeze</li>
                    <li>Great spot for evening photography and watching sunsets</li>
                    <li>Do visit the nearby lighthouse for panoramic views</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Kuttanadu Backwaters</h2>
             <div class="imageContainer">
                <img id="placeImage" class="place-image" src="an (1).jpg" alt="Qila Mubarak">
            </div>
            <p>Kuttanadu is known as the 'Rice Bowl of Kerala' and is famous for its lush paddy fields and tranquil backwaters.</p>
            <div class="details">
                <p><strong>Timings:</strong> Open 24 hours (Best for a visit in the morning or late afternoon)</p>
                <p><strong>Entry Fee:</strong> Free</p>
                <p><strong>Address:</strong> Kuttanadu, Alleppey, Kerala</p>
                <p><strong>Best Time to Visit:</strong> November to March for clear skies and pleasant weather</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Enjoy a boat ride through the backwaters for a peaceful experience</li>
                    <li>Take time to interact with local farmers and learn about paddy cultivation</li>
                    <li>Bring a camera to capture the serene landscape</li>
                </ul>
            </div>
        </div>
        
      
        
    </body>
</html>

