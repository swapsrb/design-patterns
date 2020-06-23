package com.design.validators;

import com.design.models.Address;

public class AddressLineValidator implements FieldValidator{

    @Override
    public boolean validate(Address a) {
        return true;
    }
}
