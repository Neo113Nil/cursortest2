package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Pn implements ProtobufConverter {
    public final Sl a;

    public Pn() {
        this(new Sl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5612q6 fromModel(@NonNull On on) {
        C5612q6 c5612q6 = new C5612q6();
        Integer num = on.e;
        c5612q6.e = num == null ? -1 : num.intValue();
        c5612q6.d = on.d;
        c5612q6.b = on.b;
        c5612q6.a = on.a;
        c5612q6.c = on.c;
        Sl sl = this.a;
        List list = on.f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Ul((StackTraceElement) it.next()));
        }
        c5612q6.f = sl.fromModel(arrayList);
        return c5612q6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Pn(Sl sl) {
        this.a = sl;
    }

    @NonNull
    public final On a(@NonNull C5612q6 c5612q6) {
        throw new UnsupportedOperationException();
    }
}
