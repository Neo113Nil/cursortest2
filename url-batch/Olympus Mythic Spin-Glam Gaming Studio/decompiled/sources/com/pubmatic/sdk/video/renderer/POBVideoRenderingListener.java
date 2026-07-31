package com.pubmatic.sdk.video.renderer;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.POBDataType;

/* loaded from: classes5.dex */
public interface POBVideoRenderingListener {
    void notifyAdEvent(@NonNull POBDataType.POBVideoAdEventType pOBVideoAdEventType);

    void onSkipOptionUpdate(boolean z);
}
