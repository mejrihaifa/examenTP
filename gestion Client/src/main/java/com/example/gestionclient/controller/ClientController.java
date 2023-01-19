package com.example.gestionclient.controller;

import com.example.gestionclient.entities.Client;
import com.example.gestionclient.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientService clientService;
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Client addClient(Client c)
    {
        return clientService.addClient(c);

    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Client> getAll()
    {
        return  clientService.getAll();
    }

    @RequestMapping(value = "/getClient/{id}", method = RequestMethod.GET)
    public Client getClient(@PathVariable Long id)
    {
        return  clientService.getClient(id);
    }

    @RequestMapping(value = "/getClientCIN/{cin}", method = RequestMethod.GET)
    public Client getClientCIN(@PathVariable Long cin)
    {
          return clientService.getClientCIN(cin) ;
    }
}
