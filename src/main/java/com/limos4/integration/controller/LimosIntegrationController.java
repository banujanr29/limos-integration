package com.limos4.integration.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LimosIntegrationController {
    @GetMapping("/test")
    public String test(){
        return "test";
    }

}
