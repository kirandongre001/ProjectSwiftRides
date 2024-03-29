package com.swiftrides.repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.swiftrides.models.City;
import com.swiftrides.models.Ride;
import com.swiftrides.models.User;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface RideRepository extends JpaRepository<Ride, Integer> 
{

	@Query("select r from Ride r where r.start_location=:start_location and r.end_location=:end_location")
	public List<Ride> getAllRidesFromOneCityToAnotherCity(City start_location,City end_location);
	
	@Query("select r from Ride r where r.start_location=:start_location and r.end_location=:end_location and r.date_of_journey=:date_of_journey")
	public List<Ride> getAllRidesFromOneCityToAnotherCityByDate(City start_location,City end_location,Date date_of_journey);
	
	@Query("select r from Ride r where r.date_of_journey=:date_of_journey")
	public List<Ride> getAllRidesByDate(Date date_of_journey);
	
	@Query("select r from Ride r where r.status=:status")
	public List<Ride> getAllRidesByStatus(String status);
	
	@Query("select r from Ride r where r.users=:carowner_id")
	public List<Ride> getAllRidesById(@RequestParam("carowner_id") User carowner_id);
	
	@Query("update Ride r set r.status='cancelled' where r.id=:rid")
	@Modifying
	public int changeRideStatusById(int rid);
}

