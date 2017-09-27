package com.maxron.databindingexample.handler;

import android.util.Log;
import android.view.View;

/**
 * Created by maxron on 2017/9/27.
 */

public class MyHandler {

    private static final String TAG = MyHandler.class.getSimpleName();

    public void onClickedName(View view) {
        Log.d(TAG, "onClickedName: ");
    }
}
