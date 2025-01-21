<%-- 
    Document   : bathinda
    Created on : 15 Jan, 2025, 4:13:43 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tourist Places in Bathinda</title>
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
            <h1>Tourist Places in Bathinda</h1>
            <p>Explore the historical and cultural gems of Bathinda</p>
        </div>

        <!-- Qila Mubarak -->
        <div class="place-card">
            <h2>Qila Mubarak</h2>
<!--           <form class="image-upload-form" id="imageUploadForm">
                <input type="file" id="imageInput" class="file-input" accept="image/*">
                <button type="submit" class="upload-btn">Upload Image</button>
            </form>-->
            
            <!-- Image container where the uploaded image will be displayed -->
            <div id="imageContainer">
                <img id="placeImage" class="place-image" src="a.jpg" alt="Qila Mubarak">
            </div>
            <p>Qila Mubarak is a historic fort in Bathinda, known for its ancient architecture and rich history. The fort is a landmark of the city and a must-visit for history enthusiasts.</p>
            <div class="details">
                <p><strong>Timings:</strong> 9:00 AM - 5:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹20</p>
                <p><strong>Address:</strong> Qila Mubarak Rd, Bathinda</p>
                <p><strong>Best Time to Visit:</strong> Early morning or late afternoon to avoid the heat</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Explore the fort's history and architecture with a local guide</li>
                    <li>Carry water and wear comfortable shoes for walking</li>
                </ul>
            </div>
        </div>

        <!-- Bathinda Lake -->
        <div class="place-card">
            <h2>Bathinda Lake</h2>
            <img src="images/bathinda-lake.jpg" alt="Bathinda Lake" class="place-image">
            <p>Bathinda Lake is a serene spot located near the city's center, ideal for picnics and boat rides. The peaceful ambiance makes it a perfect escape from the bustling city life.</p>
            <div class="details">
                <p><strong>Timings:</strong> 9:00 AM - 6:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹30</p>
                <p><strong>Address:</strong> Bathinda Lake Rd, Bathinda</p>
                <p><strong>Best Time to Visit:</strong> Evening for a calm experience by the water</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Don't forget to bring your camera to capture the scenic views</li>
                    <li>Try the boat rides for a peaceful experience on the lake</li>
                </ul>
            </div>
        </div>

        <!-- Rose Garden -->
        <div class="place-card">
            <h2>Rose Garden</h2>
            <img src="images/rose-garden.jpg" alt="Rose Garden" class="place-image">
            <p>The Rose Garden is a beautiful park with vibrant roses in full bloom. It's a great spot for nature lovers, photographers, and those looking for a relaxing walk.</p>
            <div class="details">
                <p><strong>Timings:</strong> 6:00 AM - 9:00 PM</p>
                <p><strong>Entry Fee:</strong> Free</p>
                <p><strong>Address:</strong> Rose Garden Rd, Bathinda</p>
                <p><strong>Best Time to Visit:</strong> Early morning or late evening when the weather is pleasant</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Bring a hat and sunscreen for protection under the sun</li>
                    <li>Enjoy a peaceful stroll through the rose-filled pathways</li>
                </ul>
            </div>
        </div>

    </body>
</html>
