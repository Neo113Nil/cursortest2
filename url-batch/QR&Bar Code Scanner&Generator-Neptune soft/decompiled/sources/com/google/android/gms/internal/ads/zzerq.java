package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzerq implements zzeve {
    private final zzfzq zza;
    private final zzdvq zzb;
    private final String zzc;
    private final zzfef zzd;

    public zzerq(zzfzq zzfzqVar, zzdvq zzdvqVar, zzfef zzfefVar, String str) {
        this.zza = zzfzqVar;
        this.zzb = zzdvqVar;
        this.zzd = zzfefVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerq.this.zzc();
            }
        });
    }

    final /* synthetic */ zzerr zzc() throws Exception {
        return new zzerr(this.zzb.zzb(this.zzd.zzf, this.zzc), this.zzb.zza());
    }
}
