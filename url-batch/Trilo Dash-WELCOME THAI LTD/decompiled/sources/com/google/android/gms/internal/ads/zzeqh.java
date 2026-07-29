package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzeqh implements zzetb {
    private final zzfvk zza;
    private final zzfby zzb;

    zzeqh(zzfvk zzfvkVar, zzfby zzfbyVar) {
        this.zza = zzfvkVar;
        this.zzb = zzfbyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 21;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqh.this.zzc();
            }
        });
    }

    final /* synthetic */ zzeqi zzc() throws Exception {
        return new zzeqi("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(this.zzb.zzd)));
    }
}
