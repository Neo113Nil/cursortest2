package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public final class Kg implements InterfaceC5394hm, InterfaceC5331fb {
    public final Context a;
    public final C5351g5 b;
    public final C5377h5 c;
    public final Rm d;
    public final InterfaceC5460kb e;

    public Kg(@NotNull Context context, @NotNull C5351g5 c5351g5, @NotNull G4 g4, @NotNull InterfaceC5558o5 interfaceC5558o5, @NotNull C5377h5 c5377h5, @NotNull Yl yl) {
        this.a = context;
        this.b = c5351g5;
        this.c = c5377h5;
        Rm a = yl.a(context, c5351g5, g4.a);
        this.d = a;
        this.e = interfaceC5558o5.a(context, c5351g5, g4.b, a);
        yl.a(c5351g5, this);
    }

    @VisibleForTesting
    @NotNull
    public final C5351g5 a() {
        return this.b;
    }

    @VisibleForTesting
    @NotNull
    public final Context b() {
        return this.a;
    }

    public final void a(@NotNull InterfaceC5765w4 interfaceC5765w4) {
        this.c.a.add(interfaceC5765w4);
    }

    public final void b(@NotNull InterfaceC5765w4 interfaceC5765w4) {
        this.c.a.remove(interfaceC5765w4);
        if (this.c.a.isEmpty()) {
            ((InterfaceC5280db) this.e).c();
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5394hm
    public final void a(@NotNull C5783wm c5783wm) {
        ((C5532n5) this.e).a(c5783wm);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5394hm
    public final void a(@NotNull EnumC5213am enumC5213am, @Nullable C5783wm c5783wm) {
        ((C5532n5) this.e).getClass();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5331fb
    public final void a(@NotNull G4 g4) {
        this.d.a(g4.a);
        this.e.a(g4.b);
    }

    public final void a(@NotNull C5326f6 c5326f6, @NotNull G4 g4) {
        if (!Q9.c.contains(EnumC5798xb.a(c5326f6.d))) {
            this.e.a(g4.b);
        }
        ((C5532n5) this.e).a(c5326f6);
    }

    public Kg(@NotNull Context context, @NotNull C5351g5 c5351g5, @NotNull G4 g4, @NotNull InterfaceC5558o5 interfaceC5558o5) {
        this(context, c5351g5, g4, interfaceC5558o5, new C5377h5(), Yl.a());
    }
}
