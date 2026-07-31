package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfet implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzfet(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5) {
        this.zza = zziofVar;
        this.zzb = zziofVar3;
        this.zzc = zziofVar4;
    }

    public static zzfet zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5) {
        return new zzfet(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar5);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfer zzb() {
        return new zzfer(((zzffo) this.zza).zza(), zzcrw.zza(), (zzcfv) this.zzb.zzb(), (ScheduledExecutorService) this.zzc.zzb(), zzfoy.zzc());
    }
}
