package edu.mum.cs5.airTicketbooking.service;

import edu.mum.cs5.airTicketbooking.model.Airplane;
import edu.mum.cs5.airTicketbooking.repository.AirplaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AirplaneService {

	@Autowired
	private AirplaneRepository airplaneRepository;

	public Airplane saveAirplane(Airplane airplane) {
		// TODO Auto-generated method stub
		return airplaneRepository.save(airplane);
	}

	public List<Airplane> findAllAirplane() {
		// TODO Auto-generated method stub
		return airplaneRepository.findAll();
	}

	public List<Airplane> findOrderedAirplane() {
		// TODO Auto-generated method stub
		return airplaneRepository.findAllByOrderByCapacityAsc();
	}
	
	public Airplane getAirplane(Integer id) {
		// TODO Auto-generated method stub
		if(id != null) 
			return airplaneRepository.findById(id).get();
		return null;
	}

	public void deletAirplane(Integer id) {
		// TODO Auto-generated method stub
		airplaneRepository.deleteById(id);
	}

	public Airplane updateById(Integer id) {
		// TODO Auto-generated method stub
	Airplane airplane =	airplaneRepository.findById(id).get();
	return saveAirplane(airplane);
		
	}

}
