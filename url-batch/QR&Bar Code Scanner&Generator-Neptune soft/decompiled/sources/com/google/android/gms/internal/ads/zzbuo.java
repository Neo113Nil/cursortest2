package com.google.android.gms.internal.ads;

import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbuo implements zzbua {
    private final zzbuc zza;
    private final zzbud zzb;
    private final zzbtw zzc;
    private final String zzd;

    zzbuo(zzbtw zzbtwVar, String str, zzbud zzbudVar, zzbuc zzbucVar) {
        this.zzc = zzbtwVar;
        this.zzd = str;
        this.zzb = zzbudVar;
        this.zza = zzbucVar;
    }

    static /* bridge */ /* synthetic */ void zzd(zzbuo zzbuoVar, zzbtq zzbtqVar, zzbtx zzbtxVar, Object obj, zzchh zzchhVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzp();
            String uuid = UUID.randomUUID().toString();
            zzbpt.zzo.zzc(uuid, new zzbun(zzbuoVar, zzbtqVar, zzchhVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", zzbuoVar.zzb.zzb(obj));
            zzbtxVar.zzl(zzbuoVar.zzd, jSONObject);
        } catch (Exception e) {
            try {
                zzchhVar.zze(e);
                com.google.android.gms.ads.internal.util.zze.zzh("Unable to invokeJavascript", e);
            } finally {
                zzbtqVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyn
    public final zzfzp zza(Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbua
    public final zzfzp zzb(Object obj) {
        zzchh zzchhVar = new zzchh();
        zzbtq zzb = this.zzc.zzb(null);
        zzb.zzi(new zzbul(this, zzb, obj, zzchhVar), new zzbum(this, zzchhVar, zzb));
        return zzchhVar;
    }
}
