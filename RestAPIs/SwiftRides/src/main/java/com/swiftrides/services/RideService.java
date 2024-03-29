package com.swiftrides.services;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiftrides.models.City;
import com.swiftrides.models.Ride;
import com.swiftrides.models.Role;
import com.swiftrides.models.User;
import com.swiftrides.repositories.RideRepository;

@Service
public class RideService 
{
	@Autowired
	RideRepository rrepo;
	
	public List<Ride> getAll()
	{
		return rrepo.findAll();
	}

	public Ride getOneRide(int rideid)
	{
		Optional<Ride> oride=rrepo.findById(rideid);
		Ride r=null;
		try
		{
			r=oride.get();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return r;
	}
	
	public Ride saveRide(Ride r)
	{
		return rrepo.save(r);
	}
	
	public Ride getRideId(int id)
	{
		return rrepo.findById(id).get();
	}
	
	public List<Ride> getRidesBetweenCitiesRange(City start_location,City end_location)
	{
		return rrepo.getAllRidesFromOneCityToAnotherCity(start_location, end_location);
	}
	
	public List<Ride> getAllRidesFromOneCityToAnotherCityByDate(City start_location,City end_location,Date date_of_journey)
	{
		return rrepo.getAllRidesFromOneCityToAnotherCityByDate(start_location, end_location, date_of_journey);
	}
	
	public List<Ride> getAllRidesByDate(Date date_of_journey)
	{
		return rrepo.getAllRidesByDate(date_of_journey);
	}
	
	public List<Ride> getAllRidesByStatus(String status)
	{
		return rrepo.getAllRidesByStatus(status);
	}
	
	
	
	public List<Ride> getAllRidesById(User carowner_id)
	{
		return rrepo.getAllRidesById(carowner_id);
	}
	
	
	public int changeRideStatusById(int rid)
	{
		return rrepo.changeRideStatusById(rid);
	}
}

