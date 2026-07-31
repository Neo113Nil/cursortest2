package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes12.dex */
public final class zzees extends zzgbs {
    private final Context zza;
    private SensorManager zzb;
    private Sensor zzc;
    private long zzd;
    private int zze;
    private zzeer zzf;
    private boolean zzg;

    zzees(Context context) {
        super("ShakeDetector", "ads");
        this.zza = context;
    }

    public final void zza(zzeer zzeerVar) {
        this.zzf = zzeerVar;
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkz)).booleanValue()) {
                    if (this.zzb == null) {
                        SensorManager sensorManager2 = (SensorManager) this.zza.getSystemService("sensor");
                        this.zzb = sensorManager2;
                        if (sensorManager2 == null) {
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.zzc = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.zzg && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.zzd = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkB)).intValue();
                        this.zzg = true;
                        com.google.android.gms.ads.internal.util.zze.zza("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc() {
        synchronized (this) {
            try {
                if (this.zzg) {
                    SensorManager sensorManager = this.zzb;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.zzc);
                        com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for shake gestures.");
                    }
                    this.zzg = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbs
    public final void zzd(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkz)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0] / 9.80665f;
            float f2 = fArr[1] / 9.80665f;
            float f3 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f * f) + (f2 * f2) + (f3 * f3))) >= ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkA)).floatValue()) {
                long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                if (this.zzd + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkB)).intValue() <= currentTimeMillis) {
                    if (this.zzd + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkC)).intValue() < currentTimeMillis) {
                        this.zze = 0;
                    }
                    com.google.android.gms.ads.internal.util.zze.zza("Shake detected.");
                    this.zzd = currentTimeMillis;
                    int i = this.zze + 1;
                    this.zze = i;
                    zzeer zzeerVar = this.zzf;
                    if (zzeerVar != null) {
                        if (i == ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkD)).intValue()) {
                            zzedp zzedpVar = (zzedp) zzeerVar;
                            zzedpVar.zzo(new zzedm(zzedpVar), zzedo.GESTURE);
                        }
                    }
                }
            }
        }
    }
}
