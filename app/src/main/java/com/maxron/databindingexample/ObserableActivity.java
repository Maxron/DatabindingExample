package com.maxron.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.maxron.databindingexample.databinding.ActivityObserableBinding;
import com.maxron.databindingexample.model.ObserableFieldUser;
import com.maxron.databindingexample.model.ObserableUser;

public class ObserableActivity extends AppCompatActivity {

    ObserableUser user;
    ObserableFieldUser fieldUser = new ObserableFieldUser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityObserableBinding databinding =
                DataBindingUtil.setContentView(this, R.layout.activity_obserable);
        user = new ObserableUser("Wei", "Ko");
        databinding.setObserableUser(user);

        fieldUser.firstName.set("Chantal");
        fieldUser.lastName.set("Chang");
        databinding.setObserableFieldUser(fieldUser);
    }

    public void changeOtherName(View view) {
        user.setFirstName("Allan");
        user.setLastName("Bian");

        fieldUser.firstName.set("Kent");
        fieldUser.lastName.set("Yu");
    }

    public void changeMyName(View view) {
        user.setFirstName("Wei");
        user.setLastName("Ko");

        fieldUser.firstName.set("Chantal");
        fieldUser.lastName.set("Chang");
    }
}
