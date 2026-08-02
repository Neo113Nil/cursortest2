package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbaa {
    private final ExecutorService zza = zzbar.zzl("Loader:ExtractorMediaPeriod");
    private zzazx zzb;
    private IOException zzc;

    public zzbaa(String str) {
    }

    public final long zza(zzazy zzazyVar, zzazw zzazwVar, int i) {
        Looper myLooper = Looper.myLooper();
        zzbac.zze(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzazx(this, myLooper, zzazyVar, zzazwVar, i, elapsedRealtime).zzc(0L);
        return elapsedRealtime;
    }

    public final void zzf() {
        this.zzb.zza(false);
    }

    public final void zzg(int i) throws IOException {
        IOException iOException = this.zzc;
        if (iOException != null) {
            throw iOException;
        }
        zzazx zzazxVar = this.zzb;
        if (zzazxVar != null) {
            zzazxVar.zzb(zzazxVar.zza);
        }
    }

    public final void zzh(Runnable runnable) {
        zzazx zzazxVar = this.zzb;
        if (zzazxVar != null) {
            zzazxVar.zza(true);
        }
        this.zza.execute(runnable);
        this.zza.shutdown();
    }

    public final boolean zzi() {
        return this.zzb != null;
    }
}
