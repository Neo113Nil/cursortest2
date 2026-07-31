package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.a0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5191a0 implements Converter {
    public final N7 a;
    public final Sa b;

    public C5191a0() {
        this(new N7(), new Sa(20));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(@NonNull C5217b0 c5217b0) {
        C5743v8 c5743v8 = new C5743v8();
        c5743v8.b = this.a.fromModel(c5217b0.a);
        C5318eo a = this.b.a(c5217b0.b);
        c5743v8.a = StringUtils.getUTF8Bytes((String) a.a);
        return new Qi(c5743v8, new C5609q3(C5609q3.b(a)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5191a0(N7 n7, Sa sa) {
        this.a = n7;
        this.b = sa;
    }

    @NonNull
    public final C5217b0 a(@NonNull Qi qi) {
        throw new UnsupportedOperationException();
    }
}
