package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes2.dex */
public class zzbja {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    protected zzbja(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static zzbja zza(String str, double d) {
        return new zzbja(str, Double.valueOf(d), 3);
    }

    public static zzbja zzb(String str, long j) {
        return new zzbja(str, Long.valueOf(j), 2);
    }

    public static zzbja zzc(String str, String str2) {
        return new zzbja(str, str2, 4);
    }

    public static zzbja zzd(String str, boolean z) {
        return new zzbja(str, Boolean.valueOf(z), 1);
    }

    public final Object zze() {
        zzbkd zza = zzbkf.zza();
        if (zza != null) {
            int i = this.zzc - 1;
            return i != 0 ? i != 1 ? i != 2 ? zza.zzd(this.zza, (String) this.zzb) : zza.zzb(this.zza, ((Double) this.zzb).doubleValue()) : zza.zzc(this.zza, ((Long) this.zzb).longValue()) : zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (zzbkf.zzb() != null) {
            zzbkf.zzb().zza();
        }
        return this.zzb;
    }
}
