//package com.csc340.demo;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//@RestController
//@SpringBootApplication
//@RequestMapping("/api") // Adding a base path for your API endpoints
//public class RestAPIController {
//
//    public static void main(String[] args) {
//        SpringApplication.run(RestAPIController.class, args);
//    }
//
//    @GetMapping("/location")
//    public Location getLocation() {
//        try {
//            String url = "https://api.weatherstack.com/current?query=40.7831,-73.9712&access_key=aa15b82ebf3d71cb6c06c3042546b4a7"; // Replace with your actual access key
//            RestTemplate restTemplate = new RestTemplate();
//            ObjectMapper mapper = new ObjectMapper();
//
//            String jsonResponse = restTemplate.getForObject(url, String.class);
//            JsonNode root = mapper.readTree(jsonResponse);
//            JsonNode locationNode = root.path("location");
//
//            // Extract properties
//            String name = locationNode.path("name").asText();
//            String country = locationNode.path("country").asText();
//            String lat = locationNode.path("lat").asText();
//            String lon = locationNode.path("lon").asText();
//
//            // Create Location object
//            Location location = new Location(name, country, lat, lon);
//
//            return location;
//        } catch (JsonProcessingException ex) {
//            Logger.getLogger(RestAPIController.class.getName()).log(Level.SEVERE, null, ex);
//            throw new RuntimeException("Error processing JSON response", ex); // Improved error handling
//        } catch (Exception ex) {
//            Logger.getLogger(RestAPIController.class.getName()).log(Level.SEVERE, null, ex);
//            throw new RuntimeException("An unexpected error occurred", ex); // Handle other exceptions
//        }
//    }
//}
