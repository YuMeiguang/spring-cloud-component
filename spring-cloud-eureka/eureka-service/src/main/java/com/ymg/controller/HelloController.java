package com.ymg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yumg
 * @create 2019/07/24
 * @desc
 * @since 1.0.0
 **/
@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${spring.application.name}")
    private String serviceId;

    @GetMapping("hello")
    public String hello(){
        List<ServiceInstance> serviceInstances = discoveryClient.getInstances(serviceId);

        List<String> services = discoveryClient.getServices();

        return services.get(0);
    }

}
