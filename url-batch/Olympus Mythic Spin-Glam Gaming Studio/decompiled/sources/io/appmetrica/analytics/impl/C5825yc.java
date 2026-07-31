package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.yc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5825yc {
    public final Zg a;
    public final L9 b;
    public final F4 c;
    public final C5621qf d;
    public final C5274d5 e;
    public final Qc f = new Qc();
    public final Lazy g = LazyKt.lazy(new C5799xc(this));

    public C5825yc(@NotNull C5250c7 c5250c7, @NotNull Zg zg, @NotNull L9 l9, @NotNull F4 f4, @NotNull C5621qf c5621qf) {
        this.a = zg;
        this.b = l9;
        this.c = f4;
        this.d = c5621qf;
        this.e = new C5274d5(c5250c7, zg);
    }

    @NotNull
    public final List<Z8> a() {
        return this.e.a();
    }

    @NotNull
    public final List<Z8> b() {
        return CollectionsKt.plus((Collection) CollectionsKt.listOf(this.e.c), (Iterable) CollectionsKt.listOf((Z8) this.g.getValue()));
    }
}
