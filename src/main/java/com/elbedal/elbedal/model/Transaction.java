package com.elbedal.elbedal.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Document(collection = "transaction")
public class Transaction {
    @Id
    private String id;
    private String userId;
    private BigDecimal amount;
    private Date date;
    private String description;
}