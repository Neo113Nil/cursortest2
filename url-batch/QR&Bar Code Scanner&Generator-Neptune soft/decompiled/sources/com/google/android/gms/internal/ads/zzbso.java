package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzbso {
    public static void zza(zzbsp zzbspVar, String str, Map map) {
        try {
            zzbspVar.zze(str, com.google.android.gms.ads.internal.client.zzaw.zzb().zzi(map));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbsp zzbspVar, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        com.google.android.gms.ads.internal.util.zze.zze("Dispatching AFMA event: ".concat(sb.toString()));
        zzbspVar.zza(sb.toString());
    }

    public static void zzc(zzbsp zzbspVar, String str, String str2) {
        zzbspVar.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbsp zzbspVar, String str, JSONObject jSONObject) {
        zzbspVar.zzb(str, jSONObject.toString());
    }
}
