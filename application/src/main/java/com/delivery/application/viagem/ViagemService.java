package com.delivery.application.viagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ViagemService {

    public List<MotoristaDTO> getMotoristas() {
        String url = "http://localhost:8080/entregador";
        ResponseEntity<MotoristaDTO[]> response = restTemplate.getForEntity(url, MotoristaDTO[].class);
        if (response.getStatusCode().is2xxSuccessful()) {
            return Arrays.asList(response.getBody());
        } else {
            throw new RuntimeException("Erro ao fazer requisição");
        }
    }

    public Integer getMotoristaDisponivel() {
        List<MotoristaDTO> motoristas = getMotoristas();
        for (MotoristaDTO motorista : motoristas) {
            if ("DISPONIVEL".equals(motorista.getStatus_ocupacao())) {
                return motorista.getId();
            }
        }
        throw new RuntimeException("Nenhum motorista disponível");
    }

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
        viajem.setIdMotorista(getMotoristaDisponivel());
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

}
