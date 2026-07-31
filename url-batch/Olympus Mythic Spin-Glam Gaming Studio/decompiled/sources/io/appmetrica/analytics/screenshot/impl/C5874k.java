package io.appmetrica.analytics.screenshot.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.screenshot.impl.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5874k {
    public final boolean a;
    public final List b;
    public final long c;

    public C5874k(boolean z, List list, long j) {
        this.a = z;
        this.b = list;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C5874k.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideContentObserverCaptorConfig");
        C5874k c5874k = (C5874k) obj;
        return this.a == c5874k.a && Intrinsics.areEqual(this.b, c5874k.b) && this.c == c5874k.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "ClientSideContentObserverCaptorConfig(enabled=" + this.a + ", mediaStoreColumnNames=" + this.b + ", detectWindowSeconds=" + this.c + ')';
    }

    public C5874k(B b) {
        this(b.b(), b.c(), b.a());
    }
}
