package com.design.dao;

import java.util.HashSet;
import java.util.Set;

/**
 * SINGLETON PATTERN
 */
public final class ResourceInitializer
{
    private static Set<String> pinCodes;
    private static Set<String> states;
    static ResourceInitializer resourceInitializer;
    private ResourceInitializer()
    {
        //create DB;
        //hit query
        //initialize;
        pinCodes = new HashSet<>();
        pinCodes.add("34242");
        pinCodes.add("35465");
        pinCodes.add("87687");
        states = new HashSet<>();
        states.add("MH");
        states.add("MP");
        states.add("UP");


    }

    public static ResourceInitializer getResourceInitializer()
    {
        if(resourceInitializer == null)
        {
            resourceInitializer = new ResourceInitializer();
        }
        return resourceInitializer;
    }

    public Set<String> getPinCodes()
    {
        return pinCodes;
    }
    public Set<String> getStates()
    {
        return states;
    }

}
