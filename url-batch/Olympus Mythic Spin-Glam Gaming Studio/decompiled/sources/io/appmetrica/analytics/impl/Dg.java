package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class Dg implements Eg {
    public final C5751vg a;

    public Dg(@NotNull C5751vg c5751vg) {
        this.a = c5751vg;
    }

    @Override // io.appmetrica.analytics.impl.Eg
    @NotNull
    public final C5751vg a() {
        return this.a;
    }

    @NotNull
    public final String toString() {
        return "Success(referrerInfo=" + this.a + ')';
    }
}
