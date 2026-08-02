package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzjx {
    private final zzjw zza;
    private final zzjv zzb;
    private final zzde zzc;
    private final zzcn zzd;
    private int zze;
    private Object zzf;
    private final Looper zzg;
    private final int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public zzjx(zzjv zzjvVar, zzjw zzjwVar, zzcn zzcnVar, int i, zzde zzdeVar, Looper looper) {
        this.zzb = zzjvVar;
        this.zza = zzjwVar;
        this.zzd = zzcnVar;
        this.zzg = looper;
        this.zzc = zzdeVar;
        this.zzh = i;
    }

    public final int zza() {
        return this.zze;
    }

    public final Looper zzb() {
        return this.zzg;
    }

    public final zzjw zzc() {
        return this.zza;
    }

    public final zzjx zzd() {
        zzdd.zzf(!this.zzi);
        this.zzi = true;
        this.zzb.zzm(this);
        return this;
    }

    public final zzjx zze(Object obj) {
        zzdd.zzf(!this.zzi);
        this.zzf = obj;
        return this;
    }

    public final zzjx zzf(int i) {
        zzdd.zzf(!this.zzi);
        this.zze = i;
        return this;
    }

    public final Object zzg() {
        return this.zzf;
    }

    public final synchronized void zzh(boolean z) {
        this.zzj = z | this.zzj;
        this.zzk = true;
        notifyAll();
    }

    public final synchronized boolean zzi(long j) throws InterruptedException, TimeoutException {
        zzdd.zzf(this.zzi);
        zzdd.zzf(this.zzg.getThread() != Thread.currentThread());
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (!this.zzk) {
            if (j <= 0) {
                throw new TimeoutException("Message delivery timed out.");
            }
            wait(j);
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        return this.zzj;
    }

    public final synchronized boolean zzj() {
        return false;
    }
}
