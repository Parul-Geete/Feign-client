package com.experian.client.service.impl;

import com.experian.client.dto.CustomerDetails;
import com.experian.client.experianenum.CreditStatusEnum;
import com.experian.client.feignclient.ExperianFeignClient;
import com.experian.client.service.CustomerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerInfoServiceImpl implements CustomerInfoService {

    @Autowired
    private ExperianFeignClient experianFeignClient;

    @Override
    public CreditStatusEnum getCreditStatus(CustomerDetails customerDetails) {
        CustomerDetails responseCustomerDetail = experianFeignClient.getCustomerDetails(customerDetails);
        Integer creditScore = Integer.parseInt(responseCustomerDetail.getCreditScore());
        if (creditScore > 750) {
            return CreditStatusEnum.GREEN;
        } else if (creditScore > 700) {
            return CreditStatusEnum.ORANGE;
        } else
            return CreditStatusEnum.RED;
    }
}
