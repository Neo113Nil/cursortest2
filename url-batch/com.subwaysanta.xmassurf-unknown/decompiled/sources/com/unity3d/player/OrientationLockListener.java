package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

/* loaded from: classes.dex */
public class OrientationLockListener {
    public com.unity3d.player.a.N a;
    public final Context b;

    public final native void nativeUpdateOrientationLockState(int i);

    public OrientationLockListener(Context context) {
        this.b = context;
        this.a = new com.unity3d.player.a.N(context);
        nativeUpdateOrientationLockState(Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0));
        com.unity3d.player.a.N n = this.a;
        n.getClass();
        n.b = new com.unity3d.player.a.M(new Handler(Looper.getMainLooper()), this);
        n.a.getContentResolver().registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), true, n.b);
    }
}
