package com.example.my.controller;

import com.example.my.util.Result;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("excel")
@ApiModel(value = "Excel",description = "Excel相关")
public class ExcelController {

    @PostMapping("export")
    @ApiOperation("excel导出")
    public Result<Object> export(){

        return Result.success();
    }
}
