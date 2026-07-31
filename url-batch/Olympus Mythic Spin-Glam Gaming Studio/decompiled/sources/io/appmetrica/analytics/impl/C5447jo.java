package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.jo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5447jo implements ProtobufConverter {
    public final Xn a;
    public final Y b;
    public final C5793x6 c;
    public final Sl d;
    public final C5258cf e;
    public final C5284df f;

    public C5447jo() {
        this(new Xn(), new Y(new Pn()), new C5793x6(), new Sl(), new C5258cf(), new C5284df());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5481l6 fromModel(@NonNull C5421io c5421io) {
        C5481l6 c5481l6 = new C5481l6();
        Yn yn = c5421io.a;
        if (yn != null) {
            c5481l6.a = this.a.fromModel(yn);
        }
        X x = c5421io.b;
        if (x != null) {
            c5481l6.b = this.b.fromModel(x);
        }
        List<Ul> list = c5421io.c;
        if (list != null) {
            c5481l6.e = this.d.fromModel(list);
        }
        String str = c5421io.g;
        if (str != null) {
            c5481l6.c = str;
        }
        c5481l6.d = this.c.a(c5421io.h);
        if (!StringUtils.isNullOrEmpty(c5421io.d)) {
            c5481l6.h = this.e.fromModel(c5421io.d);
        }
        if (!StringUtils.isNullOrEmpty(c5421io.e)) {
            c5481l6.i = c5421io.e.getBytes();
        }
        if (!Do.a(c5421io.f)) {
            c5481l6.j = this.f.fromModel(c5421io.f);
        }
        return c5481l6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5447jo(Xn xn, Y y, C5793x6 c5793x6, Sl sl, C5258cf c5258cf, C5284df c5284df) {
        this.b = y;
        this.a = xn;
        this.c = c5793x6;
        this.d = sl;
        this.e = c5258cf;
        this.f = c5284df;
    }

    @NonNull
    public final C5421io a(@NonNull C5481l6 c5481l6) {
        throw new UnsupportedOperationException();
    }
}
