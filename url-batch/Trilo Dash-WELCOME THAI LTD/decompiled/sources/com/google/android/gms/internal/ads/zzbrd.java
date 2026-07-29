package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzbrd {
    public static void zza(zzbre zzbreVar, String str, Map map) {
        try {
            zzbreVar.zze(str, com.google.android.gms.ads.internal.client.zzaw.zzb().zzh(map));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbre zzbreVar, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        com.google.android.gms.ads.internal.util.zze.zze("Dispatching AFMA event: ".concat(sb.toString()));
        zzbreVar.zza(sb.toString());
    }

    public static void zzc(zzbre zzbreVar, String str, String str2) {
        zzbreVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbre zzbreVar, String str, JSONObject jSONObject) {
        zzbreVar.zzb(str, jSONObject.toString());
    }
}
