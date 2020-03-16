package com.clientui.controller;

import com.clientui.beans.Guitar;
import com.clientui.proxies.GuitarProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ClientController {

    @Autowired
    private GuitarProxy guitarProxy;


    @RequestMapping("/")
    public String accueil(Model model){

        List<Guitar> guitars =  guitarProxy.findAll();

        model.addAttribute("guitars", guitars);

        return "Accueil";
    }

    @RequestMapping(value = { "/homeSignedIn" }, method = RequestMethod.GET)
    public String homeSignedIn(Model model) {

        List<Guitar> guitars =  guitarProxy.findAll();

        model.addAttribute("guitars", guitars);

        return "homeSignedIn";
    }

    @RequestMapping("/predefined-object-session")
    public String objectSession(HttpServletRequest request) {

        HttpSession session = request.getSession();

        session.setAttribute("mygreeting", "Hello Everyone!");

        return "predefined-object-session";
    }
}
