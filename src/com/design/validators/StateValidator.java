package com.design.validators;

import com.design.dao.ResourceInitializer;
import com.design.models.Address;

public class StateValidator implements FieldValidator
{
    public boolean validate(String state)
    {
        ResourceInitializer resourceInitializer = ResourceInitializer.getResourceInitializer();
        System.out.println("RI From State : " + resourceInitializer);
        return resourceInitializer.getStates().contains(state);
    }

    @Override
    public boolean validate(Address a) {
        return validate(a.getState());
    }
}
