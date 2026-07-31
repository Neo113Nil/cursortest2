package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final /* synthetic */ class zzbqc implements zzbqh {
    static final /* synthetic */ zzbqc zza = new zzbqc();

    private /* synthetic */ zzbqc() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcmy zzcmyVar = (zzcmy) obj;
        zzbqh zzbqhVar = zzbqg.zza;
        String str = (String) map.get("u");
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from httpTrack GMSG.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzg)).booleanValue() && str.isEmpty()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URL is empty from httpTrack GMSG.");
        } else {
            zzcld zzcldVar = (zzcld) zzcmyVar;
            new com.google.android.gms.ads.internal.util.zzbt(zzcmyVar.getContext(), ((zzcng) zzcmyVar).zzs().afmaVersion, str, null, zzcldVar.zzC() != null ? zzcldVar.zzC().zzax : null).zzb();
        }
    }
}
