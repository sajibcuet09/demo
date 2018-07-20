package com.example.demo.dto;

import com.example.demo.controller.TestController;
import com.example.demo.controller.ValidationStepOne;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Data
public class TestReq implements Serializable{

    private static final long serialVersionUID = 1L;

    @NotNull(message = "Please provide the inventory name",groups = {ValidationStepOne.class})
    private String inventoryName;
}


