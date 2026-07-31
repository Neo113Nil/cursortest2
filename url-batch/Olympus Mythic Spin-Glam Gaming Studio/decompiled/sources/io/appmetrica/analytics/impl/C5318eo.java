package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.eo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5318eo implements InterfaceC5634r3 {

    @Nullable
    public final Object a;

    @NonNull
    public final InterfaceC5634r3 b;

    public C5318eo(@Nullable Object obj, @NonNull InterfaceC5634r3 interfaceC5634r3) {
        this.a = obj;
        this.b = interfaceC5634r3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5634r3
    public final int getBytesTruncated() {
        return this.b.getBytesTruncated();
    }

    @NonNull
    public final String toString() {
        return "TrimmingResult{value=" + this.a + ", metaInfo=" + this.b + '}';
    }
}
