package com.example.demo;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dms")
public class MainController {

    @PostMapping("/api")
    public ResponseEntity<ResponseObj> postAPI(@RequestHeader("X-ADOBESIGN-CLIENTID") String clientId) {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("X-AdobeSign-ClientId", clientId);
        ResponseObj obj = new ResponseObj();
        obj.setRequestType("POST API is working");
        obj.setxAdobeSignClientId(clientId);
        return ResponseEntity.ok().headers(responseHeaders).body(obj);
    }

    @GetMapping("/api")
    public ResponseEntity<ResponseObj> getAPI(@RequestHeader("X-ADOBESIGN-CLIENTID") String clientId) {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("X-AdobeSign-ClientId", clientId);
        ResponseObj obj = new ResponseObj();
        obj.setRequestType("GET API is working");
        obj.setxAdobeSignClientId(clientId);
        return ResponseEntity.ok().headers(responseHeaders).body(obj);
    }
}

