package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class S2 {
    public final AbstractC5207ag a;
    public final InterfaceC5280db b;

    public S2(AbstractC5207ag abstractC5207ag, InterfaceC5280db interfaceC5280db) {
        this.a = abstractC5207ag;
        this.b = interfaceC5280db;
    }

    public final boolean a(@NonNull C5326f6 c5326f6, @NonNull R2 r2) {
        Iterator it = ((C5588p9) this.a.a(c5326f6.d)).a.iterator();
        while (it.hasNext()) {
            if (r2.a(it.next(), c5326f6)) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    public final AbstractC5207ag b() {
        return this.a;
    }

    public final InterfaceC5280db a() {
        return this.b;
    }
}
