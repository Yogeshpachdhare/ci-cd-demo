package com.cicd.piplinedemo.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class NewSpringProject {
    @GetMapping
    public ResponseEntity<String> getAPI(){
        return ResponseEntity.ok("OK WE ARE READY");
    }
}
