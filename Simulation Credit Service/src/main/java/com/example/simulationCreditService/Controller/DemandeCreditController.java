package com.example.simulationCreditService.Controller;

import com.example.simulationCreditService.dto.BaremeDto;
import com.example.simulationCreditService.dto.ClientDto;
import com.example.simulationCreditService.dto.DossierCreditDto;
import com.example.simulationCreditService.entities.DemandeCredit;
import com.example.simulationCreditService.service.DemandeCreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController("/simulerCredit")
public class DemandeCreditController {

    @Autowired
    DemandeCreditService demandeCreditService;



    @RequestMapping(value = "/simuler/{idDemandeCredit}/{idBareme}/{idClient}/{taux}", method = RequestMethod.GET)
    public DossierCreditDto simulerCredit(@PathVariable Long idDemandeCredit, @PathVariable Long idBareme, @PathVariable Long idClient ,@PathVariable  double taux )
    {
//        DemandeCredit demandeCredit = demandeCreditService.getDemandeCredit(id);
//        DossierCreditDto dossierCreditDto = new DossierCreditDto();
//        dossierCreditDto.setDuree(demandeCredit.getDuree());
//        BaremeDto baremeDto = demandeCreditService.getBaremeById(demandeCredit.getBareme_id());
//        ClientDto client = demandeCreditService.getClientById(demandeCredit.getClient_id());
//        dossierCreditDto.setBareme(baremeDto);
//        dossierCreditDto.setMensualite(demandeCredit.getMontant());
//        dossierCreditDto.setInteret(demandeCredit.getMontant()*baremeDto.getTauxNominal());
//        dossierCreditDto.setClient(client);
//        return  dossierCreditDto;


        DemandeCredit demandeCredit = demandeCreditService.getDemandeCredit(idDemandeCredit);
        DossierCreditDto dossierCreditDto = new DossierCreditDto();
        dossierCreditDto.setDuree(demandeCredit.getDuree());
        //ClientDto client = demandeCreditService.getClientById(demandeCredit.getClient_id());
        dossierCreditDto.setBareme(idBareme);
        dossierCreditDto.setMensualite(demandeCredit.getMontant());
        dossierCreditDto.setInteret(demandeCredit.getMontant()*taux);
        dossierCreditDto.setClient(idClient);
        return  dossierCreditDto;
    }


}
