package com.ymg.controller;

import com.ymg.dto.DemoRequestDTO;
import com.ymg.dto.DemoResponseDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * @author yumg
 * @create 2019/07/24
 * @desc
 * @since 1.0.0
 **/
@RestController
@Api(value = "V1",tags = "test",description = "swagger测试类")
public class SwaggerController {

    @PostMapping("/demoRequet")
    @ResponseBody
    @ApiOperation("请求demo")
    public DemoResponseDTO demoRequest(@RequestBody DemoRequestDTO demoRequestDTO){
        return new DemoResponseDTO();
    }

    @GetMapping("/getUser/{userName}")
    @ApiOperation(value = "查询用户",notes = "查询用户Notes")
    @ApiImplicitParam(name = "userName",example = "yumeiguang",value = "yumeiguang",required = true,dataType = "string",paramType = "path")
    @ResponseBody
    public DemoResponseDTO getUser(@ApiParam(value = "用户姓名",name = "userName",example = "yumeiguang") @PathVariable(value = "userName")String userName){
        DemoResponseDTO demoResponseDTO = new DemoResponseDTO();
        demoResponseDTO.setUserName(userName);
        return demoResponseDTO;
    }



}
