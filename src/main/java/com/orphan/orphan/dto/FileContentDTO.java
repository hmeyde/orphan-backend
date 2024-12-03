package com.orphan.orphan.dto;

import lombok.Data;

import java.util.Base64;

import static com.orphan.orphan.service.OrphanService.UPLOAD_DIR;

@Data
public class FileContentDTO {
    private String field;
    private String fileName;
    private String content;

    public FileContentDTO(String field, String fileName, byte[] content) {
        this.field = field;
        this.fileName = fileName.replaceAll(UPLOAD_DIR, "");
        this.content = Base64.getEncoder().encodeToString(content);
    }
}
