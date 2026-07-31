package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.io, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4087io {
    public final int a;
    public final int b;
    public final H5 c;

    public C4087io(AdConfig.VideoPlayerViewabilityConfig viewableConfig) {
        Intrinsics.checkNotNullParameter(viewableConfig, "viewableConfig");
        this.a = viewableConfig.getMinPercentageVisible();
        this.b = viewableConfig.getPollingInterval();
        this.c = Gl.a(viewableConfig.getMinDimensions());
    }
}
