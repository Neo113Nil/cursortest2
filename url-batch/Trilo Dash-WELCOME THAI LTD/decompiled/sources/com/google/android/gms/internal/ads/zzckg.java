package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzckg implements zzjb {
    private final zzvw zza = new zzvw(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    zzckg() {
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final long zza() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final void zzb() {
        zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final void zzc() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final void zzd() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final void zze(zzju[] zzjuVarArr, zztz zztzVar, zzvh[] zzvhVarArr) {
        int i = 0;
        this.zzf = 0;
        while (true) {
            int length = zzjuVarArr.length;
            if (i >= 2) {
                this.zza.zzf(this.zzf);
                return;
            } else {
                if (zzvhVarArr[i] != null) {
                    this.zzf += zzjuVarArr[i].zzb() != 1 ? 131072000 : 13107200;
                }
                i++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final boolean zzg(long j, long j2, float f) {
        boolean z = true;
        char c = j2 > this.zzc ? (char) 0 : j2 < this.zzb ? (char) 2 : (char) 1;
        int zza = this.zza.zza();
        int i = this.zzf;
        if (c != 2 && (c != 1 || !this.zzg || zza >= i)) {
            z = false;
        }
        this.zzg = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final boolean zzh(long j, float f, boolean z, long j2) {
        long j3 = z ? this.zze : this.zzd;
        return j3 <= 0 || j >= j3;
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final zzvw zzi() {
        return this.zza;
    }

    final void zzj(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zze();
        }
    }

    public final synchronized void zzk(int i) {
        this.zzd = i * 1000;
    }

    public final synchronized void zzl(int i) {
        this.zze = i * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zzc = i * 1000;
    }

    public final synchronized void zzn(int i) {
        this.zzb = i * 1000;
    }
}
