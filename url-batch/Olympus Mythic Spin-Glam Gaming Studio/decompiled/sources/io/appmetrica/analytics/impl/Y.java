package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class Y implements ProtobufConverter {
    public final Pn a;

    public Y(@NonNull Pn pn) {
        this.a = pn;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5378h6 fromModel(@NonNull X x) {
        C5378h6 c5378h6 = new C5378h6();
        On on = x.a;
        if (on != null) {
            c5378h6.a = this.a.fromModel(on);
        }
        c5378h6.b = new C5612q6[x.b.size()];
        Iterator it = x.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            c5378h6.b[i] = this.a.fromModel((On) it.next());
            i++;
        }
        String str = x.c;
        if (str != null) {
            c5378h6.c = str;
        }
        return c5378h6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final X a(@NonNull C5378h6 c5378h6) {
        throw new UnsupportedOperationException();
    }
}
