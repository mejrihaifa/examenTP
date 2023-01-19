package com.example.catalogueBaremeService.services;

import com.example.catalogueBaremeService.entities.Bareme;
import com.example.catalogueBaremeService.repoisitory.BaremeRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaremeService {
    @Autowired
    BaremeRep baremeRep;

    public  void addBareme(Bareme b)
    {
        baremeRep.save(b);
    }
    public  Bareme getBareme(Long id)
    {
        return  baremeRep.findById(id).get();
    }
    public  Double getTaux(Long id)
    {
        return  baremeRep.findById(id).get().getTauxNominal();
    }
    public List<Bareme> getAll()
    {
        return  baremeRep.findAll();
    }
    public Long selectBareme(int duree, double montant)
    {
        List<Bareme> baremeList = getAll();
        Bareme filteredBareme = baremeList.stream()
                .filter(bareme -> bareme.getDureeMin() <= duree && bareme.getDureeMax() >= duree)
                .filter(bareme -> bareme.getMontantMin() <= montant && bareme.getMontantMax() >= montant)
                .findFirst()
                .orElse(null);
        return filteredBareme.getId();
    }
}
