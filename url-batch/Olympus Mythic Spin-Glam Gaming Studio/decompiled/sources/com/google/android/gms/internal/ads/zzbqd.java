package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final /* synthetic */ class zzbqd implements zzbqh {
    static final /* synthetic */ zzbqd zza = new zzbqd();

    private /* synthetic */ zzbqd() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcnf zzcnfVar = (zzcnf) obj;
        zzbqh zzbqhVar = zzbqg.zza;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            zzbbd zzS = zzcnfVar.zzS();
            if (zzS != null) {
                zzS.zzb().zze(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse touch parameters from gmsg.");
        }
    }
}
