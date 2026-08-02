package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfks {
    private final zzfkz zza;
    private final zzfkz zzb;
    private final zzfkw zzc;
    private final zzfky zzd;

    private zzfks(zzfkw zzfkwVar, zzfky zzfkyVar, zzfkz zzfkzVar, zzfkz zzfkzVar2, boolean z) {
        this.zzc = zzfkwVar;
        this.zzd = zzfkyVar;
        this.zza = zzfkzVar;
        if (zzfkzVar2 == null) {
            this.zzb = zzfkz.NONE;
        } else {
            this.zzb = zzfkzVar2;
        }
    }

    public static zzfks zza(zzfkw zzfkwVar, zzfky zzfkyVar, zzfkz zzfkzVar, zzfkz zzfkzVar2, boolean z) {
        zzfly.zzb(zzfkyVar, "ImpressionType is null");
        zzfly.zzb(zzfkzVar, "Impression owner is null");
        if (zzfkzVar == zzfkz.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (zzfkwVar == zzfkw.DEFINED_BY_JAVASCRIPT && zzfkzVar == zzfkz.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (zzfkyVar == zzfky.DEFINED_BY_JAVASCRIPT && zzfkzVar == zzfkz.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new zzfks(zzfkwVar, zzfkyVar, zzfkzVar, zzfkzVar2, true);
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzflw.zzh(jSONObject, "impressionOwner", this.zza);
        zzflw.zzh(jSONObject, "mediaEventsOwner", this.zzb);
        zzflw.zzh(jSONObject, "creativeType", this.zzc);
        zzflw.zzh(jSONObject, "impressionType", this.zzd);
        zzflw.zzh(jSONObject, "isolateVerificationScripts", true);
        return jSONObject;
    }
}
