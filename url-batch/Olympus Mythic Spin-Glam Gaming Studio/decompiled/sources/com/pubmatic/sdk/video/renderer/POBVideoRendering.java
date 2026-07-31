package com.pubmatic.sdk.video.renderer;

import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.ui.POBBannerRendering;

/* loaded from: classes15.dex */
public interface POBVideoRendering extends POBBannerRendering {
    @Override // com.pubmatic.sdk.common.ui.POBBannerRendering
    void destroy();

    void proceedAdSkip(boolean z);

    void setVideoRenderingListener(@Nullable POBVideoRenderingListener pOBVideoRenderingListener);

    void setVideoSkipEventListener(@Nullable POBVideoSkipEventListener pOBVideoSkipEventListener);
}
