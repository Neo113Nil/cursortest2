package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgr implements zzka, zzkb {
    private final int zza;
    private zzkc zzc;
    private int zzd;
    private zznb zze;
    private int zzf;
    private zztz zzg;
    private zzaf[] zzh;
    private long zzi;
    private boolean zzk;
    private boolean zzl;
    private final zzjg zzb = new zzjg();
    private long zzj = Long.MIN_VALUE;

    public zzgr(int i) {
        this.zza = i;
    }

    private final void zzP(long j, boolean z) throws zzha {
        this.zzk = false;
        this.zzj = j;
        zzu(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public final void zzA() {
        zzdd.zzf(this.zzf == 0);
        zzjg zzjgVar = this.zzb;
        zzjgVar.zzb = null;
        zzjgVar.zza = null;
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public final void zzB(long j) throws zzha {
        zzP(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public final void zzC() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public /* synthetic */ void zzD(float f, float f2) {
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public final void zzE() throws zzha {
        zzdd.zzf(this.zzf == 1);
        this.zzf = 2;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public final void zzF() {
        zzdd.zzf(this.zzf == 2);
        this.zzf = 1;
        zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public final boolean zzG() {
        return this.zzj == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public final boolean zzH() {
        return this.zzk;
    }

    protected final zzaf[] zzJ() {
        zzaf[] zzafVarArr = this.zzh;
        Objects.requireNonNull(zzafVarArr);
        return zzafVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzka, com.google.android.gms.internal.ads.zzkb
    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public final int zzbe() {
        return this.zzf;
    }

    protected final int zzbf(zzjg zzjgVar, zzgi zzgiVar, int i) {
        zztz zztzVar = this.zzg;
        Objects.requireNonNull(zztzVar);
        int zza = zztzVar.zza(zzjgVar, zzgiVar, i);
        if (zza == -4) {
            if (zzgiVar.zzg()) {
                this.zzj = Long.MIN_VALUE;
                return this.zzk ? -4 : -3;
            }
            long j = zzgiVar.zzd + this.zzi;
            zzgiVar.zzd = j;
            this.zzj = Math.max(this.zzj, j);
        } else if (zza == -5) {
            zzaf zzafVar = zzjgVar.zza;
            Objects.requireNonNull(zzafVar);
            long j2 = zzafVar.zzq;
            if (j2 != Long.MAX_VALUE) {
                zzad zzb = zzafVar.zzb();
                zzb.zzW(j2 + this.zzi);
                zzjgVar.zza = zzb.zzY();
                return -5;
            }
        }
        return zza;
    }

    protected final zzha zzbg(Throwable th, zzaf zzafVar, boolean z, int i) {
        int i2 = 4;
        if (zzafVar != null && !this.zzl) {
            this.zzl = true;
            try {
                i2 = zzO(zzafVar) & 7;
            } catch (zzha unused) {
            } finally {
                this.zzl = false;
            }
        }
        return zzha.zzb(th, zzK(), this.zzd, zzafVar, i2, z, i);
    }

    @Override // com.google.android.gms.internal.ads.zzkb
    public int zze() throws zzha {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public final long zzf() {
        return this.zzj;
    }

    protected final zzjg zzh() {
        zzjg zzjgVar = this.zzb;
        zzjgVar.zzb = null;
        zzjgVar.zza = null;
        return zzjgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public zzji zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public final zzkb zzj() {
        return this;
    }

    protected final zzkc zzk() {
        zzkc zzkcVar = this.zzc;
        Objects.requireNonNull(zzkcVar);
        return zzkcVar;
    }

    protected final zznb zzl() {
        zznb zznbVar = this.zze;
        Objects.requireNonNull(zznbVar);
        return zznbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public final zztz zzm() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public final void zzn() {
        zzdd.zzf(this.zzf == 1);
        zzjg zzjgVar = this.zzb;
        zzjgVar.zzb = null;
        zzjgVar.zza = null;
        this.zzf = 0;
        this.zzg = null;
        this.zzh = null;
        this.zzk = false;
        zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public final void zzo(zzkc zzkcVar, zzaf[] zzafVarArr, zztz zztzVar, long j, boolean z, boolean z2, long j2, long j3) throws zzha {
        zzdd.zzf(this.zzf == 0);
        this.zzc = zzkcVar;
        this.zzf = 1;
        zzt(z, z2);
        zzz(zzafVarArr, zztzVar, j2, j3);
        zzP(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzjw
    public void zzp(int i, Object obj) throws zzha {
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public final void zzq(int i, zznb zznbVar) {
        this.zzd = i;
        this.zze = zznbVar;
    }

    protected void zzs() {
        throw null;
    }

    protected void zzt(boolean z, boolean z2) throws zzha {
    }

    protected void zzu(long j, boolean z) throws zzha {
        throw null;
    }

    protected void zzv() {
    }

    protected void zzw() throws zzha {
    }

    protected void zzx() {
    }

    protected void zzy(zzaf[] zzafVarArr, long j, long j2) throws zzha {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public final void zzz(zzaf[] zzafVarArr, zztz zztzVar, long j, long j2) throws zzha {
        zzdd.zzf(!this.zzk);
        this.zzg = zztzVar;
        if (this.zzj == Long.MIN_VALUE) {
            this.zzj = j;
        }
        this.zzh = zzafVarArr;
        this.zzi = j2;
        zzy(zzafVarArr, j, j2);
    }

    protected final boolean zzI() {
        if (zzG()) {
            return this.zzk;
        }
        zztz zztzVar = this.zzg;
        Objects.requireNonNull(zztzVar);
        return zztzVar.zze();
    }

    protected final int zzd(long j) {
        zztz zztzVar = this.zzg;
        Objects.requireNonNull(zztzVar);
        return zztzVar.zzb(j - this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzka
    public final void zzr() throws IOException {
        zztz zztzVar = this.zzg;
        Objects.requireNonNull(zztzVar);
        zztzVar.zzd();
    }
}
