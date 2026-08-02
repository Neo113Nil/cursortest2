package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzla {
    private final zzkz zza;
    private final zzky zzb;
    private final zzcc zzc;
    private int zzd;
    private Object zze;
    private final Looper zzf;
    private final int zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    public zzla(zzky zzkyVar, zzkz zzkzVar, zzcc zzccVar, int i, zzdj zzdjVar, Looper looper) {
        this.zzb = zzkyVar;
        this.zza = zzkzVar;
        this.zzc = zzccVar;
        this.zzf = looper;
        this.zzg = i;
    }

    public final int zza() {
        return this.zzd;
    }

    public final Looper zzb() {
        return this.zzf;
    }

    public final zzkz zzc() {
        return this.zza;
    }

    public final zzla zzd() {
        zzdi.zzf(!this.zzh);
        this.zzh = true;
        this.zzb.zzl(this);
        return this;
    }

    public final zzla zze(Object obj) {
        zzdi.zzf(!this.zzh);
        this.zze = obj;
        return this;
    }

    public final zzla zzf(int i) {
        zzdi.zzf(!this.zzh);
        this.zzd = i;
        return this;
    }

    public final Object zzg() {
        return this.zze;
    }

    public final synchronized void zzh(boolean z) {
        this.zzi = z | this.zzi;
        this.zzj = true;
        notifyAll();
    }

    public final synchronized boolean zzi(long j) throws InterruptedException, TimeoutException {
        zzdi.zzf(this.zzh);
        zzdi.zzf(this.zzf.getThread() != Thread.currentThread());
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (!this.zzj) {
            if (j <= 0) {
                throw new TimeoutException("Message delivery timed out.");
            }
            wait(j);
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        return this.zzi;
    }

    public final synchronized boolean zzj() {
        return false;
    }
}
