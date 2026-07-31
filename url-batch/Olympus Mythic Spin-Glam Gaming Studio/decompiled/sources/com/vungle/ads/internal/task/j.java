package com.vungle.ads.internal.task;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public abstract class j implements com.vungle.ads.internal.executor.h {
    public abstract int a();

    @Override // java.lang.Comparable
    public int compareTo(Object other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (!(other instanceof j)) {
            return -1;
        }
        return Intrinsics.compare(((j) other).a(), a());
    }
}
