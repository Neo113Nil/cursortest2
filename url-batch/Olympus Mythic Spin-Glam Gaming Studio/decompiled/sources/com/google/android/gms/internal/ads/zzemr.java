package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzemr implements zzemq {

    @VisibleForTesting
    public final zzemq zza;
    private final zzgub zzb;

    public zzemr(zzemq zzemqVar, zzgub zzgubVar) {
        this.zza = zzemqVar;
        this.zzb = zzgubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final boolean zza(zzflo zzfloVar, zzfld zzfldVar) {
        return this.zza.zza(zzfloVar, zzfldVar);
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final ListenableFuture zzb(zzflo zzfloVar, zzfld zzfldVar) {
        return zzhcy.zzk(this.zza.zzb(zzfloVar, zzfldVar), this.zzb, zzcgj.zza);
    }
}
