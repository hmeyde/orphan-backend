package com.orphan.orphan.controller;

import com.orphan.orphan.model.OrphanEntity;
import com.orphan.orphan.service.OrphanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/orphans")
public class OrphanController {

    private final OrphanService orphanService;

    public OrphanController(OrphanService orphanService) {
        this.orphanService = orphanService;
    }

    @GetMapping
    public List<OrphanEntity> getAllOrphans() {
        return orphanService.getAllOrphans();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrphanEntity> getOrphanById(@PathVariable Long id) {
        Optional<OrphanEntity> famille = orphanService.getOrphanById(id);
        return famille.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public OrphanEntity createFamille(@RequestBody OrphanEntity famille) {
        return orphanService.saveOrphan(famille);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrphanEntity> updateOrphan(@PathVariable Long id, @RequestBody OrphanEntity familleDetails) {
        Optional<OrphanEntity> famille = orphanService.getOrphanById(id);

        if (famille.isPresent()) {
            OrphanEntity updatedFamille = famille.get();
            updatedFamille.setNni(familleDetails.getNni());
            updatedFamille.setNom(familleDetails.getNom());
            updatedFamille.setEtat(familleDetails.getEtat());
            // Add all other field updates here...
            orphanService.saveOrphan(updatedFamille);
            return ResponseEntity.ok(updatedFamille);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrphan(@PathVariable Long id) {
        if (orphanService.getOrphanById(id).isPresent()) {
            orphanService.deleteOrphan(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
