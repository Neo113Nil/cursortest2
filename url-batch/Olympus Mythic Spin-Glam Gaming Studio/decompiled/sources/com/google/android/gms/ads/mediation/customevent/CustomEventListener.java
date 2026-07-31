package com.google.android.gms.ads.mediation.customevent;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
@Deprecated
/* loaded from: classes6.dex */
public interface CustomEventListener {
    void onAdClicked();

    void onAdClosed();

    @Deprecated
    void onAdFailedToLoad(int i);

    void onAdFailedToLoad(@NonNull AdError adError);

    void onAdLeftApplication();

    void onAdOpened();
}
