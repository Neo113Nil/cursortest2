package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzdyt {
    private Long zza;
    private final String zzb;
    private String zzc;
    private Integer zzd;
    private String zze;
    private Integer zzf;

    /* synthetic */ zzdyt(String str, zzdys zzdysVar) {
        this.zzb = str;
    }

    static /* bridge */ /* synthetic */ String zza(zzdyt zzdytVar) {
        String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzii);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdytVar.zza);
            jSONObject.put("eventCategory", zzdytVar.zzb);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, zzdytVar.zzc);
            jSONObject.putOpt("errorCode", zzdytVar.zzd);
            jSONObject.putOpt("rewardType", zzdytVar.zze);
            jSONObject.putOpt("rewardAmount", zzdytVar.zzf);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zzj("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }
}
