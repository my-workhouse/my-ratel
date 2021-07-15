package com.example.my.controller;

import com.example.my.util.Result;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("enum")
@ApiModel(value = "Enum",description = "枚举相干")
public class EnumController {

    @PostMapping("all")
    @ApiOperation("所有枚举")
    public Result<Object> all(){

        return Result.success();
    }
}
