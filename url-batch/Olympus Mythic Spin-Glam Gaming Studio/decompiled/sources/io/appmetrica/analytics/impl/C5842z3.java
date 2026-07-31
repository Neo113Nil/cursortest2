package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.z3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5842z3 implements InterfaceC5717u8 {
    public final A3 a;

    public C5842z3() {
        this(new A3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Qi> fromModel(@NonNull C5816y3 c5816y3) {
        N8 n8 = new N8();
        n8.e = new C5769w8();
        Qi fromModel = this.a.fromModel(c5816y3.b);
        n8.e.a = (C5795x8) fromModel.a;
        n8.a = c5816y3.a;
        return Collections.singletonList(new Qi(n8, new C5609q3(C5609q3.b(fromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5842z3(A3 a3) {
        this.a = a3;
    }

    @NonNull
    public final C5816y3 a(@NonNull List<Qi> list) {
        throw new UnsupportedOperationException();
    }
}
