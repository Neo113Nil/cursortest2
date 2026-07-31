package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzbiz implements zzbjl {
    zzbiz() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcek zzcekVar = (zzcek) obj;
        if (map.containsKey("start")) {
            zzcekVar.zzas(true);
        }
        if (map.containsKey("stop")) {
            zzcekVar.zzas(false);
        }
    }
}
