<%-- 
    Document   : thekkady
    Created on : 15 Jan, 2025, 4:00:30 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tourist Places in Thekkady</title>
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
            <h1>Tourist Places in Thekkady</h1>
            <p>Explore the wildlife and natural beauty of Thekkady</p>
        </div>
        
        <div class="place-card">
            <h2>Thekkady Wildlife Sanctuary</h2>
            <img src="images/thekkady-wildlife.jpg" alt="Thekkady Wildlife Sanctuary" class="place-image">
            <p>Thekkady Wildlife Sanctuary is famous for its diverse flora and fauna, and it's a great place for wildlife enthusiasts and nature lovers.</p>
            <div class="details">
                <p><strong>Timings:</strong> 6:00 AM - 6:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹30 for Indians, ₹500 for foreigners</p>
                <p><strong>Address:</strong> Thekkady, Kumily, Kerala</p>
                <p><strong>Best Time to Visit:</strong> October to February for good weather and wildlife sightings</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Book a guided tour to explore the sanctuary better</li>
                    <li>Carry binoculars and a camera for wildlife spotting</li>
                    <li>Visit during early morning or late afternoon for the best wildlife sightings</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Periyar Lake</h2>
            <img src="images/periyar-lake.jpg" alt="Periyar Lake" class="place-image">
            <p>Periyar Lake is a scenic destination offering boat rides where visitors can spot elephants, deer, and other wildlife.</p>
            <div class="details">
                <p><strong>Timings:</strong> 7:00 AM - 5:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹25 for Indians, ₹300 for foreigners</p>
                <p><strong>Address:</strong> Thekkady, Kumily, Kerala</p>
                <p><strong>Best Time to Visit:</strong> November to February</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Book a boat ride in advance to avoid waiting in long queues</li>
                    <li>Carry water and snacks as there are limited options available</li>
                    <li>Dress in comfortable clothing and wear a hat and sunscreen</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Murikkady Plantation</h2>
            <img src="images/murikkady-plantation.jpg" alt="Murikkady Plantation" class="place-image">
            <p>Murikkady is known for its spice plantations, offering visitors a chance to experience the beauty of coffee, tea, and cardamom cultivation.</p>
            <div class="details">
                <p><strong>Timings:</strong> 9:00 AM - 5:00 PM</p>
                <p><strong>Entry Fee:</strong> Free</p>
                <p><strong>Address:</strong> Thekkady, Kumily, Kerala</p>
                <p><strong>Best Time to Visit:</strong> September to March</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Take a guided tour to learn about the cultivation process</li>
                    <li>Wear comfortable shoes as you will be walking on uneven paths</li>
                    <li>Sample local products such as fresh spices and teas</li>
                </ul>
            </div>
        </div>
        
        <!-- Add more place cards as needed -->
        
    </body>
</html>
