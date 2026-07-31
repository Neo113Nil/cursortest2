package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzczc implements zzinw {
    private final zzczb zza;

    private zzczc(zzczb zzczbVar) {
        this.zza = zzczbVar;
    }

    public static zzczc zzc(zzczb zzczbVar) {
        return new zzczc(zzczbVar);
    }

    public static zzfld zzd(zzczb zzczbVar) {
        zzfld zzb = zzczbVar.zzb();
        zzioe.zzb(zzb);
        return zzb;
    }

    public final zzfld zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
