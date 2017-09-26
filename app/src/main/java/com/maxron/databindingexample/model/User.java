package com.maxron.databindingexample.model;

/**
 * Created by maxron on 2017/9/26.
 */

public class User {

    /**
     * firstName : Wei
     * lastName : Ko
     */

    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String firstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String lastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
