package com.place.apirest.place.test;

import com.place.apirest.repository.CityRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CityApplicationTests {

    @Autowired
    CityRepository repo;



}
