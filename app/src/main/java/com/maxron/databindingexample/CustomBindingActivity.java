package com.maxron.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.maxron.databindingexample.model.Contact;

public class CustomBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ContactBinding contactBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_custom_binding);

        contactBinding.setContact(
                new Contact("09123456789", "Taiwan taipei city, num.123"));
    }
}
