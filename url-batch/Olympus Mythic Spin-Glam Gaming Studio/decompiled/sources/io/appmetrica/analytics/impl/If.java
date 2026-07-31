package io.appmetrica.analytics.impl;

import androidx.annotation.VisibleForTesting;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes11.dex */
public final class If implements InterfaceC5416ij {
    public final C5698tf a;

    @VisibleForTesting
    public If(@NotNull C5698tf c5698tf) {
        this.a = c5698tf;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5416ij
    public final boolean a() {
        return this.a.i();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5416ij
    public final void b() {
        this.a.h();
    }

    public If() {
        this(Ka.k().y());
    }
}
