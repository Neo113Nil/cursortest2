package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class V implements Converter {
    public final C5870g a;
    public final Z b;
    public final r c;

    public V() {
        this(null, null, null, 7, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N fromModel(@NotNull T t) {
        N n = new N();
        C5868e c5868e = t.a;
        n.a = c5868e != null ? this.a.fromModel(c5868e) : null;
        X x = t.b;
        n.b = x != null ? this.b.fromModel(x) : null;
        C5879p c5879p = t.c;
        n.c = c5879p != null ? this.c.fromModel(c5879p) : null;
        return n;
    }

    public V(@NotNull C5870g c5870g, @NotNull Z z, @NotNull r rVar) {
        this.a = c5870g;
        this.b = z;
        this.c = rVar;
    }

    public /* synthetic */ V(C5870g c5870g, Z z, r rVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C5870g() : c5870g, (i & 2) != 0 ? new Z() : z, (i & 4) != 0 ? new r() : rVar);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T toModel(@NotNull N n) {
        C5868e c5868e;
        X x;
        K k = n.a;
        if (k != null) {
            this.a.getClass();
            c5868e = new C5868e(k.a);
        } else {
            c5868e = null;
        }
        M m = n.b;
        if (m != null) {
            this.b.getClass();
            x = new X(m.a, m.b);
        } else {
            x = null;
        }
        L l = n.c;
        return new T(c5868e, x, l != null ? this.c.toModel(l) : null);
    }
}
