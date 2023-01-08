package com.experian.client.controller;

import com.experian.client.dto.CustomerDetails;
import com.experian.client.experianenum.CreditStatusEnum;
import com.experian.client.service.CustomerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerInfoController {
    @Autowired
    private CustomerInfoService customerInfoService;

    @PostMapping(path = "/status")
    CreditStatusEnum getCreditStatus(@RequestBody CustomerDetails customerDetails) {
        CreditStatusEnum statusEnum = customerInfoService.getCreditStatus(customerDetails);
        return statusEnum;
    }

}
