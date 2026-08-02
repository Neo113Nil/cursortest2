package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeqm implements zzeve {
    private final zzfzq zza;
    private final zzfef zzb;
    private final zzcgv zzc;
    private final zzcgc zzd;

    public zzeqm(zzfzq zzfzqVar, zzfef zzfefVar, zzcgv zzcgvVar, zzcgc zzcgcVar) {
        this.zza = zzfzqVar;
        this.zzb = zzfefVar;
        this.zzc = zzcgvVar;
        this.zzd = zzcgcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeql
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqm.this.zzc();
            }
        });
    }

    final /* synthetic */ zzeqn zzc() throws Exception {
        return new zzeqn(this.zzb.zzj, this.zzc, this.zzd.zzj());
    }
}
