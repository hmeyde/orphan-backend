package com.orphan.orphan.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "app_famille")
public class Famille {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nni;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String etat;

    @Column(nullable = false)
    private String nomPere;

    @Column(nullable = false)
    private String nomGrPere;

    @Column(nullable = false)
    private String nomFamille;

    @Column(nullable = false)
    private String nomMere;

    @Column(nullable = false)
    private String nomMere2;

    @Column(nullable = false)
    private String nomFamilleMere;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String lieuNaissnce;

    @Column(nullable = false)
    private String wilaya;

    @Column(nullable = false)
    private String nbrFille;

    @Column(nullable = false)
    private String nbrGrcon;

    @Column(nullable = false)
    private String foto;

    @Column(nullable = false)
    private LocalDateTime uploadedAt;

    @Column(nullable = false)
    private LocalDateTime datTwjih;

    @Column(nullable = false)
    private LocalDateTime datKevalle;

    @Column(nullable = false)
    private String moustrj;

    @Column(nullable = false)
    private String wevat;

    @Column(nullable = false)
    private String nbrFrrEncharge;

    @Column(nullable = false)
    private String etudier;

    @Column(nullable = false)
    private String etatEtude;

    @Column(nullable = false)
    private String nomEcole;

    @Column(nullable = false)
    private String maladie;

    @Column(nullable = false)
    private String dscrptSente;

    @Column(nullable = false)
    private String trubi;

    @Column(nullable = false)
    private String trubiMere;

    @Column(nullable = false)
    private String logemnt;

    @Column(nullable = false)
    private String logemntDetail;

    @Column(nullable = false)
    private String rue;

    private Integer numMaison;

    @Column(nullable = false)
    private String etatLogement;

    @Column(nullable = false)
    private String loyerOu;

    @Column(nullable = false)
    private String nomMouil;

    @Column(nullable = false)
    private String degreParence;

    @Column(nullable = false)
    private String rendmntMensuel;

    @Column(nullable = false)
    private String sourceRendmnt;

    @Column(nullable = false)
    private String depenseMensuel;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String codeSponse;

    @Column(nullable = false)
    private String isDeleted;

    @Column(nullable = false)
    private String col1;

    @Column(nullable = false)
    private String col2;

    @Column(nullable = false)
    private String col3;

    @Column(nullable = false)
    private String col4;

    @Column(nullable = false)
    private String col5;

    @Column(nullable = false)
    private String col6;
}

