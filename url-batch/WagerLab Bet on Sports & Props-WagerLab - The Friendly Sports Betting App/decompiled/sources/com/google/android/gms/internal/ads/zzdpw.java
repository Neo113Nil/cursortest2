package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdpw {
    private final zzdsm zza;

    zzdpw(zzdsm zzdsmVar) {
        this.zza = zzdsmVar;
    }

    public final boolean zza(zzfrv zzfrvVar) {
        if (zzfrvVar.zzj()) {
            zzdsl zza = this.zza.zza();
            zza.zzc("action", "aq_ad_closed");
            zza.zzc("gqi", zzfrvVar.zza());
            zza.zzc("aq_ad_duration", String.valueOf(zzfrvVar.zzb()));
            zza.zzc("aq_ad_bounce_cnt", String.valueOf(zzfrvVar.zzc()));
            zza.zzc("aq_time_away", String.valueOf(zzfrvVar.zzg()));
            return Boolean.valueOf(zza.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS)).booleanValue();
        }
        zzdsl zza2 = this.zza.zza();
        zza2.zzc("action", "aq_ad_kill");
        zza2.zzc("gqi", zzfrvVar.zza());
        zza2.zzc("aq_ad_duration", String.valueOf(zzfrvVar.zzb()));
        zza2.zzc("aq_ad_bounce_cnt", String.valueOf(zzfrvVar.zzc()));
        zza2.zzc("aq_time_away", String.valueOf(zzfrvVar.zzg()));
        zza2.zzc("aq_is_os_kill", String.valueOf(zzfrvVar.zze()));
        return Boolean.valueOf(zza2.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS)).booleanValue();
    }
}
