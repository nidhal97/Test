package com.listeParkings.listeParkings.service;

import com.listeParkings.listeParkings.config.UrlConfig;
import com.listeParkings.listeParkings.models.Parking;
import com.listeParkings.listeParkings.models.Place;
import com.listeParkings.listeParkings.models.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class ParkingService {

    @Autowired
    private UrlConfig urlConfig;

    public List<Record> getListParking(){
        WebClient webClient = WebClient.create();
        String url = urlConfig.getParkingListUrl();

        // Make the HTTP GET request and retrieve the JSON response
        Parking jsonResponse = webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(Parking.class)
                .block();

        // Process the JSON response as needed
        System.out.println(jsonResponse);
        return jsonResponse.getRecords();
    }

    public int getNbParking(){
        WebClient webClient = WebClient.create();
        String url = urlConfig.getParkingNbUrl();

        // Make the HTTP GET request and retrieve the JSON response
        Place jsonResponse = webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(Place.class)
                .block();

        // Process the JSON response as needed
        System.out.println(jsonResponse);
        return jsonResponse.getRecords().size();
    }
}
