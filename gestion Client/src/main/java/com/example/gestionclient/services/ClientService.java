package com.example.gestionclient.services;

import com.example.gestionclient.entities.Client;
import com.example.gestionclient.repoisitory.ClientRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    ClientRep clientRep;

    public Client addClient(Client c)
    {
        return clientRep.save(c);
    }
    public List<Client>  getAll()
    {
        return clientRep.findAll();
    }

    public Client getClient(Long id)
    {
        return clientRep.findById(id).get();
    }

    public Client getClientCIN(Long cin)
    {
        return clientRep.findByCIN(cin);
    }
}
