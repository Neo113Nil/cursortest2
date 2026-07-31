package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzbpv implements zzbqh {
    zzbpv() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzclm zzclmVar = (zzclm) obj;
        if (map.containsKey("start")) {
            zzclmVar.zzas(true);
        }
        if (map.containsKey("stop")) {
            zzclmVar.zzas(false);
        }
    }
}
