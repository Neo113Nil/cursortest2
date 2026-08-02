package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzsa implements zzsg, zzsf {
    public final zzsi zza;
    private final long zzb;
    private zzsk zzc;
    private zzsg zzd;
    private zzsf zze;
    private long zzf = -9223372036854775807L;
    private final zzwi zzg;

    public zzsa(zzsi zzsiVar, zzwi zzwiVar, long j, byte[] bArr) {
        this.zza = zzsiVar;
        this.zzg = zzwiVar;
        this.zzb = j;
    }

    private final long zzv(long j) {
        long j2 = this.zzf;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final long zza(long j, zzkd zzkdVar) {
        zzsg zzsgVar = this.zzd;
        int i = zzen.zza;
        return zzsgVar.zza(j, zzkdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
    public final long zzb() {
        zzsg zzsgVar = this.zzd;
        int i = zzen.zza;
        return zzsgVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
    public final long zzc() {
        zzsg zzsgVar = this.zzd;
        int i = zzen.zza;
        return zzsgVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final long zzd() {
        zzsg zzsgVar = this.zzd;
        int i = zzen.zza;
        return zzsgVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final long zze(long j) {
        zzsg zzsgVar = this.zzd;
        int i = zzen.zza;
        return zzsgVar.zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final long zzf(zzvt[] zzvtVarArr, boolean[] zArr, zztz[] zztzVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.zzf;
        if (j3 == -9223372036854775807L || j != this.zzb) {
            j2 = j;
        } else {
            this.zzf = -9223372036854775807L;
            j2 = j3;
        }
        zzsg zzsgVar = this.zzd;
        int i = zzen.zza;
        return zzsgVar.zzf(zzvtVarArr, zArr, zztzVarArr, zArr2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzua
    public final /* bridge */ /* synthetic */ void zzg(zzub zzubVar) {
        zzsf zzsfVar = this.zze;
        int i = zzen.zza;
        zzsfVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final zzuh zzh() {
        zzsg zzsgVar = this.zzd;
        int i = zzen.zza;
        return zzsgVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzsf
    public final void zzi(zzsg zzsgVar) {
        zzsf zzsfVar = this.zze;
        int i = zzen.zza;
        zzsfVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzj(long j, boolean z) {
        zzsg zzsgVar = this.zzd;
        int i = zzen.zza;
        zzsgVar.zzj(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzk() throws IOException {
        try {
            zzsg zzsgVar = this.zzd;
            if (zzsgVar != null) {
                zzsgVar.zzk();
                return;
            }
            zzsk zzskVar = this.zzc;
            if (zzskVar != null) {
                zzskVar.zzw();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg
    public final void zzl(zzsf zzsfVar, long j) {
        this.zze = zzsfVar;
        zzsg zzsgVar = this.zzd;
        if (zzsgVar != null) {
            zzsgVar.zzl(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
    public final void zzm(long j) {
        zzsg zzsgVar = this.zzd;
        int i = zzen.zza;
        zzsgVar.zzm(j);
    }

    public final long zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
    public final boolean zzo(long j) {
        zzsg zzsgVar = this.zzd;
        return zzsgVar != null && zzsgVar.zzo(j);
    }

    @Override // com.google.android.gms.internal.ads.zzsg, com.google.android.gms.internal.ads.zzub
    public final boolean zzp() {
        zzsg zzsgVar = this.zzd;
        return zzsgVar != null && zzsgVar.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzsi zzsiVar) {
        long zzv = zzv(this.zzb);
        zzsk zzskVar = this.zzc;
        Objects.requireNonNull(zzskVar);
        zzsg zzD = zzskVar.zzD(zzsiVar, this.zzg, zzv);
        this.zzd = zzD;
        if (this.zze != null) {
            zzD.zzl(this, zzv);
        }
    }

    public final void zzs(long j) {
        this.zzf = j;
    }

    public final void zzu(zzsk zzskVar) {
        zzdd.zzf(this.zzc == null);
        this.zzc = zzskVar;
    }

    public final void zzt() {
        zzsg zzsgVar = this.zzd;
        if (zzsgVar != null) {
            zzsk zzskVar = this.zzc;
            Objects.requireNonNull(zzskVar);
            zzskVar.zzB(zzsgVar);
        }
    }
}
