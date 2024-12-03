package com.orphan.orphan.service;

import com.orphan.orphan.dto.Orphan;
import com.orphan.orphan.dto.OrphanInputDTO;
import com.orphan.orphan.dto.OrphanOutputDTO;
import com.orphan.orphan.model.OrphanEntity;
import com.orphan.orphan.repository.OrphanRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;


@Service
public class OrphanService {

    public static final String UPLOAD_DIR = "uploads/";

    private final OrphanRepository orphanRepository;

    public OrphanService(OrphanRepository orphanRepository) {
        this.orphanRepository = orphanRepository;
    }

    public List<OrphanEntity> getAllOrphans() {
        return orphanRepository.findAll();
    }

    public Optional<OrphanOutputDTO> getOrphanById(Long id) {
        return orphanRepository.findById(id).map(OrphanOutputDTO::new);
    }

    public OrphanEntity saveOrphan(OrphanInputDTO orphan) throws IOException {
        return orphanRepository.save(new OrphanEntity(orphan));
    }

    public void deleteOrphan(Long id) {
        orphanRepository.deleteById(id);
    }
}
