package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class Yi {
    public final String a;
    public final String b;

    public Yi(String sourceId, String renderViewId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        Intrinsics.checkNotNullParameter(renderViewId, "renderViewId");
        this.a = sourceId;
        this.b = renderViewId;
    }
}
