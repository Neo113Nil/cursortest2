package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzctu {
    private final Map zza;
    private final Map zzb;

    zzctu(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfdw zzfdwVar) throws Exception {
        for (zzfdu zzfduVar : zzfdwVar.zzb.zzc) {
            if (this.zza.containsKey(zzfduVar.zza)) {
                ((zzctx) this.zza.get(zzfduVar.zza)).zza(zzfduVar.zzb);
            } else if (this.zzb.containsKey(zzfduVar.zza)) {
                zzctw zzctwVar = (zzctw) this.zzb.get(zzfduVar.zza);
                JSONObject jSONObject = zzfduVar.zzb;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                zzctwVar.zza(hashMap);
            }
        }
    }
}
