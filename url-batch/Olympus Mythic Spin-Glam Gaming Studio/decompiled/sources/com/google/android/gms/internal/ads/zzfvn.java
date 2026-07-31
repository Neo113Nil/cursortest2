package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzfvn {
    private final zzfvz zza;
    private final zzfvz zzb;
    private final boolean zzc;
    private final zzfvr zzd;
    private final zzfvu zze;

    private zzfvn(zzfvr zzfvrVar, zzfvu zzfvuVar, zzfvz zzfvzVar, zzfvz zzfvzVar2, boolean z) {
        this.zzd = zzfvrVar;
        this.zze = zzfvuVar;
        this.zza = zzfvzVar;
        if (zzfvzVar2 == null) {
            this.zzb = zzfvz.NONE;
        } else {
            this.zzb = zzfvzVar2;
        }
        this.zzc = z;
    }

    public static zzfvn zza(zzfvr zzfvrVar, zzfvu zzfvuVar, zzfvz zzfvzVar, zzfvz zzfvzVar2, boolean z) {
        zzfxk.zzb(zzfvrVar, "CreativeType is null");
        zzfxk.zzb(zzfvuVar, "ImpressionType is null");
        zzfxk.zzb(zzfvzVar, "Impression owner is null");
        if (zzfvzVar == zzfvz.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (zzfvrVar == zzfvr.DEFINED_BY_JAVASCRIPT && zzfvzVar == zzfvz.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (zzfvuVar == zzfvu.DEFINED_BY_JAVASCRIPT && zzfvzVar == zzfvz.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new zzfvn(zzfvrVar, zzfvuVar, zzfvzVar, zzfvzVar2, z);
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfxg.zzc(jSONObject, "impressionOwner", this.zza);
        zzfxg.zzc(jSONObject, "mediaEventsOwner", this.zzb);
        zzfxg.zzc(jSONObject, "creativeType", this.zzd);
        zzfxg.zzc(jSONObject, "impressionType", this.zze);
        zzfxg.zzc(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.zzc));
        return jSONObject;
    }
}
