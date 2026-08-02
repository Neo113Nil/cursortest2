package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzasg implements zzatb, zzatc {
    private final int zza;
    private zzatd zzb;
    private int zzc;
    private int zzd;
    private zzayo zze;
    private long zzf;
    private boolean zzg = true;
    private boolean zzh;

    public zzasg(int i) {
        this.zza = i;
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final boolean zzA() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final boolean zzB() {
        return this.zzh;
    }

    protected final boolean zzC() {
        return this.zzg ? this.zzh : this.zze.zze();
    }

    protected final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzatb, com.google.android.gms.internal.ads.zzatc
    public final int zzc() {
        return this.zza;
    }

    protected final int zzd(zzasx zzasxVar, zzaur zzaurVar, boolean z) {
        int zzb = this.zze.zzb(zzasxVar, zzaurVar, z);
        if (zzb == -4) {
            if (zzaurVar.zzf()) {
                this.zzg = true;
                return this.zzh ? -4 : -3;
            }
            zzaurVar.zzc += this.zzf;
        } else if (zzb == -5) {
            zzasw zzaswVar = zzasxVar.zza;
            long j = zzaswVar.zzw;
            if (j != Long.MAX_VALUE) {
                zzasxVar.zza = new zzasw(zzaswVar.zza, zzaswVar.zze, zzaswVar.zzf, zzaswVar.zzc, zzaswVar.zzb, zzaswVar.zzg, zzaswVar.zzj, zzaswVar.zzk, zzaswVar.zzl, zzaswVar.zzm, zzaswVar.zzn, zzaswVar.zzp, zzaswVar.zzo, zzaswVar.zzq, zzaswVar.zzr, zzaswVar.zzs, zzaswVar.zzt, zzaswVar.zzu, zzaswVar.zzv, zzaswVar.zzx, zzaswVar.zzy, zzaswVar.zzz, j + this.zzf, zzaswVar.zzh, zzaswVar.zzi, zzaswVar.zzd);
                return -5;
            }
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzatc
    public int zze() throws zzasi {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final zzatc zzf() {
        return this;
    }

    protected final zzatd zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final zzayo zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public zzbag zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void zzj() {
        zzbac.zze(this.zzd == 1);
        this.zzd = 0;
        this.zze = null;
        this.zzh = false;
        zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void zzk(zzatd zzatdVar, zzasw[] zzaswVarArr, zzayo zzayoVar, long j, boolean z, long j2) throws zzasi {
        zzbac.zze(this.zzd == 0);
        this.zzb = zzatdVar;
        this.zzd = 1;
        zzo(z);
        zzt(zzaswVarArr, zzayoVar, j2);
        zzp(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzask
    public void zzl(int i, Object obj) throws zzasi {
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void zzm() throws IOException {
        this.zze.zzc();
    }

    protected void zzn() {
        throw null;
    }

    protected void zzo(boolean z) throws zzasi {
    }

    protected void zzp(long j, boolean z) throws zzasi {
        throw null;
    }

    protected void zzq() throws zzasi {
    }

    protected void zzr() throws zzasi {
    }

    protected void zzs(zzasw[] zzaswVarArr, long j) throws zzasi {
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void zzt(zzasw[] zzaswVarArr, zzayo zzayoVar, long j) throws zzasi {
        zzbac.zze(!this.zzh);
        this.zze = zzayoVar;
        this.zzg = false;
        this.zzf = j;
        zzs(zzaswVarArr, j);
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void zzu(long j) throws zzasi {
        this.zzh = false;
        this.zzg = false;
        zzp(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void zzv() {
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void zzw(int i) {
        this.zzc = i;
    }

    protected final void zzx(long j) {
        this.zze.zzd(j - this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void zzy() throws zzasi {
        zzbac.zze(this.zzd == 1);
        this.zzd = 2;
        zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void zzz() throws zzasi {
        zzbac.zze(this.zzd == 2);
        this.zzd = 1;
        zzr();
    }
}
