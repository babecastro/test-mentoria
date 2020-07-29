package com.place.apirest.controllers;

import com.place.apirest.models.State;
import com.place.apirest.repository.StateRepository;
import com.place.apirest.services.StateService;
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
public class StateController {

    StateService stateService;

    @GetMapping("/state")
    @ApiOperation(value="Return list of States.")
    public List<State> showState(){
        return stateService.showState();
    }

    @GetMapping("/state/{id}")
    @ApiOperation(value="Return just one State.")
    public State showStateUnico(@PathVariable(value="id") Integer id) throws Exception {
        return stateService.showStateById(id);
    }

    @GetMapping("/stateName/{name}")
    @ApiOperation(value="Return state by name.")
    public State showStateByName(@PathVariable(value="name") String name) throws Exception {
        return stateService.showStateByName(name);
    }

    @PostMapping("/state")
    @ApiOperation(value="Save one more State.")
    public State saveState(@RequestBody State state) throws Exception {
        return stateService.saveNewState(state);
    }

    @DeleteMapping("/state")
    @ApiOperation(value="Delete one state.")
    public void deleteState(@RequestBody State state) {
        stateService.deleteState(state);
    }

    @PutMapping("/state")
    @ApiOperation(value="Modify one state.")
    public State updateState(@RequestBody State state) throws Exception {
        return stateService.updateState(state);
    }
}
