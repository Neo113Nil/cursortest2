package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzyx {
    public static final zzyr zza = new zzyr(2, -9223372036854775807L, null);
    public static final zzyr zzb = new zzyr(3, -9223372036854775807L, null);
    private final ExecutorService zzc = zzet.zzE("ExoPlayer:Loader:ProgressiveMediaPeriod");
    private zzys zzd;
    private IOException zze;

    public zzyx(String str) {
    }

    public static zzyr zzb(boolean z, long j) {
        return new zzyr(z ? 1 : 0, j, null);
    }

    public final long zza(zzyt zzytVar, zzyp zzypVar, int i) {
        Looper myLooper = Looper.myLooper();
        zzdi.zzb(myLooper);
        this.zze = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzys(this, myLooper, zzytVar, zzypVar, i, elapsedRealtime).zzc(0L);
        return elapsedRealtime;
    }

    public final void zzg() {
        zzys zzysVar = this.zzd;
        zzdi.zzb(zzysVar);
        zzysVar.zza(false);
    }

    public final void zzh() {
        this.zze = null;
    }

    public final void zzi(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null) {
            throw iOException;
        }
        zzys zzysVar = this.zzd;
        if (zzysVar != null) {
            zzysVar.zzb(i);
        }
    }

    public final void zzj(zzyu zzyuVar) {
        zzys zzysVar = this.zzd;
        if (zzysVar != null) {
            zzysVar.zza(true);
        }
        this.zzc.execute(new zzyv(zzyuVar));
        this.zzc.shutdown();
    }

    public final boolean zzk() {
        return this.zze != null;
    }

    public final boolean zzl() {
        return this.zzd != null;
    }
}
