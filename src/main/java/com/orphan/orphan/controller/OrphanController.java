package com.orphan.orphan.controller;

import com.orphan.orphan.dto.FileContentDTO;
import com.orphan.orphan.dto.Orphan;
import com.orphan.orphan.dto.OrphanInputDTO;
import com.orphan.orphan.dto.OrphanOutputDTO;
import com.orphan.orphan.model.OrphanEntity;
import com.orphan.orphan.service.OrphanService;
import lombok.SneakyThrows;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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
    public ResponseEntity<OrphanOutputDTO> getOrphanById(@PathVariable Long id) {
        Optional<OrphanOutputDTO> orphanById = orphanService.getOrphanById(id);
        return orphanById.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @SneakyThrows
    @PostMapping
    public OrphanEntity createFamille(OrphanInputDTO orphan) {
        return orphanService.saveOrphan(orphan);
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
