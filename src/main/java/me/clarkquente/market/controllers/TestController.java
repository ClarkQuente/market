package me.clarkquente.market.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class TestController {

    @GetMapping
    public ResponseEntity<?> initial() {
        return ResponseEntity.ok("OK");
    }

}
