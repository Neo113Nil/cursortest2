package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
@Deprecated
/* loaded from: classes13.dex */
public interface CustomEventNative extends CustomEvent {
    void requestNativeAd(@NonNull Context context, @NonNull CustomEventNativeListener customEventNativeListener, @Nullable String str, @NonNull NativeMediationAdRequest nativeMediationAdRequest, @Nullable Bundle bundle);
}
