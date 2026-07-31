package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* renamed from: com.inmobi.media.mn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4191mn extends AbstractC4075ic {
    public final MutableSharedFlow a;
    public final long b;

    public C4191mn(MutableSharedFlow mediaEventFlow, long j) {
        Intrinsics.checkNotNullParameter(mediaEventFlow, "mediaEventFlow");
        this.a = mediaEventFlow;
        this.b = j;
    }
}
