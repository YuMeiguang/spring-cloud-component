package com.ymg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author yumg
 * @create 2019/07/25
 * @desc
 * @since 1.0.0
 **/
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("hello-consumer")
    public String helloConsumer(){
        Byte b = null;
        StringUtils.isEmpty(b);
        return restTemplate.getForObject("http://eureka-service/hello",String.class);
    }
}
