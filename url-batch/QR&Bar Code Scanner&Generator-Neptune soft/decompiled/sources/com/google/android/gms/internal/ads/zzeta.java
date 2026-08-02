package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeta implements zzeve {
    private final zzfzq zza;
    private final zzfdj zzb;

    public zzeta(zzfzq zzfzqVar, zzfdj zzfdjVar) {
        this.zza = zzfzqVar;
        this.zzb = zzfdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeta.this.zzc();
            }
        });
    }

    final /* synthetic */ zzetb zzc() throws Exception {
        return new zzetb(this.zzb);
    }
}
