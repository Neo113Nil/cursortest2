package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.Base64;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfbr implements zzfdg {
    private final Map zza;

    public zzfbr(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        Map map = this.zza;
        if (map.isEmpty()) {
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziT)).booleanValue()) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : map.entrySet()) {
                ArrayDeque arrayDeque = (ArrayDeque) entry.getValue();
                if (!arrayDeque.isEmpty()) {
                    zzebp zzebpVar = (zzebp) entry.getKey();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", zzebpVar.zza());
                        jSONObject.put("event_type", zzebpVar.zzb());
                        JSONArray jSONArray2 = new JSONArray();
                        Iterator it = arrayDeque.iterator();
                        while (it.hasNext()) {
                            jSONArray2.put((Long) it.next());
                        }
                        jSONObject.put("timestamps", jSONArray2);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        com.google.android.gms.ads.internal.util.zze.zzb("Failed putting the on-device storage record.", e);
                    }
                }
            }
            if (jSONArray.length() > 0) {
                bundle.putString("on_device_storage_records", jSONArray.toString());
                return;
            }
            return;
        }
        Map map2 = this.zza;
        zzheg zzb = zzhej.zzb();
        for (Map.Entry entry2 : map2.entrySet()) {
            ArrayDeque arrayDeque2 = (ArrayDeque) entry2.getValue();
            if (!arrayDeque2.isEmpty()) {
                zzebp zzebpVar2 = (zzebp) entry2.getKey();
                int zza = zzhed.zza(zzebpVar2.zzb());
                if (zza != 0) {
                    zzhee zza2 = zzhef.zza();
                    zza2.zza(zzebpVar2.zza());
                    zza2.zzb(zza);
                    zzhef zzhefVar = (zzhef) zza2.zzbu();
                    zzheh zza3 = zzhei.zza();
                    zza3.zza(zzhefVar);
                    zza3.zzb(arrayDeque2);
                    zzb.zza(zza3);
                }
            }
        }
        zzhej zzhejVar = (zzhej) zzb.zzbu();
        if (zzhejVar.zza() > 0) {
            bundle.putString("ods", Base64.encodeToString(zzhejVar.zzaN(), 11));
        }
    }
}
