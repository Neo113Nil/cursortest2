package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public class zzyi {
    protected final zzyc zza;
    protected final zzyh zzb;
    protected zzye zzc;
    private final int zzd;

    protected zzyi(zzyf zzyfVar, zzyh zzyhVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzyhVar;
        this.zzd = i;
        this.zza = new zzyc(zzyfVar, j, 0L, j3, j4, j5, j6);
    }

    protected static final int zzf(zzyt zzytVar, long j, zzzs zzzsVar) {
        if (j == zzytVar.zzf()) {
            return 0;
        }
        zzzsVar.zza = j;
        return 1;
    }

    protected static final boolean zzg(zzyt zzytVar, long j) throws IOException {
        long zzf = j - zzytVar.zzf();
        if (zzf < 0 || zzf > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        ((zzym) zzytVar).zzo((int) zzf, false);
        return true;
    }

    public final int zza(zzyt zzytVar, zzzs zzzsVar) throws IOException {
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
            zzye zzyeVar = this.zzc;
            zzcw.zzb(zzyeVar);
            j = zzyeVar.zzf;
            j2 = zzyeVar.zzg;
            j3 = zzyeVar.zzh;
            if (j2 - j <= this.zzd) {
                zzc(false, j);
                return zzf(zzytVar, j, zzzsVar);
            }
            if (!zzg(zzytVar, j3)) {
                return zzf(zzytVar, j3, zzzsVar);
            }
            zzytVar.zzj();
            zzyh zzyhVar = this.zzb;
            j4 = zzyeVar.zzb;
            zzyg zza = zzyhVar.zza(zzytVar, j4);
            i = zza.zzb;
            if (i == -3) {
                zzc(false, j3);
                return zzf(zzytVar, j3, zzzsVar);
            }
            if (i == -2) {
                j10 = zza.zzc;
                j11 = zza.zzd;
                zzye.zzh(zzyeVar, j10, j11);
            } else {
                if (i != -1) {
                    j5 = zza.zzd;
                    zzg(zzytVar, j5);
                    j6 = zza.zzd;
                    zzc(true, j6);
                    j7 = zza.zzd;
                    return zzf(zzytVar, j7, zzzsVar);
                }
                j8 = zza.zzc;
                j9 = zza.zzd;
                zzye.zzg(zzyeVar, j8, j9);
            }
        }
    }

    public final zzzv zzb() {
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
        zzye zzyeVar = this.zzc;
        if (zzyeVar != null) {
            j6 = zzyeVar.zza;
            if (j6 == j) {
                return;
            }
        }
        long zzf = this.zza.zzf(j);
        zzyc zzycVar = this.zza;
        j2 = zzycVar.zzc;
        j3 = zzycVar.zzd;
        j4 = zzycVar.zze;
        j5 = zzycVar.zzf;
        this.zzc = new zzye(j, zzf, 0L, j2, j3, j4, j5);
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
