package com.orphan.orphan.model;

import com.orphan.orphan.dto.UserDTO;
import com.orphan.orphan.model.enums.RoleEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "app_user")
public class UserEntity {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String username;

    private String firstName;
    private String lastName;
    private String password;
    private String resetToken;
    private String language;
    private String birthPlace;
    private LocalDate birthDate;
    @Enumerated(EnumType.ORDINAL)
    private RoleEnum role;

    private Boolean userActive;

    @CreationTimestamp
    private LocalDateTime createdAt;

    public UserEntity(UserDTO userDTO) {
        this.email = userDTO.getEmail();
        this.username = userDTO.getUsername();
        this.password = userDTO.getPassword();
        this.role = RoleEnum.USER;
        this.userActive = true;
    }
}