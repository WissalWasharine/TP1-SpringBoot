package com.washarine.vehicules.service;

import java.util.List;

import com.washarine.vehicules.entities.Vehicule;

public interface VehiculeService {
	Vehicule saveVehicule(Vehicule vh);
	Vehicule updateVehicule(Vehicule vh);
	void deleteVehicule(Vehicule vh);
	void deleteVehiculeById(Long id);
	Vehicule getVehicule(Long id);
	List<Vehicule> getAllVehicules();
			
}
