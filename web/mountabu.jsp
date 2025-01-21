<%-- 
    Document   : mountabu
    Created on : 15 Jan, 2025, 3:43:06 PM
    Author     : DELL
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tourist Places in Mount Abu</title>
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
            
            .place-card:hover {
            transform: translateY(-5px);
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }

        .place-image {
            width: 100%;
            height: 300px;
            object-fit: cover;
        }

        .place-info {
            padding: 20px;
        }

        .place-title {
            font-size: 24px;
            color: #036666;
            margin-bottom: 10px;
        }

        .place-description {
            color: #444;
            margin-bottom: 20px;
            line-height: 1.6;
        }
            .details {
                margin: 15px 0;
                padding: 15px;
                background-color: #e0f2f1;
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
            .place-image-container {
            width: 100%;
            max-width: 800px; /* Adjust this value based on your needs */
            margin: 20px 0;
            overflow: hidden;
            border-radius: 8px;
        }
         /* Optional: Add a max-height if needed */
        .place-image.with-max-height {
            max-height: 500px; /* Adjust this value based on your needs */
            object-position: center;
        }

        /* Container for the entire content */
        .content-container {
            max-width: 1200px;
            margin: 0 auto;
            padding: 20px;
        }

        /* Styling for the place title */
        .place-title {
            color: #008080;
            margin-bottom: 20px;
            font-size: 24px;
        }

        /* Styling for the description */
        .place-description {
            margin: 20px 0;
            line-height: 1.6;
        }
         .imageContainer {
            width: 100%;
            max-width: 800px; /* Adjust this value based on your needs */
            margin: 20px 0;
            overflow: hidden;
            border-radius: 8px;
        }
 .details-grid {
            display: grid;
            grid-gap: 10px;
        }

        .detail-item {
            display: grid;
            grid-template-columns: 100px 1fr;
            align-items: center;
        }

        .detail-label {
            font-weight: bold;
            color: #0891b2;
        }

        .detail-value {
            color: #444;
        }

        @media (min-width: 768px) {
            .tourist-places {
                grid-template-columns: repeat(2, 1fr);
            }
        }

        @media (max-width: 767px) {
            .tourist-places {
                grid-template-columns: 1fr;
            }
            
            .place-image {
                height: 200px;
            }
        }
        </style>
    </head>
    <body>
        <a href="index.jsp" class="back-button">← Back to Regions</a>
        
        <div class="header">
            <h1>Tourist Places in Mount Abu</h1>
            <p>Explore the only hill station in Rajasthan</p>
        </div>
        
        <div class="place-card">
            <h2>Dilwara Temples</h2>
          <div class="imageContainer">
                <img id="placeImage" class="place-image" src="t (1).webp" alt="Qila Mubarak">
            </div>
            <p>Famous for their stunning marble architecture, the Dilwara Temples are dedicated to Jain Tirthankaras and are an architectural marvel.</p>
            <div class="details">
                <p><strong>Timings:</strong> 12:00 PM - 5:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹10 for Indians, ₹50 for foreigners</p>
                <p><strong>Address:</strong> Dilwara Rd, Mount Abu, Rajasthan</p>
                <p><strong>Best Time to Visit:</strong> Early afternoon to avoid crowd</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Dress modestly as it is a religious site</li>
                    <li>Admire the intricate carvings and marble work</li>
                    <li>Hiring a guide is recommended to understand the history and architecture</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Nakki Lake</h2>
            <div id="imageContainer">
                <img id="placeImage" class="place-image" src="ab (1).jpg" alt="Qila Mubarak">
            </div>
            <p>A serene lake located in the heart of Mount Abu, ideal for boating and enjoying the peaceful atmosphere surrounded by hills.</p>
            <div class="details">
                <p><strong>Timings:</strong> 8:00 AM - 8:00 PM</p>
                <p><strong>Entry Fee:</strong> Free</p>
                <p><strong>Address:</strong> Nakki Lake Rd, Mount Abu, Rajasthan</p>
                <p><strong>Best Time to Visit:</strong> Early morning or evening for a cool breeze and less crowd</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Go for a boat ride to explore the lake</li>
                    <li>Visit the nearby Sunset Point after boating</li>
                    <li>Don’t miss the surrounding gardens and local eateries</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Sunset Point</h2>
           <div id="imageContainer">
                <img id="placeImage" class="place-image" src="sunset_Main_800(1).jpg" alt="Qila Mubarak">
            </div>
            <p>One of the best spots to view a stunning sunset with panoramic views of the surrounding mountains and valleys.</p>
            <div class="details">
                <p><strong>Timings:</strong> 4:00 PM - 7:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹20</p>
                <p><strong>Address:</strong> Sunset Point, Mount Abu, Rajasthan</p>
                <p><strong>Best Time to Visit:</strong> Late afternoon to catch the sunset</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Arrive early to secure a good spot for viewing</li>
                    <li>Wear comfortable shoes as it’s a short walk uphill</li>
                    <li>Bring a light jacket, as it can get chilly in the evening</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Guru Shikhar</h2>
            <div id="imageContainer">
                <img id="placeImage" class="place-image" src="view-from-top (1).jpg" alt="Qila Mubarak">
            </div>
            <p>At the highest point in Mount Abu, Guru Shikhar offers breathtaking views and is home to the Guru Dattatreya Temple.</p>
            <div class="details">
                <p><strong>Timings:</strong> 5:00 AM - 7:00 PM</p>
                <p><strong>Entry Fee:</strong> Free</p>
                <p><strong>Address:</strong> Guru Shikhar, Mount Abu, Rajasthan</p>
                <p><strong>Best Time to Visit:</strong> Early morning or evening for the best views</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Bring a camera for panoramic views of the entire region</li>
                    <li>Wear comfortable walking shoes as the path can be steep</li>
                    <li>Spend some time at the temple for a spiritual experience</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Achalgarh Fort</h2>
           <div id="imageContainer">
                <img id="placeImage" class="place-image" src="achala (1).jpg" alt="Qila Mubarak">
            </div>
            <p>An ancient fort offering a glimpse into Mount Abu's history, featuring temples, ruins, and scenic surroundings.</p>
            <div class="details">
                <p><strong>Timings:</strong> 9:00 AM - 5:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹20</p>
                <p><strong>Address:</strong> Achalgarh, Mount Abu, Rajasthan</p>
                <p><strong>Best Time to Visit:</strong> Early morning or late afternoon</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Explore the nearby Jain temples for a deeper cultural experience</li>
                    <li>Carry water, as the climb can be tiring</li>
                    <li>Be cautious around the ruins and ancient structures</li>
                </ul>
            </div>
        </div>
        
        <div class="place-card">
            <h2>Mount Abu Wildlife Sanctuary</h2>
            <div id="imageContainer">
                <img id="placeImage" class="place-image" src="park-sign (1).jpg" alt="Qila Mubarak">
            </div>
            <p>A sanctuary known for its diverse flora and fauna, offering nature walks and wildlife sightings like leopards, bears, and several species of birds.</p>
            <div class="details">
                <p><strong>Timings:</strong> 7:00 AM - 5:00 PM</p>
                <p><strong>Entry Fee:</strong> ₹20 for Indians, ₹50 for foreigners</p>
                <p><strong>Address:</strong> Mount Abu, Rajasthan</p>
                <p><strong>Best Time to Visit:</strong> Winter months (October to March) for pleasant weather</p>
                <p><strong>Tips:</strong></p>
                <ul>
                    <li>Take a guided tour to spot wildlife</li>
                    <li>Wear appropriate clothing for a nature walk</li>
                    <li>Carry binoculars for birdwatching</li>
                </ul>
            </div>
        </div>
        
     
        
    </body>
</html>
