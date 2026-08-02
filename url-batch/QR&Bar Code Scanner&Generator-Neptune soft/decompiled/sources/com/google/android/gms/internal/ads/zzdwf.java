package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdwf implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;

    public zzdwf(zzgxv zzgxvVar, zzgxv zzgxvVar2) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfzq zzfzqVar = zzchc.zza;
        zzgxq.zzb(zzfzqVar);
        Set singleton = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzea)).booleanValue() ? Collections.singleton(new zzdkg(((zzdwy) this.zzb).zzb(), zzfzqVar)) : Collections.emptySet();
        zzgxq.zzb(singleton);
        return singleton;
    }
}
