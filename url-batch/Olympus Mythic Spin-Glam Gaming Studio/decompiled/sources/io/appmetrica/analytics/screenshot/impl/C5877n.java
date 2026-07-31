package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.screenshot.impl.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5877n {
    public final boolean a;
    public final long b;

    public C5877n(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C5877n.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideServiceCaptorConfig");
        C5877n c5877n = (C5877n) obj;
        return this.a == c5877n.a && this.b == c5877n.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ClientSideServiceCaptorConfig(enabled=" + this.a + ", delaySeconds=" + this.b + ')';
    }

    public C5877n(F f) {
        this(f.b(), f.a());
    }
}
