package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzrn implements zzsg, zzsf {
    public final zzsg zza;
    long zzb;
    private zzsf zzc;
    private zzrm[] zzd = new zzrm[0];
    private long zze = 0;

    public zzrn(zzsg zzsgVar, boolean z, long j, long j2) {
        this.zza = zzsgVar;
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final long zza(long j, zzkd zzkdVar) {
        if (j == 0) {
            return 0L;
        }
        long zzr = zzen.zzr(zzkdVar.zzf, 0L, j);
        long j2 = zzkdVar.zzg;
        long j3 = this.zzb;
        long zzr2 = zzen.zzr(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (zzr != zzkdVar.zzf || zzr2 != zzkdVar.zzg) {
            zzkdVar = new zzkd(zzr, zzr2);
        }
        return this.zza.zza(j, zzkdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
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

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
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

    @Override // com.google.android.gms.internal.ads.zzsg
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
        zzdd.zzf(zzd2 >= 0);
        long j2 = this.zzb;
        zzdd.zzf(j2 == Long.MIN_VALUE || zzd2 <= j2);
        return zzd2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0 > r3) goto L17;
     */
    @Override // com.google.android.gms.internal.ads.zzsg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zze(long j) {
        this.zze = -9223372036854775807L;
        boolean z = false;
        for (zzrm zzrmVar : this.zzd) {
            if (zzrmVar != null) {
                zzrmVar.zzc();
            }
        }
        long zze = this.zza.zze(j);
        if (zze != j) {
            if (zze >= 0) {
                long j2 = this.zzb;
                if (j2 != Long.MIN_VALUE) {
                }
            }
            zzdd.zzf(z);
            return zze;
        }
        z = true;
        zzdd.zzf(z);
        return zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r4 > r6) goto L24;
     */
    @Override // com.google.android.gms.internal.ads.zzsg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzf(zzvt[] zzvtVarArr, boolean[] zArr, zztz[] zztzVarArr, boolean[] zArr2, long j) {
        int length = zztzVarArr.length;
        this.zzd = new zzrm[length];
        zztz[] zztzVarArr2 = new zztz[length];
        int i = 0;
        while (true) {
            zztz zztzVar = null;
            if (i >= zztzVarArr.length) {
                break;
            }
            zzrm[] zzrmVarArr = this.zzd;
            zzrm zzrmVar = (zzrm) zztzVarArr[i];
            zzrmVarArr[i] = zzrmVar;
            if (zzrmVar != null) {
                zztzVar = zzrmVar.zza;
            }
            zztzVarArr2[i] = zztzVar;
            i++;
        }
        long zzf = this.zza.zzf(zzvtVarArr, zArr, zztzVarArr2, zArr2, j);
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
        zzdd.zzf(z);
        for (int i2 = 0; i2 < zztzVarArr.length; i2++) {
            zztz zztzVar2 = zztzVarArr2[i2];
            if (zztzVar2 == null) {
                this.zzd[i2] = null;
            } else {
                zzrm[] zzrmVarArr2 = this.zzd;
                zzrm zzrmVar2 = zzrmVarArr2[i2];
                if (zzrmVar2 == null || zzrmVar2.zza != zztzVar2) {
                    zzrmVarArr2[i2] = new zzrm(this, zztzVar2);
                }
            }
            zztzVarArr[i2] = this.zzd[i2];
        }
        return zzf;
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
        this.zza.zzj(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzl(zzsf zzsfVar, long j) {
        this.zzc = zzsfVar;
        this.zza.zzl(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
    public final void zzm(long j) {
        this.zza.zzm(j);
    }

    public final void zzn(long j, long j2) {
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
    public final boolean zzo(long j) {
        return this.zza.zzo(j);
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
    public final boolean zzp() {
        return this.zza.zzp();
    }

    final boolean zzq() {
        return this.zze != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzsf
    public final void zzi(zzsg zzsgVar) {
        zzsf zzsfVar = this.zzc;
        Objects.requireNonNull(zzsfVar);
        zzsfVar.zzi(this);
    }
}
