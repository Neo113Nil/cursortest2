package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class Pn {
    public final G a;
    public final boolean[] b;

    public Pn(G adContext) {
        Intrinsics.checkNotNullParameter(adContext, "adContext");
        this.a = adContext;
        boolean[] zArr = new boolean[5];
        for (int i = 0; i < 5; i++) {
            zArr[i] = false;
        }
        this.b = zArr;
    }
}
