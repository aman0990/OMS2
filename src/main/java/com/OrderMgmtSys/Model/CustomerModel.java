package com.OrderMgmtSys.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class CustomerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

   private String name;

   private String email;
   private String mobno;
   private String address;
   private String status;

   @OneToMany(mappedBy = "customerModel")
   private List <OrderModel> orders;

    public CustomerModel ( ) {
    }

    public CustomerModel (Long id, String name, String email, String mobno, String address,String status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobno = mobno;
        this.address = address;
    }

    public Long getId ( ) {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getName ( ) {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getEmail ( ) {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getMobno ( ) {
        return mobno;
    }

    public void setMobno (String mobno) {
        this.mobno = mobno;
    }

    public String getAddress ( ) {
        return address;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public String getStatus ( ) {return status;}

    public void setStatus (String status) {this.status = status;}

    @Override
    public String toString ( ) {
        return "CustomerModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobno='" + mobno + '\'' +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
