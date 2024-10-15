package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/get")
    public String getTest() {
        return "tezzzzzzzzzza3zzzz3zz2t";
    }
}
