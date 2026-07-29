package com.unity3d.player.a;

import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import com.unity3d.player.OrientationLockListener;

/* loaded from: classes.dex */
public final class M extends ContentObserver {
    public final OrientationLockListener a;

    public M(Handler handler, OrientationLockListener orientationLockListener) {
        super(handler);
        this.a = orientationLockListener;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        OrientationLockListener orientationLockListener = this.a;
        if (orientationLockListener != null) {
            orientationLockListener.nativeUpdateOrientationLockState(Settings.System.getInt(orientationLockListener.b.getContentResolver(), "accelerometer_rotation", 0));
        }
    }
}
