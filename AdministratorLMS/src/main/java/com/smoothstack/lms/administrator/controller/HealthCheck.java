package com.smoothstack.lms.administrator.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthCheck {


    @RequestMapping(path = "/health", method=RequestMethod.GET,
            produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Map<String, Object>> healthCheck() {
        Map<String, Object> ret = new HashMap<>();

        ret.put("code",200);
        ret.put("status","OK!");
        ret.put("message", "healthy");

        return new ResponseEntity<>(ret, HttpStatus.OK);
    }
}
