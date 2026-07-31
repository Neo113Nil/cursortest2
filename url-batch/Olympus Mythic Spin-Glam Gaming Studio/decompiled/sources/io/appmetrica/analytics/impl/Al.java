package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class Al implements InterfaceC5717u8 {
    public final C5572oj a;

    public Al() {
        this(new C5572oj());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Qi> fromModel(@NonNull C5860zl c5860zl) {
        N8 n8 = new N8();
        n8.a = 1;
        n8.b = new M8();
        Qi fromModel = this.a.fromModel(c5860zl.a);
        n8.b.a = (J8) fromModel.a;
        C5609q3 c5609q3 = new C5609q3(C5609q3.b(fromModel));
        fromModel.b.getBytesTruncated();
        return Collections.singletonList(new Qi(n8, c5609q3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Al(C5572oj c5572oj) {
        this.a = c5572oj;
    }

    @NonNull
    public final C5860zl a(@NonNull List<Qi> list) {
        throw new UnsupportedOperationException();
    }
}
