package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbuv implements zzbqi {
    final /* synthetic */ zzbuw zza;
    private final zzchh zzb;

    public zzbuv(zzbuw zzbuwVar, zzchh zzchhVar) {
        this.zza = zzbuwVar;
        this.zzb = zzchhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqi
    public final void zza(String str) {
        try {
            if (str == null) {
                this.zzb.zze(new zzbtz());
            } else {
                this.zzb.zze(new zzbtz(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqi
    public final void zzb(JSONObject jSONObject) {
        try {
            this.zzb.zzd(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zzb.zze(e);
        }
    }
}
