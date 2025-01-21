<%-- 
    Document   : udaipur
    Created on : 15 Jan, 2025, 3:38:21 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tourist Places in Udaipur</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f0f8ff;
                margin: 0;
                padding: 20px;
            }
            
            .header {
                text-align: center;
                color: #004d80;
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
                color: #0059b3;
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
                background-color: #f7faff;
                border-radius: 5px;
            }
            
            .back-button {
                display: inline-block;
                padding: 10px 20px;
                background-color: #0073e6;
                color: white;
                text-decoration: none;
                border-radius: 5px;
                margin: 20px 0;
            }
            
            .back-button:hover {
                background-color: #0059b3;
            }
        </style>
    </head>
    <body>
        <a href="jai.jsp" class="back-button">← Back to Regions</a>
        
        <div class="header">
            <h1>Tourist Places in Udaipur</h1>
            <p>Explore the serene lakes and palaces of the City of Lakes</p>
        </div>
        
        <div class="place-card">
            <h2>City Palace</h2>
            <img src="images/city-palace.jpg" alt="City Palace" class="place-image">
            <p>A majestic palace complex built over nearly 400 years. Known for its intricate architecture and breathtaking views of Lake Pichola.</p>
            <div class="details">
                <p><strong>Timings:</strong> 9:30 AM - 5:30 PM</p>
                <p><strong>Entry Fee:</strong> ₹300 for adults, ₹100 for children</p>
                <p><strong>Address:</strong> Old City, Udaipur, Rajasthan</p>
                <p><strong>Best Time to Visit:</strong> Morning or evening for beautiful lighting</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Buy combined tickets for City Palace and Crystal Gallery</li>
                    <li>Enjoy a boat ride in Lake Pichola for spectacular views</li>
                    <li>Hire a guide to learn about its rich history</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Lake Pichola</h2>
            <img src="images/lake-pichola.jpg" alt="Lake Pichola" class="place-image">
            <p>An artificial freshwater lake created in 1362 AD, offering picturesque views of the city. Surrounded by palaces and temples.</p>
            <div class="details">
                <p><strong>Timings:</strong> Open all day</p>
                <p><strong>Boat Ride Timings:</strong> 10:00 AM - 5:00 PM</p>
                <p><strong>Boat Ride Fee:</strong> ₹400-₹800 per person</p>
                <p><strong>Best Time to Visit:</strong> Sunset for a magical experience</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Opt for a sunset boat ride for the best experience</li>
                    <li>Capture the scenic view of the City Palace from the lake</li>
                    <li>Visit Jag Mandir Island for a unique dining experience</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Jag Mandir</h2>
            <img src="images/jag-mandir.jpg" alt="Jag Mandir" class="place-image">
            <p>Also known as the "Lake Garden Palace," Jag Mandir is a beautiful structure built on an island in Lake Pichola.</p>
            <div class="details">
                <p><strong>Timings:</strong> 10:00 AM - 6:00 PM</p>
                <p><strong>Entry Fee:</strong> Included with boat ride</p>
                <p><strong>Best Time to Visit:</strong> During the day for clear views</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Enjoy a peaceful walk around the palace gardens</li>
                    <li>Visit the café for a relaxing break</li>
                    <li>Learn about the history of this island palace</li>
                </ul>
            </div>
        </div>
        
        <!-- Add more place cards as needed -->
        
    </body>
</html>

