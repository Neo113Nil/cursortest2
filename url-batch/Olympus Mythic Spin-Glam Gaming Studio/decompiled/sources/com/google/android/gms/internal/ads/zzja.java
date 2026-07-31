package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public abstract class zzja implements zzne, zzng {
    private final int zzb;

    @Nullable
    private zznh zzd;
    private int zze;
    private zzqj zzf;
    private zzdp zzg;
    private int zzh;

    @Nullable
    private zzzg zzi;

    @Nullable
    private zzv[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;

    @Nullable
    private zzxo zzq;

    @Nullable
    @GuardedBy
    private zznf zzs;
    private final Object zza = new Object();
    private final zzma zzc = new zzma();
    private long zzm = Long.MIN_VALUE;
    private zzbf zzp = zzbf.zza;
    private long zzr = -9223372036854775807L;

    public zzja(int i) {
        this.zzb = i;
    }

    private final void zzaf(long j, boolean z, boolean z2) throws zzjn {
        this.zzn = false;
        this.zzl = j;
        this.zzm = j;
        if (!z2) {
            z2 = zzS(j) != 0;
        }
        zzA(j, z, z2);
    }

    private final void zzag() {
        zzxo zzxoVar;
        int zze;
        if (this.zzp.zzg() || (zzxoVar = this.zzq) == null || (zze = this.zzp.zze(zzxoVar.zza)) == -1) {
            this.zzr = -9223372036854775807L;
            return;
        }
        zzbd zzd = this.zzp.zzd(zze, new zzbd(), false);
        this.zzr = zzd.zzd;
        int i = zzxoVar.zzb;
        if (i != -1) {
            this.zzr = zzd.zzg.zza(i).zzf[zzxoVar.zzc];
            return;
        }
        int i2 = zzxoVar.zze;
        if (i2 != -1) {
            long j = zzd.zzg.zza(i2).zza;
            this.zzr = 0L;
        }
    }

    protected void zzA(long j, boolean z, boolean z2) throws zzjn {
        throw null;
    }

    protected void zzB() throws zzjn {
    }

    protected void zzC() {
    }

    protected void zzD() {
        throw null;
    }

    protected void zzE() {
    }

    protected void zzF() {
    }

    protected void zzG(zzbf zzbfVar) {
    }

    protected final long zzH() {
        return this.zzl;
    }

    protected final zzma zzI() {
        zzma zzmaVar = this.zzc;
        zzmaVar.zza = null;
        zzmaVar.zzb = null;
        return zzmaVar;
    }

    protected final zzbf zzN() {
        return this.zzp;
    }

    @Nullable
    protected final zzxo zzO() {
        return this.zzq;
    }

    protected final long zzP() {
        return this.zzr;
    }

    protected final zzjn zzQ(Throwable th, @Nullable zzv zzvVar, boolean z, int i) {
        int i2 = 4;
        if (zzvVar != null && !this.zzo) {
            this.zzo = true;
            try {
                i2 = zzae(zzvVar) & 7;
            } catch (zzjn unused) {
            } finally {
                this.zzo = false;
            }
        }
        return zzjn.zzb(th, zzV(), this.zze, zzvVar, i2, this.zzq, z, i);
    }

    protected final int zzR(zzma zzmaVar, zziy zziyVar, int i) {
        zzzg zzzgVar = this.zzi;
        zzzgVar.getClass();
        int zzc = zzzgVar.zzc(zzmaVar, zziyVar, i);
        if (zzc == -4) {
            int i2 = i & 1;
            if (zziyVar.zzb()) {
                if (i2 == 0) {
                    this.zzm = Long.MIN_VALUE;
                }
                return this.zzn ? -4 : -3;
            }
            long j = zziyVar.zzd + this.zzk;
            zziyVar.zzd = j;
            if (i2 == 0) {
                this.zzm = Math.max(this.zzm, j);
                return -4;
            }
        } else if (zzc == -5) {
            zzv zzvVar = zzmaVar.zzb;
            zzvVar.getClass();
            long j2 = zzvVar.zzu;
            if (j2 != Long.MAX_VALUE) {
                zzt zza = zzvVar.zza();
                zza.zzt(j2 + this.zzk);
                zzmaVar.zzb = zza.zzQ();
                return -5;
            }
        }
        return zzc;
    }

    protected final void zzU() {
        zznf zznfVar;
        synchronized (this.zza) {
            zznfVar = this.zzs;
        }
        if (zznfVar != null) {
            zznfVar.zza(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzne, com.google.android.gms.internal.ads.zzng
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final zzng zzb() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzc(int i, zzqj zzqjVar, zzdp zzdpVar) {
        this.zze = i;
        this.zzf = zzqjVar;
        this.zzg = zzdpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzcT() throws zzjn {
        zzguk.zzi(this.zzh == 1);
        this.zzh = 2;
        zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzcU(zzv[] zzvVarArr, zzzg zzzgVar, long j, long j2, zzxo zzxoVar) throws zzjn {
        zzguk.zzi(!this.zzn);
        this.zzi = zzzgVar;
        this.zzq = zzxoVar;
        zzag();
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j;
        }
        this.zzj = zzvVarArr;
        this.zzk = j2;
        zzz(zzvVarArr, j, j2, zzxoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzne
    @Nullable
    public final zzzg zzcV() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final boolean zzcW() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    @Nullable
    public zzmf zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final int zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzf(zznh zznhVar, zzv[] zzvVarArr, zzzg zzzgVar, long j, boolean z, boolean z2, long j2, long j3, zzxo zzxoVar) throws zzjn {
        zzguk.zzi(this.zzh == 0);
        this.zzd = zznhVar;
        this.zzq = zzxoVar;
        this.zzh = 1;
        zzy(z, z2);
        zzcU(zzvVarArr, zzzgVar, j2, j3, zzxoVar);
        zzaf(j2, z, true);
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final long zzk() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzl() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final boolean zzm() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzo(zzbf zzbfVar) {
        if (Objects.equals(this.zzp, zzbfVar)) {
            return;
        }
        this.zzp = zzbfVar;
        zzag();
        zzG(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzp(long j, boolean z) throws zzjn {
        zzaf(j, false, z);
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzq() {
        zzguk.zzi(this.zzh == 2);
        this.zzh = 1;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzr() {
        zzguk.zzi(this.zzh == 1);
        zzma zzmaVar = this.zzc;
        zzmaVar.zza = null;
        zzmaVar.zzb = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzD();
        this.zzq = null;
        this.zzr = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzs() {
        zzguk.zzi(this.zzh == 0);
        zzma zzmaVar = this.zzc;
        zzmaVar.zza = null;
        zzmaVar.zzb = null;
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzt() {
        zzguk.zzi(this.zzh == 0);
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public int zzu() throws zzjn {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzv(zznf zznfVar) {
        synchronized (this.zza) {
            this.zzs = zznfVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzng
    public final void zzw() {
        synchronized (this.zza) {
            this.zzs = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public void zzx(int i, @Nullable Object obj) throws zzjn {
    }

    protected void zzy(boolean z, boolean z2) throws zzjn {
    }

    protected void zzz(zzv[] zzvVarArr, long j, long j2, zzxo zzxoVar) throws zzjn {
    }

    protected final zzv[] zzJ() {
        zzv[] zzvVarArr = this.zzj;
        zzvVarArr.getClass();
        return zzvVarArr;
    }

    protected final zznh zzK() {
        zznh zznhVar = this.zzd;
        zznhVar.getClass();
        return zznhVar;
    }

    protected final zzqj zzL() {
        zzqj zzqjVar = this.zzf;
        zzqjVar.getClass();
        return zzqjVar;
    }

    protected final zzdp zzM() {
        zzdp zzdpVar = this.zzg;
        zzdpVar.getClass();
        return zzdpVar;
    }

    protected final int zzS(long j) {
        zzzg zzzgVar = this.zzi;
        zzzgVar.getClass();
        return zzzgVar.zzd(j - this.zzk);
    }

    protected final boolean zzT() {
        if (zzcW()) {
            return this.zzn;
        }
        zzzg zzzgVar = this.zzi;
        zzzgVar.getClass();
        return zzzgVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzn() throws IOException {
        zzzg zzzgVar = this.zzi;
        zzzgVar.getClass();
        zzzgVar.zzb();
    }
}
