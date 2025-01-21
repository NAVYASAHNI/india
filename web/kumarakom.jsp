<%-- 
    Document   : kumarakom
    Created on : 15 Jan, 2025, 4:04:32 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tourist Places in Kumarakom</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #e0f7fa;
                margin: 0;
                padding: 20px;
            }
            
            .header {
                text-align: center;
                color: #004d40;
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
                color: #00796b;
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
                background-color:  #e0f2f1;
                border-radius: 5px;
            }
            
            .back-button {
                display: inline-block;
                padding: 10px 20px;
                background-color: #009688;
                color: white;
                text-decoration: none;
                border-radius: 5px;
                margin: 20px 0;
            }
            
            .back-button:hover {
                background-color: #00796b;
            }
       
        </style>
    </head>
    <body>
        <a href="kerela.jsp" class="back-button">← Back to Regions</a>
        
        <div class="header">
            <h1>Tourist Places in Kumarakom</h1>
            <p>Explore the serene beauty of Kumarakom</p>
        </div>
        
        <div class="place-card">
            <h2>Kumarakom Backwaters</h2>
            <img src="images/kumarakom-backwaters.jpg" alt="Kumarakom Backwaters" class="place-image">
            <p>The backwaters of Kumarakom are famous for their scenic beauty, offering a peaceful retreat and boat cruises amidst lush greenery and local wildlife.</p>
            <div class="details">
                <p><strong>Timings:</strong> Open throughout the day</p>
                <p><strong>Entry Fee:</strong> Varies depending on the boat ride package</p>
                <p><strong>Address:</strong> Kumarakom, Kottayam, Kerala</p>
                <p><strong>Best Time to Visit:</strong> November to February</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Book a houseboat cruise for the full backwater experience</li>
                    <li>Carry sunscreen and a hat, as it can get hot during midday</li>
                    <li>Take a camera for beautiful scenic views of the backwaters</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Vembanad Lake</h2>
            <img src="images/vembanad-lake.jpg" alt="Vembanad Lake" class="place-image">
            <p>Vembanad Lake is the longest lake in India, offering tranquil waters surrounded by lush greenery. It's ideal for boating, fishing, and bird watching.</p>
            <div class="details">
                <p><strong>Timings:</strong> Open throughout the day</p>
                <p><strong>Entry Fee:</strong> Free (Charges apply for boat rides)</p>
                <p><strong>Address:</strong> Vembanadu Lake, Kumarakom, Kottayam, Kerala</p>
                <p><strong>Best Time to Visit:</strong> November to March</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Try the traditional Kerala houseboat experience</li>
                    <li>Wear comfortable shoes for walking along the shores</li>
                    <li>Carry binoculars if you're interested in bird watching</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Bay Island Driftwood Museum</h2>
            <img src="images/bay-island-museum.jpg" alt="Bay Island Driftwood Museum" class="place-image">
            <p>This unique museum showcases a rare collection of driftwood sculptures and artifacts found in the local backwaters, offering a glimpse of artistic creativity.</p>
            <div class="details">
                <p><strong>Timings:</strong> 9:00 AM - 5:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹20 for adults, ₹10 for children</p>
                <p><strong>Address:</strong> Bay Island Driftwood Museum, Kumarakom, Kerala</p>
                <p><strong>Best Time to Visit:</strong> October to March</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Don't forget to explore the nearby village after visiting the museum</li>
                    <li>Perfect for photography enthusiasts who enjoy capturing unique art forms</li>
                    <li>Visit in the early morning or late afternoon to avoid crowds</li>
                </ul>
            </div>
        </div>
        
        <!-- Add more place cards as needed -->
        
    </body>
</html>
