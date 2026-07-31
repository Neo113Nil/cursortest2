package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class Xn implements ProtobufConverter {
    public final Sl a;

    public Xn() {
        this(new Sl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5637r6 fromModel(@NonNull Yn yn) {
        C5637r6 c5637r6 = new C5637r6();
        c5637r6.a = (String) WrapUtils.getOrDefault(yn.a, "");
        c5637r6.b = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(yn.b, ""));
        List<Ul> list = yn.c;
        if (list != null) {
            c5637r6.c = this.a.fromModel(list);
        }
        Yn yn2 = yn.d;
        if (yn2 != null) {
            c5637r6.d = fromModel(yn2);
        }
        List list2 = yn.e;
        int i = 0;
        if (list2 == null) {
            c5637r6.e = new C5637r6[0];
        } else {
            c5637r6.e = new C5637r6[list2.size()];
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                c5637r6.e[i] = fromModel((Yn) it.next());
                i++;
            }
        }
        return c5637r6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Xn(Sl sl) {
        this.a = sl;
    }

    @NonNull
    public final Yn a(@NonNull C5637r6 c5637r6) {
        throw new UnsupportedOperationException();
    }
}
