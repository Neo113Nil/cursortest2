package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzerp implements zzeup {
    private final Context zza;
    private final zzgpd zzb;

    zzerp(zzgpd zzgpdVar, Context context) {
        this.zzb = zzgpdVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzero
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzerp.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 57;
    }

    final /* synthetic */ zzerq zzc() {
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzerq(com.google.android.gms.ads.internal.util.zzs.zzw(this.zza));
    }
}
