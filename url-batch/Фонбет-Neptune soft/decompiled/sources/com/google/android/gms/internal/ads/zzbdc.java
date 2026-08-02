package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public class zzbdc {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    protected zzbdc(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static zzbdc zza(String str, double d) {
        return new zzbdc(str, Double.valueOf(d), 3);
    }

    public static zzbdc zzb(String str, long j) {
        return new zzbdc(str, Long.valueOf(j), 2);
    }

    public static zzbdc zzc(String str, String str2) {
        return new zzbdc(str, str2, 4);
    }

    public static zzbdc zzd(String str, boolean z) {
        return new zzbdc(str, Boolean.valueOf(z), 1);
    }

    public final Object zze() {
        zzbeh zza = zzbej.zza();
        if (zza != null) {
            int i = this.zzc - 1;
            return i != 0 ? i != 1 ? i != 2 ? zza.zzd(this.zza, (String) this.zzb) : zza.zzb(this.zza, ((Double) this.zzb).doubleValue()) : zza.zzc(this.zza, ((Long) this.zzb).longValue()) : zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (zzbej.zzb() != null) {
            zzbej.zzb().zza();
        }
        return this.zzb;
    }
}
