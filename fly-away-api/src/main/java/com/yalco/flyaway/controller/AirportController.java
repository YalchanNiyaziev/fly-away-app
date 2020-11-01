package com.yalco.flyaway.controller;

import com.yalco.flyaway.model.binding.AirportBindingModel;
import com.yalco.flyaway.service.AirportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/airports")
public class AirportController {
    private final AirportService airportService;

    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }

    @PostMapping
    ResponseEntity<Void> createAirport(@RequestBody AirportBindingModel airportBindingModel){
        airportService.create(airportBindingModel);
        return ResponseEntity.ok().build();
    }
}
