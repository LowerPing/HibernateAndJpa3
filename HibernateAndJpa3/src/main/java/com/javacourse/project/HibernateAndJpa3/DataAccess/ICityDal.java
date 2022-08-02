package com.javacourse.project.HibernateAndJpa3.DataAccess;

import java.util.List;

import com.javacourse.project.HibernateAndJpa3.Entities.City;

public interface ICityDal {
	
	List<City> getAll();
	void add(City city);
	void delete(City city);
	void update(City city);
	City getById(int id);
	
	

}
