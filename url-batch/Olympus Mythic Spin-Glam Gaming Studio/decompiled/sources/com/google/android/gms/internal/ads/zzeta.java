package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes.dex */
public final class zzeta implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;
    private final zziof zze;

    private zzeta(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
        this.zzd = zziofVar4;
        this.zze = zziofVar5;
    }

    public static zzeta zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5) {
        return new zzeta(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar5);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzesz((Context) this.zza.zzb(), ((zzdow) this.zzb).zza(), ((zzddg) this.zzc).zza(), ((zzcwq) this.zzd).zzb(), (zzeaj) this.zze.zzb());
    }
}
