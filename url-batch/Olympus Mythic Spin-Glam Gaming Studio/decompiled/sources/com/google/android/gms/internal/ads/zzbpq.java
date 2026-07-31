package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzbpq implements zzbqh {
    zzbpq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zza(Object obj, Map map) {
        String valueOf = String.valueOf((String) map.get("string"));
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Received log message: ".concat(valueOf));
    }
}
