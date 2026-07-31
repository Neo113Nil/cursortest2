package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzggw implements zzhcg {
    final /* synthetic */ zzghb zza;

    zzggw(zzghb zzghbVar) {
        Objects.requireNonNull(zzghbVar);
        this.zza = zzghbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        zzggu zzgguVar = (zzggu) obj;
        if (zzgguVar != null) {
            return zzhcy.zza(zzgguVar);
        }
        zzghb zzghbVar = this.zza;
        zzghbVar.zza().zzb(51);
        return zzghbVar.zzd(zzghbVar.zze());
    }
}
