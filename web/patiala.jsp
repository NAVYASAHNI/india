<%-- 
    Document   : patiala
    Created on : 15 Jan, 2025, 4:12:06 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tourist Places in Patiala</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f3e5f5; /* Light Lavender */
                margin: 0;
                padding: 20px;
            }

            .header {
                text-align: center;
                color: #6a4c9c; /* Purple color for heading */
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
                color: #7e57c2; /* Slightly darker lavender for headings */
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
                background-color: #f9f0f9; /* Light lavender background for details */
                border-radius: 5px;
            }

            .back-button {
                display: inline-block;
                padding: 10px 20px;
                background-color: #6a4c9c; /* Purple color for button */
                color: white;
                text-decoration: none;
                border-radius: 5px;
                margin: 20px 0;
            }

            .back-button:hover {
                background-color: #5e3b8f; /* Darker purple for hover effect */
            }

        </style>
    </head>
    <body>
        <a href="punjab.jsp" class="back-button">← Back to Regions</a>

        <div class="header">
            <h1>Tourist Places in Patiala</h1>
            <p>Discover the cultural and historical landmarks of Patiala</p>
        </div>

        <!-- Qila Mubarak -->
        <div class="place-card">
            <h2>Qila Mubarak</h2>
            <img src="images/qila-mubarak.jpg" alt="Qila Mubarak" class="place-image">
            <p>The historic Qila Mubarak is an ancient fort and one of the major attractions in Patiala, with its beautiful architecture and rich history.</p>
            <div class="details">
                <p><strong>Timings:</strong> 9:00 AM - 5:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹20 for Indians, ₹50 for foreigners</p>
                <p><strong>Address:</strong> Qila Mubarak, Patiala</p>
                <p><strong>Best Time to Visit:</strong> Morning or late afternoon to avoid heat</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Explore the inner chambers and the palace area</li>
                    <li>Don't miss the beautiful garden in the fort's premises</li>
                    <li>Wear comfortable footwear for walking around the fort</li>
                </ul>
            </div>
        </div>

        <!-- Sheesh Mahal -->
        <div class="place-card">
            <h2>Sheesh Mahal</h2>
            <img src="images/sheesh-mahal.jpg" alt="Sheesh Mahal" class="place-image">
            <p>Sheesh Mahal, the Mirror Palace, is famous for its intricate glasswork and beautiful architecture, representing the grandeur of Patiala's royal era.</p>
            <div class="details">
                <p><strong>Timings:</strong> 10:00 AM - 6:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹30 for Indians, ₹100 for foreigners</p>
                <p><strong>Address:</strong> Sheesh Mahal Rd, Patiala</p>
                <p><strong>Best Time to Visit:</strong> Early morning for fewer crowds</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Take a guided tour to understand the history behind the palace</li>
                    <li>Photographers will love the reflective mirror walls</li>
                    <li>It's best to visit during the cooler months</li>
                </ul>
            </div>
        </div>

        <!-- Moti Bagh Palace -->
        <div class="place-card">
            <h2>Moti Bagh Palace</h2>
            <img src="images/moti-bagh-palace.jpg" alt="Moti Bagh Palace" class="place-image">
            <p>The Moti Bagh Palace is an 18th-century royal palace known for its exquisite gardens and magnificent architecture.</p>
            <div class="details">
                <p><strong>Timings:</strong> 9:00 AM - 5:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹10 for Indians, ₹50 for foreigners</p>
                <p><strong>Address:</strong> Moti Bagh Palace, Patiala</p>
                <p><strong>Best Time to Visit:</strong> Early morning or evening for a peaceful experience</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Take a stroll through the lush gardens and enjoy the natural beauty</li>
                    <li>Visit the museum inside the palace to learn about its history</li>
                </ul>
            </div>
        </div>

    </body>
</html>
