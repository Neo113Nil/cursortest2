package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfhr implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;
    private final zziof zze;
    private final zziof zzf;
    private final zziof zzg;

    private zzfhr(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7, zziof zziofVar8) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
        this.zzd = zziofVar4;
        this.zze = zziofVar5;
        this.zzf = zziofVar6;
        this.zzg = zziofVar8;
    }

    public static zzfhr zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7, zziof zziofVar8) {
        return new zzfhr(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar5, zziofVar6, zziofVar7, zziofVar8);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfhq((Context) this.zza.zzb(), (Executor) this.zzb.zzb(), (com.google.android.gms.ads.internal.client.zzr) this.zzc.zzb(), (zzcob) this.zzd.zzb(), (zzeua) this.zze.zzb(), (zzeue) this.zzf.zzb(), new zzflv(), (zzdiv) this.zzg.zzb());
    }
}
