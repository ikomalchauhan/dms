package com.example.demo;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/dms")
public class MainController {

    @PostMapping("/api")
    public ResponseEntity<ResponseObj> postAPI(@RequestHeader("X-ADOBESIGN-CLIENTID") String clientId, @RequestBody Map<String, Object>[] payload) {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("X-AdobeSign-ClientId", clientId);
        ResponseObj obj = new ResponseObj();
        obj.setRequestType("POST API is working");
        obj.setxAdobeSignClientId(clientId);
        System.out.println("POST API is working");
        System.out.println(payload);
        return ResponseEntity.ok().headers(responseHeaders).body(obj);
    }

    @GetMapping("/api")
    public ResponseEntity<ResponseObj> getAPI(@RequestHeader("X-ADOBESIGN-CLIENTID") String clientId, @RequestBody Map<String, Object>[] payload) {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("X-AdobeSign-ClientId", clientId);
        ResponseObj obj = new ResponseObj();
        obj.setRequestType("GET API is working");
        obj.setxAdobeSignClientId(clientId);
        System.out.println("GET API is working");
        System.out.println(payload);
        return ResponseEntity.ok().headers(responseHeaders).body(obj);
    }
}

