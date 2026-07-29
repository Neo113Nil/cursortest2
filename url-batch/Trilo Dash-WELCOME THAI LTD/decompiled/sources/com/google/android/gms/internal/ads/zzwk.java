package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzwk {
    public static final zzwe zza = new zzwe(0, -9223372036854775807L, null);
    public static final zzwe zzb = new zzwe(1, -9223372036854775807L, null);
    public static final zzwe zzc = new zzwe(2, -9223372036854775807L, null);
    public static final zzwe zzd = new zzwe(3, -9223372036854775807L, null);
    private final ExecutorService zze = zzeg.zzP("ExoPlayer:Loader:ProgressiveMediaPeriod");
    private zzwf zzf;
    private IOException zzg;

    public zzwk(String str) {
    }

    public static zzwe zzb(boolean z, long j) {
        return new zzwe(z ? 1 : 0, j, null);
    }

    public final long zza(zzwg zzwgVar, zzwc zzwcVar, int i) {
        Looper myLooper = Looper.myLooper();
        zzcw.zzb(myLooper);
        this.zzg = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzwf(this, myLooper, zzwgVar, zzwcVar, i, elapsedRealtime).zzc(0L);
        return elapsedRealtime;
    }

    public final void zzg() {
        zzwf zzwfVar = this.zzf;
        zzcw.zzb(zzwfVar);
        zzwfVar.zza(false);
    }

    public final void zzh() {
        this.zzg = null;
    }

    public final void zzi(int i) throws IOException {
        IOException iOException = this.zzg;
        if (iOException != null) {
            throw iOException;
        }
        zzwf zzwfVar = this.zzf;
        if (zzwfVar != null) {
            zzwfVar.zzb(i);
        }
    }

    public final void zzj(zzwh zzwhVar) {
        zzwf zzwfVar = this.zzf;
        if (zzwfVar != null) {
            zzwfVar.zza(true);
        }
        this.zze.execute(new zzwi(zzwhVar));
        this.zze.shutdown();
    }

    public final boolean zzk() {
        return this.zzg != null;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}
