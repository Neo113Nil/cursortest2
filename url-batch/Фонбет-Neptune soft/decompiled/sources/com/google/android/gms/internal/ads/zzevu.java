package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzevu implements zzevo {
    private final Context zza;
    private final zzgcu zzb;

    zzevu(Context context, zzgcu zzgcuVar) {
        this.zza = context;
        this.zzb = zzgcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 59;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final ListenableFuture zzb() {
        return ((Boolean) zzbdk.zzb.zze()).booleanValue() ? this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzevu.this.zzc();
            }
        }) : zzgcj.zzh(null);
    }

    final /* synthetic */ zzevv zzc() throws Exception {
        Context context = this.zza;
        return new zzevv(zzbbg.zzb(context), zzbbg.zza(context));
    }
}
