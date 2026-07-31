package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
public final class zzeyy implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzeyy(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzeyy zza(zziof zziofVar, zziof zziofVar2) {
        return new zzeyy(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfbu(((zzevv) this.zza).zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzob)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
