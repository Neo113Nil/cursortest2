package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzess implements zzeve {
    private final zzfzq zza;
    private final zzeak zzb;

    zzess(zzfzq zzfzqVar, zzeak zzeakVar) {
        this.zza = zzfzqVar;
        this.zzb = zzeakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzess.this.zzc();
            }
        });
    }

    final /* synthetic */ zzest zzc() throws Exception {
        return new zzest(this.zzb.zzc(), this.zzb.zzo(), com.google.android.gms.ads.internal.zzt.zzs().zzl());
    }
}
