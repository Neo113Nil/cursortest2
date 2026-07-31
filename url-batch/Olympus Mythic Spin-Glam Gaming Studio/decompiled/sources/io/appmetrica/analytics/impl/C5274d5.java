package io.appmetrica.analytics.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.d5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5274d5 {
    public final N5 a;
    public final Zc b;
    public final Zc c;

    public C5274d5(@NotNull C5250c7 c5250c7, @NotNull Zg zg) {
        Oe oe = new Oe(c5250c7);
        this.a = new N5(c5250c7);
        this.b = new Zc(oe, new C5248c5(zg));
        this.c = new Zc(oe, C5222b5.a);
    }

    @NotNull
    public final List<Z8> a() {
        return CollectionsKt.listOf((Object[]) new Z8[]{this.a, this.b});
    }

    @NotNull
    public final List<Z8> b() {
        return CollectionsKt.listOf(this.c);
    }
}
