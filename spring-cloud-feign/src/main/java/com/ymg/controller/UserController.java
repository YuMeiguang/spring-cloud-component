package com.ymg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yumg
 * @create 2019/07/27
 * @desc
 * @since 1.0.0
 **/
@RestController
public class UserController {

    @RequestMapping("helloFeign")
    public String helloFeign(){
        return "";
    }
}
