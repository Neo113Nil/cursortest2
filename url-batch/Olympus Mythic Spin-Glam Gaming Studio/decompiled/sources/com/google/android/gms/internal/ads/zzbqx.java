package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzbqx implements zzbqy {
    final /* synthetic */ zzcgo zza;

    zzbqx(zzbqz zzbqzVar, zzcgo zzcgoVar) {
        this.zza = zzcgoVar;
        Objects.requireNonNull(zzbqzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final void zza(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbqy
    public final void zzb(@Nullable String str) {
        this.zza.zzd(new zzbup(str));
    }
}
