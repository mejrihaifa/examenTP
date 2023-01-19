package com.example.simulationCreditService.service;

import com.example.simulationCreditService.dto.BaremeDto;
import com.example.simulationCreditService.dto.ClientDto;
import com.example.simulationCreditService.entities.DemandeCredit;
import com.example.simulationCreditService.repository.DemandeCreditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DemandeCreditService {
    @Autowired
    public DemandeCreditRepository demandeCreditRepository;

    public DemandeCredit getDemandeCredit(Long id){
       return demandeCreditRepository.findById(id).get();
    }

    public BaremeDto getBaremeById(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        BaremeDto baremeDto = restTemplate.getForObject("http://bareme-service:8080/bareme/" + id, BaremeDto.class);
        return baremeDto;
    }

    public ClientDto getClientById(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        ClientDto clientDto = restTemplate.getForObject("http://client-service:8080/client/" + id, ClientDto.class);
        return clientDto;
    }
}
