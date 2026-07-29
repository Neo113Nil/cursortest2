package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzboa implements zzbol {
    zzboa() {
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzb;
        zzcli zzcliVar = (zzcli) obj;
        zzbkn zzM = zzcliVar.zzM();
        if (zzM == null || (zzb = zzM.zzb()) == null) {
            zzcliVar.zze("nativeClickMetaReady", new JSONObject());
        } else {
            zzcliVar.zze("nativeClickMetaReady", zzb);
        }
    }
}
