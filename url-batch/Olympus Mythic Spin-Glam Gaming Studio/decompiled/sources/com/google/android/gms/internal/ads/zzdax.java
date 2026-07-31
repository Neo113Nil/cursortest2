package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzdax implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzdax(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
    }

    public static zzdax zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        return new zzdax(zziofVar, zziofVar2, zziofVar3, zziofVar4);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdaw(((zzcok) this.zza).zza(), (zzfrj) this.zzb.zzb(), ((zzcpa) this.zzc).zza(), zzfoy.zzc());
    }
}
