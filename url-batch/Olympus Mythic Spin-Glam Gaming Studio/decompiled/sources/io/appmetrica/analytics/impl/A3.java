package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes6.dex */
public final class A3 implements Converter {
    public final C5233bg a;
    public final N7 b;
    public final Sf c;
    public final C5673sg d;

    public A3() {
        this(new C5233bg(), new N7(), new Sf(), new C5673sg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(@NonNull B3 b3) {
        Qi qi;
        C5795x8 c5795x8 = new C5795x8();
        Qi fromModel = this.a.fromModel(b3.a);
        c5795x8.a = (G8) fromModel.a;
        c5795x8.c = this.b.fromModel(b3.b);
        Qi fromModel2 = this.c.fromModel(b3.c);
        c5795x8.d = (F8) fromModel2.a;
        Gg gg = b3.d;
        if (gg != null) {
            qi = this.d.fromModel(gg);
            c5795x8.b = (I8) qi.a;
        } else {
            qi = null;
        }
        return new Qi(c5795x8, new C5609q3(C5609q3.b(fromModel, fromModel2, qi)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public A3(C5233bg c5233bg, N7 n7, Sf sf, C5673sg c5673sg) {
        this.a = c5233bg;
        this.b = n7;
        this.c = sf;
        this.d = c5673sg;
    }

    @NonNull
    public final B3 a(@NonNull Qi qi) {
        throw new UnsupportedOperationException();
    }
}
