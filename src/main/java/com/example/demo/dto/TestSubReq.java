package com.example.demo.dto;

import com.example.demo.controller.TestController;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class TestSubReq {

    @NotNull(message = "Please provide the inventory name", groups = {TestController.class})
    private String inventoryName;
}
