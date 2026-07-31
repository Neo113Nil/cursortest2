package com.google.android.gms.internal.ads;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzeal implements zzbnw {
    zzeal() {
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzeam zzeamVar = (zzeam) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkb)).booleanValue()) {
            zzbux zzbuxVar = zzeamVar.zzc;
            jSONObject2.put("ad_request_url", zzbuxVar.zze());
            jSONObject2.put("ad_request_post_body", zzbuxVar.zzd());
        }
        zzbux zzbuxVar2 = zzeamVar.zzc;
        jSONObject2.put("base_url", zzbuxVar2.zzc());
        jSONObject2.put("signals", zzeamVar.zzb);
        zzeas zzeasVar = zzeamVar.zza;
        jSONObject3.put("body", zzeasVar.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzbb.zza().zzk(zzeasVar.zzb));
        jSONObject3.put(DiagnosticsTracker.RESPONSE_CODE_KEY, zzeasVar.zza);
        jSONObject3.put("latency", zzeasVar.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put(NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, zzbuxVar2.zzh());
        return jSONObject;
    }
}
