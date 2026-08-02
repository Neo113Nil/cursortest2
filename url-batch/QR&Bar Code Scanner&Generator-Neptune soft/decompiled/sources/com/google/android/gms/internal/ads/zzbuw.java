package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbuw implements zzfyn {
    private final zzbuc zza;
    private final zzbud zzb;
    private final String zzc = "google.afma.activeView.handleUpdate";
    private final zzfzp zzd;

    zzbuw(zzfzp zzfzpVar, String str, zzbud zzbudVar, zzbuc zzbucVar) {
        this.zzd = zzfzpVar;
        this.zzb = zzbudVar;
        this.zza = zzbucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyn
    public final zzfzp zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final zzfzp zzb(final Object obj) {
        return zzfzg.zzn(this.zzd, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzbuu
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj2) {
                return zzbuw.this.zzc(obj, (zzbtx) obj2);
            }
        }, zzchc.zzf);
    }

    final /* synthetic */ zzfzp zzc(Object obj, zzbtx zzbtxVar) throws Exception {
        zzchh zzchhVar = new zzchh();
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzbpt.zzo.zzc(uuid, new zzbuv(this, zzchhVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbtxVar.zzl(this.zzc, jSONObject);
        return zzchhVar;
    }
}
