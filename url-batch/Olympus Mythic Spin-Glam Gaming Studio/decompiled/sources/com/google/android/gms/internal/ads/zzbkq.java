package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes14.dex */
public class zzbkq {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    protected zzbkq(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static zzbkq zza(String str, boolean z) {
        return new zzbkq(str, Boolean.valueOf(z), 1);
    }

    public static zzbkq zzb(String str, long j) {
        return new zzbkq(str, Long.valueOf(j), 2);
    }

    public static zzbkq zzc(String str, double d) {
        return new zzbkq(str, Double.valueOf(d), 3);
    }

    public static zzbkq zzd(String str, String str2) {
        return new zzbkq("gad:dynamite_module:experiment_id", "", 4);
    }

    public final Object zze() {
        zzblx zza = zzblz.zza();
        if (zza != null) {
            int i = this.zzc - 1;
            return i != 0 ? i != 1 ? i != 2 ? zza.zzd(this.zza, (String) this.zzb) : zza.zzc(this.zza, ((Double) this.zzb).doubleValue()) : zza.zzb(this.zza, ((Long) this.zzb).longValue()) : zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (zzblz.zzb() != null) {
            zzblz.zzb().zza();
        }
        return this.zzb;
    }
}
