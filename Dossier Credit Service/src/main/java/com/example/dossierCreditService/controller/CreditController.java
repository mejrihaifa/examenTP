package com.example.dossierCreditService.controller;

import com.example.dossierCreditService.entities.DossierCredit;
import com.example.dossierCreditService.services.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/dossierCredit")
public class CreditController {
   @Autowired
   CreditService creditService;
    @RequestMapping(value = "/add", method = RequestMethod.POST)

   public DossierCredit add(DossierCredit d)
   {
       return creditService.addCredit(d);
   }
}
