package com.ymg.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author yumg
 * @create 2019/07/24
 * @desc
 * @since 1.0.0
 **/
@Data
@ApiModel(value = "示例实体",description = "示例实体",reference = "")
public class DemoRequestDTO {
    @ApiModelProperty(value = "用户名",example = "yumeiguang",name = "yumeiguang",required = true)
    private String userName;
    @ApiModelProperty(value = "密码",example = "123456",name = "密码",required = true)
    private String password;
    @ApiModelProperty(value = "身份证",example = "341224198909287611",name = "身份证",required = false)
    private String idCardAddress;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty(value = "创建时间",example = "2019-10-11 19:00:00",name = "创建时间",required = false)
    private Date createDate;
}
