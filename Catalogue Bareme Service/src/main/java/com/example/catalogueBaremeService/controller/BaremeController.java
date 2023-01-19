package com.example.catalogueBaremeService.controller;

import com.example.catalogueBaremeService.entities.Bareme;
import com.example.catalogueBaremeService.services.BaremeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/bareme")
public class BaremeController {
    @Autowired
    BaremeService baremeService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addBareme(Bareme b)
    {
        baremeService.addBareme(b);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Bareme> getAll()
    {
        return  baremeService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Bareme getBareme(@PathVariable Long id)
    {
        return  baremeService.getBareme(id);
    }

    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public Long selectBareme(@RequestParam("dure") int dure,@RequestParam("montant") double montant)
    {
        return  baremeService.selectBareme(dure,montant);
    }

    @RequestMapping(value = "/taux/{id}", method = RequestMethod.GET)
    public Double getTaux(@PathVariable("id") Long id)
    {
        return  baremeService.getTaux(id);
    }
}
