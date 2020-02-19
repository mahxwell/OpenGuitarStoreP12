package com.guitarstore.guitar.web.controller;

import com.guitarstore.guitar.dao.GuitarDao;
import com.guitarstore.guitar.model.Guitar;
import com.guitarstore.guitar.web.exceptions.GuitarNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class GuitarController {

    @Autowired
    GuitarDao guitarDao;

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
    public Guitar findAll() {

        List<Guitar> customers = guitarDao.findAll();

        List<Guitar> customerUI = new ArrayList<>();

        for (Guitar customer : customers) {

            customerUI.add(new Guitar(customer.getGuitar_name(), customer.getGuitar_description(), null, null, null, 0, false));
        }

        System.out.println(customers);
        return customerUI.get(0);

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
