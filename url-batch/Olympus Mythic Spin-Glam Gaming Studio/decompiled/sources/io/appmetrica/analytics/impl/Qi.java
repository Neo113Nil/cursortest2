package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class Qi implements InterfaceC5634r3 {

    @NonNull
    public final Object a;

    @NonNull
    public final InterfaceC5634r3 b;

    public Qi(@NonNull Object obj, @NonNull InterfaceC5634r3 interfaceC5634r3) {
        this.a = obj;
        this.b = interfaceC5634r3;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5634r3
    public final int getBytesTruncated() {
        return this.b.getBytesTruncated();
    }

    @NonNull
    public final String toString() {
        return "Result{result=" + this.a + ", metaInfo=" + this.b + '}';
    }
}
