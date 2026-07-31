package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes12.dex */
public final class zzedb extends zzgbs {
    private final SensorManager zza;
    private final Sensor zzb;
    private float zzc;
    private Float zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzeda zzi;
    private boolean zzj;

    zzedb(Context context) {
        super("FlickDetector", "ads");
        this.zzc = 0.0f;
        this.zzd = Float.valueOf(0.0f);
        this.zze = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        this.zzf = 0;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
        this.zzj = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.zza = sensorManager;
        if (sensorManager != null) {
            this.zzb = sensorManager.getDefaultSensor(4);
        } else {
            this.zzb = null;
        }
    }

    public final void zza(zzeda zzedaVar) {
        this.zzi = zzedaVar;
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkE)).booleanValue()) {
                    if (!this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.zzj = true;
                        com.google.android.gms.ads.internal.util.zze.zza("Listening for flick gestures.");
                    }
                    if (this.zza == null || this.zzb == null) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.zzj = false;
                    com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for flick gestures.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbs
    public final void zzd(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkE)).booleanValue()) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (this.zze + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkG)).intValue() < currentTimeMillis) {
                this.zzf = 0;
                this.zze = currentTimeMillis;
                this.zzg = false;
                this.zzh = false;
                this.zzc = this.zzd.floatValue();
            }
            Float valueOf = Float.valueOf(this.zzd.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.zzd = valueOf;
            float floatValue = valueOf.floatValue();
            float f = this.zzc;
            zzbix zzbixVar = zzbjg.zzkF;
            if (floatValue > f + ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzh = true;
            } else if (this.zzd.floatValue() < this.zzc - ((Float) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzg = true;
            }
            if (this.zzd.isInfinite()) {
                this.zzd = Float.valueOf(0.0f);
                this.zzc = 0.0f;
            }
            if (this.zzg && this.zzh) {
                com.google.android.gms.ads.internal.util.zze.zza("Flick detected.");
                this.zze = currentTimeMillis;
                int i = this.zzf + 1;
                this.zzf = i;
                this.zzg = false;
                this.zzh = false;
                zzeda zzedaVar = this.zzi;
                if (zzedaVar != null) {
                    if (i == ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkH)).intValue()) {
                        zzedp zzedpVar = (zzedp) zzedaVar;
                        zzedpVar.zzo(new zzedn(zzedpVar), zzedo.GESTURE);
                    }
                }
            }
        }
    }
}
