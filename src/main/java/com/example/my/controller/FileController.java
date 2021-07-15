package com.example.my.controller;

import com.example.my.util.Result;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "file")
@ApiModel(description = "文件上传下载")

public class FileController {

    @PostMapping("upload")
    @ApiOperation("文件上传")
    public Result<Object> upload(){

        return Result.success();
    }

    @PostMapping("download")
    @ApiOperation("文件下载")
    public Result<Object> download(){

        return Result.success();
    }
}
