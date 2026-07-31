package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes10.dex */
public final class N6 implements ProtobufConverter {
    public final Ng a;

    public N6() {
        this(new Ng());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5533n6 fromModel(@NonNull M6 m6) {
        C5533n6 fromModel = this.a.fromModel(m6.a);
        fromModel.g = 1;
        C5507m6 c5507m6 = new C5507m6();
        fromModel.h = c5507m6;
        c5507m6.a = StringUtils.correctIllFormedString(m6.b);
        return fromModel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public N6(Ng ng) {
        this.a = ng;
    }

    @NonNull
    public final M6 a(@NonNull C5533n6 c5533n6) {
        throw new UnsupportedOperationException();
    }
}
