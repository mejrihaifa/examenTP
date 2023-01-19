package com.example.scoreService.controller;

import com.example.scoreService.services.DecisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/decision")
public class DecisionController {
    @Autowired
    DecisionService decisionService;
    @RequestMapping(value = "/{evaluation}/{id_demande}", method = RequestMethod.POST)
    public void addDecision(@PathVariable  String evaluation,@PathVariable  Long id_demande)
    {
        decisionService.addDecision(evaluation,id_demande);
    }
}
