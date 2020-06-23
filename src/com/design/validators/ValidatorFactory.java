package com.design.validators;

import java.util.HashMap;
import java.util.Map;

/**
 * FACTORY PATTERN
 */
public class ValidatorFactory
{
    public static Map<String, CountryValidator> countryToValidatorMap;
    private static ValidatorFactory validatorFactory;
    private ValidatorFactory()
    {
        countryToValidatorMap = new HashMap<>();
        countryToValidatorMap.put("US", new UsAddressCountryValidator());
        countryToValidatorMap.put("IN", new InAddressCountryValidator());
        countryToValidatorMap.put("PAK", new PakAddressCountryValidator());
    }

    public static ValidatorFactory getValidatorFactory()
    {
        if(validatorFactory == null)
            validatorFactory = new ValidatorFactory();

        return validatorFactory;
    }

    public CountryValidator getCountryValidator(String country) throws Exception {
        if(countryToValidatorMap.containsKey(country))
            return countryToValidatorMap.get(country);
        else
            throw new Exception("No validator found for this country");
    }
}
