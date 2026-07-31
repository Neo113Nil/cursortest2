package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzffz implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;
    private final zziof zze;

    private zzffz(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar5;
        this.zzd = zziofVar6;
        this.zze = zziofVar7;
    }

    public static zzffz zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7) {
        return new zzffz(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar5, zziofVar6, zziofVar7);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzffx zzb() {
        return new zzffx((zzcfv) this.zza.zzb(), ((zzffr) this.zzb).zzb().booleanValue(), zzcsg.zza(), zzfoy.zzc(), ((zzffo) this.zzc).zza(), (ScheduledExecutorService) this.zzd.zzb(), ((zzfft) this.zze).zzb().intValue());
    }
}
