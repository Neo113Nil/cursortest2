package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzesa implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;

    public zzesa(zzgxv zzgxvVar, zzgxv zzgxvVar2) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzcos) this.zza).zza();
        zzfzq zzfzqVar = zzchc.zza;
        zzgxq.zzb(zzfzqVar);
        return new zzerz(zza, zzfzqVar);
    }
}
