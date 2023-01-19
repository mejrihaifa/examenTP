package com.example.catalogueBaremeService.repoisitory;

import com.example.catalogueBaremeService.entities.Bareme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaremeRep extends JpaRepository<Bareme,Long> {
    //Bareme findFirstByDureeMinLessThanEqualAndDureeMaxGreaterThanEqualAndMontantMinLessThanEqualAndMontantMaxGreaterThanEqual(
      //      Integer duree, double montant);
    //Bareme findFirstByDureeMinLessThanEqualAndDureeMaxGreaterThanEqual(Integer duree);

     // Bareme findFirstByMontantMinLessThanEqualAndMontantMaxGreaterThanEqual(Double montant) ;


}
