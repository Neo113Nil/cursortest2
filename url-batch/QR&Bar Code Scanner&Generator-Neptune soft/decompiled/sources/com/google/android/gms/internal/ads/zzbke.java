package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public class zzbke {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    protected zzbke(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static zzbke zza(String str, double d) {
        return new zzbke(str, Double.valueOf(d), 3);
    }

    public static zzbke zzb(String str, long j) {
        return new zzbke(str, Long.valueOf(j), 2);
    }

    public static zzbke zzc(String str, String str2) {
        return new zzbke(str, str2, 4);
    }

    public static zzbke zzd(String str, boolean z) {
        return new zzbke(str, Boolean.valueOf(z), 1);
    }

    public final Object zze() {
        zzblh zza = zzblj.zza();
        if (zza != null) {
            int i = this.zzc - 1;
            return i != 0 ? i != 1 ? i != 2 ? zza.zzd(this.zza, (String) this.zzb) : zza.zzb(this.zza, ((Double) this.zzb).doubleValue()) : zza.zzc(this.zza, ((Long) this.zzb).longValue()) : zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (zzblj.zzb() != null) {
            zzblj.zzb().zza();
        }
        return this.zzb;
    }
}
