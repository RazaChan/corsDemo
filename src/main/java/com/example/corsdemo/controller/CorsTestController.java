package com.example.corsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("cors")
public class CorsTestController {

    @RequestMapping("/get")
    @ResponseBody
    public String get() {
        return "响应get请求";
    }
}
