package com.orphan.orphan.dto;

import com.orphan.orphan.model.OrphanEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@Data
public class Orphan {


    private Long id;

    private String nni;

    private String nom;

    private String etat;

    private String nomPere;

    private String nomGrPere;

    private String nomFamille;

    private String nomMere;

    private String nomMere2;

    private String nomFamilleMere;

    private String gender;

    private LocalDate datNaissnce;

    private String lieuNaissnce;

    private String wilaya;

    private LocalDate datDecePere;

    private String coseDecePere;

    private String nbrFille;

    private String nbrGrcon;

    private LocalDateTime uploadedAt;

    private LocalDateTime datTwjih;

    private LocalDateTime datKevalle;

    private String nbrFrrEncharge;

    private String etudier;

    private String etatEtude;

    private String nomEcole;

    private String maladie;

    private String dscrptSente;

    private String trubi;

    private String trubiMere;

    private String logemnt;

    private String logemntDetail;

    private String rue;

    private Integer numMaison;

    private String etatLogement;

    private String loyerOu;

    private Integer phone;

    private Integer phone2;
    private Integer phone3;

    private String nomMouil;

    private String degreParence;

    private String rendmntMensuel;

    private String sourceRendmnt;

    private String depenseMensuel;

    private String code;

    private String codeSponse;

    private String col1;

    public Orphan(OrphanEntity orphanEntity) {
        this.id = orphanEntity.getId();
        this.nni = orphanEntity.getNni();
        this.nom = orphanEntity.getNom();
        this.etat = orphanEntity.getEtat();
        this.nomPere = orphanEntity.getNomPere();
        this.nomGrPere = orphanEntity.getNomGrPere();
        this.nomFamille = orphanEntity.getNomFamille();
        this.nomMere = orphanEntity.getNomMere();
        this.nomMere2 = orphanEntity.getNomMere2();
        this.nomFamilleMere = orphanEntity.getNomFamilleMere();
        this.gender = orphanEntity.getGender();
        this.datNaissnce = orphanEntity.getDatNaissnce();
        this.lieuNaissnce = orphanEntity.getLieuNaissnce();
        this.wilaya = orphanEntity.getWilaya();
        this.datDecePere = orphanEntity.getDatDecePere();
        this.coseDecePere = orphanEntity.getCoseDecePere();
        this.nbrFille = orphanEntity.getNbrFille();
        this.nbrGrcon = orphanEntity.getNbrGrcon();
        this.uploadedAt = orphanEntity.getUploadedAt();
        this.datTwjih = orphanEntity.getDatTwjih();
        this.datKevalle = orphanEntity.getDatKevalle();
        this.nbrFrrEncharge = orphanEntity.getNbrFrrEncharge();
        this.etudier = orphanEntity.getEtudier();
        this.etatEtude = orphanEntity.getEtatEtude();
        this.nomEcole = orphanEntity.getNomEcole();
        this.maladie = orphanEntity.getMaladie();
        this.dscrptSente = orphanEntity.getDscrptSente();
        this.trubi = orphanEntity.getTrubi();
        this.trubiMere = orphanEntity.getTrubiMere();
        this.logemnt = orphanEntity.getLogemnt();
        this.logemntDetail = orphanEntity.getLogemntDetail();
        this.rue = orphanEntity.getRue();
        this.numMaison = orphanEntity.getNumMaison();
        this.etatLogement = orphanEntity.getEtatLogement();
        this.loyerOu = orphanEntity.getLoyerOu();
        this.phone = orphanEntity.getPhone();
        this.phone2 = orphanEntity.getPhone2();
        this.phone3 = orphanEntity.getPhone3();
        this.nomMouil = orphanEntity.getNomMouil();
        this.degreParence = orphanEntity.getDegreParence();
        this.rendmntMensuel = orphanEntity.getRendmntMensuel();
        this.sourceRendmnt = orphanEntity.getSourceRendmnt();
        this.depenseMensuel = orphanEntity.getDepenseMensuel();
        this.code = orphanEntity.getCode();
        this.codeSponse = orphanEntity.getCodeSponse();
        this.col1 = orphanEntity.getCol1();
    }
}
