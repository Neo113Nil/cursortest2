package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzduk implements zzgxi {
    private final zzgxv zza;

    public zzduk(zzgxv zzgxvVar) {
        this.zza = zzgxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbez zzbezVar = ((zzdcr) this.zza).zza().zzo.zza == 3 ? zzbez.REWARDED_INTERSTITIAL : zzbez.REWARD_BASED_VIDEO_AD;
        zzgxq.zzb(zzbezVar);
        return zzbezVar;
    }
}
