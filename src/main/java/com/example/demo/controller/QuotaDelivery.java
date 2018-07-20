package com.example.demo.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuotaDelivery {
    @JsonProperty("quotasForPaymentTypes")
    @SumOfValuesEqualsToOneHundred
    List< @Valid QuotaPayment> quotaPaymentList;
}
