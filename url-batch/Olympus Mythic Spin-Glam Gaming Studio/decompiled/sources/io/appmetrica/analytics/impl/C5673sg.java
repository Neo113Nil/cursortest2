package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.sg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5673sg implements Converter {
    public final C5572oj a;
    public final Sa b;
    public final Sa c;

    public C5673sg() {
        this(new C5572oj(), new Sa(100), new Sa(2048));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(@NonNull Gg gg) {
        Qi qi;
        I8 i8 = new I8();
        C5318eo a = this.b.a(gg.a);
        i8.a = StringUtils.getUTF8Bytes((String) a.a);
        C5318eo a2 = this.c.a(gg.b);
        i8.b = StringUtils.getUTF8Bytes((String) a2.a);
        C5676sj c5676sj = gg.c;
        if (c5676sj != null) {
            qi = this.a.fromModel(c5676sj);
            i8.c = (J8) qi.a;
        } else {
            qi = null;
        }
        return new Qi(i8, new C5609q3(C5609q3.b(a, a2, qi)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5673sg(C5572oj c5572oj, Sa sa, Sa sa2) {
        this.a = c5572oj;
        this.b = sa;
        this.c = sa2;
    }

    @NonNull
    public final Gg a(@NonNull Qi qi) {
        throw new UnsupportedOperationException();
    }
}
