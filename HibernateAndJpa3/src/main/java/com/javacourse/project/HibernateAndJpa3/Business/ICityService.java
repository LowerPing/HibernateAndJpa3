package com.javacourse.project.HibernateAndJpa3.Business;

import java.util.List;

import com.javacourse.project.HibernateAndJpa3.Entities.City;


public interface ICityService {
	
	List<City> getAll();
	void add(City city);
	void delete(City city);
	void update(City city);
	City getById(int id);

}
