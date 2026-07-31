package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfbq implements zzfdi {
    private final zzhdi zza;
    private final zzebm zzb;

    zzfbq(zzhdi zzhdiVar, zzebm zzebmVar) {
        this.zza = zzhdiVar;
        this.zzb = zzebmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbp
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfbq.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 62;
    }

    final /* synthetic */ zzfbr zzc() {
        return new zzfbr(this.zzb.zzb());
    }
}
