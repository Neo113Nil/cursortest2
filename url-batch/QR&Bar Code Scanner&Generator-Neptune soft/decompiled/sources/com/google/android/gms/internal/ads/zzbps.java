package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbps implements zzbpu {
    zzbps() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcmp zzcmpVar = (zzcmp) obj;
        if (map.keySet().contains("start")) {
            zzcmpVar.zzau(true);
        }
        if (map.keySet().contains("stop")) {
            zzcmpVar.zzau(false);
        }
    }
}
