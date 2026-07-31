package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzmg {
    public final zzxm zza;
    public final Object zzb;
    public final zzzg[] zzc;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public zzmh zzg;
    public boolean zzh;
    private final boolean[] zzi;
    private final zzng[] zzj;
    private final zzabl zzk;
    private final zzmv zzl;

    @Nullable
    private zzmg zzm;
    private zzzr zzn;
    private zzabm zzo;
    private long zzp;

    public zzmg(zzng[] zzngVarArr, long j, zzabl zzablVar, zzabp zzabpVar, zzmv zzmvVar, zzmh zzmhVar, zzabm zzabmVar, long j2) {
        this.zzj = zzngVarArr;
        this.zzp = j;
        this.zzk = zzablVar;
        this.zzl = zzmvVar;
        zzxo zzxoVar = zzmhVar.zza;
        this.zzb = zzxoVar.zza;
        this.zzg = zzmhVar;
        this.zzn = zzzr.zza;
        this.zzo = zzabmVar;
        this.zzc = new zzzg[2];
        this.zzi = new boolean[2];
        this.zza = zzmvVar.zze(zzxoVar, zzabpVar, zzmhVar.zzb);
    }

    private final void zzt() {
        if (!zzv()) {
            return;
        }
        int i = 0;
        while (true) {
            zzabm zzabmVar = this.zzo;
            if (i >= zzabmVar.zza) {
                return;
            }
            zzabmVar.zza(i);
            zzabe zzabeVar = this.zzo.zzc[i];
            i++;
        }
    }

    private final void zzu() {
        if (!zzv()) {
            return;
        }
        int i = 0;
        while (true) {
            zzabm zzabmVar = this.zzo;
            if (i >= zzabmVar.zza) {
                return;
            }
            zzabmVar.zza(i);
            zzabe zzabeVar = this.zzo.zzc[i];
            i++;
        }
    }

    private final boolean zzv() {
        return this.zzm == null;
    }

    public final long zza() {
        return this.zzp;
    }

    public final void zzb(long j) {
        this.zzp = j;
    }

    public final long zzc() {
        return this.zzg.zzb + this.zzp;
    }

    public final boolean zzd() {
        if (this.zze) {
            return !this.zzf || this.zza.zzb() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean zze() {
        if (this.zze) {
            return zzd() || zzf() - this.zzg.zzb >= -9223372036854775807L;
        }
        return false;
    }

    public final long zzf() {
        if (!this.zze) {
            return this.zzg.zzb;
        }
        long zzb = this.zzf ? this.zza.zzb() : Long.MIN_VALUE;
        return zzb == Long.MIN_VALUE ? this.zzg.zze : zzb;
    }

    public final long zzg() {
        if (this.zze) {
            return this.zza.zzc();
        }
        return 0L;
    }

    public final void zzh(float f, zzbf zzbfVar, boolean z) throws zzjn {
        this.zze = true;
        this.zzn = this.zza.zzn();
        zzabm zzk = zzk(f, zzbfVar, z);
        zzmh zzmhVar = this.zzg;
        long j = zzmhVar.zzb;
        long j2 = zzmhVar.zze;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        long zzl = zzl(zzk, j, false);
        long j3 = this.zzp;
        zzmh zzmhVar2 = this.zzg;
        this.zzp = j3 + (zzmhVar2.zzb - zzl);
        this.zzg = zzmhVar2.zza(zzl, zzmhVar2.zzc);
    }

    public final void zzi(long j) {
        zzguk.zzi(zzv());
        if (this.zze) {
            this.zza.zzf(j - this.zzp);
        }
    }

    public final void zzj(zzme zzmeVar) {
        zzguk.zzi(zzv());
        this.zza.zzd(zzmeVar);
    }

    public final zzabm zzk(float f, zzbf zzbfVar, boolean z) throws zzjn {
        zzzr zzzrVar = this.zzn;
        zzxo zzxoVar = this.zzg.zza;
        zzabl zzablVar = this.zzk;
        zzng[] zzngVarArr = this.zzj;
        zzabm zzr = zzablVar.zzr(zzngVarArr, zzzrVar, zzxoVar, zzbfVar);
        for (int i = 0; i < zzr.zza; i++) {
            if (zzr.zza(i)) {
                if (zzr.zzc[i] == null) {
                    zzngVarArr[i].zza();
                    r2 = false;
                }
                zzguk.zzi(r2);
            } else {
                zzguk.zzi(zzr.zzc[i] == null);
            }
        }
        for (zzabe zzabeVar : zzr.zzc) {
        }
        return zzr;
    }

    public final long zzl(zzabm zzabmVar, long j, boolean z) {
        return zzm(zzabmVar, j, false, new boolean[2]);
    }

    public final long zzm(zzabm zzabmVar, long j, boolean z, boolean[] zArr) {
        zzng[] zzngVarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzabmVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzi;
            if (z || !zzabmVar.zzb(this.zzo, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzngVarArr = this.zzj;
            if (i2 >= 2) {
                break;
            }
            zzngVarArr[i2].zza();
            i2++;
        }
        zzu();
        this.zzo = zzabmVar;
        zzt();
        zzxm zzxmVar = this.zza;
        zzabe[] zzabeVarArr = zzabmVar.zzc;
        boolean[] zArr3 = this.zzi;
        zzzg[] zzzgVarArr = this.zzc;
        long zzo = zzxmVar.zzo(zzabeVarArr, zArr3, zzzgVarArr, zArr, j);
        for (int i3 = 0; i3 < 2; i3++) {
            zzngVarArr[i3].zza();
        }
        this.zzf = false;
        for (int i4 = 0; i4 < 2; i4++) {
            if (zzzgVarArr[i4] != null) {
                zzguk.zzi(zzabmVar.zza(i4));
                zzngVarArr[i4].zza();
                this.zzf = true;
            } else {
                zzguk.zzi(zzabeVarArr[i4] == null);
            }
        }
        return zzo;
    }

    public final void zzn() {
        zzu();
        try {
            this.zzl.zzf(this.zza);
        } catch (RuntimeException e) {
            zzeh.zzf("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzo(@Nullable zzmg zzmgVar) {
        if (zzmgVar == this.zzm) {
            return;
        }
        zzu();
        this.zzm = zzmgVar;
        zzt();
    }

    @Nullable
    public final zzmg zzp() {
        return this.zzm;
    }

    public final zzzr zzq() {
        return this.zzn;
    }

    public final zzabm zzr() {
        return this.zzo;
    }

    public final void zzs(zzxl zzxlVar, long j) {
        this.zzd = true;
        this.zza.zzl(zzxlVar, j);
    }
}
