package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzexc implements zzeve {
    final zzfzq zza;
    final List zzb;
    final zzbin zzc;

    public zzexc(zzbin zzbinVar, zzfzq zzfzqVar, List list, byte[] bArr) {
        this.zzc = zzbinVar;
        this.zza = zzfzqVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzexb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzexd(zzexc.this.zzb);
            }
        });
    }
}
