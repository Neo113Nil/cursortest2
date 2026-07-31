package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.fj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5339fj implements Bg {
    public final Bg a;

    public C5339fj(@NotNull Bg bg) {
        this.a = bg;
    }

    @Override // io.appmetrica.analytics.impl.Bg
    @NotNull
    public final String a() {
        return this.a.a();
    }

    @Override // io.appmetrica.analytics.impl.Bg
    public final void a(@NotNull InterfaceC5803xg interfaceC5803xg) {
        try {
            this.a.a(interfaceC5803xg);
        } catch (Throwable th) {
            String str = "Failed to request " + this.a.a() + " referrer";
            C5340fk c5340fk = Dj.a;
            c5340fk.getClass();
            c5340fk.a(new Ej(str, th));
            interfaceC5803xg.a(new Cg(str, th));
        }
    }
}
