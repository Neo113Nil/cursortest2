package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdrv {
    private final Executor zza;
    private final zzdrq zzb;

    public zzdrv(Executor executor, zzdrq zzdrqVar) {
        this.zza = executor;
        this.zzb = zzdrqVar;
    }

    public final zzfzp zza(JSONObject jSONObject, String str) {
        zzfzp zzi;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzfzg.zzi(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                zzi = zzfzg.zzi(null);
            } else {
                final String optString = optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                if (optString == null) {
                    zzi = zzfzg.zzi(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    zzi = TypedValues.Custom.S_STRING.equals(optString2) ? zzfzg.zzi(new zzdru(optString, optJSONObject.optString("string_value"))) : "image".equals(optString2) ? zzfzg.zzm(this.zzb.zze(optJSONObject, "image_value"), new zzfsm() { // from class: com.google.android.gms.internal.ads.zzdrs
                        @Override // com.google.android.gms.internal.ads.zzfsm
                        public final Object apply(Object obj) {
                            return new zzdru(optString, (zzblq) obj);
                        }
                    }, this.zza) : zzfzg.zzi(null);
                }
            }
            arrayList.add(zzi);
        }
        return zzfzg.zzm(zzfzg.zze(arrayList), new zzfsm() { // from class: com.google.android.gms.internal.ads.zzdrt
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdru zzdruVar : (List) obj) {
                    if (zzdruVar != null) {
                        arrayList2.add(zzdruVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
