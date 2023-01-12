package com.OrderMgmtSys.Object;

import org.springframework.stereotype.Component;

@Component
public class CustomerObject {

    private String name;
    private String email;
    private String mobno;
    private String address;
    private String status;

    public CustomerObject ( ) {
    }

    public CustomerObject (Long id, String name, String email, String mobno, String address) {
        this.name = name;
        this.email = email;
        this.mobno = mobno;
        this.address = address;
        this.status = status;
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
        return "CustomerObject{" +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobno='" + mobno + '\'' +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

}
