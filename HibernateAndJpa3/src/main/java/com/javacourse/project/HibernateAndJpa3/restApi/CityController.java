package com.javacourse.project.HibernateAndJpa3.restApi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacourse.project.HibernateAndJpa3.Business.ICityService;
import com.javacourse.project.HibernateAndJpa3.Entities.City;

@RestController
@RequestMapping("/api")
public class CityController {
	
	public ICityService cityService;
	
	public CityController(ICityService cityService) {
		this.cityService = cityService;
	}
	
	@GetMapping("/cities")
	public List<City> getAll() {
		return this.cityService.getAll();
	}
	@PostMapping("/add")
	public void add(@RequestBody City city) {
		
		this.cityService.add(city);
	}
	@PostMapping("/delete")
	public void delete(@RequestBody City city) {
		
		this.cityService.delete(city);
	}
	@PostMapping("/update")
	public void update(@RequestBody City city) {
		
		this.cityService.update(city);
	}
	
	@GetMapping("/cities/{id}")
	public City getById(@PathVariable int id) {
	return this.cityService.getById(id);
		
	}
	
	
	
	

}
