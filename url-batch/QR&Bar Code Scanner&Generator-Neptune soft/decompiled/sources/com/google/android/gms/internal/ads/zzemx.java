package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzemx implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;

    public zzemx(zzgxv zzgxvVar, zzgxv zzgxvVar2) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzemw zzb() {
        return new zzemw((Context) this.zza.zzb(), (zzdmh) this.zzb.zzb());
    }
}
