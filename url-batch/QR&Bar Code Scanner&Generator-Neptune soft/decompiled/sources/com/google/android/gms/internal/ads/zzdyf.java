package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdyf implements zzgxi {
    private final zzdyd zza;
    private final zzgxv zzb;
    private final zzgxv zzc;

    public zzdyf(zzdyd zzdydVar, zzgxv zzgxvVar, zzgxv zzgxvVar2) {
        this.zza = zzdydVar;
        this.zzb = zzgxvVar;
        this.zzc = zzgxvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdyn zzdynVar = (zzdyn) this.zzb.zzb();
        zzfzq zzfzqVar = zzchc.zza;
        zzgxq.zzb(zzfzqVar);
        Set zzb = zzdyd.zzb(zzdynVar, zzfzqVar);
        zzgxq.zzb(zzb);
        return zzb;
    }
}
