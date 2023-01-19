package com.example.gestionclient.services;

import com.example.gestionclient.entities.Client;
import com.example.gestionclient.entities.DemandeCredit;
import com.example.gestionclient.repoisitory.ClientRep;
import com.example.gestionclient.repoisitory.DemandeCreditRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemandeCreditService {

    @Autowired
    DemandeCreditRep demandeCreditRep;

    @Autowired
    ClientRep clientRep;
    public DemandeCredit add(DemandeCredit d)
    {
        demandeCreditRep.save(d);
         return d;
    }
}
