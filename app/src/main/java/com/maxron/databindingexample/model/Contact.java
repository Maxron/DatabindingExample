package com.maxron.databindingexample.model;

/**
 * Created by maxron on 2017/9/27.
 */

public class Contact {

    /**
     * tel : 1234567
     * address : Taipei city
     */

    private String  tel;
    private String address;

    public Contact(String tel, String address) {
        this.tel = tel;
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
