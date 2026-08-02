package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbqj implements zzbpu {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbpu
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
            zzbqi zzbqiVar = (zzbqi) this.zzb.remove(str);
            if (zzbqiVar == null) {
                com.google.android.gms.ads.internal.util.zze.zzj("Received result for unexpected method invocation: " + str);
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                zzbqiVar.zza(str3 + concat);
                return;
            }
            if (str5 == null) {
                zzbqiVar.zzb(null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str5);
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Result GMSG: " + jSONObject.toString(2));
                }
                zzbqiVar.zzb(jSONObject);
            } catch (JSONException e) {
                zzbqiVar.zza(e.getMessage());
            }
        }
    }

    public final zzfzp zzb(zzbta zzbtaVar, String str, JSONObject jSONObject) {
        zzchh zzchhVar = new zzchh();
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzc(uuid, new zzbqh(this, zzchhVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            zzbtaVar.zzl(str, jSONObject2);
        } catch (Exception e) {
            zzchhVar.zze(e);
        }
        return zzchhVar;
    }

    public final void zzc(String str, zzbqi zzbqiVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbqiVar);
        }
    }
}
