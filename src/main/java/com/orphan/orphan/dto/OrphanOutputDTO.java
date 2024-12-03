package com.orphan.orphan.dto;

import com.orphan.orphan.model.OrphanEntity;
import lombok.Data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Data
public class OrphanOutputDTO extends Orphan {
    private List<FileContentDTO> fileContents = new ArrayList<>();

    public OrphanOutputDTO(OrphanEntity orphanEntity) {
        super(orphanEntity);
        List<String> fieldNames = List.of("foto", "moustrj", "wevat");
        getFileContent(fileContents, fieldNames, orphanEntity);
    }

    private void getFileContent(List<FileContentDTO> fileContents, List<String> fieldNames, OrphanEntity orphanEntity) {
        fieldNames.forEach(field -> {
            try {
                String fileName = getFileNameByField(field, orphanEntity);
                Path path = Paths.get(fileName);
                byte[] content = Files.readAllBytes(path);
                fileContents.add(new FileContentDTO(field, fileName , content));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }

    private String getFileNameByField(String field, OrphanEntity orphanEntity) {
        if(field.equals("foto")) return orphanEntity.getFoto();
        if(field.equals("moustrj")) return orphanEntity.getMoustrj();
        if(field.equals("wevat"))  return orphanEntity.getWevat();
        return null;
    }
}
