<%-- 
    Document   : amritsar
    Created on : 15 Jan, 2025, 4:11:47 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tourist Places in Amritsar</title>
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
        <a href="punjab.jsp" class="back-button">← Back to Regions</a>

        <div class="header">
            <h1>Tourist Places in Amritsar</h1>
            <p>Explore the spiritual and historical beauty of Amritsar</p>
        </div>

        <!-- Golden Temple -->
        <div class="place-card">
            <h2>Golden Temple</h2>
            <div class="imageContainer">
                <img id="placeImage" class="place-image" src="g (1).webp" alt="Qila Mubarak">
            </div>
            <p>The Golden Temple, also known as Harmandir Sahib, is the holiest Gurdwara and the most important pilgrimage site of Sikhism.</p>
            <div class="details">
                <p><strong>Timings:</strong> 4:00 AM - 10:00 PM</p>
                <p><strong>Entry Fee:</strong> Free</p>
                <p><strong>Address:</strong> Golden Temple Rd, Amritsar, Punjab</p>
                <p><strong>Best Time to Visit:</strong> Early morning or evening for peaceful surroundings and a serene experience</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Wear modest attire while visiting the temple</li>
                    <li>Visit the community kitchen (Langar) to experience the service</li>
                    <li>Be respectful to the traditions and practices of the Gurdwara</li>
                </ul>
            </div>
        </div>

        <!-- Jallianwala Bagh -->
        <div class="place-card">
            <h2>Jallianwala Bagh</h2>
           <div class="imageContainer">
                <img id="placeImage" class="place-image" src="j (1).jpeg" alt="Qila Mubarak">
            </div>
            <p>The Jallianwala Bagh is a public garden that is historically significant for the massacre that occurred here in 1919.</p>
            <div class="details">
                <p><strong>Timings:</strong> 6:30 AM - 7:30 PM</p>
                <p><strong>Entry Fee:</strong> ₹15 for Indians, ₹100 for foreigners</p>
                <p><strong>Address:</strong> Near Golden Temple, Amritsar, Punjab</p>
                <p><strong>Best Time to Visit:</strong> Early mornings or late evenings</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Visit the memorial to pay your respects to the martyrs</li>
                    <li>Take a guided tour to understand the significance of the site</li>
                    <li>Wear comfortable footwear as it involves walking around the garden</li>
                </ul>
            </div>
        </div>

        <!-- Partition Museum -->
        <div class="place-card">
            <h2>Partition Museum</h2>
           <div class="imageContainer">
                <img id="placeImage" class="place-image" src="tt (1).jpg" alt="Qila Mubarak">
            </div>
            <p>The Partition Museum is dedicated to the history and aftermath of the partition of India in 1947.</p>
            <div class="details">
                <p><strong>Timings:</strong> 10:00 AM - 6:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹10 for Indians, ₹50 for foreigners</p>
                <p><strong>Address:</strong> Town Hall, Amritsar, Punjab</p>
                <p><strong>Best Time to Visit:</strong> During the day, as the museum provides a detailed account of history</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Explore the exhibitions to understand the impact of the partition on the region</li>
                    <li>Check the museum’s schedule for events or talks about the partition</li>
                </ul>
            </div>
        </div>

    </body>
</html>

