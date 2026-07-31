package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzcge {

    @Nullable
    private zzhdi zza;

    @Nullable
    private zzeaj zzb;
    private Context zzc;
    private final AtomicBoolean zzd = new AtomicBoolean(false);
    private final AtomicBoolean zze = new AtomicBoolean(false);
    private long zzf = -1;
    private long zzg = -1;

    public final void zza(zzhdi zzhdiVar, zzeaj zzeajVar, Context context) {
        if (this.zzd.getAndSet(true)) {
            return;
        }
        this.zza = zzhdiVar;
        this.zzb = zzeajVar;
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpD)).longValue();
        this.zzg = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpE)).longValue();
        this.zzc = context;
    }

    public final void zzb() {
        zzhdi zzhdiVar;
        if (!this.zzd.get() || this.zzf < 0 || this.zzg < 0 || !this.zze.compareAndSet(false, true) || (zzhdiVar = this.zza) == null) {
            return;
        }
        zzhdiVar.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcge.this.zzc();
            }
        });
    }

    final /* synthetic */ void zzc() {
        zzeaj zzeajVar;
        ActivityManager.MemoryInfo zze;
        while (this.zze.get()) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    atomicBoolean.getAndSet(true);
                }
            });
            try {
                Thread.sleep(this.zzf);
                if (!atomicBoolean.get()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpF)).booleanValue() && (zzeajVar = this.zzb) != null) {
                        zzeai zza = zzeajVar.zza();
                        zza.zzc("action", "panr");
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzqh)).booleanValue() && (zze = com.google.android.gms.ads.internal.util.client.zzf.zze(this.zzc)) != null) {
                            zza.zzc("mem_avl", String.valueOf(zze.availMem));
                            zza.zzc("mem_tt", String.valueOf(zze.totalMem));
                            zza.zzc("low_m", true != zze.lowMemory ? "0" : "1");
                        }
                        zza.zzf();
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpG)).booleanValue()) {
                        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                        zzcgd zzcgdVar = new zzcgd("Potential ANR detected");
                        zzcgdVar.setStackTrace(stackTrace);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpH)).booleanValue()) {
                            zzcaq.zzc(this.zzc).zzi(zzcgdVar, "AnrWatchdog", ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpI)).intValue() / 100.0f);
                        } else {
                            com.google.android.gms.ads.internal.zzt.zzh().zzh(zzcgdVar, "AnrWatchdog");
                        }
                    }
                }
                do {
                    try {
                        Thread.sleep(this.zzg);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                } while (!atomicBoolean.get());
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
