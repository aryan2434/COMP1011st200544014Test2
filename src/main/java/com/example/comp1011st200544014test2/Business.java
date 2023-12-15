package com.example.comp1011st200544014test2;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Business {
    @SerializedName("BusinessName")
    private String businessName;

    @SerializedName("Customers")
    private List<Customers> customers;

    public String getBusinessName() {
        return businessName;
    }

    public List<Customers> getCustomers() {
        return customers;
    }

    @Override
    public String toString() {
        return "Business{" +
                "businessName='" + businessName + '\'' +
                ", customers=" + customers +
                '}';
    }
}
