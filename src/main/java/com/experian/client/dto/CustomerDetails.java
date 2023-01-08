package com.experian.client.dto;

import lombok.Data;

@Data
public class CustomerDetails {

    private CardDetails cardDetails;
    private String creditScore;
    private String cardNumber;
}
