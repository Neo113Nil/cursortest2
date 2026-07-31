package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzfwp implements zzgob {
    final /* synthetic */ zzfwr zza;

    zzfwp(zzfwr zzfwrVar) {
        Objects.requireNonNull(zzfwrVar);
        this.zza = zzfwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        zzfwn zzfwnVar = (zzfwn) obj;
        if (zzfwnVar != null) {
            return zzgot.zza(zzfwnVar);
        }
        zzfwr zzfwrVar = this.zza;
        zzfwrVar.zza().zzb(51);
        return zzfwrVar.zzc(2);
    }
}
