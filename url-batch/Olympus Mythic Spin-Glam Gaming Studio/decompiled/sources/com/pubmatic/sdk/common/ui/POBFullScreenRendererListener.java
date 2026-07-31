package com.pubmatic.sdk.common.ui;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.base.POBAdDescriptor;

@MainThread
/* loaded from: classes5.dex */
public interface POBFullScreenRendererListener {
    void onAdClicked();

    void onAdExpired();

    void onAdImpression();

    void onAdInteractionStarted();

    void onAdInteractionStopped();

    void onAdRender(POBAdDescriptor pOBAdDescriptor);

    void onAdRenderingFailed(@NonNull POBError pOBError);

    void onAdUnload();

    void onLeavingApplication();

    void onRenderProcessGone();
}
