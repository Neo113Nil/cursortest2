package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbpd implements zzbpu {
    zzbpd() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zza;
        zzcmp zzcmpVar = (zzcmp) obj;
        zzblr zzM = zzcmpVar.zzM();
        if (zzM == null || (zza = zzM.zza()) == null) {
            zzcmpVar.zze("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcmpVar.zze("nativeAdViewSignalsReady", zza);
        }
    }
}
