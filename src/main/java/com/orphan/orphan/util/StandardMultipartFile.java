package com.orphan.orphan.util;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StandardMultipartFile implements MultipartFile {

    private final Path filePath;
    private final String contentType;

    public StandardMultipartFile(String filePath) throws IOException {
        this.filePath = Paths.get(filePath);
        this.contentType = Files.probeContentType(this.filePath); // Get MIME type based on file extension
    }

    public static MultipartFile getMultipartFile(String filePath) throws IOException {
        return new StandardMultipartFile(filePath);
    }

    @Override
    public String getName() {
        return filePath.getFileName().toString();
    }

    @Override
    public String getOriginalFilename() {
        return filePath.getFileName().toString();
    }

    @Override
    public String getContentType() {
        return contentType;
    }

    @Override
    public boolean isEmpty() {
        try {
            return Files.size(filePath) == 0;
        } catch (IOException e) {
            return true;
        }
    }

    @Override
    public long getSize() {
        try {
            return Files.size(filePath);
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public byte[] getBytes() throws IOException {
        return Files.readAllBytes(filePath);
    }

    @Override
    @JsonIgnore
    public InputStream getInputStream() throws IOException {
        return new FileInputStream(filePath.toFile());
    }

    @Override
    public void transferTo(File dest) throws IOException {
        Files.copy(this.filePath, dest.toPath());
    }
}