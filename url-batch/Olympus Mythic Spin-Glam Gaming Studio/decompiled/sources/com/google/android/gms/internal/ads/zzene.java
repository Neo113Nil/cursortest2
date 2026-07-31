package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzene implements zzdom {
    final /* synthetic */ zzemt zza;
    final /* synthetic */ zzfld zzb;

    zzene(zzenf zzenfVar, zzemt zzemtVar, zzfld zzfldVar) {
        this.zza = zzemtVar;
        this.zzb = zzfldVar;
        Objects.requireNonNull(zzenfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    public final void zza(boolean z, Context context, @Nullable zzdec zzdecVar) throws zzdol {
        try {
            zzfmu zzfmuVar = (zzfmu) this.zza.zzb;
            zzfmuVar.zzs(z);
            zzfmuVar.zzz(context);
        } catch (zzfmd e) {
            throw new zzdol(e.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    @Nullable
    public final zzfld zzb() {
        return this.zzb;
    }
}
