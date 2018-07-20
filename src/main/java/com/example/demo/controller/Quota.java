package com.example.demo.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.validation.Valid;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quota {
    @Id
    private Integer storeId;
    @JsonProperty("quotas")
    private List< @Valid QuotaDelivery> quotaDeliveryList;
}
