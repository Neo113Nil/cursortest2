package com.pubmatic.sdk.nativead.renderer;

import android.view.View;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.POBDataType;
import com.pubmatic.sdk.common.POBError;

@MainThread
/* loaded from: classes8.dex */
public interface POBNativeRendererListener {
    void onAdClicked();

    void onAdClicked(int i);

    void onAdClosed();

    void onAdImpression();

    void onAdInfoIconClicked();

    void onAdLeavingApplication();

    void onAdOpened();

    void onAdRendered(@NonNull View view);

    void onAdRenderingFailed(@NonNull POBError pOBError);

    void onVideoEventOccurred(@NonNull POBDataType.POBVideoAdEventType pOBVideoAdEventType);
}
