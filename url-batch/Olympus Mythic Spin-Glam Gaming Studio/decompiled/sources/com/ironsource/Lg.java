package com.ironsource;

import com.ironsource.H;
import com.ironsource.ch;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes11.dex */
public final class Lg implements G, Vg {

    @NotNull
    private final V0 a;

    @NotNull
    private final AbstractC4961x0 b;

    @NotNull
    private final Tg c;

    @Nullable
    private final InterfaceC4974xd d;

    @Nullable
    private final F e;

    @NotNull
    private final ch f;

    @NotNull
    private final Og g;

    @Nullable
    private H h;

    @Nullable
    private Wg i;

    @NotNull
    private final List<B> j;

    @Nullable
    private B k;
    private boolean l;
    private boolean m;
    private int n;

    public Lg(@NotNull V0 adTools, @NotNull AbstractC4961x0 adUnitData, boolean z, @NotNull Tg listener, @Nullable InterfaceC4974xd interfaceC4974xd, @Nullable F f) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a = adTools;
        this.b = adUnitData;
        this.c = listener;
        this.d = interfaceC4974xd;
        this.e = f;
        this.f = ch.a.a.a(z, this);
        this.g = Og.d.a(adTools, adUnitData);
        this.j = new ArrayList();
    }

    private final void c(B b) {
        if (this.l || i()) {
            if (!b.A()) {
                b.c();
                return;
            }
            InterfaceC4974xd interfaceC4974xd = this.d;
            if (interfaceC4974xd != null) {
                interfaceC4974xd.a(this.b.b().c(), false);
                return;
            }
            return;
        }
        F f = this.e;
        if (f != null) {
            b.a(f);
        }
        Wg wg = this.i;
        if (wg != null) {
            wg.a(b);
        }
        this.j.add(b);
        if (this.j.size() == 1) {
            Wg wg2 = this.i;
            if (wg2 != null) {
                wg2.b(b);
            }
            this.c.b(b);
            return;
        }
        H h = this.h;
        if (h == null || !h.a(b)) {
            return;
        }
        this.c.a(b);
    }

    private final List<B> f() {
        H.c c;
        List<B> d;
        H h = this.h;
        return (h == null || (c = h.c()) == null || (d = c.d()) == null) ? CollectionsKt.emptyList() : d;
    }

    private final boolean i() {
        return this.k != null;
    }

    private final void j() {
        H h = this.h;
        H.b d = h != null ? h.d() : null;
        if (d == null || d.e()) {
            this.c.a(509, "Mediation No fill");
            return;
        }
        if (d.f()) {
            Wg wg = this.i;
            if (wg != null) {
                wg.a();
                return;
            }
            return;
        }
        for (B b : d.a()) {
            this.n++;
            if (b.A()) {
                this.m = false;
                b(b);
            } else {
                b.a(this);
            }
        }
    }

    public final void d() {
        this.l = true;
        B b = this.k;
        if (b != null) {
            b.b();
        }
    }

    @Nullable
    public final B e() {
        H.c c;
        H h = this.h;
        if (h == null || (c = h.c()) == null) {
            return null;
        }
        return c.c();
    }

    @NotNull
    public final Od g() {
        return this.f.b();
    }

    public final boolean h() {
        Iterator<B> it = this.j.iterator();
        while (it.hasNext()) {
            if (it.next().B()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ironsource.G
    public void b(@NotNull B instance) {
        InterfaceC4974xd interfaceC4974xd;
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.n--;
        c(instance);
        if (this.n > 0 || !this.m || (interfaceC4974xd = this.d) == null) {
            return;
        }
        interfaceC4974xd.a(this.b.b().c(), false);
    }

    public final void d(@NotNull B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Wg wg = this.i;
        if (wg != null) {
            wg.a(instance, this.b.l(), this.b.o());
        }
    }

    public final void a(@NotNull E adInstanceFactory) {
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        this.g.a(adInstanceFactory, new a());
    }

    @Override // com.ironsource.Vg
    public boolean b() {
        return !this.j.isEmpty();
    }

    public final void a(@NotNull K adInstancePresenter, boolean z) {
        Wg wg;
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        B c = this.f.c();
        if (c != null) {
            this.f.a(c);
            if (!z && (wg = this.i) != null) {
                wg.a(c, f());
            }
            c.a(adInstancePresenter);
        }
    }

    @Override // com.ironsource.G
    public void a(@NotNull IronSourceError error, @NotNull B instance) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.n--;
        if (this.l) {
            return;
        }
        j();
    }

    public /* synthetic */ Lg(V0 v0, AbstractC4961x0 abstractC4961x0, boolean z, Tg tg, InterfaceC4974xd interfaceC4974xd, F f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(v0, abstractC4961x0, z, tg, (i & 16) != 0 ? null : interfaceC4974xd, (i & 32) != 0 ? null : f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Qg qg) {
        H a2 = H.c.a(this.b, qg);
        this.h = a2;
        this.i = Wg.c.a(this.a, this.b, this.g.a(), qg, a2);
        j();
    }

    public final void c() {
        this.f.a();
    }

    @Override // com.ironsource.Vg
    public void a(@NotNull B instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.k = instance;
        this.j.remove(instance);
    }

    @Override // com.ironsource.Vg
    public void a() {
        IronLog.INTERNAL.verbose(C4814p0.a(this.a, "destroyReadyToShowInstances", (String) null, 2, (Object) null));
        if (this.j.isEmpty()) {
            return;
        }
        String c = this.b.b().c();
        for (B b : this.j) {
            if (b.A()) {
                InterfaceC4974xd interfaceC4974xd = this.d;
                if (interfaceC4974xd != null) {
                    interfaceC4974xd.a(c, false);
                }
            } else {
                b.c();
            }
        }
        this.j.clear();
        this.a.f().h().a();
    }

    @Override // com.ironsource.Vg
    @Nullable
    public B a(int i) {
        List<B> f = f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : f) {
            if (((B) obj).x()) {
                arrayList.add(obj);
            }
        }
        return (B) CollectionsKt.getOrNull(arrayList, i);
    }

    public static final class a implements Pg {
        a() {
        }

        @Override // com.ironsource.Pg
        public void a(@NotNull Qg waterfallInstances) {
            boolean z;
            Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
            if (Lg.this.l) {
                return;
            }
            Lg lg = Lg.this;
            List<B> b = waterfallInstances.b();
            if (!(b instanceof Collection) || !b.isEmpty()) {
                Iterator<T> it = b.iterator();
                while (it.hasNext()) {
                    if (((B) it.next()).A()) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            lg.m = z;
            Lg.this.a(waterfallInstances);
        }

        @Override // com.ironsource.Pg
        public void a(int i, @NotNull String errorReason) {
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            if (Lg.this.l) {
                return;
            }
            Lg.this.c.a(i, errorReason);
        }
    }
}
