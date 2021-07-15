package com.example.my.controller;

import com.example.my.service.TestService;
import com.example.my.util.Result;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping("test")
@ApiModel(value = "Test",description = "测试类")
public class TestController {

    @Resource
    TestService testService;

    @GetMapping
    @ApiOperation("测试方法1")
    public Result<Object> test1(){

        return Result.success(testService.list());
    }

    public void test2(){
        CopyOnWriteArrayList<Object> c = new CopyOnWriteArrayList<>();

        c.add("123");

        ArrayList<Object> objects = new ArrayList<>();
    }

}
