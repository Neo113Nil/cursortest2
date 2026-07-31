package com.inmobi.media;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Wj extends G6 {
    public final List a;
    public final C3923ck b;

    public Wj(List imageAssets, C3923ck staticTelemetryHelper) {
        Intrinsics.checkNotNullParameter(imageAssets, "imageAssets");
        Intrinsics.checkNotNullParameter(staticTelemetryHelper, "staticTelemetryHelper");
        this.a = imageAssets;
        this.b = staticTelemetryHelper;
    }
}
