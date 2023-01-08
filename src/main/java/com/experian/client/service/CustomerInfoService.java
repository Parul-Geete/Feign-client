package com.experian.client.service;


import com.experian.client.dto.CustomerDetails;
import com.experian.client.experianenum.CreditStatusEnum;

public interface CustomerInfoService {

    CreditStatusEnum getCreditStatus(CustomerDetails customerDetails);

}
