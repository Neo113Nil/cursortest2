package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbpq implements zzbpu {
    zzbpq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcmp zzcmpVar = (zzcmp) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcmpVar.zzbn();
        } else if ("resume".equals(str)) {
            zzcmpVar.zzbo();
        }
    }
}
