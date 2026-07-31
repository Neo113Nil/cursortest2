package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.screenshot.impl.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5875l {
    public final boolean a;
    public final C5876m b;

    public C5875l(boolean z, C5876m c5876m) {
        this.a = z;
        this.b = c5876m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C5875l.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideRemoteScreenshotConfig");
        C5875l c5875l = (C5875l) obj;
        return this.a == c5875l.a && Intrinsics.areEqual(this.b, c5875l.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        C5876m c5876m = this.b;
        return hashCode + (c5876m != null ? c5876m.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideRemoteScreenshotConfig(enabled=" + this.a + ", config=" + this.b + ')';
    }
}
