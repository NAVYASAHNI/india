<%-- 
    Document   : result
    Created on : 14 Jan, 2025, 4:40:58 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Search Results</title>
</head>
<body>
    <h1>Search Results</h1>
    <% 
        try {
            // Define destinations
            HashMap<String, List<String>> destinations = new HashMap<>();
            destinations.put("rajasthan", Arrays.asList("Jaipur", "Udaipur", "Jaisalmer"));
            destinations.put("kerala", Arrays.asList("Munnar", "Alleppey", "Kochi"));
            destinations.put("himachal pradesh", Arrays.asList("Shimla", "Manali", "Dharamshala"));

            // Retrieve user input
            String state = request.getParameter("state");
            if (state != null) {
                state = state.trim().toLowerCase();
                List<String> places = destinations.get(state);

                if (places != null) {
    %>
    <h2>Tourist Destinations in <%= state %>:</h2>
    <ul>
        <% for (String place : places) { %>
            <li><%= place %></li>
        <% } %>
    </ul>
    <% 
                } else { 
    %>
    <p>No destinations found for the state: <%= state %>.</p>
    <% 
                }
            } else { 
    %>
    <p>State parameter is missing.</p>
    <% 
            }
        } catch (Exception e) { 
    %>
    <p>Error: <%= e.getMessage() %></p>
    <%
//            e.printStackTrace(out);
        }
    %>
    <a href="a.jsp">Back to Search</a>
</body>
</html>
