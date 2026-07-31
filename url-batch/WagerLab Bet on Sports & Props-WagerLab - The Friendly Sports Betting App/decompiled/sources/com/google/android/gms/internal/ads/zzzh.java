package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.C;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzzh {
    public static final zzzb zza = new zzzb(2, C.TIME_UNSET, null);
    public static final zzzb zzb = new zzzb(3, C.TIME_UNSET, null);
    private final zzzn zzc = zzzn.zzb(zzeo.zzf("ExoPlayer:Loader:ProgressiveMediaPeriod"), zzza.zza);
    private zzzc zzd;
    private IOException zze;

    public zzzh(String str) {
    }

    public static zzzb zza(boolean z, long j) {
        return new zzzb(z ? 1 : 0, j, null);
    }

    public final boolean zzb() {
        return this.zze != null;
    }

    public final void zzc() {
        this.zze = null;
    }

    public final long zzd(zzzd zzzdVar, zzyz zzyzVar, int i) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.zze = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzzc(this, myLooper, zzzdVar, zzyzVar, i, elapsedRealtime).zzb(0L);
        return elapsedRealtime;
    }

    public final boolean zze() {
        return this.zzd != null;
    }

    public final void zzg(zzze zzzeVar) {
        zzzc zzzcVar = this.zzd;
        if (zzzcVar != null) {
            zzzcVar.zzc(true);
        }
        zzzn zzznVar = this.zzc;
        zzznVar.execute(new zzzf(zzzeVar));
        zzznVar.zza();
    }

    public final void zzh(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null) {
            throw iOException;
        }
        zzzc zzzcVar = this.zzd;
        if (zzzcVar != null) {
            zzzcVar.zza(i);
        }
    }

    final /* synthetic */ zzzn zzi() {
        return this.zzc;
    }

    final /* synthetic */ zzzc zzj() {
        return this.zzd;
    }

    final /* synthetic */ void zzk(zzzc zzzcVar) {
        this.zzd = zzzcVar;
    }

    final /* synthetic */ void zzl(IOException iOException) {
        this.zze = iOException;
    }

    public final void zzf() {
        zzzc zzzcVar = this.zzd;
        zzzcVar.getClass();
        zzzcVar.zzc(false);
    }
}
