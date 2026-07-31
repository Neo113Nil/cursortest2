package com.google.android.gms.ads.mediation.rtb;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes6.dex */
public interface SignalCallbacks {
    void onFailure(@NonNull AdError adError);

    void onSuccess(@NonNull String str);
}
