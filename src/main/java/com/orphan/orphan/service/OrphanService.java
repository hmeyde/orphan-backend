package com.orphan.orphan.service;

import com.orphan.orphan.model.OrphanEntity;
import com.orphan.orphan.repository.OrphanRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class OrphanService {

    private final OrphanRepository orphanRepository;

    public OrphanService(OrphanRepository orphanRepository) {
        this.orphanRepository = orphanRepository;
    }

    public List<OrphanEntity> getAllOrphans() {
        return orphanRepository.findAll();
    }

    public Optional<OrphanEntity> getOrphanById(Long id) {
        return orphanRepository.findById(id);
    }

    public OrphanEntity saveOrphan(OrphanEntity famille) {
        return orphanRepository.save(famille);
    }

    public void deleteOrphan(Long id) {
        orphanRepository.deleteById(id);
    }
}
