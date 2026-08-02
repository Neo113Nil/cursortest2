package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbyr extends zzbnr {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbyr(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbns
    public final void zze(zzbob zzbobVar) {
        this.zza.onNativeAdLoaded(new zzbyk(zzbobVar));
    }
}
