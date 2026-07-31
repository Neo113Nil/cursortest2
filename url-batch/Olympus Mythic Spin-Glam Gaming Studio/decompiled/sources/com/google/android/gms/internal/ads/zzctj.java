package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzctj implements zzcsm {
    private final zzcek zza;

    zzctj(zzcek zzcekVar) {
        this.zza = zzcekVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.zzcek] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // com.google.android.gms.internal.ads.zzcsm
    public final void zza(JSONObject jSONObject) {
        this.zza.zzd(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong("timestamp"));
    }
}
