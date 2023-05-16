package com.delivery.application.viagem;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/viagem")
public class ViagemController {
    
    @Autowired
    private ViagemService viagemService;

    @GetMapping
    public ResponseEntity<List<ViagemDTO>> getAllViagens() {
        List<ViagemDTO> viagens = viagemService.findAll();
        return new ResponseEntity<>(viagens, HttpStatus.OK);
    }

    @GetMapping("/{identifier}")
    public ResponseEntity<ViagemDTO> findByIdentifier(@PathVariable String identifier) {
        ViagemDTO viagem = viagemService.findByIdentifier(identifier);
        return new ResponseEntity<>(viagem, HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ViagemDTO> save(@RequestBody @Valid ViagemDTO viagemDTO) {
        ViagemDTO savedViagem = viagemService.save(viagemDTO);
        return new ResponseEntity<>(savedViagem, HttpStatus.CREATED);
    }

    @DeleteMapping("/{identifier}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteByIdentifier(@PathVariable String identifier) {
        viagemService.deleteByIdentifier(identifier);
    }

    @PutMapping
    public ResponseEntity<ViagemDTO> update(@RequestBody @Valid ViagemDTO viagemDTO) {
        ViagemDTO updatedViagem = viagemService.update(viagemDTO);
        return new ResponseEntity<>(updatedViagem, HttpStatus.OK);
    }

    @PutMapping("/{identifier}/status/")
    public ResponseEntity<ViagemDTO> updateStatusByIdentifier(@PathVariable String identifier) {
        ViagemDTO updatedViagem = viagemService.updateStatusByIdentifier(identifier);
        return new ResponseEntity<>(updatedViagem, HttpStatus.OK);
    }
}
