package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzsp implements zzrz, zzry {
    private final zzrz zza;
    private final long zzb;
    private zzry zzc;

    public zzsp(zzrz zzrzVar, long j) {
        this.zza = zzrzVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zza(long j, zzjx zzjxVar) {
        return this.zza.zza(j - this.zzb, zzjxVar) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zzd() {
        long zzd = this.zza.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zze(long j) {
        return this.zza.zze(j - this.zzb) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final long zzf(zzvh[] zzvhVarArr, boolean[] zArr, zztr[] zztrVarArr, boolean[] zArr2, long j) {
        zztr[] zztrVarArr2 = new zztr[zztrVarArr.length];
        int i = 0;
        while (true) {
            zztr zztrVar = null;
            if (i >= zztrVarArr.length) {
                break;
            }
            zzsq zzsqVar = (zzsq) zztrVarArr[i];
            if (zzsqVar != null) {
                zztrVar = zzsqVar.zzc();
            }
            zztrVarArr2[i] = zztrVar;
            i++;
        }
        long zzf = this.zza.zzf(zzvhVarArr, zArr, zztrVarArr2, zArr2, j - this.zzb);
        for (int i2 = 0; i2 < zztrVarArr.length; i2++) {
            zztr zztrVar2 = zztrVarArr2[i2];
            if (zztrVar2 == null) {
                zztrVarArr[i2] = null;
            } else {
                zztr zztrVar3 = zztrVarArr[i2];
                if (zztrVar3 == null || ((zzsq) zztrVar3).zzc() != zztrVar2) {
                    zztrVarArr[i2] = new zzsq(zztrVar2, this.zzb);
                }
            }
        }
        return zzf + this.zzb;
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
        this.zza.zzj(j - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzrz
    public final void zzl(zzry zzryVar, long j) {
        this.zzc = zzryVar;
        this.zza.zzl(this, j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final void zzm(long j) {
        this.zza.zzm(j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final boolean zzo(long j) {
        return this.zza.zzo(j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzrz, com.google.android.gms.internal.ads.zztt
    public final boolean zzp() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzi(zzrz zzrzVar) {
        zzry zzryVar = this.zzc;
        Objects.requireNonNull(zzryVar);
        zzryVar.zzi(this);
    }
}
