package com.orphan.orphan.controller;

import com.orphan.orphan.model.Famille;
import com.orphan.orphan.service.FamilleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/familles")
public class FamilleController {

    private final FamilleService familleService;

    public FamilleController(FamilleService familleService) {
        this.familleService = familleService;
    }

    @GetMapping
    public List<Famille> getAllFamilles() {
        return familleService.getAllFamilles();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Famille> getFamilleById(@PathVariable int id) {
        Optional<Famille> famille = familleService.getFamilleById(id);
        return famille.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Famille createFamille(@RequestBody Famille famille) {
        return familleService.saveFamille(famille);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Famille> updateFamille(@PathVariable int id, @RequestBody Famille familleDetails) {
        Optional<Famille> famille = familleService.getFamilleById(id);

        if (famille.isPresent()) {
            Famille updatedFamille = famille.get();
            updatedFamille.setNni(familleDetails.getNni());
            updatedFamille.setNom(familleDetails.getNom());
            updatedFamille.setEtat(familleDetails.getEtat());
            // Add all other field updates here...
            familleService.saveFamille(updatedFamille);
            return ResponseEntity.ok(updatedFamille);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFamille(@PathVariable int id) {
        if (familleService.getFamilleById(id).isPresent()) {
            familleService.deleteFamille(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
