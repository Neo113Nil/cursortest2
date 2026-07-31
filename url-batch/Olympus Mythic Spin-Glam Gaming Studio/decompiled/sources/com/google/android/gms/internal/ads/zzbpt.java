package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzbpt implements zzbqh {
    zzbpt() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzclm zzclmVar = (zzclm) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzclmVar.zzdk();
        } else if ("resume".equals(str)) {
            zzclmVar.zzdl();
        }
    }
}
