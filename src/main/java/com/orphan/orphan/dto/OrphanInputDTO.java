package com.orphan.orphan.dto;

import com.orphan.orphan.model.OrphanEntity;
import com.orphan.orphan.util.StandardMultipartFile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class OrphanInputDTO extends Orphan {

    private MultipartFile foto;

    private MultipartFile moustrj;

    private MultipartFile wevat;
}
