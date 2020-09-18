package com.place.apirest.controllers;

import com.place.apirest.models.City;
import com.place.apirest.repository.CityRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Barbara Ellen
 */
@RestController
@RequestMapping(value="/api")
@Api(value = "API REST Place")
@CrossOrigin(origins = "*")
public class CityController {

    @Autowired
    CityRepository cityRepository;

    @GetMapping("/city")
    @ApiOperation(value="Return list of cities.")
    public List<City> showCity(){
        return cityRepository.findAll();
    }

    @GetMapping("/city/{id}")
    @ApiOperation(value="Return just one city.")
    public City showCityUnica(@PathVariable(value="id") Integer id) {
        return cityRepository.findCityById(id);
    }

    @GetMapping("/city-name/{name}")
    @ApiOperation(value="Return cities by name.")
    public List<City> showCityByName(@PathVariable(value="name") String name) {
        return cityRepository.findCityByName(name);
    }

    @PostMapping("/city")
    @ApiOperation(value="Save one more city.")
    public City saveCity(@RequestBody City city) {
        return cityRepository.save(city);
    }

    @DeleteMapping("/city")
    @ApiOperation(value="Delete one city.")
    public void deleteCity(@RequestBody City city) {
        cityRepository.delete(city);
    }

    @PutMapping("/city")
    @ApiOperation(value="Modify one city.")
    public City updateCity(@RequestBody City city){
        return cityRepository.save(city);
    }
}
