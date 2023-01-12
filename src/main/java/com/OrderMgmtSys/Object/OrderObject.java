package com.OrderMgmtSys.Object;

import org.springframework.stereotype.Component;

@Component
public class OrderObject {
    private String categories;
    private String product;
    private double price;
    private double discount;
    private int quantity;

    private long custId;

    public OrderObject ( ) {
    }

    public OrderObject (Long id, String categories, String product, double price, double discount, int quantity, long custId) {
        this.categories = categories;
        this.product = product;
        this.price = price;
        this.discount = discount;
        this.quantity = quantity;
        this.custId = custId;
    }

    public String getCategories ( ) {
        return categories;
    }

    public void setCategories (String categories) {
        this.categories = categories;
    }

    public String getProduct ( ) {
        return product;
    }

    public void setProduct (String product) {
        this.product = product;
    }

    public double getPrice ( ) {
        return price;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public double getDiscount ( ) {
        return discount;
    }

    public void setDiscount (double discount) {
        this.discount = discount;
    }

    public int getQuantity ( ) {
        return quantity;
    }

    public void setQuantity (int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString ( ) {
        return "OrderObject{" +
                ", categories='" + categories + '\'' +
                ", product='" + product + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", quantity=" + quantity +
                '}';
    }

    public long getCustId ( ) {
        return custId;
    }

    public void setCustId (long custId) {
        this.custId = custId;
    }
}
