package com.ymg.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author yumg
 * @create 2019/07/24
 * @desc
 * @since 1.0.0
 **/
@Data
@ApiModel(value = "示例实体",description = "示例实体",reference = "")
public class DemoResponseDTO {

    @ApiModelProperty(value = "用户名",example = "yumeiguang",name = "yumeiguang",required = true)
    private String userName;
    @ApiModelProperty(value = "密码",example = "123456",name = "密码",required = true)
    private String password;
    @ApiModelProperty(value = "身份证",example = "341224198909287611",name = "身份证",required = false)
    private String idCardAddress;

}
