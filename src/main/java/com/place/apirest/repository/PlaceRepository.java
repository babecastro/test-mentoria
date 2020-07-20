package com.place.apirest.repository;

import com.place.apirest.models.Place;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Barbara Ellen
 */
public interface PlaceRepository extends JpaRepository<Place, Integer> {

    Place findPlaceById(Integer id);

    List<Place> findPlaceByName(String name);

}
