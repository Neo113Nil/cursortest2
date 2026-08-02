package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzkd {
    public static final zzkd zza;
    public static final zzkd zzb;
    public static final zzkd zzc;
    public static final zzkd zzd;
    public static final zzkd zze;
    public final long zzf;
    public final long zzg;

    static {
        zzkd zzkdVar = new zzkd(0L, 0L);
        zza = zzkdVar;
        zzb = new zzkd(Long.MAX_VALUE, Long.MAX_VALUE);
        zzc = new zzkd(Long.MAX_VALUE, 0L);
        zzd = new zzkd(0L, Long.MAX_VALUE);
        zze = zzkdVar;
    }

    public zzkd(long j, long j2) {
        zzdd.zzd(j >= 0);
        zzdd.zzd(j2 >= 0);
        this.zzf = j;
        this.zzg = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzkd zzkdVar = (zzkd) obj;
            if (this.zzf == zzkdVar.zzf && this.zzg == zzkdVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzf) * 31) + ((int) this.zzg);
    }
}
