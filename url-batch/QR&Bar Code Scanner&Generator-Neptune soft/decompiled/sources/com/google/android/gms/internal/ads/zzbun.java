package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbun implements zzbqi {
    final /* synthetic */ zzbuo zza;
    private final zzbtq zzb;
    private final zzchh zzc;

    public zzbun(zzbuo zzbuoVar, zzbtq zzbtqVar, zzchh zzchhVar) {
        this.zza = zzbuoVar;
        this.zzb = zzbtqVar;
        this.zzc = zzchhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqi
    public final void zza(String str) {
        zzbtq zzbtqVar;
        try {
            if (str == null) {
                this.zzc.zze(new zzbtz());
            } else {
                this.zzc.zze(new zzbtz(str));
            }
            zzbtqVar = this.zzb;
        } catch (IllegalStateException unused) {
            zzbtqVar = this.zzb;
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
        zzbtqVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbqi
    public final void zzb(JSONObject jSONObject) {
        zzbtq zzbtqVar;
        zzbuc zzbucVar;
        try {
            try {
                zzchh zzchhVar = this.zzc;
                zzbucVar = this.zza.zza;
                zzchhVar.zzd(zzbucVar.zza(jSONObject));
                zzbtqVar = this.zzb;
            } catch (IllegalStateException unused) {
                zzbtqVar = this.zzb;
            } catch (JSONException e) {
                this.zzc.zze(e);
                zzbtqVar = this.zzb;
            }
            zzbtqVar.zzb();
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
    }
}
