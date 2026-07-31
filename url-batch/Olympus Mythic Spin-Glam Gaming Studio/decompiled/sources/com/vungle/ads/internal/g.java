package com.vungle.ads.internal;

import com.ironsource.X3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public final class g extends h {
    public g() {
        super("READY", 2, 0);
    }

    @Override // com.vungle.ads.internal.h
    public final boolean a(h adState) {
        Intrinsics.checkNotNullParameter(adState, "adState");
        return adState == h.d || adState == h.f || adState == h.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return X3.i.s;
    }
}
