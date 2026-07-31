package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.ye, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5827ye implements Bg {
    public final String a;
    public final String b;

    public C5827ye(@Nullable String str) {
        this.a = str;
        this.b = str == null ? "<unknown-package-installer>" : str;
    }

    @Override // io.appmetrica.analytics.impl.Bg
    @NotNull
    public final String a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.Bg
    public final void a(@NotNull InterfaceC5803xg interfaceC5803xg) {
        interfaceC5803xg.a(new Cg("Package installer " + this.a + " is not supported", null, 2, null));
    }
}
