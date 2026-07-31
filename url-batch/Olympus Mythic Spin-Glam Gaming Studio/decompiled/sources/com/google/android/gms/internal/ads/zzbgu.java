package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzbgu extends zzbhb {

    @Nullable
    private final AppOpenAd.AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzbgu(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.zza = appOpenAdLoadCallback;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zza(zzbgz zzbgzVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.zza;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdLoaded(new zzbgv(zzbgzVar, this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzb(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbhc
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.zza;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }
}
