package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzevl implements zzevo {
    private final zzgcu zza;
    private final Context zzb;

    zzevl(zzgcu zzgcuVar, Context context) {
        this.zza = zzgcuVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzevl.this.zzc();
            }
        });
    }

    final /* synthetic */ zzevn zzc() throws Exception {
        final Bundle zzb = com.google.android.gms.ads.internal.util.zzad.zzb(this.zzb, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfx));
        if (zzb.isEmpty()) {
            return null;
        }
        return new zzevn() { // from class: com.google.android.gms.internal.ads.zzevk
            @Override // com.google.android.gms.internal.ads.zzevn
            public final void zzj(Object obj) {
                ((Bundle) obj).putBundle("shared_pref", zzb);
            }
        };
    }
}
