package com.maxron.databindingexample.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.maxron.databindingexample.BR;

/**
 * Created by maxron on 2017/9/27.
 */

public class ObserableUser extends BaseObservable {


    /**
     * firstName : Wei
     * lastName : Ko
     * fullName : Wei Ko
     */

    private String firstName;
    private String lastName;

    public ObserableUser(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
        notifyPropertyChanged(BR.fullName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
        notifyPropertyChanged(BR.fullName);
    }

    @Bindable
    public String getFullName() {
        return String.format("%s %s", this.firstName, this.lastName);
    }

}
