package com.example.demo;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dms")
public class MainController {

    @PostMapping("/api")
    public ResponseEntity<String> postAPI(@RequestHeader("X-ADOBESIGN-CLIENTID") String clientId) {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("X-AdobeSign-ClientId", clientId);
        return ResponseEntity.ok().headers(responseHeaders).body("POST API is working");
    }

    @GetMapping("/api")
    public ResponseEntity<String> getAPI(@RequestHeader("X-ADOBESIGN-CLIENTID") String clientId) {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("X-AdobeSign-ClientId", clientId);
        return ResponseEntity.ok().headers(responseHeaders).body("GET API is working");
    }
}
