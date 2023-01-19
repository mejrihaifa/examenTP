package com.example.dossierCreditService.services;

import com.example.dossierCreditService.entities.DossierCredit;
import com.example.dossierCreditService.repoisitory.CreditRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CreditService {
    @Autowired
    CreditRep creditRep;

    public DossierCredit addCredit(DossierCredit c)
    {
        return creditRep.save(c);

    }
    public void updateCredit(DossierCredit c)
    {




    }
}
