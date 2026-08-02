package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzesk implements zzeve {
    private final zzfzq zza;
    private final zzfef zzb;

    zzesk(zzfzq zzfzqVar, zzfef zzfefVar) {
        this.zza = zzfzqVar;
        this.zzb = zzfefVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesk.this.zzc();
            }
        });
    }

    final /* synthetic */ zzesl zzc() throws Exception {
        return new zzesl("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(this.zzb.zzd)));
    }
}
