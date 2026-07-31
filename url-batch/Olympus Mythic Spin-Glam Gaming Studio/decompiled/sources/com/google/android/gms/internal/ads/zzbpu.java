package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzbpu implements zzbqh {
    zzbpu() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzclm zzclmVar = (zzclm) obj;
        if (map.containsKey("start")) {
            zzclmVar.zzP().zzr();
        } else if (map.containsKey("stop")) {
            zzclmVar.zzP().zzs();
        } else if (map.containsKey("cancel")) {
            zzclmVar.zzP().zzt();
        }
    }
}
