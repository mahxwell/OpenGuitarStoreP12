package com.guitarstore.guitar.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.guitarstore.guitar.dao.GuitarDao;
import com.guitarstore.guitar.dao.GuitarmodelDao;
import com.guitarstore.guitar.model.Guitar;
import com.guitarstore.guitar.model.Guitarmodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class GuitarController implements HealthIndicator {

    /**
     * GUITAR CONTROLLER
     */

    @Autowired
    GuitarDao guitarDao;

    /**
     * GUITARMODEL CONTROLLER
     */

    @Autowired
    GuitarmodelDao guitarmodelDao;


    /**
     * Health Indicator
     *
     * @return
     */
    @Override
    public Health health() {

        List<Guitar> guitars = guitarDao.findAll();

        if (guitars.isEmpty()) {
            return Health.down().build();
        }
        return Health.up().build();
    }

    /**
     * Get All Guitars available in DB
     *
     * @return All guitar list
     */
    @CrossOrigin
    @RequestMapping(value = "/guitars", method = RequestMethod.GET)
    public MappingJacksonValue getGuitars() {
        Iterable<Guitar> guitars = guitarDao.findAll();
        MappingJacksonValue guitarsFilter = new MappingJacksonValue(guitars);
        return guitarsFilter;
    }


    /**
     * Get One Guitar By Identification Number
     *
     * @param id Unique Guitar Identification Number
     * @return MappingJacksonValue -> JSON with Guitar details AND Stocks Available
     */
    @CrossOrigin
    @GetMapping(value = "/guitars/{id}")
    public MappingJacksonValue showOneGuitar(@PathVariable int id) {
        Guitar guitar = guitarDao.findById(id);
        List<Guitarmodel> guitarmodel = guitarmodelDao.findStock(id);
        Integer stockSize = guitarmodel.size();

        ObjectMapper objectMapper =  new ObjectMapper();

        Map<String, String> map =  objectMapper.convertValue(guitar, Map.class);

        /**
         * Adding stock row from another table (GuitarModel table)
         */
        Map<String, String> map2 = new HashMap<>();
        map2.put("stock",stockSize.toString());

        /**
         * Merging two maps
         */
        map.putAll(map2);

        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(map);

        return mappingJacksonValue;
    }
}
