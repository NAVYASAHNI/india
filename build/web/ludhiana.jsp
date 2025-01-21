<%-- 
    Document   : ludhiana
    Created on : 15 Jan, 2025, 4:13:28 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tourist Places in Ludhiana</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #e8f5e9; /* Light Green */
                margin: 0;
                padding: 20px;
            }

            .header {
                text-align: center;
                color: #388e3c; /* Dark Green for headings */
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
                color: #43a047; /* Slightly darker green for headings */
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
                background-color: #c8e6c9; /* Light green background for details */
                border-radius: 5px;
            }

            .back-button {
                display: inline-block;
                padding: 10px 20px;
                background-color: #388e3c; /* Dark green for button */
                color: white;
                text-decoration: none;
                border-radius: 5px;
                margin: 20px 0;
            }

            .back-button:hover {
                background-color: #2e7d32; /* Darker green for hover effect */
            }

        </style>
    </head>
    <body>
        <a href="punjab.jsp" class="back-button">← Back to Regions</a>

        <div class="header">
            <h1>Tourist Places in Ludhiana</h1>
            <p>Discover the vibrant attractions of Ludhiana</p>
        </div>

        <!-- Punjab Agricultural University Museum -->
        <div class="place-card">
            <h2>Punjab Agricultural University Museum</h2>
            <img src="images/paumuseum.jpg" alt="Punjab Agricultural University Museum" class="place-image">
            <p>The Punjab Agricultural University Museum is dedicated to agriculture and farming, with a range of exhibits showcasing the agricultural history of Punjab.</p>
            <div class="details">
                <p><strong>Timings:</strong> 9:00 AM - 5:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹20</p>
                <p><strong>Address:</strong> Punjab Agricultural University, Ludhiana</p>
                <p><strong>Best Time to Visit:</strong> Morning hours for less crowd</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Explore the different sections of the museum to understand agricultural advancements in Punjab</li>
                    <li>Bring a camera to capture the artifacts and exhibitions</li>
                </ul>
            </div>
        </div>

        <!-- Gurudwara Dukh Niwaran Sahib -->
        <div class="place-card">
            <h2>Gurudwara Dukh Niwaran Sahib</h2>
            <img src="images/gurudwara.jpg" alt="Gurudwara Dukh Niwaran Sahib" class="place-image">
            <p>This Gurudwara is known for its peaceful environment and spiritual significance, making it a must-visit for both pilgrims and tourists.</p>
            <div class="details">
                <p><strong>Timings:</strong> 5:00 AM - 9:00 PM</p>
                <p><strong>Entry Fee:</strong> Free</p>
                <p><strong>Address:</strong> Dukh Niwaran Road, Ludhiana</p>
                <p><strong>Best Time to Visit:</strong> Morning or evening prayers for a serene experience</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Wear a headscarf when entering the Gurudwara</li>
                    <li>Participate in the langar (community meal) to experience Punjabi hospitality</li>
                </ul>
            </div>
        </div>

        <!-- Hardy's World Amusement Park -->
        <div class="place-card">
            <h2>Hardy's World Amusement Park</h2>
            <img src="images/hardys-world.jpg" alt="Hardy's World Amusement Park" class="place-image">
            <p>Hardy's World is an amusement park that offers rides, water attractions, and fun activities for all age groups, making it a popular family destination.</p>
            <div class="details">
                <p><strong>Timings:</strong> 10:00 AM - 6:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹300 for adults, ₹200 for children</p>
                <p><strong>Address:</strong> Fattuwal, Ludhiana</p>
                <p><strong>Best Time to Visit:</strong> Summer months for water rides</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Plan to visit during weekdays to avoid long lines</li>
                    <li>Wear comfortable clothes and footwear</li>
                    <li>Bring sunscreen for outdoor activities</li>
                </ul>
            </div>
        </div>

    </body>
</html>

