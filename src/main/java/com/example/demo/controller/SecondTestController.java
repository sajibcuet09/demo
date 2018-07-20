package com.example.demo.controller;

import com.example.demo.dto.TestReq;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/test2")
@Validated
public class SecondTestController {

    @PostMapping
    ResponseEntity doNothing(@Valid @RequestBody TestReq testReq){
        return ResponseEntity.ok().build();
    }

    @PostMapping(value = "/quotas", produces = MediaType.APPLICATION_JSON_VALUE)
    public void quotas(@Valid @RequestBody List<@Valid Quota> quotaList){

    }

}
