package com.orphan.orphan.model;

import com.orphan.orphan.dto.Orphan;
import com.orphan.orphan.dto.OrphanInputDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static com.orphan.orphan.service.OrphanService.UPLOAD_DIR;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "app_nouveau")
public class OrphanEntity {

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
    private LocalDate datNaissnce;

    @Column(nullable = false)
    private String lieuNaissnce;

    @Column(nullable = false)
    private String wilaya;

    @Column(nullable = false)
    private LocalDate datDecePere;

    @Column(nullable = false)
    private String coseDecePere;

    @Column(nullable = false)
    private String nbrFille;

    @Column(nullable = false)
    private String nbrGrcon;

    @Column(nullable = false)
    private String foto;

    @Column(nullable = false)
    private LocalDateTime uploadedAt;

    @Column(nullable = true)
    private LocalDateTime datTwjih;

    @Column(nullable = true)
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
    private Integer phone;

    private Integer phone2;
    private Integer phone3;

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

    @Column(nullable = true)
    private String col1;

    @Column(nullable = true)
    private String col2;

    @Column(nullable = true)
    private String col3;

    @Column(nullable = true)
    private String col4;

    @Column(nullable = true)
    private String col5;

    @Column(nullable = true)
    private String col6;

    @Column(nullable = true)
    private String isDeleted;

    @Column(nullable = true)
    private Integer sponsId;

    public OrphanEntity(OrphanInputDTO orphan) throws IOException {
        if (orphan.getId() == null) {
            this.uploadedAt = LocalDateTime.now();
            this.etat = "غير موجه";
        } else {
            this.id = orphan.getId();
            this.uploadedAt = orphan.getUploadedAt();
            this.etat = orphan.getEtat();
        }
        this.nni = orphan.getNni();
        this.nom = orphan.getNom();
        this.nomPere = orphan.getNomPere();
        this.nomGrPere = orphan.getNomGrPere();
        this.nomFamille = orphan.getNomFamille();
        this.nomMere = orphan.getNomMere();
        this.nomMere2 = orphan.getNomMere2();
        this.nomFamilleMere = orphan.getNomFamilleMere();
        this.gender = orphan.getGender();
        this.datNaissnce = orphan.getDatNaissnce();
        this.lieuNaissnce = orphan.getLieuNaissnce();
        this.wilaya = orphan.getWilaya();
        this.datDecePere = orphan.getDatDecePere();
        this.coseDecePere = orphan.getCoseDecePere();
        this.nbrFille = orphan.getNbrFille();
        this.nbrGrcon = orphan.getNbrGrcon();
        this.foto = saveOrphanFile(orphan.getFoto(), "foto");
        this.moustrj = saveOrphanFile(orphan.getMoustrj(), "moustrj");
        this.wevat = saveOrphanFile(orphan.getWevat(), "wevat");
        this.nbrFrrEncharge = orphan.getNbrFrrEncharge();
        this.etudier = orphan.getEtudier();
        this.etatEtude = orphan.getEtatEtude();
        this.nomEcole = orphan.getNomEcole();
        this.maladie = orphan.getMaladie();
        this.dscrptSente = orphan.getDscrptSente();
        this.trubi = orphan.getTrubi();
        this.trubiMere = orphan.getTrubiMere();
        this.logemnt = orphan.getLogemnt();
        this.logemntDetail = orphan.getLogemntDetail();
        this.rue = orphan.getRue();
        this.numMaison = orphan.getNumMaison();
        this.etatLogement = orphan.getEtatLogement();
        this.loyerOu = orphan.getLoyerOu();
        this.phone = orphan.getPhone();
        this.phone2 = orphan.getPhone2();
        this.phone3 = orphan.getPhone3();
        this.nomMouil = orphan.getNomMouil();
        this.degreParence = orphan.getDegreParence();
        this.rendmntMensuel = orphan.getRendmntMensuel();
        this.sourceRendmnt = orphan.getSourceRendmnt();
        this.depenseMensuel = orphan.getDepenseMensuel();
        this.code = orphan.getCode();
        this.codeSponse = orphan.getCodeSponse();
        this.col1 = orphan.getCol1();
        this.isDeleted = "N";
        this.sponsId = 1;
    }

    private String saveOrphanFile(MultipartFile file, String prefix) throws IOException {
        if (file != null && !file.isEmpty() && file.getOriginalFilename() != null) {
            File uploadDir = new File(UPLOAD_DIR);
            if (!uploadDir.exists()) {
                uploadDir.mkdirs();
            }
            String originalFilename = file.getOriginalFilename().replace("uploads\\", "");
            if(new File(UPLOAD_DIR.concat(originalFilename)).exists()) return UPLOAD_DIR.concat(originalFilename);
            String fileName = prefix + "_" + System.currentTimeMillis() + "_" + file.getOriginalFilename();
            Path filePath = Paths.get(UPLOAD_DIR, fileName);
            Files.write(filePath, file.getBytes());
            return filePath.toString();
        }
        return null;
    }

}
