package com.experian.client.feignclient;

import com.experian.client.dto.CustomerDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "Experian", url = "${experian.api-gateway.domain}")
public interface ExperianFeignClient {

    @PostMapping(path = "${experian.api-gateway.endpoint.customerDetails}")
    CustomerDetails getCustomerDetails(@RequestBody CustomerDetails customerDetails);

}
