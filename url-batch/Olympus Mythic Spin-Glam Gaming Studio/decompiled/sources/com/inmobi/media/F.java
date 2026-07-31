package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class F {
    public final byte a;
    public final String b;
    public final int c;
    public final int d;

    public F(byte b, String impressionId, int i, int i2, int[] viewableFrameArray) {
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(viewableFrameArray, "viewableFrameArray");
        this.a = b;
        this.b = impressionId;
        this.c = i;
        this.d = i2;
    }
}
