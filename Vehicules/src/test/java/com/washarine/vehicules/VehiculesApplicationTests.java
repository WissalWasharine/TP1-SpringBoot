package com.washarine.vehicules;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.washarine.vehicules.entities.Vehicule;
import com.washarine.vehicules.repos.VehiculeRepository;





@SpringBootTest
class VehiculesApplicationTests {
	@Autowired
	private VehiculeRepository vehiculeRepository;

	@Test
	public void testCreateVehicule() {
		Vehicule prod = new Vehicule("Velo",720.0,new Date());
		vehiculeRepository.save(prod);
	}

	@Test
	public void testFindVehicule()
	{
		Vehicule vh = vehiculeRepository.findById(13L).get(); 
	System.out.println(vh);
	}
	
	@Test
	public void testUpdateVehicule()
	{
	Vehicule vh = vehiculeRepository.findById(13L).get();
	vh.setPrixVehicule(560800.0);
	vh.setNomVehicule("Train");
	vehiculeRepository.save(vh);
	}
	
	@Test
	public void testDeleteVehicule()
	{
		vehiculeRepository.deleteById(12L);;
	}

	
	@Test
	public void testListerTousVehicule()
	{
	List<Vehicule> vhs = vehiculeRepository.findAll();
	for (Vehicule vh : vhs)
	{
	System.out.println(vh);
	}
	}



}
