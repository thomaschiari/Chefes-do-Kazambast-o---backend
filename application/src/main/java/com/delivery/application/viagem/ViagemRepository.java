package com.delivery.application.viagem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ViagemRepository extends JpaRepository<Viagem, Integer> {
    List<Viagem> findByStatus(Integer status);
    List<Viagem> findByIdentifier(String identifier);
    void deleteByIdentifier(String identifier);
    void updateStatusByIdentifier(String identifier);
}
