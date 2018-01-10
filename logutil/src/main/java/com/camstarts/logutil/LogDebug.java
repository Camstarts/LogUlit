package com.camstarts.logutil;

import android.util.Log;

/**
 * Created by Piseth on 1/10/2018.
 */

public class LogDebug {

    private static final String TAG = "SIMPLE_NAME_APP";
    public static void d(String message) {
        Log.d(TAG, message);
    }

}
