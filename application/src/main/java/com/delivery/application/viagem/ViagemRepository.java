package com.delivery.application.viagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface ViagemRepository extends JpaRepository<Viagem, Integer> {
    List<Viagem> findByStatus(Integer status);
    List<Viagem> findByIdentifier(String identifier);
    void deleteByIdentifier(String identifier);
    @Modifying
    @Query("UPDATE Viagem v SET v.status = 1 WHERE v.identifier = :identifier")
    void confirmByIdentifier(String identifier);
}