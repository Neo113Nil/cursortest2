package com.smaato.sdk.nativead;

import android.view.View;

/* loaded from: classes12.dex */
public interface NativeAdRenderer {
    String creativeId();

    NativeAdAssets getAssets();

    void onDestroyView();

    void registerForClicks(Iterable<? extends View> iterable);

    void registerForClicks(View... viewArr);

    void registerForImpression(View view);

    void renderInView(NativeAdView nativeAdView);

    String sessionId();
}
