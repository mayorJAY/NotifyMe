package com.example.josycom.notifyme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;

import java.lang.ref.WeakReference;

public class NotificationReceiver extends BroadcastReceiver {

    public NotificationReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // Update the notification
        Toast.makeText(context, "Done", Toast.LENGTH_SHORT).show();
    }
}