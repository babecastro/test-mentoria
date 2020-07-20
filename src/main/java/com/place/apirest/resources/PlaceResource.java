package com.place.apirest.resources;

import com.place.apirest.models.Place;
import com.place.apirest.repository.PlaceRepository;
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
public class PlaceResource {

    @Autowired
    PlaceRepository placeRepository;

    @GetMapping("/place")
    @ApiOperation(value = "Return list of places.")
    public List<Place> showPlace(){
        return placeRepository.findAll();
    }


    @GetMapping("/place/{id}")
    @ApiOperation(value = "Return just one place.")
    public Place showPlaceUnico(@PathVariable(value="id") Integer id) {
        return placeRepository.findPlaceById(id);
    }

    @GetMapping("/placeName/{name}")
    @ApiOperation(value="Return Place by name.")
    public List<Place> showPlaceByName(@PathVariable(value="name") String name) {
        return placeRepository.findPlaceByName(name);
    }

    @PostMapping("/place")
    @ApiOperation(value="Save one more place.")
    public Place savePlace(@RequestBody Place place){
        return placeRepository.save(place);
    }

    @DeleteMapping("/place")
    @ApiOperation(value="Delete one place.")
    public void deletePlace(@RequestBody Place place) {
        placeRepository.delete(place);
    }

    @PutMapping("/place")
    @ApiOperation(value="Modify one place.")
    public Place updatePlace(@RequestBody Place place){
        return placeRepository.save(place);
    }
}
