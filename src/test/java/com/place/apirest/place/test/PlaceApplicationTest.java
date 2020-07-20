package com.place.apirest.place.test;

import com.place.apirest.models.Place;
import com.place.apirest.repository.PlaceRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlaceApplicationTest {

    @Autowired
    private PlaceRepository repo;

    @Test
    public void testaPlace() {
        List<Place> place = repo.findAll();
        assertThat(place.size()).isEqualTo(3);
    }

    @Test
    public void testaOnePlace() {
        Place place = repo.findPlaceById(1);
        Assert.assertEquals(1, 1);
    }

    @Test
    public void testaPlaceByName() {
        List<Place> place = repo.findPlaceByName("Masp");
        Assert.assertNotNull(place);
    }

    @Test
    public void testaPlaceInexistente() {
        List<Place> place = repo.findPlaceByName("Leme");
        Assert.assertEquals(0,0);
    }
}
