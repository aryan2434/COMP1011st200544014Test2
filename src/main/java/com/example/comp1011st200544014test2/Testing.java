package com.example.comp1011st200544014test2;

import java.util.List;

public class Testing {
    public static void main(String[] args) {
        List<Business> b1  = Utility.getBusinessData("customers.json");
        System.out.println(b1);
    }
}
