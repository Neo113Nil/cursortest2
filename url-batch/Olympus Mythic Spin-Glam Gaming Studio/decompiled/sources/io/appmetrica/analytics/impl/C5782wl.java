package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.wl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5782wl implements InterfaceC5717u8 {
    public final C5572oj a;
    public final C5233bg b;

    public C5782wl() {
        this(new C5572oj(), new C5233bg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Qi> fromModel(@NonNull C5756vl c5756vl) {
        N8 n8 = new N8();
        n8.a = 2;
        n8.c = new K8();
        Qi fromModel = this.a.fromModel(c5756vl.b);
        n8.c.b = (J8) fromModel.a;
        Qi fromModel2 = this.b.fromModel(c5756vl.a);
        n8.c.a = (G8) fromModel2.a;
        return Collections.singletonList(new Qi(n8, new C5609q3(C5609q3.b(fromModel, fromModel2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5782wl(C5572oj c5572oj, C5233bg c5233bg) {
        this.a = c5572oj;
        this.b = c5233bg;
    }

    @NonNull
    public final C5756vl a(@NonNull List<Qi> list) {
        throw new UnsupportedOperationException();
    }
}
