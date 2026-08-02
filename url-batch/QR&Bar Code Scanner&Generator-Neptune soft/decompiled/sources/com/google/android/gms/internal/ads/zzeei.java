package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzeei implements zzbud {
    zzeei() {
    }

    @Override // com.google.android.gms.internal.ads.zzbud
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzeej zzeejVar = (zzeej) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhX)).booleanValue()) {
            jSONObject2.put("ad_request_url", zzeejVar.zzd.zze());
            jSONObject2.put("ad_request_post_body", zzeejVar.zzd.zzd());
        }
        jSONObject2.put("base_url", zzeejVar.zzd.zzb());
        jSONObject2.put("signals", zzeejVar.zzc);
        jSONObject3.put("body", zzeejVar.zzb.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzaw.zzb().zzi(zzeejVar.zzb.zzb));
        jSONObject3.put("response_code", zzeejVar.zzb.zza);
        jSONObject3.put("latency", zzeejVar.zzb.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzeejVar.zzd.zzg());
        return jSONObject;
    }
}
