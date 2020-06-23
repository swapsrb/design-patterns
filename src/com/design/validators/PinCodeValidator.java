package com.design.validators;

import com.design.dao.ResourceInitializer;
import com.design.models.Address;

public class PinCodeValidator implements FieldValidator
{
    public boolean validate(String pinCode)
    {
        ResourceInitializer resourceInitializer = ResourceInitializer.getResourceInitializer();
        System.out.println("RI From PinCode : " + resourceInitializer);
        return resourceInitializer.getPinCodes().contains(pinCode);
    }

    @Override
    public boolean validate(Address a) {
        return validate(a.getPinCode());
    }
}
