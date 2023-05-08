package com.delivery.application.viagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public Viagem save(Viagem viagem) {
        viagem.setIdentifier(UUID.randomUUID().toString());
        return viagemRepository.save(viagem);
    }

    @Transactional
    public void deleteByIdentifier(String identifier) {
        viagemRepository.deleteByIdentifier(identifier);
    }

    public Viagem update(Viagem viagem) {
        return viagemRepository.save(viagem);
    }

}
