package com.delivery.application.viagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return viagemRepository.save(viajem);
    }

    public void deleteByIdentifier(String identifier) {
        viagemRepository.deleteByIdentifier(identifier);
    }

    public Viagem update(Viagem viajem) {
        return viagemRepository.save(viajem);
    }

}
