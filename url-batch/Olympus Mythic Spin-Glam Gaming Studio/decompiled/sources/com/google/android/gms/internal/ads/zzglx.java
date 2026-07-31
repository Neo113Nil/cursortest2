package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzglx implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzglx(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzglx zza(zziof zziofVar, zziof zziofVar2) {
        return new zzglx(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbei zzb = zzfzf.zzb((Context) this.zza.zzb(), (zzfyi) this.zzb.zzb());
        zzioe.zzb(zzb);
        return zzb;
    }
}
