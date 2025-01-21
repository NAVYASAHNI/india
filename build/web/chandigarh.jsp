<%-- 
    Document   : chandigarh
    Created on : 15 Jan, 2025, 4:11:55 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tourist Places in Chandigarh</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #fff9e6;
                margin: 0;
                padding: 20px;
            }

            .header {
                text-align: center;
                color: #ffcc00;
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
                color: #ff9900;
                margin-top: 0;
            }

            .place-image {
                width: 100%;
                height: 400px;
                object-fit: cover;
                border-radius: 8px;
                margin: 10px 0;
            }

            .details {
                margin: 15px 0;
                padding: 15px;
                background-color: #fff7d9;
                border-radius: 5px;
            }

            .back-button {
                display: inline-block;
                padding: 10px 20px;
                background-color: #ffcc00;
                color: white;
                text-decoration: none;
                border-radius: 5px;
                margin: 20px 0;
            }

            .back-button:hover {
                background-color: #ffb300;
            }

        </style>
    </head>
    <body>
        <a href="punjab.jsp" class="back-button">← Back to Regions</a>

        <div class="header">
            <h1>Tourist Places in Chandigarh</h1>
            <p>Explore the beauty and modern architecture of Chandigarh</p>
        </div>

        <!-- Sukhna Lake -->
        <div class="place-card">
            <h2>Sukhna Lake</h2>
            <div id="imageContainer">
                <img id="placeImage" class="place-image" src="s.jpg" alt="Qila Mubarak">
            </div>
            <p>Sukhna Lake is a man-made reservoir at the foothills of the Himalayas, popular for boating and its scenic beauty.</p>
            <div class="details">
                <p><strong>Timings:</strong> 5:00 AM - 9:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹10 for Indians, ₹50 for foreigners</p>
                <p><strong>Address:</strong> Sector 1, Chandigarh</p>
                <p><strong>Best Time to Visit:</strong> Early mornings and evenings for a peaceful experience</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Boating is a popular activity here, try it for a unique experience</li>
                    <li>Visit during sunset for beautiful views of the lake</li>
                    <li>Wear comfortable shoes if you plan to walk around the lake</li>
                </ul>
            </div>
        </div>

        <!-- Rock Garden -->
        <div class="place-card">
            <h2>Rock Garden</h2>
           <div id="imageContainer">
                <img id="placeImage" class="place-image" src="rr (1).jpg" alt="Qila Mubarak">
            </div>
            <p>The Rock Garden of Chandigarh is a unique garden made entirely from industrial & home waste and thrown-away items.</p>
            <div class="details">
                <p><strong>Timings:</strong> 9:00 AM - 7:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹30 for Indians, ₹50 for foreigners</p>
                <p><strong>Address:</strong> Sector 1, Chandigarh</p>
                <p><strong>Best Time to Visit:</strong> Afternoon to enjoy the artistic sculptures</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Spend time exploring the various sections of the garden</li>
                    <li>Photography is allowed, so don’t forget to bring your camera</li>
                    <li>Visit on weekdays to avoid heavy crowds</li>
                </ul>
            </div>
        </div>

        <!-- Elante Mall -->
        <div class="place-card">
            <h2>Elante Mall</h2>
           <div id="imageContainer">
                <img id="placeImage" class="place-image" src="ee (1).webp" alt="Qila Mubarak">
            </div>
            <p>Elante Mall is one of the largest shopping malls in Chandigarh, offering a wide range of shopping, dining, and entertainment options.</p>
            <div class="details">
                <p><strong>Timings:</strong> 10:00 AM - 10:00 PM</p>
                <p><strong>Entry Fee:</strong> Free</p>
                <p><strong>Address:</strong> Industrial Area, Chandigarh</p>
                <p><strong>Best Time to Visit:</strong> Evening for shopping and dining</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Check out the entertainment zone for kids and families</li>
                    <li>Great place for shopping and enjoying delicious meals</li>
                </ul>
            </div>
        </div>

    </body>
</html>

