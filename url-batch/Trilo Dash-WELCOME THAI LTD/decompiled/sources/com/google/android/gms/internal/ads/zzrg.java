package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzrg implements zzrz, zzry {
    public final zzrz zza;
    long zzb;
    private zzry zzc;
    private zzrf[] zzd = new zzrf[0];
    private long zze = 0;

    public zzrg(zzrz zzrzVar, boolean z, long j, long j2) {
        this.zza = zzrzVar;
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zza(long j, zzjx zzjxVar) {
        if (j == 0) {
            return 0L;
        }
        long zzr = zzeg.zzr(zzjxVar.zzf, 0L, j);
        long j2 = zzjxVar.zzg;
        long j3 = this.zzb;
        long zzr2 = zzeg.zzr(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (zzr != zzjxVar.zzf || zzr2 != zzjxVar.zzg) {
            zzjxVar = new zzjx(zzr, zzr2);
        }
        return this.zza.zza(j, zzjxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzb < j) {
                return zzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzc < j) {
                return zzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zzd() {
        if (zzq()) {
            long j = this.zze;
            this.zze = -9223372036854775807L;
            long zzd = zzd();
            return zzd != -9223372036854775807L ? zzd : j;
        }
        long zzd2 = this.zza.zzd();
        if (zzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        zzcw.zzf(zzd2 >= 0);
        long j2 = this.zzb;
        zzcw.zzf(j2 == Long.MIN_VALUE || zzd2 <= j2);
        return zzd2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0 > r8) goto L17;
     */
    @Override // com.google.android.gms.internal.ads.zzrz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zze(long j) {
        this.zze = -9223372036854775807L;
        boolean z = false;
        for (zzrf zzrfVar : this.zzd) {
            if (zzrfVar != null) {
                zzrfVar.zzc();
            }
        }
        long zze = this.zza.zze(j);
        if (zze != j) {
            if (zze >= 0) {
                long j2 = this.zzb;
                if (j2 != Long.MIN_VALUE) {
                }
            }
            zzcw.zzf(z);
            return zze;
        }
        z = true;
        zzcw.zzf(z);
        return zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r4 > r7) goto L24;
     */
    @Override // com.google.android.gms.internal.ads.zzrz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzf(zzvh[] zzvhVarArr, boolean[] zArr, zztr[] zztrVarArr, boolean[] zArr2, long j) {
        int length = zztrVarArr.length;
        this.zzd = new zzrf[length];
        zztr[] zztrVarArr2 = new zztr[length];
        int i = 0;
        while (true) {
            zztr zztrVar = null;
            if (i >= zztrVarArr.length) {
                break;
            }
            zzrf[] zzrfVarArr = this.zzd;
            zzrf zzrfVar = (zzrf) zztrVarArr[i];
            zzrfVarArr[i] = zzrfVar;
            if (zzrfVar != null) {
                zztrVar = zzrfVar.zza;
            }
            zztrVarArr2[i] = zztrVar;
            i++;
        }
        long zzf = this.zza.zzf(zzvhVarArr, zArr, zztrVarArr2, zArr2, j);
        long j2 = (zzq() && j == 0) ? 0L : j;
        this.zze = -9223372036854775807L;
        boolean z = true;
        if (zzf != j2) {
            if (zzf >= 0) {
                long j3 = this.zzb;
                if (j3 != Long.MIN_VALUE) {
                }
            }
            z = false;
        }
        zzcw.zzf(z);
        for (int i2 = 0; i2 < zztrVarArr.length; i2++) {
            zztr zztrVar2 = zztrVarArr2[i2];
            if (zztrVar2 == null) {
                this.zzd[i2] = null;
            } else {
                zzrf[] zzrfVarArr2 = this.zzd;
                zzrf zzrfVar2 = zzrfVarArr2[i2];
                if (zzrfVar2 == null || zzrfVar2.zza != zztrVar2) {
                    zzrfVarArr2[i2] = new zzrf(this, zztrVar2);
                }
            }
            zztrVarArr[i2] = this.zzd[i2];
        }
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public final /* bridge */ /* synthetic */ void zzg(zztt zzttVar) {
        zzry zzryVar = this.zzc;
        Objects.requireNonNull(zzryVar);
        zzryVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final zztz zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzj(long j, boolean z) {
        this.zza.zzj(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzl(zzry zzryVar, long j) {
        this.zzc = zzryVar;
        this.zza.zzl(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final void zzm(long j) {
        this.zza.zzm(j);
    }

    public final void zzn(long j, long j2) {
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final boolean zzo(long j) {
        return this.zza.zzo(j);
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final boolean zzp() {
        return this.zza.zzp();
    }

    final boolean zzq() {
        return this.zze != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzi(zzrz zzrzVar) {
        zzry zzryVar = this.zzc;
        Objects.requireNonNull(zzryVar);
        zzryVar.zzi(this);
    }
}
