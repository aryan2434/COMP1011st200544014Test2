package com.example.comp1011st200544014test2;

import com.google.gson.annotations.SerializedName;

public class Purchase {

    @SerializedName("id")
    private String id;
    @SerializedName("sku")
    private String SKU;
    @SerializedName("name")
    private String name;
    @SerializedName("salePrice")
    private String salePrice;
    @SerializedName("regularPrice")
    private String regularPrice;
    @SerializedName("image")
    private String image;

    public String getId() {
        return id;
    }

    public String getSKU() {
        return SKU;
    }

    public String getName() {
        return name;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public String getRegularPrice() {
        return regularPrice;
    }

    public String getImage() {
        return image;
    }

    //this is for the total purchase and saving
    public double getSavings() {
        double regularPriceValue = Double.parseDouble(regularPrice);
        double salePriceValue = Double.parseDouble(salePrice);
        return regularPriceValue - salePriceValue;
    }
    public double getSalePriceTwo() {
        return Double.parseDouble(salePrice);
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id='" + id + '\'' +
                ", SKU='" + SKU + '\'' +
                ", name='" + name + '\'' +
                ", salePrice='" + salePrice + '\'' +
                ", regularPrice='" + regularPrice + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
