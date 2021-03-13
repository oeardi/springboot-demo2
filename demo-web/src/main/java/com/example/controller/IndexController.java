package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 冷枫红舞
 */
@RestController
public class IndexController {

    @GetMapping(value = "/index")
    public String index() {
        return "hello module";
    }
}
