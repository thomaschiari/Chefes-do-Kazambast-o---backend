package com.delivery.application.viagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

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

    @Transactional
    public void deleteByIdentifier(String identifier) {
        viagemRepository.deleteByIdentifier(identifier);
    }

    public Viagem update(Viagem viajem) {
        return viagemRepository.save(viajem);
    }

<<<<<<< Updated upstream
    // confirmByIdentifier (change status to 1)
=======
    // confirmByIdentifier (muda o status para 1)
>>>>>>> Stashed changes
    @Transactional
    public void confirmByIdentifier(String identifier) {
        viagemRepository.confirmByIdentifier(identifier);
    }

}
