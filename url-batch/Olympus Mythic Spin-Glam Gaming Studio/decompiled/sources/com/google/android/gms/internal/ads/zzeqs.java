package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
public final class zzeqs implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzeqs(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzeqs zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzeqs(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeqr zzb() {
        return new zzeqr((Context) this.zza.zzb(), (zzdwp) this.zzb.zzb());
    }
}
