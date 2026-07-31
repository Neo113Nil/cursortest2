package com.inmobi.media;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class Xk {
    public final int a;
    public final int b;
    public final int c;
    public final Function0 d;

    public Xk(int i, int i2, int i3, Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = action;
    }
}
