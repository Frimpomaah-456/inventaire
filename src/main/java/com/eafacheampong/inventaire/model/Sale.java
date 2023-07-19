package com.eafacheampong.inventaire.model;

public class Sale {
    public int id;
    public String product_code;

    public Sale(int sale_id, String product_code) {
        this.id = sale_id;
        this.product_code = product_code;
    }
}
