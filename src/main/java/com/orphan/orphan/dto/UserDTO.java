package com.orphan.orphan.dto;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class UserDTO {
    private String username;
    private String email;
    private String password;
    private Set<String> roles = new HashSet<>();
}