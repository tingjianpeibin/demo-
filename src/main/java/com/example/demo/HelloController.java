package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tingjian
 * @create 2019-11-28 10:10
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "你好！";
    }
}
