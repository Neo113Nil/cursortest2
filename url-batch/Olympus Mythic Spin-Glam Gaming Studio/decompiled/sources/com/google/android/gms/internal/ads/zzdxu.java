package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzdxu {
    private final zzeaj zza;

    zzdxu(zzeaj zzeajVar) {
        this.zza = zzeajVar;
    }

    public final boolean zza(zzgbw zzgbwVar) {
        if (zzgbwVar.zzj()) {
            zzeai zza = this.zza.zza();
            zza.zzc("action", "aq_ad_closed");
            zza.zzc("gqi", zzgbwVar.zza());
            zza.zzc("aq_ad_duration", String.valueOf(zzgbwVar.zzb()));
            zza.zzc("aq_ad_bounce_cnt", String.valueOf(zzgbwVar.zzc()));
            zza.zzc("aq_time_away", String.valueOf(zzgbwVar.zzg()));
            return zza.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
        }
        zzeai zza2 = this.zza.zza();
        zza2.zzc("action", "aq_ad_kill");
        zza2.zzc("gqi", zzgbwVar.zza());
        zza2.zzc("aq_ad_duration", String.valueOf(zzgbwVar.zzb()));
        zza2.zzc("aq_ad_bounce_cnt", String.valueOf(zzgbwVar.zzc()));
        zza2.zzc("aq_time_away", String.valueOf(zzgbwVar.zzg()));
        zza2.zzc("aq_is_os_kill", String.valueOf(zzgbwVar.zze()));
        return zza2.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
    }
}
