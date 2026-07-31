package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.f0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5320f0 implements ProtobufConverter {
    public final Y a;
    public final C5793x6 b;

    public C5320f0() {
        this(new Y(new Pn()), new C5793x6());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5404i6 fromModel(@NonNull C5294e0 c5294e0) {
        C5404i6 c5404i6 = new C5404i6();
        c5404i6.a = this.a.fromModel(c5294e0.a);
        String str = c5294e0.b;
        if (str != null) {
            c5404i6.b = str;
        }
        c5404i6.c = this.b.a(c5294e0.c);
        return c5404i6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5320f0(Y y, C5793x6 c5793x6) {
        this.a = y;
        this.b = c5793x6;
    }

    @NonNull
    public final C5294e0 a(@NonNull C5404i6 c5404i6) {
        throw new UnsupportedOperationException();
    }
}
