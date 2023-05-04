package com.delivery.application.viagem;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/viagem")
public class ViagemController {
    
    @Autowired
    private ViagemService viagemService;

    @GetMapping
    public List<Viagem> findAll() {
        return viagemService.findAll();
    }

    @GetMapping("/{identifier}")
    public Viagem findByIdentifier(@PathVariable String identifier) {
        return viagemService.findByIdentifier(identifier);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Viagem save(@RequestBody @Valid Viagem viajem) {
        return viagemService.save(viajem);
    }

    @DeleteMapping("/{identifier}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteByIdentifier(@PathVariable String identifier) {
        viagemService.deleteByIdentifier(identifier);
    }

    @PutMapping
    public Viagem update(@RequestBody @Valid Viagem viajem) {
        return viagemService.update(viajem);
    }

}
