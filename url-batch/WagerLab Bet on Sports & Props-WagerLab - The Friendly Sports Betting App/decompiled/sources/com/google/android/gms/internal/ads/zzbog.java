package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzbog implements zzbkb {
    final /* synthetic */ zzboh zza;
    private final zzbnj zzb;
    private final zzbzm zzc;

    public zzbog(zzboh zzbohVar, zzbnj zzbnjVar, zzbzm zzbzmVar) {
        Objects.requireNonNull(zzbohVar);
        this.zza = zzbohVar;
        this.zzb = zzbnjVar;
        this.zzc = zzbzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkb
    public final void zza(JSONObject jSONObject) {
        try {
            try {
                this.zzc.zzc(this.zza.zzd().zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                this.zzc.zzd(e);
            }
        } finally {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkb
    public final void zzb(String str) {
        try {
            if (str == null) {
                this.zzc.zzd(new zzbns());
            } else {
                this.zzc.zzd(new zzbns(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.zzb.zza();
            throw th;
        }
        this.zzb.zza();
    }
}
