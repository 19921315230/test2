package com.example.project1.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = "测试swagger控制器")
public class TestContorller {


    @GetMapping("/list")
    @ApiOperation(value = "查询列表")
    @ResponseBody
    public String getList(){

        return "success";
    }

}
