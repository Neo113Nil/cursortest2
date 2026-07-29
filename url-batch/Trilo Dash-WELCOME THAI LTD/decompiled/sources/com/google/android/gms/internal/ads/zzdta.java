package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzdta implements zzgpu {
    private final zzgqh zza;

    public zzdta(zzgqh zzgqhVar) {
        this.zza = zzgqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbdv zzbdvVar = ((zzdbj) this.zza).zza().zzo.zza == 3 ? zzbdv.REWARDED_INTERSTITIAL : zzbdv.REWARD_BASED_VIDEO_AD;
        zzgqc.zzb(zzbdvVar);
        return zzbdvVar;
    }
}
