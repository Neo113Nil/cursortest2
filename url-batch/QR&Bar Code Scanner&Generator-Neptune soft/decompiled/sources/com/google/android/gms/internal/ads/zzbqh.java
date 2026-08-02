package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbqh implements zzbqi {
    final /* synthetic */ zzchh zza;

    zzbqh(zzbqj zzbqjVar, zzchh zzchhVar) {
        this.zza = zzchhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqi
    public final void zza(String str) {
        this.zza.zze(new zzbtz(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbqi
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzd(jSONObject);
    }
}
