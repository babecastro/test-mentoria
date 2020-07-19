package com.place.apirest.resources;

import com.place.apirest.models.City;
import com.place.apirest.models.Place;
import com.place.apirest.models.State;
import com.place.apirest.repository.CityRepository;
import com.place.apirest.repository.PlaceRepository;
import com.place.apirest.repository.StateRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
@Api(value = "API REST Place")
@CrossOrigin(origins = "*")
public class PlaceResource {

    @Autowired
    PlaceRepository placeRepository;

    @Autowired
    CityRepository cityRepository;

    @Autowired
    StateRepository stateRepository;

    @GetMapping("/place")
    @ApiOperation(value = "Return list of places.")
    public List<Place> showPlace(){
        return placeRepository.findAll();
    }

    @GetMapping("/city")
    @ApiOperation(value="Return list of cities.")
    public List<City> showCity(){
        return cityRepository.findAll();
    }

    @GetMapping("/state")
    @ApiOperation(value="Return list of States.")
    public List<State> showState(){
        return stateRepository.findAll();
    }

    @GetMapping("/place/{id}")
    @ApiOperation(value = "Return just one place.")
    public Place showPlaceUnico(@PathVariable(value="id") Integer id) {
        return placeRepository.findPlaceById(id);
    }

    @GetMapping("/place-name/{name}")
    @ApiOperation(value="Return Place by name.")
    public Place showPlaceByName(@PathVariable(value="name") String name) {
        return placeRepository.findPlaceByName(name);
    }

    @GetMapping("/city/{id}")
    @ApiOperation(value="Return just one city.")
    public City showCityUnica(@PathVariable(value="id") Integer id) {
        return cityRepository.findCityById(id);
    }

    @GetMapping("/city-name/{name}")
    @ApiOperation(value="Return cities by name.")
    public City showCityByName(@PathVariable(value="name") String name) {
        return cityRepository.findCityByName(name);
    }

    @GetMapping("/state/{id}")
    @ApiOperation(value="Return just one State.")
    public State showStateUnico(@PathVariable(value="id") Integer id) {
        return stateRepository.findStateById(id);
    }

    @GetMapping("/state-name/{name}")
    @ApiOperation(value="Return state by name.")
    public State showStateByName(@PathVariable(value="name") String name) {
        return stateRepository.findStateByName(name);
    }

    @PostMapping("/place")
    @ApiOperation(value="Save one more place.")
    public Place savePlace(@RequestBody Place place){
        return placeRepository.save(place);
    }

    @PostMapping("/city")
    @ApiOperation(value="Save one more city.")
    public City saveCity(@RequestBody City city) {
        return cityRepository.save(city);
    }

    @PostMapping("/state")
    @ApiOperation(value="Save one more State.")
    public State saveState(@RequestBody State state) {
        return stateRepository.save(state);
    }

    @DeleteMapping("/place")
    @ApiOperation(value="Delete one place.")
    public void deletePlace(@RequestBody Place place) {
        placeRepository.delete(place);
    }

    @DeleteMapping("/city")
    @ApiOperation(value="Delete one city.")
    public void deleteCity(@RequestBody City city) {
        cityRepository.delete(city);
    }

    @DeleteMapping("/state")
    @ApiOperation(value="Delete one state.")
    public void deleteState(@RequestBody State state) {
        stateRepository.delete(state);
    }

    @PutMapping("/place")
    @ApiOperation(value="Modify one place.")
    public Place updatePlace(@RequestBody Place place){
        return placeRepository.save(place);
    }

    @PutMapping("/city")
    @ApiOperation(value="Modify one city.")
    public City updateCity(@RequestBody City city){
        return cityRepository.save(city);
    }

    @PutMapping("/state")
    @ApiOperation(value="Modify one state.")
    public State updateState(@RequestBody State state){
        return stateRepository.save(state);
    }

}
