package com.washarine.vehicules.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.washarine.vehicules.entities.Vehicule;
import com.washarine.vehicules.repos.VehiculeRepository;

@Service
public class VehiculeServiceImpl  implements VehiculeService{
	
	@Autowired
	VehiculeRepository vehiculeRepository;
	
	@Override
	public Vehicule saveVehicule(Vehicule vh) {
		// TODO Auto-generated method stub
		return vehiculeRepository.save(vh);
	}

	@Override
	public Vehicule updateVehicule(Vehicule vh) {
	
		return vehiculeRepository.save(vh);
	}
	@Override
	public void deleteVehicule(Vehicule vh) {
	
		vehiculeRepository.delete(vh);
	}
	 @Override
	public void deleteVehiculeById(Long id) {
	
		 vehiculeRepository.deleteById(id);
	}
	@Override
	public Vehicule getVehicule(Long id) {
	
		return vehiculeRepository.findById(id).get();
	}
	@Override
	public List<Vehicule> getAllVehicules() {
	
		return vehiculeRepository.findAll();
	}

}
