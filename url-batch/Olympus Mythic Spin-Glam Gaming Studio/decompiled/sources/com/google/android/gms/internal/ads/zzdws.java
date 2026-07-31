package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbil;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzdws implements zzinw {
    private final zziof zza;

    private zzdws(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdws zza(zziof zziofVar) {
        return new zzdws(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbil.zza.EnumC0240zza enumC0240zza = ((zzddg) this.zza).zza().zzp.zza == 3 ? zzbil.zza.EnumC0240zza.REWARDED_INTERSTITIAL : zzbil.zza.EnumC0240zza.REWARD_BASED_VIDEO_AD;
        zzioe.zzb(enumC0240zza);
        return enumC0240zza;
    }
}
