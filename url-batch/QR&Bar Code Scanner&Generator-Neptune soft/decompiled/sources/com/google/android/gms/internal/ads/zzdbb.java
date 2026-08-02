package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdbb implements zzgxi {
    private final zzdba zza;
    private final zzgxv zzb;
    private final zzgxv zzc;

    public zzdbb(zzdba zzdbaVar, zzgxv zzgxvVar, zzgxv zzgxvVar2) {
        this.zza = zzdbaVar;
        this.zzb = zzgxvVar;
        this.zzc = zzgxvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new com.google.android.gms.ads.internal.zzb((Context) this.zzb.zzb(), (zzcdq) this.zzc.zzb(), null);
    }
}
