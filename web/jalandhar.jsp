<%-- 
    Document   : jalandhar
    Created on : 15 Jan, 2025, 4:13:11 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tourist Places in Jalandhar</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f8bbd0; /* Light Pink */
                margin: 0;
                padding: 20px;
            }

            .header {
                text-align: center;
                color: #ec407a; /* Deep Pink for headings */
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
                color: #f06292; /* Slightly darker pink for headings */
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
                background-color: #fce4ec; /* Light pink background for details */
                border-radius: 5px;
            }

            .back-button {
                display: inline-block;
                padding: 10px 20px;
                background-color: #ec407a; /* Deep pink for button */
                color: white;
                text-decoration: none;
                border-radius: 5px;
                margin: 20px 0;
            }

            .back-button:hover {
                background-color: #d81b60; /* Darker pink for hover effect */
            }

        </style>
    </head>
    <body>
        <a href="punjab.jsp" class="back-button">← Back to Regions</a>

        <div class="header">
            <h1>Tourist Places in Jalandhar</h1>
            <p>Explore the charming destinations of Jalandhar</p>
        </div>

        <!-- Devi Talab Mandir -->
        <div class="place-card">
            <h2>Devi Talab Mandir</h2>
            <img src="images/devi-talab-mandir.jpg" alt="Devi Talab Mandir" class="place-image">
            <p>Devi Talab Mandir is an ancient temple dedicated to Goddess Durga, one of the most famous and revered temples in Jalandhar.</p>
            <div class="details">
                <p><strong>Timings:</strong> 5:00 AM - 9:00 PM</p>
                <p><strong>Entry Fee:</strong> Free</p>
                <p><strong>Address:</strong> Devi Talab, Jalandhar</p>
                <p><strong>Best Time to Visit:</strong> Morning and evening for peaceful prayers</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Visit during the Navratri festival for a special experience</li>
                    <li>Dress modestly as it's a religious place</li>
                    <li>Try the Prasad offered at the temple</li>
                </ul>
            </div>
        </div>

        <!-- Wonderland Theme Park -->
        <div class="place-card">
            <h2>Wonderland Theme Park</h2>
            <img src="images/wonderland-theme-park.jpg" alt="Wonderland Theme Park" class="place-image">
            <p>Wonderland Theme Park offers fun-filled rides, water attractions, and entertainment for families, making it a popular choice for tourists in Jalandhar.</p>
            <div class="details">
                <p><strong>Timings:</strong> 10:00 AM - 7:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹300 for adults, ₹200 for children</p>
                <p><strong>Address:</strong> Near Fattuwal, Jalandhar</p>
                <p><strong>Best Time to Visit:</strong> Summer months for water rides</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Visit on weekdays to avoid the weekend rush</li>
                    <li>Wear comfortable clothes and shoes for the rides</li>
                    <li>Bring sunscreen and stay hydrated</li>
                </ul>
            </div>
        </div>

        <!-- Pushpa Gujral Science City -->
        <div class="place-card">
            <h2>Pushpa Gujral Science City</h2>
            <img src="images/pushpa-gujral-science-city.jpg" alt="Pushpa Gujral Science City" class="place-image">
            <p>Pushpa Gujral Science City is a science and technology museum with interactive exhibits, a planetarium, and a range of educational displays.</p>
            <div class="details">
                <p><strong>Timings:</strong> 10:00 AM - 5:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹40 for Indians, ₹100 for foreigners</p>
                <p><strong>Address:</strong> GT Road, Jalandhar</p>
                <p><strong>Best Time to Visit:</strong> Anytime, ideal for students and science enthusiasts</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Spend time at the planetarium for an immersive experience</li>
                    <li>Take the guided tour to understand the exhibits better</li>
                </ul>
            </div>
        </div>

    </body>
</html>

