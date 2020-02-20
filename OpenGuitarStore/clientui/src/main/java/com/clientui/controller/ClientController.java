package com.clientui.controller;

import com.clientui.beans.GuitarBean;
import com.clientui.proxies.GuitarProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {

    @Autowired
    private GuitarProxy guitarProxy;


    @RequestMapping("/")
    public String accueil(Model model){

        GuitarBean guitar =  guitarProxy.findAll();

        model.addAttribute("guitars", guitar);

        return "Accueil";
    }
}
