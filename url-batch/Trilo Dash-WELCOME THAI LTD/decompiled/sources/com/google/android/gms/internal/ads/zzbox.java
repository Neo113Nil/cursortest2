package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzbox implements zzboy {
    final /* synthetic */ zzcga zza;

    zzbox(zzboz zzbozVar, zzcga zzcgaVar) {
        this.zza = zzcgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboy
    public final void zza(String str) {
        this.zza.zze(new zzbso(str));
    }

    @Override // com.google.android.gms.internal.ads.zzboy
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzd(jSONObject);
    }
}
