<%-- 
    Document   : dashboard
    Created on : 14 Jan, 2025, 3:10:24 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Explore India: State-by-State Travel Guide</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, sans-serif;
        }

        .background-container {
            position: fixed;
            top: 0;
            left: 0;
            width: 100%;
            height: 100vh;
            /* Gradient background instead of image */
            background: linear-gradient(135deg, 
                #FF9933, /* Saffron */
                #FFFFFF, /* White */
                #138808  /* Green */
            );
            opacity: 0.8;
            z-index: -1;
          background: linear-gradient(rgba(0, 0, 0, 0.3), rgba(0, 0, 0, 0.3)), 
                        url('b4.jpeg');
            background-size: cover;
            background-position: center;
        }

        .container {
            min-height: 100vh;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            padding: 20px;
            text-align: center;
        }

        .title {
            color: white;
            font-size: 48px;
            margin-bottom: 20px;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.5);
        }

        .tagline {
            color: white;
            font-size: 24px;
            margin-bottom: 40px;
            text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.5);
        }

        .search-container {
            width: 100%;
            max-width: 600px;
            position: relative;
        }

        .search-input {
            width: 100%;
            padding: 15px 100px 15px 20px;
            font-size: 18px;
            border: none;
            border-radius: 30px;
            background: rgba(255, 255, 255, 0.9);
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            transition: all 0.3s ease;
        }

        .search-input:focus {
            outline: none;
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.2);
            background: rgba(255, 255, 255, 1);
        }

        .search-buttons {
            position: absolute;
            right: 10px;
            top: 50%;
            transform: translateY(-50%);
            display: flex;
            gap: 10px;
        }

        .btn {
            background: none;
            border: none;
            cursor: pointer;
            padding: 8px 12px;
            border-radius: 50%;
            transition: all 0.3s ease;
            font-size: 20px;
            color: #666;
        }

        .btn:hover {
            background-color: rgba(0, 0, 0, 0.1);
            color: #000;
        }

        .btn.active {
            color: #ff4444;
        }

        .listening-indicator {
            margin-top: 20px;
            padding: 10px 20px;
            background: rgba(0, 0, 0, 0.7);
            color: white;
            border-radius: 20px;
            display: none;
            animation: pulse 1.5s infinite;
        }

        @keyframes pulse {
            0% { opacity: 1; }
            50% { opacity: 0.5; }
            100% { opacity: 1; }
        }

        @media (max-width: 768px) {
            .title {
                font-size: 36px;
            }
            
            .tagline {
                font-size: 20px;
            }
            
            .search-input {
                font-size: 16px;
            }
        }
        
     
    </style>
</head>
<body>
    <div class="background-container"></div>
    
    <div class="container">
        <h1 class="title">Explore India: State-by-State Travel Guide</h1>
        <p class="tagline">Discover the beauty of India, one state at a time!</p>
        
        <div class="search-container">
            <input type="text" 
                   id="searchInput" 
                   class="search-input" 
                   placeholder="Search for a state (e.g., Rajasthan, Kerala)">
            
            <div class="search-buttons">
                <button class="btn" onclick="handleSearch()" title="Search">
                    &#128269; <!-- Magnifying glass emoji -->
                </button>
                <button class="btn" id="voiceSearchBtn" title="Voice Search">
                    &#127908; <!-- Microphone emoji -->
                </button>
            </div>
        </div>
        
        <div id="listeningIndicator" class="listening-indicator">
            Listening... Speak now
        </div>
<!--        <div id="imageContainer">
                <img id="placeImage" class="place-image" src="a.jpg" alt="Qila Mubarak">
            </div>-->
    </div>

   <script>
       
    let recognition = null;
    let isListening = false;

    // Initialize speech recognition
    if ('webkitSpeechRecognition' in window) {
        recognition = new webkitSpeechRecognition();
        recognition.continuous = false;
        recognition.interimResults = false;
        recognition.lang = 'en-IN';
    }

    const searchInput = document.getElementById('searchInput');
    const voiceSearchBtn = document.getElementById('voiceSearchBtn');
    const listeningIndicator = document.getElementById('listeningIndicator');

    function handleSearch() {
        const searchTerm = searchInput.value.trim().toLowerCase();
        if (searchTerm) {
            // Create a mapping of states to their corresponding pages
            const statePages = {
                'rajasthan': 'jai.jsp',
                'Rajasthan': 'jai.jsp',
                'Rajasthan.': 'jai.jsp',
                'RAJASTHAN': 'jai.jsp',
                'kerala': 'kerela.jsp',
                'punjab': 'punjab.jsp',
                // Add more states and corresponding pages here
            };

            // Check if the search term matches a state in the mapping
            if (statePages[searchTerm]) {
                // Redirect to the corresponding page
                window.location.href = statePages[searchTerm];
            } else {
                alert('State not found. Please try again!');
            }
        }
    }

    function toggleVoiceSearch() {
        if (!recognition) {
            alert('Voice search is not supported in your browser. Please use Chrome or Edge browser.');
            return;
        }

        if (isListening) {
            recognition.stop();
        } else {
            recognition.start();
            listeningIndicator.style.display = 'inline-block';
        }
    }

    if (recognition) {
        recognition.onstart = () => {
            isListening = true;
            voiceSearchBtn.classList.add('active');
        };

        recognition.onresult = (event) => {
            const transcript = event.results[0][0].transcript;
            searchInput.value = transcript;
            searchInput.focus();
        };

        recognition.onerror = () => {
            isListening = false;
            listeningIndicator.style.display = 'none';
            voiceSearchBtn.classList.remove('active');
        };

        recognition.onend = () => {
            isListening = false;
            listeningIndicator.style.display = 'none';
            voiceSearchBtn.classList.remove('active');
        };
    }

    // Event listeners
    voiceSearchBtn.addEventListener('click', toggleVoiceSearch);

    searchInput.addEventListener('keypress', (e) => {
        if (e.key === 'Enter') {
            handleSearch();
        }
    });
</script>

</body>
</html>