package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.oj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5572oj implements Converter {
    public final Ne a;
    public final C3 b;
    public final Sa c;
    public final Sa d;

    public C5572oj() {
        this(new Ne(), new C3(), new Sa(100), new Sa(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(@NonNull C5676sj c5676sj) {
        Qi qi;
        J8 j8 = new J8();
        C5318eo a = this.c.a(c5676sj.a);
        j8.a = StringUtils.getUTF8Bytes((String) a.a);
        List<String> list = c5676sj.b;
        Qi qi2 = null;
        if (list != null) {
            qi = this.b.fromModel(list);
            j8.b = (C5821y8) qi.a;
        } else {
            qi = null;
        }
        C5318eo a2 = this.d.a(c5676sj.c);
        j8.c = StringUtils.getUTF8Bytes((String) a2.a);
        Map<String, String> map = c5676sj.d;
        if (map != null) {
            qi2 = this.a.fromModel(map);
            j8.d = (E8) qi2.a;
        }
        return new Qi(j8, new C5609q3(C5609q3.b(a, qi, a2, qi2)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5572oj(Ne ne, C3 c3, Sa sa, Sa sa2) {
        this.a = ne;
        this.b = c3;
        this.c = sa;
        this.d = sa2;
    }

    @NonNull
    public final C5676sj a(@NonNull Qi qi) {
        throw new UnsupportedOperationException();
    }
}
