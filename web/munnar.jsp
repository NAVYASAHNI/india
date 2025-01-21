<%-- 
    Document   : munnar
    Created on : 15 Jan, 2025, 3:59:36 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tourist Places in Munnar</title>
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
            <h1>Tourist Places in Munnar</h1>
            <p>Explore the scenic beauty and natural attractions of Munnar</p>
        </div>
        
        <div class="place-card">
            <h2>Tea Gardens of Munnar</h2>
           <div class="imageContainer">
                <img id="placeImage" class="place-image" src="r.jpg" alt="Qila Mubarak">
            </div>
            <p>Munnar is famous for its lush tea plantations spread across rolling hills, offering picturesque landscapes.</p>
            <div class="details">
                <p><strong>Timings:</strong> Open 24 hours (Best to visit in the morning or late afternoon)</p>
                <p><strong>Entry Fee:</strong> Free</p>
                <p><strong>Address:</strong> Munnar, Idukki District, Kerala</p>
                <p><strong>Best Time to Visit:</strong> November to March</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Take a guided tour of the tea plantations</li>
                    <li>Don't forget to click photos amidst the green fields</li>
                    <li>Wear comfortable shoes for walking</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Mattupetty Dam</h2>
            <div class="imageContainer">
                <img id="placeImage" class="place-image" src="m.avif" alt="Qila Mubarak">
            </div>
            <p>Mattupetty Dam is a popular picnic spot in Munnar, known for its serene waters and surrounding hills.</p>
            <div class="details">
                <p><strong>Timings:</strong> 9:00 AM - 5:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹10 for Indians, ₹50 for foreigners</p>
                <p><strong>Address:</strong> Mattupetty, Munnar</p>
                <p><strong>Best Time to Visit:</strong> Early morning or evening for a peaceful experience</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Enjoy boating in the reservoir</li>
                    <li>Visit the nearby dairy farm for a unique experience</li>
                    <li>Perfect spot for nature lovers and photographers</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Attukal Waterfalls</h2>
            <div class="imageContainer">
                <img id="placeImage" class="place-image" src="as.jpg" alt="Qila Mubarak">
            </div>
            <p>Attukal Waterfalls is a beautiful, serene waterfall located amidst the Western Ghats, offering a peaceful escape.</p>
            <div class="details">
                <p><strong>Timings:</strong> 9:00 AM - 5:00 PM</p>
                <p><strong>Entry Fee:</strong> Free</p>
                <p><strong>Address:</strong> Attukal, Munnar</p>
                <p><strong>Best Time to Visit:</strong> Monsoon season (June to September) for the best views</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Wear comfortable footwear as the path can be rocky</li>
                    <li>Carry a camera to capture the beauty of the waterfall</li>
                    <li>Perfect spot for a refreshing picnic</li>
                </ul>
            </div>
        </div>
        
       
        
    </body>
</html>
