package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zzgl implements zzju, zzjv {
    private final int zza;
    private zzjw zzc;
    private int zzd;
    private zzmv zze;
    private int zzf;
    private zztr zzg;
    private zzad[] zzh;
    private long zzi;
    private boolean zzk;
    private boolean zzl;
    private final zzja zzb = new zzja();
    private long zzj = Long.MIN_VALUE;

    public zzgl(int i) {
        this.zza = i;
    }

    private final void zzP(long j, boolean z) throws zzgu {
        this.zzk = false;
        this.zzj = j;
        zzu(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final void zzA() {
        zzcw.zzf(this.zzf == 0);
        zzja zzjaVar = this.zzb;
        zzjaVar.zzb = null;
        zzjaVar.zza = null;
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final void zzB(long j) throws zzgu {
        zzP(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final void zzC() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public /* synthetic */ void zzD(float f, float f2) {
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final void zzE() throws zzgu {
        zzcw.zzf(this.zzf == 1);
        this.zzf = 2;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final void zzF() {
        zzcw.zzf(this.zzf == 2);
        this.zzf = 1;
        zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final boolean zzG() {
        return this.zzj == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final boolean zzH() {
        return this.zzk;
    }

    protected final zzad[] zzJ() {
        zzad[] zzadVarArr = this.zzh;
        Objects.requireNonNull(zzadVarArr);
        return zzadVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzju, com.google.android.gms.internal.ads.zzjv
    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final int zzbe() {
        return this.zzf;
    }

    protected final int zzbf(zzja zzjaVar, zzgc zzgcVar, int i) {
        zztr zztrVar = this.zzg;
        Objects.requireNonNull(zztrVar);
        int zza = zztrVar.zza(zzjaVar, zzgcVar, i);
        if (zza == -4) {
            if (zzgcVar.zzg()) {
                this.zzj = Long.MIN_VALUE;
                return this.zzk ? -4 : -3;
            }
            long j = zzgcVar.zzd + this.zzi;
            zzgcVar.zzd = j;
            this.zzj = Math.max(this.zzj, j);
        } else if (zza == -5) {
            zzad zzadVar = zzjaVar.zza;
            Objects.requireNonNull(zzadVar);
            long j2 = zzadVar.zzq;
            if (j2 != Long.MAX_VALUE) {
                zzab zzb = zzadVar.zzb();
                zzb.zzW(j2 + this.zzi);
                zzjaVar.zza = zzb.zzY();
                return -5;
            }
        }
        return zza;
    }

    protected final zzgu zzbg(Throwable th, zzad zzadVar, boolean z, int i) {
        int i2;
        if (zzadVar != null && !this.zzl) {
            this.zzl = true;
            try {
                int zzO = zzO(zzadVar) & 7;
                this.zzl = false;
                i2 = zzO;
            } catch (zzgu unused) {
                this.zzl = false;
            } catch (Throwable th2) {
                this.zzl = false;
                throw th2;
            }
            return zzgu.zzb(th, zzK(), this.zzd, zzadVar, i2, z, i);
        }
        i2 = 4;
        return zzgu.zzb(th, zzK(), this.zzd, zzadVar, i2, z, i);
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public int zze() throws zzgu {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final long zzf() {
        return this.zzj;
    }

    protected final zzja zzh() {
        zzja zzjaVar = this.zzb;
        zzjaVar.zzb = null;
        zzjaVar.zza = null;
        return zzjaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public zzjc zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final zzjv zzj() {
        return this;
    }

    protected final zzjw zzk() {
        zzjw zzjwVar = this.zzc;
        Objects.requireNonNull(zzjwVar);
        return zzjwVar;
    }

    protected final zzmv zzl() {
        zzmv zzmvVar = this.zze;
        Objects.requireNonNull(zzmvVar);
        return zzmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final zztr zzm() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final void zzn() {
        zzcw.zzf(this.zzf == 1);
        zzja zzjaVar = this.zzb;
        zzjaVar.zzb = null;
        zzjaVar.zza = null;
        this.zzf = 0;
        this.zzg = null;
        this.zzh = null;
        this.zzk = false;
        zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final void zzo(zzjw zzjwVar, zzad[] zzadVarArr, zztr zztrVar, long j, boolean z, boolean z2, long j2, long j3) throws zzgu {
        zzcw.zzf(this.zzf == 0);
        this.zzc = zzjwVar;
        this.zzf = 1;
        zzt(z, z2);
        zzz(zzadVarArr, zztrVar, j2, j3);
        zzP(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzjq
    public void zzp(int i, Object obj) throws zzgu {
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final void zzq(int i, zzmv zzmvVar) {
        this.zzd = i;
        this.zze = zzmvVar;
    }

    protected void zzs() {
        throw null;
    }

    protected void zzt(boolean z, boolean z2) throws zzgu {
    }

    protected void zzu(long j, boolean z) throws zzgu {
        throw null;
    }

    protected void zzv() {
    }

    protected void zzw() throws zzgu {
    }

    protected void zzx() {
    }

    protected void zzy(zzad[] zzadVarArr, long j, long j2) throws zzgu {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final void zzz(zzad[] zzadVarArr, zztr zztrVar, long j, long j2) throws zzgu {
        zzcw.zzf(!this.zzk);
        this.zzg = zztrVar;
        if (this.zzj == Long.MIN_VALUE) {
            this.zzj = j;
        }
        this.zzh = zzadVarArr;
        this.zzi = j2;
        zzy(zzadVarArr, j, j2);
    }

    protected final boolean zzI() {
        if (zzG()) {
            return this.zzk;
        }
        zztr zztrVar = this.zzg;
        Objects.requireNonNull(zztrVar);
        return zztrVar.zze();
    }

    protected final int zzd(long j) {
        zztr zztrVar = this.zzg;
        Objects.requireNonNull(zztrVar);
        return zztrVar.zzb(j - this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final void zzr() throws IOException {
        zztr zztrVar = this.zzg;
        Objects.requireNonNull(zztrVar);
        zztrVar.zzd();
    }
}
