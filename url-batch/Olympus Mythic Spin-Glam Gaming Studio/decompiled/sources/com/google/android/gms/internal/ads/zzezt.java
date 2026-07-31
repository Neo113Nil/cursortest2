package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
public final class zzezt implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzezt(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzezt zza(zziof zziofVar, zziof zziofVar2) {
        return new zzezt(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfbu(((zzfce) this.zza).zzb(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznO)).intValue(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
