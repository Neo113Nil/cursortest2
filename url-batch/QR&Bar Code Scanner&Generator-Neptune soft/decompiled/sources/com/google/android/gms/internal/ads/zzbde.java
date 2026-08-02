package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbde extends zzbdl {
    private final AppOpenAd.AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzbde(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.zza = appOpenAdLoadCallback;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzb(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zzd(zzbdj zzbdjVar) {
        if (this.zza != null) {
            this.zza.onAdLoaded(new zzbdf(zzbdjVar, this.zzb));
        }
    }
}
