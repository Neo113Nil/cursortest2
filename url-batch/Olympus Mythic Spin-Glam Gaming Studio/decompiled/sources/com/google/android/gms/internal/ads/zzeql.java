package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
public final class zzeql implements zzinw {
    private final zzeqk zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;
    private final zziof zze;

    private zzeql(zzeqk zzeqkVar, zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        this.zza = zzeqkVar;
        this.zzb = zziofVar;
        this.zzc = zziofVar2;
        this.zzd = zziofVar3;
        this.zze = zziofVar4;
    }

    public static zzeql zza(zzeqk zzeqkVar, zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        return new zzeql(zzeqkVar, zziofVar, zziofVar2, zziofVar3, zziofVar4);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return this.zza.zzb((Clock) this.zzb.zzb(), ((zzeqe) this.zzc).zzb(), (zzemv) this.zzd.zzb(), (zzfte) this.zze.zzb());
    }
}
