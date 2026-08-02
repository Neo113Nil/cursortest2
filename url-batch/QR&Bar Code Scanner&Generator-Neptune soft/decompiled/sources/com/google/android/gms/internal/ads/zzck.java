package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzck {
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzcj
    };
    public Object zzb;
    public Object zzc;
    public int zzd;
    public long zze;
    public long zzf;
    public boolean zzg;
    private zzd zzh = zzd.zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            zzck zzckVar = (zzck) obj;
            if (zzen.zzT(this.zzb, zzckVar.zzb) && zzen.zzT(this.zzc, zzckVar.zzc) && this.zzd == zzckVar.zzd && this.zze == zzckVar.zze && this.zzg == zzckVar.zzg && zzen.zzT(this.zzh, zzckVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int zza(int i) {
        return this.zzh.zza(i).zzc;
    }

    public final int zzb() {
        int i = this.zzh.zzc;
        return 0;
    }

    public final int zzc(long j) {
        return -1;
    }

    public final int zzd(long j) {
        return -1;
    }

    public final int zze(int i) {
        return this.zzh.zza(i).zza(-1);
    }

    public final int zzf(int i, int i2) {
        return this.zzh.zza(i).zza(i2);
    }

    public final long zzg(int i, int i2) {
        zzc zza2 = this.zzh.zza(i);
        if (zza2.zzc != -1) {
            return zza2.zzf[i2];
        }
        return -9223372036854775807L;
    }

    public final long zzh(int i) {
        long j = this.zzh.zza(i).zzb;
        return 0L;
    }

    public final long zzi() {
        long j = this.zzh.zzd;
        return 0L;
    }

    public final long zzj(int i) {
        long j = this.zzh.zza(i).zzg;
        return 0L;
    }

    public final zzck zzk(Object obj, Object obj2, int i, long j, long j2, zzd zzdVar, boolean z) {
        this.zzb = obj;
        this.zzc = obj2;
        this.zzd = 0;
        this.zze = j;
        this.zzf = 0L;
        this.zzh = zzdVar;
        this.zzg = z;
        return this;
    }

    public final boolean zzl(int i) {
        boolean z = this.zzh.zza(i).zzh;
        return false;
    }

    public final int hashCode() {
        Object obj = this.zzb;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
        Object obj2 = this.zzc;
        int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
        int i = this.zzd;
        long j = this.zze;
        return ((((((((hashCode + hashCode2) * 31) + i) * 31) + ((int) ((j >>> 32) ^ j))) * 961) + (this.zzg ? 1 : 0)) * 31) + this.zzh.hashCode();
    }
}
