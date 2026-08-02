package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbom extends zzbnr {
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener zza;

    public zzbom(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.zza = onUnifiedNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbns
    public final void zze(zzbob zzbobVar) {
        this.zza.onUnifiedNativeAdLoaded(new zzboc(zzbobVar));
    }
}
