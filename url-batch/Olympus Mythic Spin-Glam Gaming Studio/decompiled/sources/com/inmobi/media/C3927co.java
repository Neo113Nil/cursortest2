package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.co, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3927co {
    public final CoroutineScope a;
    public final int b;

    public C3927co(CoroutineScope coroutineScope, int i) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.a = coroutineScope;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3927co)) {
            return false;
        }
        C3927co c3927co = (C3927co) obj;
        return Intrinsics.areEqual(this.a, c3927co.a) && this.b == c3927co.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewabilityTrackerConfig(coroutineScope=" + this.a + ", impressionMinDuration=" + this.b + ")";
    }
}
