package com.guitarstore.guitar.web.controller;

import com.guitarstore.guitar.dao.GuitarDao;
import com.guitarstore.guitar.model.Guitar;
import com.guitarstore.guitar.web.exceptions.GuitarNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GuitarController implements HealthIndicator {

    @Autowired
    GuitarDao guitarDao;

    @Override
    public Health health() {

        List<Guitar> guitars= guitarDao.findAll();

        if(guitars.isEmpty()) {
            return Health.down().build();
        }
        return Health.up().build();
    }

    // Affiche la liste de toutes les guitares disponibles
    //Récupérer la liste des produits
    @RequestMapping(value = "/Guitars", method = RequestMethod.GET)
    public MappingJacksonValue listeProduits() {
        Iterable<Guitar> guitars = guitarDao.findAll();

        MappingJacksonValue produitsFiltres = new MappingJacksonValue(guitars);

        // Return JSON String
        return produitsFiltres;
    }

    //Récuperer un produit par son id
    @GetMapping(value = "/Guitars/{id}")
    public Optional<Guitar> recupererUnProduit(@PathVariable int id) {

        Optional<Guitar> product = guitarDao.findById(id);

        System.out.println("Test - " + product.toString());
        if (!product.isPresent())
            throw new GuitarNotFoundException("Le produit correspondant à l'id " + id + " n'existe pas");


        return product;
    }

    @GetMapping("/findall")
    public List<Guitar> findAll() {

        List<Guitar> customers = guitarDao.findAll();


        return customers;

    }

    @PostMapping(value = "/Ajouter")
    public void ajouterGuitare() {

        Guitar guitar = new Guitar();
        guitar.setGuitar_name("yes");
        guitar.setGuitar_description("yo");
        guitar.setGuitar_status(true);
        guitarDao.save(guitar);
        return;
    }

    @DeleteMapping(value = "/supp/{id}")
    public void supprimerGuitare(@PathVariable int id) {

        guitarDao.deleteById(id);
    }

}
