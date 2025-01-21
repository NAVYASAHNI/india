<%-- 
    Document   : jodhpur
    Created on : 15 Jan, 2025, 3:40:31 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tourist Places in Jodhpur</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #e6f7ff;
                margin: 0;
                padding: 20px;
            }
            
            .header {
                text-align: center;
                color: #003366;
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
                color: #00509e;
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
                background-color: #f2f9ff;
                border-radius: 5px;
            }
            
            .back-button {
                display: inline-block;
                padding: 10px 20px;
                background-color: #3399ff;
                color: white;
                text-decoration: none;
                border-radius: 5px;
                margin: 20px 0;
            }
            
            .back-button:hover {
                background-color: #0073e6;
            }
        </style>
    </head>
    <body>
        <a href="jai.jsp" class="back-button">← Back to Regions</a>
        
        <div class="header">
            <h1>Tourist Places in Jodhpur</h1>
            <p>Explore the heritage and charm of the Blue City</p>
        </div>
        
        <div class="place-card">
            <h2>Mehrangarh Fort</h2>
            <img src="images/mehrangarh-fort.jpg" alt="Mehrangarh Fort" class="place-image">
            <p>One of the largest forts in India, built in 1459. Famous for its impressive architecture and panoramic views of the Blue City.</p>
            <div class="details">
                <p><strong>Timings:</strong> 9:00 AM - 5:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹100 for Indians, ₹600 for foreigners</p>
                <p><strong>Address:</strong> Fort Rd, Jodhpur, Rajasthan</p>
                <p><strong>Best Time to Visit:</strong> Early morning for cool weather and fewer crowds</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Take the elevator to the top for stunning views</li>
                    <li>Visit the museum to learn about Jodhpur's royal history</li>
                    <li>Enjoy a meal at the rooftop café inside the fort</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Umaid Bhawan Palace</h2>
            <img src="images/umaid-bhawan-palace.jpg" alt="Umaid Bhawan Palace" class="place-image">
            <p>A magnificent palace built between 1928 and 1943. Part of it still serves as the royal residence, while another part is a luxury hotel and museum.</p>
            <div class="details">
                <p><strong>Timings:</strong> 10:00 AM - 4:30 PM (Museum)</p>
                <p><strong>Entry Fee:</strong> ₹30 for Indians, ₹100 for foreigners</p>
                <p><strong>Address:</strong> Circuit House Rd, Jodhpur, Rajasthan</p>
                <p><strong>Best Time to Visit:</strong> Morning hours for museum exploration</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Book a stay at the palace for a royal experience</li>
                    <li>Don’t miss the vintage car collection in the museum</li>
                    <li>Enjoy high tea at the palace hotel</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Jaswant Thada</h2>
            <img src="images/jaswant-thada.jpg" alt="Jaswant Thada" class="place-image">
            <p>Known as the "Taj Mahal of Marwar," this cenotaph is made of intricately carved marble and offers a peaceful ambiance.</p>
            <div class="details">
                <p><strong>Timings:</strong> 9:00 AM - 5:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹30 for Indians, ₹50 for foreigners</p>
                <p><strong>Address:</strong> Near Mehrangarh Fort, Jodhpur, Rajasthan</p>
                <p><strong>Best Time to Visit:</strong> Early morning or evening</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Combine your visit with Mehrangarh Fort</li>
                    <li>Capture the serene lake view nearby</li>
                    <li>Hire a guide for historical insights</li>
                </ul>
            </div>
        </div>
        
        <!-- Add more place cards as needed -->
        
    </body>
</html>

