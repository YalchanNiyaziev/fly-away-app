package com.yalco.flyaway.repository;

import com.yalco.flyaway.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport,Long> {
}
