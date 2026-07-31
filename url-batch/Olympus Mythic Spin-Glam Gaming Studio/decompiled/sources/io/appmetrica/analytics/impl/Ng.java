package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.List;

/* loaded from: classes8.dex */
public final class Ng implements ProtobufConverter {
    public final Xn a;
    public final Y b;
    public final C5793x6 c;
    public final Sl d;
    public final C5258cf e;
    public final C5284df f;

    public Ng() {
        this(new Xn(), new Y(new Pn()), new C5793x6(), new Sl(), new C5258cf(), new C5284df());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5533n6 fromModel(@NonNull Mg mg) {
        C5533n6 c5533n6 = new C5533n6();
        c5533n6.f = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(mg.a, c5533n6.f));
        C5421io c5421io = mg.b;
        if (c5421io != null) {
            Yn yn = c5421io.a;
            if (yn != null) {
                c5533n6.a = this.a.fromModel(yn);
            }
            X x = c5421io.b;
            if (x != null) {
                c5533n6.b = this.b.fromModel(x);
            }
            List<Ul> list = c5421io.c;
            if (list != null) {
                c5533n6.e = this.d.fromModel(list);
            }
            c5533n6.c = (String) WrapUtils.getOrDefault(c5421io.g, c5533n6.c);
            c5533n6.d = this.c.a(c5421io.h);
            if (!TextUtils.isEmpty(c5421io.d)) {
                c5533n6.i = this.e.fromModel(c5421io.d);
            }
            if (!TextUtils.isEmpty(c5421io.e)) {
                c5533n6.j = c5421io.e.getBytes();
            }
            if (!Do.a(c5421io.f)) {
                c5533n6.k = this.f.fromModel(c5421io.f);
            }
        }
        return c5533n6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Ng(Xn xn, Y y, C5793x6 c5793x6, Sl sl, C5258cf c5258cf, C5284df c5284df) {
        this.a = xn;
        this.b = y;
        this.c = c5793x6;
        this.d = sl;
        this.e = c5258cf;
        this.f = c5284df;
    }

    @NonNull
    public final Mg a(@NonNull C5533n6 c5533n6) {
        throw new UnsupportedOperationException();
    }
}
