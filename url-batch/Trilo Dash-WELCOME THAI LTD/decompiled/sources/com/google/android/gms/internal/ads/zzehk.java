package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzehk implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;

    public zzehk(zzgqh zzgqhVar, zzgqh zzgqhVar2) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzehj zzb() {
        return new zzehj((Context) this.zza.zzb(), (zzdkx) this.zzb.zzb());
    }
}
