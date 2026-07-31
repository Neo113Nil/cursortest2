package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzbig implements zzbjl {
    zzbig() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zzc;
        zzcek zzcekVar = (zzcek) obj;
        zzbfj zzar = zzcekVar.zzar();
        if (zzar == null || (zzc = zzar.zzc()) == null) {
            zzcekVar.zzd("nativeAdViewSignalsReady", new JSONObject());
        } else {
            zzcekVar.zzd("nativeAdViewSignalsReady", zzc);
        }
    }
}
