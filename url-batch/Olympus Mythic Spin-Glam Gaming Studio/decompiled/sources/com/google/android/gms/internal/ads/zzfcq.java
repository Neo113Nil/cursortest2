package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfcq implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;
    private final zziof zze;
    private final zziof zzf;
    private final zziof zzg;
    private final zziof zzh;

    private zzfcq(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7, zziof zziofVar8, zziof zziofVar9) {
        this.zza = zziofVar2;
        this.zzb = zziofVar3;
        this.zzc = zziofVar4;
        this.zzd = zziofVar5;
        this.zze = zziofVar6;
        this.zzf = zziofVar7;
        this.zzg = zziofVar8;
        this.zzh = zziofVar9;
    }

    public static zzfcq zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7, zziof zziofVar8, zziof zziofVar9) {
        return new zzfcq(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar5, zziofVar6, zziofVar7, zziofVar8, zziofVar9);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfco(zzfoy.zzc(), (ScheduledExecutorService) this.zza.zzb(), (String) this.zzb.zzb(), (zzesu) this.zzc.zzb(), (Context) this.zzd.zzb(), ((zzddg) this.zze).zza(), (zzesp) this.zzf.zzb(), (zzdya) this.zzg.zzb(), (zzecw) this.zzh.zzb());
    }
}
