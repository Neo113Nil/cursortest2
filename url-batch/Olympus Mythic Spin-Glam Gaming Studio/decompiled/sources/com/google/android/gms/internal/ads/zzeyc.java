package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
public final class zzeyc implements zzfdi {
    private final zzhdi zza;
    private final zzdyf zzb;
    private final String zzc;
    private final zzflw zzd;

    public zzeyc(zzhdi zzhdiVar, zzdyf zzdyfVar, zzflw zzflwVar, String str) {
        this.zza = zzhdiVar;
        this.zzb = zzdyfVar;
        this.zzd = zzflwVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeyb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzeyc.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 17;
    }

    final /* synthetic */ zzeyd zzc() {
        zzflw zzflwVar = this.zzd;
        zzdyf zzdyfVar = this.zzb;
        return new zzeyd(zzdyfVar.zzb(zzflwVar.zzg, this.zzc), zzdyfVar.zzc());
    }
}
