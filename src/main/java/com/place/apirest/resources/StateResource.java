package com.place.apirest.resources;

import com.place.apirest.models.State;
import com.place.apirest.repository.StateRepository;
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
public class StateResource {

    @Autowired
    StateRepository stateRepository;

    @GetMapping("/state")
    @ApiOperation(value="Return list of States.")
    public List<State> showState(){
        return stateRepository.findAll();
    }

    @GetMapping("/state/{id}")
    @ApiOperation(value="Return just one State.")
    public State showStateUnico(@PathVariable(value="id") Integer id) {
        return stateRepository.findStateById(id);
    }

    @GetMapping("/stateName/{name}")
    @ApiOperation(value="Return state by name.")
    public State showStateByName(@PathVariable(value="name") String name) {
        return stateRepository.findStateByName(name);
    }

    @PostMapping("/state")
    @ApiOperation(value="Save one more State.")
    public State saveState(@RequestBody State state) {
        return stateRepository.save(state);
    }

    @DeleteMapping("/state")
    @ApiOperation(value="Delete one state.")
    public void deleteState(@RequestBody State state) {
        stateRepository.delete(state);
    }

    @PutMapping("/state")
    @ApiOperation(value="Modify one state.")
    public State updateState(@RequestBody State state){
        return stateRepository.save(state);
    }
}
