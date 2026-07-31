package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes.dex */
public final class Ql extends Oa {
    public final AbstractC5208ah b;

    public Ql(Ei ei, AbstractC5208ah abstractC5208ah) {
        super(ei);
        this.b = abstractC5208ah;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void a(@NonNull List<AbstractC5208ah> list) {
        list.add(this.b);
    }
}
