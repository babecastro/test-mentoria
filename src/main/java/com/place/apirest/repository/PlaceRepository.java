package com.place.apirest.repository;

import com.place.apirest.models.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place, Integer> {

    Place findPlaceById(Integer id);

    Place findPlaceByName(String city_name);

}
