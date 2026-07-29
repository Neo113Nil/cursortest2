package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zzarc implements zzarx, zzary {
    private final int zza;
    private zzarz zzb;
    private int zzc;
    private int zzd;
    private zzaxk zze;
    private long zzf;
    private boolean zzg = true;
    private boolean zzh;

    public zzarc(int i) {
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final boolean zzA() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final boolean zzB() {
        return this.zzh;
    }

    protected final boolean zzC() {
        return this.zzg ? this.zzh : this.zze.zze();
    }

    protected final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzarx, com.google.android.gms.internal.ads.zzary
    public final int zzc() {
        return this.zza;
    }

    protected final int zzd(zzart zzartVar, zzatn zzatnVar, boolean z) {
        int zzb = this.zze.zzb(zzartVar, zzatnVar, z);
        if (zzb == -4) {
            if (zzatnVar.zzf()) {
                this.zzg = true;
                return this.zzh ? -4 : -3;
            }
            zzatnVar.zzc += this.zzf;
        } else if (zzb == -5) {
            zzars zzarsVar = zzartVar.zza;
            long j = zzarsVar.zzw;
            if (j != Long.MAX_VALUE) {
                zzartVar.zza = new zzars(zzarsVar.zza, zzarsVar.zze, zzarsVar.zzf, zzarsVar.zzc, zzarsVar.zzb, zzarsVar.zzg, zzarsVar.zzj, zzarsVar.zzk, zzarsVar.zzl, zzarsVar.zzm, zzarsVar.zzn, zzarsVar.zzp, zzarsVar.zzo, zzarsVar.zzq, zzarsVar.zzr, zzarsVar.zzs, zzarsVar.zzt, zzarsVar.zzu, zzarsVar.zzv, zzarsVar.zzx, zzarsVar.zzy, zzarsVar.zzz, j + this.zzf, zzarsVar.zzh, zzarsVar.zzi, zzarsVar.zzd);
                return -5;
            }
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public int zze() throws zzare {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final zzary zzf() {
        return this;
    }

    protected final zzarz zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final zzaxk zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public zzazc zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final void zzj() {
        zzayy.zze(this.zzd == 1);
        this.zzd = 0;
        this.zze = null;
        this.zzh = false;
        zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final void zzk(zzarz zzarzVar, zzars[] zzarsVarArr, zzaxk zzaxkVar, long j, boolean z, long j2) throws zzare {
        zzayy.zze(this.zzd == 0);
        this.zzb = zzarzVar;
        this.zzd = 1;
        zzo(z);
        zzt(zzarsVarArr, zzaxkVar, j2);
        zzp(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzarg
    public void zzl(int i, Object obj) throws zzare {
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final void zzm() throws IOException {
        this.zze.zzc();
    }

    protected void zzn() {
        throw null;
    }

    protected void zzo(boolean z) throws zzare {
    }

    protected void zzp(long j, boolean z) throws zzare {
        throw null;
    }

    protected void zzq() throws zzare {
    }

    protected void zzr() throws zzare {
    }

    protected void zzs(zzars[] zzarsVarArr, long j) throws zzare {
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final void zzt(zzars[] zzarsVarArr, zzaxk zzaxkVar, long j) throws zzare {
        zzayy.zze(!this.zzh);
        this.zze = zzaxkVar;
        this.zzg = false;
        this.zzf = j;
        zzs(zzarsVarArr, j);
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final void zzu(long j) throws zzare {
        this.zzh = false;
        this.zzg = false;
        zzp(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final void zzv() {
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final void zzw(int i) {
        this.zzc = i;
    }

    protected final void zzx(long j) {
        this.zze.zzd(j - this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final void zzy() throws zzare {
        zzayy.zze(this.zzd == 1);
        this.zzd = 2;
        zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final void zzz() throws zzare {
        zzayy.zze(this.zzd == 2);
        this.zzd = 1;
        zzr();
    }
}
