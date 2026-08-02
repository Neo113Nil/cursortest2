package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcwd {
    private final zzfir zza;
    private final zzdxq zzb;
    private final zzfdw zzc;

    public zzcwd(zzdxq zzdxqVar, zzfdw zzfdwVar, zzfir zzfirVar) {
        this.zza = zzfirVar;
        this.zzb = zzdxqVar;
        this.zzc = zzfdwVar;
    }

    private static String zzb(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    public final void zza(long j, int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhs)).booleanValue()) {
            zzfir zzfirVar = this.zza;
            zzfiq zzb = zzfiq.zzb("ad_closed");
            zzb.zzg(this.zzc.zzb.zzb);
            zzb.zza("show_time", String.valueOf(j));
            zzb.zza("ad_format", "app_open_ad");
            zzb.zza("acr", zzb(i));
            zzfirVar.zzb(zzb);
            return;
        }
        zzdxp zza = this.zzb.zza();
        zza.zze(this.zzc.zzb.zzb);
        zza.zzb("action", "ad_closed");
        zza.zzb("show_time", String.valueOf(j));
        zza.zzb("ad_format", "app_open_ad");
        zza.zzb("acr", zzb(i));
        zza.zzg();
    }
}
