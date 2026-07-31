package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzbzi extends zzbof {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbzi(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zze(zzbom zzbomVar) {
        this.zza.onNativeAdLoaded(new zzbzd(zzbomVar));
    }
}
