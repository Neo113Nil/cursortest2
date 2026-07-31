package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzfxo {
    private JSONObject zza;
    private final zzfxx zzb;

    public zzfxo(zzfxx zzfxxVar) {
        this.zzb = zzfxxVar;
    }

    public final void zza(JSONObject jSONObject, HashSet hashSet, long j) {
        this.zzb.zza(new zzfya(this, hashSet, jSONObject, j));
    }

    public final void zzb(JSONObject jSONObject, HashSet hashSet, long j) {
        this.zzb.zza(new zzfxz(this, hashSet, jSONObject, j));
    }

    public final void zzc() {
        this.zzb.zza(new zzfxy(this));
    }

    @VisibleForTesting
    public final JSONObject zzd() {
        return this.zza;
    }

    @VisibleForTesting
    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
