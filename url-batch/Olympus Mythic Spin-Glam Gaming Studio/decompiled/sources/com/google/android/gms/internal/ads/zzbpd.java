package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzbpd implements zzbqh {
    zzbpd() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzd;
        zzclm zzclmVar = (zzclm) obj;
        zzbmi zzar = zzclmVar.zzar();
        if (zzar == null || (zzd = zzar.zzd()) == null) {
            zzclmVar.zzd("nativeClickMetaReady", new JSONObject());
        } else {
            zzclmVar.zzd("nativeClickMetaReady", zzd);
        }
    }
}
