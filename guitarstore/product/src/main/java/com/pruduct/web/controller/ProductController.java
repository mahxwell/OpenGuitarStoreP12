package com.pruduct.web.controller;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.pruduct.dao.GuitarDao;
import com.pruduct.model.Guitar;
import com.pruduct.web.exceptions.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
//@EnableJpaAuditing
public class ProductController {

    @Autowired
    GuitarDao guitarDao;

    // Affiche la liste de tous les produits disponibles
    //Récupérer la liste des produits
    @RequestMapping(value = "/Produits", method = RequestMethod.GET)
    public MappingJacksonValue listeProduits() {
        Iterable<Guitar> guitars = guitarDao.findAll();

     /*   SimpleBeanPropertyFilter monFiltre = SimpleBeanPropertyFilter.serializeAllExcept("prixAchat");

        FilterProvider listDeNosFiltres = new SimpleFilterProvider().addFilter("monFiltreDynamique", monFiltre);*/

        MappingJacksonValue produitsFiltres = new MappingJacksonValue(guitars);

        //produitsFiltres.setFilters(listDeNosFiltres);

        return produitsFiltres;
    }

    //Récuperer un produit par son id
    @GetMapping(value = "/Produits/{id}")
    public Optional<Guitar> recupererUnProduit(@PathVariable int id) {

        Optional<Guitar> product = guitarDao.findById(id);

        if (!product.isPresent())
            throw new ProductNotFoundException("Le produit correspondant à l'id " + id + " n'existe pas");

        return product;
    }

    @GetMapping("/findall")
    public Guitar findAll(){

        List<Guitar> customers = guitarDao.findAll();

        List<Guitar> customerUI = new ArrayList<>();

        for (Guitar customer : customers) {

            customerUI.add(new Guitar(customer.getGuitar_name(),customer.getGuitar_description(), null, null, null, 0, false));
        }

        System.out.println(customers);
        return customerUI.get(0);

    }
}
