package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzaci {
    public static final zzacc zza = new zzacc(2, -9223372036854775807L, null);
    public static final zzacc zzb = new zzacc(3, -9223372036854775807L, null);
    private final zzaco zzc = zzaco.zzb(zzfm.zzg("ExoPlayer:Loader:ProgressiveMediaPeriod"), zzacb.zza);

    @Nullable
    private zzacd zzd;

    @Nullable
    private IOException zze;

    public zzaci(String str) {
    }

    public static zzacc zza(boolean z, long j) {
        return new zzacc(z ? 1 : 0, j, null);
    }

    public final boolean zzb() {
        return this.zze != null;
    }

    public final void zzc() {
        this.zze = null;
    }

    public final long zzd(zzace zzaceVar, zzaca zzacaVar, int i) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.zze = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzacd(this, myLooper, zzaceVar, zzacaVar, i, elapsedRealtime).zzb(0L);
        return elapsedRealtime;
    }

    public final boolean zze() {
        return this.zzd != null;
    }

    public final void zzg(@Nullable zzacf zzacfVar) {
        zzacd zzacdVar = this.zzd;
        if (zzacdVar != null) {
            zzacdVar.zzc(true);
        }
        zzaco zzacoVar = this.zzc;
        zzacoVar.execute(new zzacg(zzacfVar));
        zzacoVar.zza();
    }

    public final void zzh(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null) {
            throw iOException;
        }
        zzacd zzacdVar = this.zzd;
        if (zzacdVar != null) {
            zzacdVar.zza(i);
        }
    }

    final /* synthetic */ zzaco zzi() {
        return this.zzc;
    }

    final /* synthetic */ zzacd zzj() {
        return this.zzd;
    }

    final /* synthetic */ void zzk(zzacd zzacdVar) {
        this.zzd = zzacdVar;
    }

    final /* synthetic */ void zzl(IOException iOException) {
        this.zze = iOException;
    }

    public final void zzf() {
        zzacd zzacdVar = this.zzd;
        zzacdVar.getClass();
        zzacdVar.zzc(false);
    }
}
