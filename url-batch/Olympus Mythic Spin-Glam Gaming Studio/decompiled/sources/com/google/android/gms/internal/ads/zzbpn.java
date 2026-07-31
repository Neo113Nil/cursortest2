package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzbpn implements zzbqh {
    zzbpn() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzclm zzclmVar = (zzclm) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(zzclmVar.getContext()).edit();
            for (int i = 0; i < jSONArray.length(); i++) {
                edit.remove(jSONArray.getString(i));
            }
            edit.apply();
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "GMSG clear local storage keys handler");
        }
    }
}
