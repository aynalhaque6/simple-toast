package com.codecollection.toaster;

import android.content.Context;
import android.widget.Toast;

public class SimpleToast {
    public static void showMsg(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
