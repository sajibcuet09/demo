package com.example.demo.controller;

import com.example.demo.dto.TestReq;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @PostMapping("/validation/check")
    ResponseEntity validationCheck(@Validated(ValidationStepOne.class) @RequestBody TestReq testReq){
        return ResponseEntity.ok().build();
    }

    @GetMapping
    @PreAuthorize("hasRole('USER')")
    ResponseEntity show(){
        Deque<Map<Integer, String>> cars = new LinkedList();
        Map<Integer,String> car = new HashMap<>();
        car.put(1,"first");
        car.put(2,"Second");
        cars.add(car);
        car = new HashMap<>();
        car.put(3,"Third");
        cars.stream().flatMap(ca -> ca.keySet().stream()).collect(Collectors.toList());
        return ResponseEntity.ok().build();
    }
}
