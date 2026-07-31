package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* loaded from: classes6.dex */
public final class C3 implements Converter {
    public final Ra a;

    public C3() {
        this(new Ra(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(@NonNull List<String> list) {
        C5318eo a = this.a.a((List<Object>) list);
        C5821y8 c5821y8 = new C5821y8();
        c5821y8.a = StringUtils.getUTF8Bytes((List<String>) a.a);
        InterfaceC5634r3 interfaceC5634r3 = a.b;
        int i = ((E4) interfaceC5634r3).a;
        return new Qi(c5821y8, interfaceC5634r3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C3(@NonNull Ra ra) {
        this.a = ra;
    }

    @NonNull
    public final List<String> a(@NonNull Qi qi) {
        throw new UnsupportedOperationException();
    }
}
