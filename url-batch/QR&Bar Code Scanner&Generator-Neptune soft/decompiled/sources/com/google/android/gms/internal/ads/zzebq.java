package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzebq implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;
    private final zzgxv zzc;

    public zzebq(zzgxv zzgxvVar, zzgxv zzgxvVar2, zzgxv zzgxvVar3) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
        this.zzc = zzgxvVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        final zzape zzapeVar = (zzape) this.zza.zzb();
        final Context zza = ((zzcos) this.zzb).zza();
        zzfzq zzfzqVar = zzchc.zza;
        zzgxq.zzb(zzfzqVar);
        zzfzp zzb = zzfzqVar.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzebn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzape zzapeVar2 = zzape.this;
                return zzapeVar2.zzc().zzg(zza);
            }
        });
        zzgxq.zzb(zzb);
        return zzb;
    }
}
