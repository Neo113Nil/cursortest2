package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
final class zzerh implements zzdom {
    final /* synthetic */ zzemt zza;
    final /* synthetic */ zzfld zzb;

    zzerh(zzerj zzerjVar, zzemt zzemtVar, zzfld zzfldVar) {
        this.zza = zzemtVar;
        this.zzb = zzfldVar;
        Objects.requireNonNull(zzerjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    public final void zza(boolean z, Context context, @Nullable zzdec zzdecVar) throws zzdol {
        try {
            zzfmu zzfmuVar = (zzfmu) this.zza.zzb;
            zzfmuVar.zzs(z);
            zzfmuVar.zzm();
        } catch (zzfmd e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot show rewarded video.", e);
            throw new zzdol(e.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    @Nullable
    public final zzfld zzb() {
        return this.zzb;
    }
}
