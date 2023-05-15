package com.delivery.application.viagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ViagemService {

    @Autowired
    private ViagemRepository viagemRepository;

    public List<ViagemDTO> findAll() {
        List<Viagem> viagens = viagemRepository.findAll();

        List<ViagemDTO> viagemDTOs = viagens.stream()
                .map(viagem -> new ViagemDTO(
                        viagem.getId(),
                        viagem.getOrigem(),
                        viagem.getDestino(),
                        viagem.getData(),
                        viagem.getValor(),
                        viagem.getDistancia(),
                        viagem.getTempo(),
                        viagem.getStatus(),
                        viagem.getIdentifier()))
                .collect(Collectors.toList());

        return viagemDTOs;
    }

    public ViagemDTO findByIdentifier(String identifier) {
        Viagem viagem = viagemRepository.findByIdentifier(identifier).get(0);
        return convertToDto(viagem);
    }

    public ViagemDTO save(ViagemDTO viagemDTO) {
        Viagem viagem = convertToEntity(viagemDTO);
        viagem.setIdentifier(UUID.randomUUID().toString());
        Viagem savedViagem = viagemRepository.save(viagem);
        return convertToDto(savedViagem);
    }

    public void deleteByIdentifier(String identifier) {
        viagemRepository.deleteByIdentifier(identifier);
    }

    public ViagemDTO update(ViagemDTO viagemDTO) {
        Viagem viagem = convertToEntity(viagemDTO);
        Viagem updatedViagem = viagemRepository.save(viagem);
        return convertToDto(updatedViagem);
    }

    private ViagemDTO convertToDto(Viagem viagem) {
        return new ViagemDTO(
                viagem.getId(),
                viagem.getOrigem(),
                viagem.getDestino(),
                viagem.getData(),
                viagem.getValor(),
                viagem.getDistancia(),
                viagem.getTempo(),
                viagem.getStatus(),
                viagem.getIdentifier()
        );
    }

    private Viagem convertToEntity(ViagemDTO viagemDTO) {
        return new Viagem(
                viagemDTO.getId(),
                viagemDTO.getOrigem(),
                viagemDTO.getDestino(),
                viagemDTO.getData(),
                viagemDTO.getValor(),
                viagemDTO.getDistancia(),
                viagemDTO.getTempo(),
                viagemDTO.getStatus(),
                viagemDTO.getIdentifier()
        );
    }
}
