package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzsw implements zzsg, zzsf {
    private final zzsg zza;
    private final long zzb;
    private zzsf zzc;

    public zzsw(zzsg zzsgVar, long j) {
        this.zza = zzsgVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final long zza(long j, zzkd zzkdVar) {
        return this.zza.zza(j - this.zzb, zzkdVar) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final long zzd() {
        long zzd = this.zza.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final long zze(long j) {
        return this.zza.zze(j - this.zzb) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final long zzf(zzvt[] zzvtVarArr, boolean[] zArr, zztz[] zztzVarArr, boolean[] zArr2, long j) {
        zztz[] zztzVarArr2 = new zztz[zztzVarArr.length];
        int i = 0;
        while (true) {
            zztz zztzVar = null;
            if (i >= zztzVarArr.length) {
                break;
            }
            zzsx zzsxVar = (zzsx) zztzVarArr[i];
            if (zzsxVar != null) {
                zztzVar = zzsxVar.zzc();
            }
            zztzVarArr2[i] = zztzVar;
            i++;
        }
        long zzf = this.zza.zzf(zzvtVarArr, zArr, zztzVarArr2, zArr2, j - this.zzb);
        for (int i2 = 0; i2 < zztzVarArr.length; i2++) {
            zztz zztzVar2 = zztzVarArr2[i2];
            if (zztzVar2 == null) {
                zztzVarArr[i2] = null;
            } else {
                zztz zztzVar3 = zztzVarArr[i2];
                if (zztzVar3 == null || ((zzsx) zztzVar3).zzc() != zztzVar2) {
                    zztzVarArr[i2] = new zzsx(zztzVar2, this.zzb);
                }
            }
        }
        return zzf + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final /* bridge */ /* synthetic */ void zzg(zzub zzubVar) {
        zzsf zzsfVar = this.zzc;
        Objects.requireNonNull(zzsfVar);
        zzsfVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final zzuh zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzj(long j, boolean z) {
        this.zza.zzj(j - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzl(zzsf zzsfVar, long j) {
        this.zzc = zzsfVar;
        this.zza.zzl(this, j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
    public final void zzm(long j) {
        this.zza.zzm(j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
    public final boolean zzo(long j) {
        return this.zza.zzo(j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
    public final boolean zzp() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzsf
    public final void zzi(zzsg zzsgVar) {
        zzsf zzsfVar = this.zzc;
        Objects.requireNonNull(zzsfVar);
        zzsfVar.zzi(this);
    }
}
