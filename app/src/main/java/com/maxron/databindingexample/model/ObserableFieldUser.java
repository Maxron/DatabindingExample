package com.maxron.databindingexample.model;

import android.databinding.ObservableField;

/**
 * Created by maxron on 2017/9/27.
 */

public class ObserableFieldUser {
    public final ObservableField<String> firstName = new ObservableField<>();
    public final ObservableField<String> lastName = new ObservableField<>();
}
