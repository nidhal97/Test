package com.listeParkings.listeParkings.controller;

import com.listeParkings.listeParkings.models.Record;
import com.listeParkings.listeParkings.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParkingController {

    @Autowired
    private ParkingService parkingService;

    @GetMapping("/getParking")
    public List<Record> getPark(){
        return parkingService.getListParking();
    }

    @GetMapping("/getNbPlace")
    public int getNNb(){
        return parkingService.getNbParking();
    }
}
