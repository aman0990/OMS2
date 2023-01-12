package com.OrderMgmtSys.Model;

import jakarta.persistence.*;

@Entity
@Table
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String categories;
    private String product;
    private double price;
    private double discount;
    private int quantity;

    @ManyToOne
    @JoinColumn(name="cust_id")
    private CustomerModel customerModel;

    public OrderModel ( ) {
    }

    public OrderModel (Long id, String categories, String product, double price, double discount, int quantity, CustomerModel customerModel) {
        this.id = id;
        this.categories = categories;
        this.product = product;
        this.price = price;
        this.discount = discount;
        this.quantity = quantity;
        this.customerModel = customerModel;
    }

    public Long getId ( ) {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
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
        return "OrderModel{" +
                "id=" + id +
                ", categories='" + categories + '\'' +
                ", product='" + product + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", quantity=" + quantity +
                '}';
    }

    public CustomerModel getCustomerModel ( ) {
        return customerModel;
    }

    public void setCustomerModel (CustomerModel customerModel) {
        this.customerModel = customerModel;
    }
}
