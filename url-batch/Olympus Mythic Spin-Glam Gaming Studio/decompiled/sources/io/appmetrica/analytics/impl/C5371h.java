package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5371h extends Oa {
    public final C5351g5 b;

    public C5371h(Ei ei, C5351g5 c5351g5) {
        super(ei);
        this.b = c5351g5;
    }

    @Override // io.appmetrica.analytics.impl.Oa
    public final void a(@NonNull List<AbstractC5208ah> list) {
        list.add(this.a.p);
        list.add(this.a.o);
        list.add(this.a.r);
        list.add(this.a.g);
        if (this.b.d()) {
            list.add(this.a.q);
        }
    }
}
