package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.yl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5834yl implements InterfaceC5717u8 {
    public final C5233bg a;
    public final C5673sg b;

    public C5834yl() {
        this(new C5233bg(), new C5673sg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Qi> fromModel(@NonNull C5808xl c5808xl) {
        Qi qi;
        N8 n8 = new N8();
        n8.a = 3;
        n8.d = new L8();
        Qi fromModel = this.a.fromModel(c5808xl.a);
        n8.d.a = (G8) fromModel.a;
        Gg gg = c5808xl.b;
        if (gg != null) {
            qi = this.b.fromModel(gg);
            n8.d.b = (I8) qi.a;
        } else {
            qi = null;
        }
        return Collections.singletonList(new Qi(n8, new C5609q3(C5609q3.b(fromModel, qi))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5834yl(C5233bg c5233bg, C5673sg c5673sg) {
        this.a = c5233bg;
        this.b = c5673sg;
    }

    @NonNull
    public final C5808xl a(@NonNull List<Qi> list) {
        throw new UnsupportedOperationException();
    }
}
