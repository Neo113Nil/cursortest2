package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzeoa implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzeoa(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzeoa zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzeoa(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzenz zzb() {
        return new zzenz((Context) this.zza.zzb(), (zzcxi) this.zzb.zzb());
    }
}
