package com.place.apirest.services;

import com.place.apirest.models.State;
import com.place.apirest.repository.StateRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class StateServiceTest {

    @Mock
    private StateRepository stateRepository;

    @InjectMocks
    private StateService stateService;

    @Test
    public void shouldReturnStates() {

        List<State> entityList = new ArrayList<>();
        Date date = new Date();
        State state1 = new State(1, "Curitiba", date, date);
        entityList.add(state1);

        State state2 = Mockito.mock(State.class);
        Mockito.when(state2.getId()).thenReturn(2);
        entityList.add(state2);

        Mockito.when(stateRepository.findAll()).thenReturn(entityList);

        List<State> entities = stateService.showState();
        Assert.assertEquals(2, entities.size());

        Mockito.verify(stateRepository).findAll();

    }

    @Test
    public void showStateByName() {
        State state1 = Mockito.mock(State.class);
        Mockito.when(state1.getName()).thenReturn("São Paulo");



    }
}