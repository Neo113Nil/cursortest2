package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzjx {
    public static final zzjx zza;
    public static final zzjx zzb;
    public static final zzjx zzc;
    public static final zzjx zzd;
    public static final zzjx zze;
    public final long zzf;
    public final long zzg;

    static {
        zzjx zzjxVar = new zzjx(0L, 0L);
        zza = zzjxVar;
        zzb = new zzjx(Long.MAX_VALUE, Long.MAX_VALUE);
        zzc = new zzjx(Long.MAX_VALUE, 0L);
        zzd = new zzjx(0L, Long.MAX_VALUE);
        zze = zzjxVar;
    }

    public zzjx(long j, long j2) {
        zzcw.zzd(j >= 0);
        zzcw.zzd(j2 >= 0);
        this.zzf = j;
        this.zzg = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzjx zzjxVar = (zzjx) obj;
            if (this.zzf == zzjxVar.zzf && this.zzg == zzjxVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzf) * 31) + ((int) this.zzg);
    }
}
