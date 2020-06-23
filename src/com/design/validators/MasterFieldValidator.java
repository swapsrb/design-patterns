package com.design.validators;

import com.design.models.Address;

import java.util.ArrayList;
import java.util.List;

public class MasterFieldValidator implements FieldValidator
{
    List<FieldValidator> fieldValidators;
    public MasterFieldValidator()
    {
        /**
         * Add validators in order of less complex first
         * So that if first validation fails, it won't go for next validations and we follow 'FAIL FAST'
         */
        fieldValidators = new ArrayList<>();
        fieldValidators.add(new PinCodeValidator());
        fieldValidators.add(new StateValidator());
        fieldValidators.add(new AddressLineValidator());
    }
    @Override
    public boolean validate(Address a)
    {
        for(FieldValidator fieldValidator : fieldValidators)
        {
            if(!fieldValidator.validate(a))
                return false;
        }
        return true;
    }
}
