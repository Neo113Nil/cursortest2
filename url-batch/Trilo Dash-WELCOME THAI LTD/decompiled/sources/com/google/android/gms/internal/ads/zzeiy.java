package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzeiy implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;

    public zzeiy(zzgqh zzgqhVar, zzgqh zzgqhVar2) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeix zzb() {
        return new zzeix((Context) this.zza.zzb(), (zzdsx) this.zzb.zzb());
    }
}
