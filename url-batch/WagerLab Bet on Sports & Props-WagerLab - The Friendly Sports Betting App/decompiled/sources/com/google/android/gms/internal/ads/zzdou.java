package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbn;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdou implements zzhpx {
    private final zzhqg zza;

    private zzdou(zzhqg zzhqgVar) {
        this.zza = zzhqgVar;
    }

    public static zzdou zza(zzhqg zzhqgVar) {
        return new zzdou(zzhqgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbbn.zza.EnumC0070zza enumC0070zza = ((zzcvj) this.zza).zza().zzp.zza == 3 ? zzbbn.zza.EnumC0070zza.REWARDED_INTERSTITIAL : zzbbn.zza.EnumC0070zza.REWARD_BASED_VIDEO_AD;
        zzhqf.zzb(enumC0070zza);
        return enumC0070zza;
    }
}
