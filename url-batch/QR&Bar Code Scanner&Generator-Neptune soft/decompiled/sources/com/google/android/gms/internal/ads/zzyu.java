package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public class zzyu {
    protected final zzyo zza;
    protected final zzyt zzb;
    protected zzyq zzc;
    private final int zzd;

    protected zzyu(zzyr zzyrVar, zzyt zzytVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzytVar;
        this.zzd = i;
        this.zza = new zzyo(zzyrVar, j, 0L, j3, j4, j5, j6);
    }

    protected static final int zzf(zzzj zzzjVar, long j, zzaai zzaaiVar) {
        if (j == zzzjVar.zzf()) {
            return 0;
        }
        zzaaiVar.zza = j;
        return 1;
    }

    protected static final boolean zzg(zzzj zzzjVar, long j) throws IOException {
        long zzf = j - zzzjVar.zzf();
        if (zzf < 0 || zzf > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        ((zzyy) zzzjVar).zzo((int) zzf, false);
        return true;
    }

    public final int zza(zzzj zzzjVar, zzaai zzaaiVar) throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        while (true) {
            zzyq zzyqVar = this.zzc;
            zzdd.zzb(zzyqVar);
            j = zzyqVar.zzf;
            j2 = zzyqVar.zzg;
            j3 = zzyqVar.zzh;
            if (j2 - j <= this.zzd) {
                zzc(false, j);
                return zzf(zzzjVar, j, zzaaiVar);
            }
            if (!zzg(zzzjVar, j3)) {
                return zzf(zzzjVar, j3, zzaaiVar);
            }
            zzzjVar.zzj();
            zzyt zzytVar = this.zzb;
            j4 = zzyqVar.zzb;
            zzys zza = zzytVar.zza(zzzjVar, j4);
            i = zza.zzb;
            if (i == -3) {
                zzc(false, j3);
                return zzf(zzzjVar, j3, zzaaiVar);
            }
            if (i == -2) {
                j10 = zza.zzc;
                j11 = zza.zzd;
                zzyq.zzh(zzyqVar, j10, j11);
            } else {
                if (i != -1) {
                    j5 = zza.zzd;
                    zzg(zzzjVar, j5);
                    j6 = zza.zzd;
                    zzc(true, j6);
                    j7 = zza.zzd;
                    return zzf(zzzjVar, j7, zzaaiVar);
                }
                j8 = zza.zzc;
                j9 = zza.zzd;
                zzyq.zzg(zzyqVar, j8, j9);
            }
        }
    }

    public final zzaal zzb() {
        return this.zza;
    }

    protected final void zzc(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        zzyq zzyqVar = this.zzc;
        if (zzyqVar != null) {
            j6 = zzyqVar.zza;
            if (j6 == j) {
                return;
            }
        }
        long zzf = this.zza.zzf(j);
        zzyo zzyoVar = this.zza;
        j2 = zzyoVar.zzc;
        j3 = zzyoVar.zzd;
        j4 = zzyoVar.zze;
        j5 = zzyoVar.zzf;
        this.zzc = new zzyq(j, zzf, 0L, j2, j3, j4, j5);
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
