package com.google.alarmapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.widget.Toast;

public class Alarm extends BroadcastReceiver {
    @Override
    public void onReceive (Context context, Intent intent)
    {

        MediaPlayer mp=MediaPlayer.create(context, Settings.System.DEFAULT_ALARM_ALERT_URI);
        mp.start();
        Toast.makeText(context,"WAKE UP",Toast.LENGTH_LONG).show();

    }
}
