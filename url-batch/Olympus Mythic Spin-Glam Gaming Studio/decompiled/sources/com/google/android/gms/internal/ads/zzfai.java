package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzfai implements zzfdi {
    private final Context zza;
    private final zzhdi zzb;

    zzfai(zzhdi zzhdiVar, Context context) {
        this.zzb = zzhdiVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfah
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfai.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 57;
    }

    final /* synthetic */ zzfaj zzc() {
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzfaj(com.google.android.gms.ads.internal.util.zzs.zzu(this.zza));
    }
}
