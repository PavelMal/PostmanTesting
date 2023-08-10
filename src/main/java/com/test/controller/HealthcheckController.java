package com.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthcheckController {

    @GetMapping("/check")
    public ResponseEntity getHealthcheck() {
        return ResponseEntity.ok().build();
    }
}