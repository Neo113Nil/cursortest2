package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzele implements zzehe {
    private final Map zza = new HashMap();
    private final zzdvl zzb;

    public zzele(zzdvl zzdvlVar) {
        this.zzb = zzdvlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehe
    public final zzehf zza(String str, JSONObject jSONObject) throws zzfek {
        zzehf zzehfVar;
        synchronized (this) {
            zzehfVar = (zzehf) this.zza.get(str);
            if (zzehfVar == null) {
                zzehfVar = new zzehf(this.zzb.zzc(str, jSONObject), new zzeiy(), str);
                this.zza.put(str, zzehfVar);
            }
        }
        return zzehfVar;
    }
}
