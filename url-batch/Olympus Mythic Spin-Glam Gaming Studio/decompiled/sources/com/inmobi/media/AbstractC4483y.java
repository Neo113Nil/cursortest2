package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.y, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC4483y {
    public final C4456x a;

    public AbstractC4483y(C4456x adComponent) {
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        this.a = adComponent;
    }

    public final CoroutineScope k() {
        return this.a.a.e;
    }

    public final InterfaceC4466x9 l() {
        return this.a.a.c;
    }
}
