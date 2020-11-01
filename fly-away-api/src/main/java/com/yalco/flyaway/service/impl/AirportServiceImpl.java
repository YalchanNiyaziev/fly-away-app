package com.yalco.flyaway.service.impl;

import com.yalco.flyaway.entity.Airport;
import com.yalco.flyaway.model.binding.AirportBindingModel;
import com.yalco.flyaway.repository.AirportRepository;
import com.yalco.flyaway.service.AirportService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class AirportServiceImpl implements AirportService {
    private final AirportRepository airportRepository;
    private final ModelMapper mapper;

    public AirportServiceImpl(AirportRepository airportRepository, ModelMapper mapper) {
        this.airportRepository = airportRepository;
        this.mapper = mapper;
    }

    @Override
    public void create(AirportBindingModel airportBindingModel) {
        Airport airport = mapper.map(airportBindingModel, Airport.class);
        airportRepository.save(airport);
    }
}
