package com.example.demo.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Valid;
import java.util.List;

public class SumOfValuesEqualsToOneHundredValidator implements
        ConstraintValidator<SumOfValuesEqualsToOneHundred, List<QuotaPayment>>
{
    @Override
    public void initialize(SumOfValuesEqualsToOneHundred sumOfValuesEqualsToOneHundred) {
        //nothing to do
    }

    @Override
    public boolean isValid(List<QuotaPayment> quotaPaymentList,
                           ConstraintValidatorContext context) {
        return true;
    }


}
