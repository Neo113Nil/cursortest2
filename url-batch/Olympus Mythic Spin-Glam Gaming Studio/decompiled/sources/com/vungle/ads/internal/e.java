package com.vungle.ads.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class e extends h {
    public e() {
        super("NEW", 0, 0);
    }

    @Override // com.vungle.ads.internal.h
    public final boolean a(h adState) {
        Intrinsics.checkNotNullParameter(adState, "adState");
        return adState == h.b || adState == h.c || adState == h.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "idle";
    }
}
