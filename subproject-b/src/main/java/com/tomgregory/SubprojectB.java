package com.tomgregory;

public class SubprojectB {
    public static String getValue() {
        return "I am subproject B " + SubprojectC.getValue();
    }
}
