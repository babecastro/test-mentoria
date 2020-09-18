package com.place.apirest.services;

import com.place.apirest.models.State;
import com.place.apirest.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StateService {

    @Autowired
    StateRepository stateRepository;

    public List<State> showState () {
        return stateRepository.findAll();
    }

    public State showStateById(Integer id) throws Exception {
        try {
            return stateRepository.findStateById(id);
        } catch (Exception e) {
            throw new Exception("Não foi possível encontrar. Tente novamente.", e);
        }
    }

    public List<State> showStateByName(String name) throws Exception {
        try {
            return stateRepository.findStateByName(name);
        } catch (Exception e) {
            throw new Exception("Não foi possível encontrar Estado com esse nome. Tente novamente.", e);
        }
    }

    public State saveNewState (State state) throws Exception {
        State stateExists = stateRepository.findStateById(state.getId());
            if(!stateExists.getId().equals(state.getId())) {
                return stateRepository.save(state);
            }
        throw new Exception("Não foi possível adicionar Estado. Id já existe na base de dados.");
    }

    public void deleteState(State state) {
        stateRepository.delete(state);
    }

    public State updateState (State state) throws Exception {
        State stateExists = stateRepository.findStateById(state.getId());
            if(stateExists.getId().equals(state.getId()) && stateExists.getName().equals(state.getName())){
                return stateRepository.save(state);
            }
        throw new Exception("Não foi possivel atualizar dados. Registro não existe.");
    }

}
