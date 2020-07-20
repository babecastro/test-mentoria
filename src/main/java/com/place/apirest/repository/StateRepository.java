package com.place.apirest.repository;

import com.place.apirest.models.State;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Barbara Ellen
 */
public interface StateRepository extends JpaRepository<State, Integer> {

    State findStateById(Integer id);

    State findStateByName(String name);
}
