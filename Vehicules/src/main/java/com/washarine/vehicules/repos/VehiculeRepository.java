package com.washarine.vehicules.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.washarine.vehicules.entities.Vehicule;


public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {

}
