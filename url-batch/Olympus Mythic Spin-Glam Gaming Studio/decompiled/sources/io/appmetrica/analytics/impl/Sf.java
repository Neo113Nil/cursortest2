package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.List;

/* loaded from: classes9.dex */
public final class Sf implements Converter {
    public final C5191a0 a;
    public final Tf b;

    public Sf() {
        this(new C5191a0(), new Tf(30));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(@NonNull Uf uf) {
        int i;
        F8 f8 = new F8();
        Qi fromModel = this.a.fromModel(uf.a);
        f8.a = (C5743v8) fromModel.a;
        C5318eo a = this.b.a(uf.b);
        if (Do.a((Collection) a.a)) {
            i = 0;
        } else {
            f8.b = new C5743v8[((List) a.a).size()];
            i = 0;
            for (int i2 = 0; i2 < ((List) a.a).size(); i2++) {
                Qi fromModel2 = this.a.fromModel((C5217b0) ((List) a.a).get(i2));
                f8.b[i2] = (C5743v8) fromModel2.a;
                i += fromModel2.b.getBytesTruncated();
            }
        }
        return new Qi(f8, new C5609q3(C5609q3.b(fromModel, a, new C5609q3(i))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Sf(C5191a0 c5191a0, Tf tf) {
        this.a = c5191a0;
        this.b = tf;
    }

    @NonNull
    public final Uf a(@NonNull Qi qi) {
        throw new UnsupportedOperationException();
    }
}
