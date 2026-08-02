package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzepp implements zzeve {
    private final zzfzq zza;
    private final zzfef zzb;
    private final zzfer zzc;

    zzepp(zzfzq zzfzqVar, zzfef zzfefVar, zzfer zzferVar) {
        this.zza = zzfzqVar;
        this.zzb = zzfefVar;
        this.zzc = zzferVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepp.this.zzc();
            }
        });
    }

    final /* synthetic */ zzepq zzc() throws Exception {
        String str = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgn)).booleanValue() && "requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(this.zzb.zzd))) {
            str = zzfer.zza();
        }
        return new zzepq(str);
    }
}
