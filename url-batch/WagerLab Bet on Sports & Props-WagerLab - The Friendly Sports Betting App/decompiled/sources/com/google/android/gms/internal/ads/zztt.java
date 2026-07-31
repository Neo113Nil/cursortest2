package com.google.android.gms.internal.ads;

import androidx.media3.common.C;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zztt implements zzun, zzum {
    public final zzun zza;
    long zzb;
    private zzum zzc;
    private zzts[] zzd = new zzts[0];
    private long zze = 0;

    public zztt(zzun zzunVar, boolean z, long j, long j2) {
        this.zza = zzunVar;
        this.zzb = j2;
    }

    private static long zzq(long j, long j2, long j3) {
        long max = Math.max(j, j2);
        return j3 != Long.MIN_VALUE ? Math.min(max, j3) : max;
    }

    public final void zza(long j, long j2) {
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzb(zzum zzumVar, long j) {
        this.zzc = zzumVar;
        this.zza.zzb(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final zzwq zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zze(zzyf[] zzyfVarArr, boolean[] zArr, zzwf[] zzwfVarArr, boolean[] zArr2, long j) {
        int length = zzwfVarArr.length;
        this.zzd = new zzts[length];
        zzwf[] zzwfVarArr2 = new zzwf[length];
        int i = 0;
        while (true) {
            zzwf zzwfVar = null;
            if (i >= zzwfVarArr.length) {
                break;
            }
            zzts[] zztsVarArr = this.zzd;
            zzts zztsVar = (zzts) zzwfVarArr[i];
            zztsVarArr[i] = zztsVar;
            if (zztsVar != null) {
                zzwfVar = zztsVar.zza;
            }
            zzwfVarArr2[i] = zzwfVar;
            i++;
        }
        long zze = this.zza.zze(zzyfVarArr, zArr, zzwfVarArr2, zArr2, j);
        long zzq = zzq(zze, j, this.zzb);
        boolean zzo = zzo();
        long j2 = C.TIME_UNSET;
        if (zzo) {
            if (zze >= j) {
                if (zze != 0) {
                    for (zzyf zzyfVar : zzyfVarArr) {
                        if (zzyfVar != null) {
                            zzu zzc = zzyfVar.zzc();
                            if (!zzar.zzd(zzc.zzo, zzc.zzk)) {
                            }
                        }
                    }
                }
            }
            j2 = zzq;
            break;
        }
        this.zze = j2;
        for (int i2 = 0; i2 < zzwfVarArr.length; i2++) {
            zzwf zzwfVar2 = zzwfVarArr2[i2];
            if (zzwfVar2 == null) {
                this.zzd[i2] = null;
            } else {
                zzts[] zztsVarArr2 = this.zzd;
                zzts zztsVar2 = zztsVarArr2[i2];
                if (zztsVar2 == null || zztsVar2.zza != zzwfVar2) {
                    zztsVarArr2[i2] = new zzts(this, zzwfVar2);
                }
            }
            zzwfVarArr[i2] = this.zzd[i2];
        }
        return zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzf(long j, boolean z) {
        this.zza.zzf(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final void zzg(long j) {
        this.zza.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzh() {
        if (!zzo()) {
            long zzh = this.zza.zzh();
            return zzh == C.TIME_UNSET ? C.TIME_UNSET : zzq(zzh, 0L, this.zzb);
        }
        long j = this.zze;
        this.zze = C.TIME_UNSET;
        long zzh2 = zzh();
        return zzh2 != C.TIME_UNSET ? zzh2 : j;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzi() {
        long zzi = this.zza.zzi();
        if (zzi != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzi < j) {
                return zzi;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzj(long j) {
        this.zze = C.TIME_UNSET;
        for (zzts zztsVar : this.zzd) {
            if (zztsVar != null) {
                zztsVar.zza();
            }
        }
        return zzq(this.zza.zzj(j), 0L, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzk(long j, zzlt zzltVar) {
        if (j == 0) {
            return 0L;
        }
        long j2 = zzltVar.zzc;
        String str = zzeo.zza;
        long max = Math.max(0L, Math.min(j2, j));
        long j3 = zzltVar.zzd;
        long j4 = this.zzb;
        long max2 = Math.max(0L, Math.min(j3, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j));
        if (max != j2 || max2 != j3) {
            zzltVar = new zzlt(max, max2);
        }
        return this.zza.zzk(j, zzltVar);
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzl() {
        long zzl = this.zza.zzl();
        if (zzl != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzl < j) {
                return zzl;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzm(zzkl zzklVar) {
        return this.zza.zzm(zzklVar);
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzn() {
        return this.zza.zzn();
    }

    final boolean zzo() {
        return this.zze != C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final /* bridge */ /* synthetic */ void zzs(zzwh zzwhVar) {
        zzum zzumVar = this.zzc;
        zzumVar.getClass();
        zzumVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzum
    public final void zzp(zzun zzunVar) {
        zzum zzumVar = this.zzc;
        zzumVar.getClass();
        zzumVar.zzp(this);
    }
}
