package com.place.apirest.repository;

import com.place.apirest.models.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Barbara Ellen
 */
@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

    City findCityById(Integer id);

    List<City> findCityByName(String name);
}
