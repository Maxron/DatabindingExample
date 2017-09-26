package com.maxron.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.maxron.databindingexample.databinding.ActivityBasicBinding;
import com.maxron.databindingexample.model.User;

public class BasicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBasicBinding databinding =
                DataBindingUtil.setContentView(this, R.layout.activity_basic);

        User user = new User("Wei", "Ko");
        databinding.setUser(user);
    }
}
