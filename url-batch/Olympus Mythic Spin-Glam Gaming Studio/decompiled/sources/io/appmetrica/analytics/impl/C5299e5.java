package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.e5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5299e5 implements L9 {
    public final A5 a;

    public C5299e5(@NotNull P9 p9, @NotNull C5250c7 c5250c7, @NotNull Zg zg, @NotNull C5351g5 c5351g5) {
        C5274d5 c5274d5 = new C5274d5(c5250c7, zg);
        this.a = new A5(p9, c5274d5.a(), c5274d5.b(), c5351g5);
    }

    @Override // io.appmetrica.analytics.impl.L9
    public final K9 a() {
        return this.a;
    }

    @NotNull
    public final A5 b() {
        return this.a;
    }
}
