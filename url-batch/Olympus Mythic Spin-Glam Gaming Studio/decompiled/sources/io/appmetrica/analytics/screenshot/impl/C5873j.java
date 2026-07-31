package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.screenshot.impl.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5873j {
    public final boolean a;

    public C5873j(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C5873j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideApiCaptorConfig");
        return this.a == ((C5873j) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "ClientSideApiCaptorConfig(enabled=" + this.a + ')';
    }

    public C5873j(C5888z c5888z) {
        this(c5888z.a());
    }
}
