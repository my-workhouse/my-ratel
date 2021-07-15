package com.example.my.controller;

import com.example.my.util.Result;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("email")
@ApiModel(value = "Email",description = "右键相关")
public class EmailController {


    @PostMapping("send")
    @ApiOperation("发送邮件")
    public Result<Object> send(){

        return Result.success();
    }

}
