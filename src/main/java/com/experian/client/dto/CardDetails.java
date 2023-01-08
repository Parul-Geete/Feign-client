package com.experian.client.dto;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document
public class CardDetails {
    private String cardNo;
    private LocalDate expDate;
    private int cvv;
    private String cardType;
}
