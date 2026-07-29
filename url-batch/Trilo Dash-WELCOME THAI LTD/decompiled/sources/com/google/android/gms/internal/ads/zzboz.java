package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzboz implements zzbol {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbol
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String concat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.zza) {
            zzboy zzboyVar = (zzboy) this.zzb.remove(str);
            if (zzboyVar == null) {
                com.google.android.gms.ads.internal.util.zze.zzj("Received result for unexpected method invocation: " + str);
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                zzboyVar.zza(str3 + concat);
                return;
            }
            if (str5 == null) {
                zzboyVar.zzb(null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str5);
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Result GMSG: " + jSONObject.toString(2));
                }
                zzboyVar.zzb(jSONObject);
            } catch (JSONException e) {
                zzboyVar.zza(e.getMessage());
            }
        }
    }

    public final zzfvj zzb(zzbrp zzbrpVar, String str, JSONObject jSONObject) {
        zzcga zzcgaVar = new zzcga();
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzc(uuid, new zzbox(this, zzcgaVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            zzbrpVar.zzl(str, jSONObject2);
        } catch (Exception e) {
            zzcgaVar.zze(e);
        }
        return zzcgaVar;
    }

    public final void zzc(String str, zzboy zzboyVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzboyVar);
        }
    }
}
