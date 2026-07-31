package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.formats.NativeAdOptions;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
@Deprecated
/* loaded from: classes6.dex */
public interface NativeMediationAdRequest extends MediationAdRequest {
    float getAdVolume();

    @NonNull
    @Deprecated
    NativeAdOptions getNativeAdOptions();

    @NonNull
    com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions();

    boolean isAdMuted();

    boolean isUnifiedNativeAdRequested();

    boolean zza();

    @NonNull
    Map zzb();
}
