package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final /* synthetic */ class zzeia implements zzhcg {
    static final /* synthetic */ zzeia zza = new zzeia();

    private /* synthetic */ zzeia() {
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        Throwable th = (ExecutionException) obj;
        if (th.getCause() != null) {
            th = th.getCause();
        }
        return zzhcy.zzc(th);
    }
}
