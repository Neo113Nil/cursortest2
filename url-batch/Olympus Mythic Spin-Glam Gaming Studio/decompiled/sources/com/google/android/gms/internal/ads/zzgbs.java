package com.google.android.gms.internal.ads;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public abstract class zzgbs implements SensorEventListener {
    protected zzgbs(String str, String str2) {
        zzgbr.zza();
        zzgbq.zza();
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        zzd(sensorEvent);
    }

    public abstract void zzd(SensorEvent sensorEvent);
}
