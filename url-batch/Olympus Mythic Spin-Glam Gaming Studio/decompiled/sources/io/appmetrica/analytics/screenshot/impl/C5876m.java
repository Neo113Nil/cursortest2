package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.screenshot.impl.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5876m {
    public final C5873j a;
    public final C5877n b;
    public final C5874k c;

    public C5876m(C5873j c5873j, C5877n c5877n, C5874k c5874k) {
        this.a = c5873j;
        this.b = c5877n;
        this.c = c5874k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C5876m.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideScreenshotConfig");
        C5876m c5876m = (C5876m) obj;
        return Intrinsics.areEqual(this.a, c5876m.a) && Intrinsics.areEqual(this.b, c5876m.b) && Intrinsics.areEqual(this.c, c5876m.c);
    }

    public final int hashCode() {
        C5873j c5873j = this.a;
        int hashCode = (c5873j != null ? c5873j.hashCode() : 0) * 31;
        C5877n c5877n = this.b;
        int hashCode2 = (hashCode + (c5877n != null ? c5877n.hashCode() : 0)) * 31;
        C5874k c5874k = this.c;
        return hashCode2 + (c5874k != null ? c5874k.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideScreenshotConfig(apiCaptorConfig=" + this.a + ", serviceCaptorConfig=" + this.b + ", contentObserverCaptorConfig=" + this.c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5876m(D d) {
        this(r2, r3, r5 != null ? new C5874k(r5) : null);
        C5888z a = d.a();
        C5873j c5873j = a != null ? new C5873j(a) : null;
        F c = d.c();
        C5877n c5877n = c != null ? new C5877n(c) : null;
        B b = d.b();
    }
}
