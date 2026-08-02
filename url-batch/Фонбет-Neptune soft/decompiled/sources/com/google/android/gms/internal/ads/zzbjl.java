package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbjl implements zzbjm {
    final /* synthetic */ zzbzt zza;

    zzbjl(zzbjn zzbjnVar, zzbzt zzbztVar) {
        this.zza = zzbztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjm
    public final void zza(String str) {
        this.zza.zzd(new zzbnd(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbjm
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }
}
