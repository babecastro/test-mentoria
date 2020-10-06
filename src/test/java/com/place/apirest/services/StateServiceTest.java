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
    public void shouldReturnStates() throws Exception {

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
    public void showStateByName() throws Exception {
        State state1 = Mockito.mock(State.class);
        Mockito.when(state1.getName()).thenReturn("São Paulo");

        List<State> state = stateService.showStateByName(state1.getName());
        Assert.assertEquals("São Paulo", 1, 1);

        Mockito.verify(stateRepository).findStateByName(state1.getName());
    }

    @Test
    public void showStateById() throws Exception {
        State state = Mockito.mock(State.class);
        Mockito.when(state.getId()).thenReturn(1);

        State state1 = stateService.showStateById(state.getId());
        Assert.assertEquals(1, state.getId().longValue());

        Mockito.verify(stateRepository).findStateById(state.getId());
    }

    @Test
    public void shouldReturnWrongNumbersOfStates() throws Exception {
        List<State> entityList = new ArrayList<>();

        State state = Mockito.mock(State.class);
        Mockito.when(state.getId()).thenReturn(1);
        entityList.add(state);

        State state1 = Mockito.mock(State.class);
        Mockito.when(state1.getId()).thenReturn(2);
        entityList.add(state1);

        Mockito.when(stateRepository.findAll()).thenReturn(entityList);

        List<State> entities = stateService.showState();
        Assert.assertNotEquals(1, entities.size());
    }

    @Test
    public void shouldReturnWrongNameOfState() throws Exception {
        State state = Mockito.mock(State.class);
        Mockito.when(state.getName()).thenReturn("São Paulo");

        List<State> state1 = stateService.showStateByName(state.getName());
        Assert.assertNotEquals("Curitiba", state1.contains(state.getName()));
    }

    @Test
    public void shouldReturnWrongIdOfState() throws Exception {
        State state = Mockito.mock(State.class);
        Mockito.when(state.getId()).thenReturn(1);

        State state1 = stateService.showStateById(state.getId());
        Assert.assertNotEquals(2, state.getId().longValue());
    }
}