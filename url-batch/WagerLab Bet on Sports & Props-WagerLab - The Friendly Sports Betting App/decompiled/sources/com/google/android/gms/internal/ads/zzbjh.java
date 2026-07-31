package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final /* synthetic */ class zzbjh implements zzbjl {
    static final /* synthetic */ zzbjh zza = new zzbjh();

    private /* synthetic */ zzbjh() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcgd zzcgdVar = (zzcgd) obj;
        zzbjl zzbjlVar = zzbjk.zza;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            zzauu zzS = zzcgdVar.zzS();
            if (zzS != null) {
                zzS.zzb().zze(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse touch parameters from gmsg.");
        }
    }
}
