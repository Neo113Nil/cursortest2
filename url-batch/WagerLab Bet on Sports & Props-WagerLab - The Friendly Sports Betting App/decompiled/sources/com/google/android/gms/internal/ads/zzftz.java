package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzftz implements zzgob {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzfuc zzb;

    zzftz(zzfuc zzfucVar, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzfucVar);
        this.zzb = zzfucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        return this.zzb.zzg().zzb(this.zza);
    }
}
