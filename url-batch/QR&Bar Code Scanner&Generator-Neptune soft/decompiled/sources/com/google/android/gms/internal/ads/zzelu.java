package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzelu implements zzehe {
    private final zzemy zza;

    public zzelu(zzemy zzemyVar) {
        this.zza = zzemyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehe
    public final zzehf zza(String str, JSONObject jSONObject) throws zzfek {
        zzbxd zza = this.zza.zza(str);
        if (zza == null) {
            return null;
        }
        return new zzehf(zza, new zzeix(), str);
    }
}
