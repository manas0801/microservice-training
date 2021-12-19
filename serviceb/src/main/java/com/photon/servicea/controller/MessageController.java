package com.photon.servicea.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RefreshScope
public class MessageController {
    @Value("${greeting.message}")
    private String message;
    @Value("${server.port}")
    private String port;

    @GetMapping("/test")
    public ResponseEntity<String> getMessage(){
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/port")
    public ResponseEntity<String> getPort(){
        return new ResponseEntity<>(port, HttpStatus.OK);
    }
}