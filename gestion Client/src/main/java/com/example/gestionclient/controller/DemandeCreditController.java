package com.example.gestionclient.controller;

import com.example.gestionclient.entities.DemandeCredit;
import com.example.gestionclient.services.DemandeCreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/demandeCredit")
public class DemandeCreditController {
    @Autowired
    DemandeCreditService demandeCreditService;

    //@PostMapping(value = "/add", consumes = "application/x-groovy")
    @PostMapping(value = "/add")
    public DemandeCredit add(@RequestBody DemandeCredit c)
    {
      return demandeCreditService.add(c);
    }

}
