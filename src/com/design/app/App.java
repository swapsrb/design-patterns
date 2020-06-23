package com.design.app;

import com.design.models.Address;
import com.design.models.Employee;
import com.design.validators.MasterFieldValidator;
import com.design.validators.PinCodeValidator;
import com.design.validators.StateValidator;
import com.design.validators.ValidatorFactory;

public class App
{
    private static Employee e;
    public static void main(String[] args)
    {
        /**
         * Builder pattern object demo
         */
        Employee.EmployeeBuilder builder = new Employee.EmployeeBuilder();
        e = builder.setName("Swapnil").setRole("SDE").setId(123).setSalary("100000").setLocation("Ngp").build();

        /**
         * Singleton pattern object demo
         */
        Address a = new Address("MG Road", "MH", "Ngp", "34242", "IN");
        Address b = new Address("CA road", "UP","Indore", "45566", "US");
        PinCodeValidator pinCodeValidator = new PinCodeValidator();
        System.out.println("validated pinCode : " + pinCodeValidator.validate(a.getPinCode()));
        StateValidator stateValidator = new StateValidator();
        System.out.println("validated state : " + stateValidator.validate(a.getState()));

        /**
         * Factory Pattern demo
         */
        System.out.println(ValidatorFactory.getValidatorFactory().countryToValidatorMap.get(a.getCountry()).validate());
        try
        {
            System.out.println(ValidatorFactory.getValidatorFactory().getCountryValidator(b.getCountry()));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        /**
         * Cascading pattern demo
         * in case all fields validation is required
         */
        MasterFieldValidator masterFieldValidator = new MasterFieldValidator();
        System.out.println("Validated all fields : " + masterFieldValidator.validate(a));
    }
}
