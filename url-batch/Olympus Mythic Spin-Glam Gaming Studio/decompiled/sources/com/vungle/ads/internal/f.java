package com.vungle.ads.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class f extends h {
    public f() {
        super("PLAYING", 3, 0);
    }

    @Override // com.vungle.ads.internal.h
    public final boolean a(h adState) {
        Intrinsics.checkNotNullParameter(adState, "adState");
        return adState == h.e || adState == h.f || adState == h.g || adState == h.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "playing";
    }
}
