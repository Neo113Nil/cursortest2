package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzett implements zzeve {
    private final zzfzq zza;
    private final Bundle zzb;

    public zzett(zzfzq zzfzqVar, Bundle bundle) {
        this.zza = zzfzqVar;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 30;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzets
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzett.this.zzc();
            }
        });
    }

    final /* synthetic */ zzetu zzc() throws Exception {
        return new zzetu(this.zzb);
    }
}
