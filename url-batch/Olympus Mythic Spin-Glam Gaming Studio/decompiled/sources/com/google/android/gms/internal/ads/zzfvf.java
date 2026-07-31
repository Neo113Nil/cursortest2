package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzfvf implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;
    private final zziof zze;
    private final zziof zzf;
    private final zziof zzg;
    private final zziof zzh;

    private zzfvf(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7, zziof zziofVar8) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
        this.zzd = zziofVar4;
        this.zze = zziofVar5;
        this.zzf = zziofVar6;
        this.zzg = zziofVar7;
        this.zzh = zziofVar8;
    }

    public static zzfvf zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7, zziof zziofVar8) {
        return new zzfvf(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar5, zziofVar6, zziofVar7, zziofVar8);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfve(((zzcok) this.zza).zza(), ((zzcpa) this.zzb).zza(), (ScheduledExecutorService) this.zzc.zzb(), (zzfpm) this.zzd.zzb(), ((zzcru) this.zze).zzb(), (Clock) this.zzf.zzb(), (zzftp) this.zzg.zzb(), ((zzfug) this.zzh).zzb());
    }
}
