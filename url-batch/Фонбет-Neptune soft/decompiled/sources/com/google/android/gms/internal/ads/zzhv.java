package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzhv implements zzkg {
    private final zzlm zza;
    private final zzhu zzb;
    private zzle zzc;
    private zzkg zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzhv(zzhu zzhuVar, zzdj zzdjVar) {
        this.zzb = zzhuVar;
        this.zza = new zzlm(zzdjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final long zza() {
        throw null;
    }

    public final long zzb(boolean z) {
        zzle zzleVar = this.zzc;
        if (zzleVar == null || zzleVar.zzW() || ((z && this.zzc.zzcV() != 2) || (!this.zzc.zzX() && (z || this.zzc.zzQ())))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        } else {
            zzkg zzkgVar = this.zzd;
            zzkgVar.getClass();
            long zza = zzkgVar.zza();
            if (this.zze) {
                if (zza < this.zza.zza()) {
                    this.zza.zze();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        this.zza.zzd();
                    }
                }
            }
            this.zza.zzb(zza);
            zzbq zzc = zzkgVar.zzc();
            if (!zzc.equals(this.zza.zzc())) {
                this.zza.zzg(zzc);
                this.zzb.zza(zzc);
            }
        }
        if (this.zze) {
            return this.zza.zza();
        }
        zzkg zzkgVar2 = this.zzd;
        zzkgVar2.getClass();
        return zzkgVar2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final zzbq zzc() {
        zzkg zzkgVar = this.zzd;
        return zzkgVar != null ? zzkgVar.zzc() : this.zza.zzc();
    }

    public final void zzd(zzle zzleVar) {
        if (zzleVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzle zzleVar) throws zzhw {
        zzkg zzkgVar;
        zzkg zzk = zzleVar.zzk();
        if (zzk == null || zzk == (zzkgVar = this.zzd)) {
            return;
        }
        if (zzkgVar != null) {
            throw zzhw.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzk;
        this.zzc = zzleVar;
        zzk.zzg(this.zza.zzc());
    }

    public final void zzf(long j) {
        this.zza.zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzg(zzbq zzbqVar) {
        zzkg zzkgVar = this.zzd;
        if (zzkgVar != null) {
            zzkgVar.zzg(zzbqVar);
            zzbqVar = this.zzd.zzc();
        }
        this.zza.zzg(zzbqVar);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final boolean zzj() {
        if (this.zze) {
            return false;
        }
        zzkg zzkgVar = this.zzd;
        zzkgVar.getClass();
        return zzkgVar.zzj();
    }
}
