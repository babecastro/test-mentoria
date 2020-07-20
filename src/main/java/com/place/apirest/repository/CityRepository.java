package com.place.apirest.repository;

import com.place.apirest.models.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Barbara Ellen
 */
public interface CityRepository extends JpaRepository<City, Integer> {

    City findCityById(Integer id);

    City findCityByName(String name);
}
