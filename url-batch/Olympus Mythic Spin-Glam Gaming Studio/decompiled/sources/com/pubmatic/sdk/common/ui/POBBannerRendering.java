package com.pubmatic.sdk.common.ui;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBAdRendererListener;

/* loaded from: classes4.dex */
public interface POBBannerRendering {
    void destroy();

    void invalidateExpiration();

    void renderAd(@NonNull POBAdDescriptor pOBAdDescriptor);

    void setAdRendererListener(@Nullable POBAdRendererListener pOBAdRendererListener);

    void setWatermark(@Nullable String str);
}
