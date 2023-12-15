package com.example.comp1011st200544014test2;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Customers {
    @SerializedName("id")
    private String id;
    @SerializedName("firstName")
    private String firstName;
    @SerializedName("lastName")
    private String lastName;
    @SerializedName("city")
    private String city;
    @SerializedName("purchases")
    private List<Purchase> purchases;

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", purchases=" + purchases +
                '}';
    }
    public double getPurchaseValue() {
        return purchases.stream()
                .mapToDouble(Purchase::getSalePriceTwo)
                .sum();
    }
}
