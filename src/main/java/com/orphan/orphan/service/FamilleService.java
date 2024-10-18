package com.orphan.orphan.service;

import com.orphan.orphan.model.Famille;
import com.orphan.orphan.repository.FamilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class FamilleService {

    private final FamilleRepository familleRepository;

    public FamilleService(FamilleRepository familleRepository) {
        this.familleRepository = familleRepository;
    }

    public List<Famille> getAllFamilles() {
        return familleRepository.findAll();
    }

    public Optional<Famille> getFamilleById(int id) {
        return familleRepository.findById(id);
    }

    public Famille saveFamille(Famille famille) {
        return familleRepository.save(famille);
    }

    public void deleteFamille(int id) {
        familleRepository.deleteById(id);
    }
}
