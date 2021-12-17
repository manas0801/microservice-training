package com.photon.servicea.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient("serviceB")
public interface ServiceBProxy {

    @GetMapping("/api/v1/port")
    public String getPort();
}
