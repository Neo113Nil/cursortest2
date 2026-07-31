package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzfqk implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzfqk(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar2;
        this.zzb = zziofVar3;
    }

    public static zzfqk zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzfqk(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfqi(zzfoy.zzc(), (ScheduledExecutorService) this.zza.zzb(), ((zzfql) this.zzb).zzb());
    }
}
