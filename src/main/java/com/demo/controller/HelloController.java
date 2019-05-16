package com.demo.controller;

import com.demo.mapper.DatabaseMapper;
import com.demo.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HelloController {
    @Resource
    private HelloService helloService;

    @Resource
    private DatabaseMapper databaseMapper;

    @GetMapping("/hello")
    public String hello() {
        return helloService.hello();
    }

    @GetMapping("/tables")
    public List<String> showTables() {
        return databaseMapper.showTables();
    }
}
