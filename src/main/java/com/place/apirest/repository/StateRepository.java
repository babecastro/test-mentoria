package com.place.apirest.repository;

import com.place.apirest.models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Barbara Ellen
 */
@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

    State findStateById(Integer id);

    List<State> findStateByName(String name);

}
