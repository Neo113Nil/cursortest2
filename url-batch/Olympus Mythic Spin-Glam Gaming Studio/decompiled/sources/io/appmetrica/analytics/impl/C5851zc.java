package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.zc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5851zc implements L9 {
    public final A5 a;

    public C5851zc(@NotNull P9 p9, @NotNull C5250c7 c5250c7, @NotNull Zg zg, @NotNull F4 f4, @NotNull C5351g5 c5351g5, @NotNull C5621qf c5621qf) {
        C5825yc c5825yc = new C5825yc(c5250c7, zg, this, f4, c5621qf);
        this.a = new A5(p9, c5825yc.a(), c5825yc.b(), c5351g5);
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
