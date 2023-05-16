package com.delivery.application.viagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Service
public class ViagemService {
    @Autowired
    private ViagemRepository viagemRepository;
    public List<Viagem> findAll() {
        return viagemRepository.findAll();
    }
    public Viagem findByIdentifier(String identifier) {
        return viagemRepository.findByIdentifier(identifier).get(0);
    }
    public Viagem save(Viagem viajem) {
        viajem.setIdentifier(UUID.randomUUID().toString());
        Integer idMotorista = obterIdMotoristaDisponivel();
        viajem.setIdMotorista(idMotorista);
        return viagemRepository.save(viajem);
    }
    @Transactional
    public void deleteByIdentifier(String identifier) {
        viagemRepository.deleteByIdentifier(identifier);
    }
    public Viagem update(Viagem viajem) {
        return viagemRepository.save(viajem);
    }

    // confirmByIdentifier (change status to 1)
    @Transactional
    public void confirmByIdentifier(String identifier) {
        viagemRepository.confirmByIdentifier(identifier);
    }

    private RestTemplate restTemplate = new RestTemplate();

    private Integer obterIdMotoristaDisponivel() {
        String url = "http://192.168.10.174:8080/entregador";
    
        // Faz a requisição GET para a API externa e obtém a resposta como HashMap
        HashMap<String, Object>[] response = restTemplate.getForObject(url, HashMap[].class);
    
        if (response != null && response.length > 0) {
            for (HashMap<String, Object> driver : response) {
                String statusOcupacao = (String) driver.get("status_ocupacao");
    
                if ("DISPONIVEL".equals(statusOcupacao)) {
                    return (Integer) driver.get("id");
                }
            }
        }
    
        return null; // Retorna null caso não haja motoristas disponíveis
    }
}