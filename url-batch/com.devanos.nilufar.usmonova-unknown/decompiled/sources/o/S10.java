package o;

import com.devanos.nilufar.usmonova.R;

/* loaded from: classes.dex */
public final class S10 implements InterfaceC1773qd, InterfaceC0288Kz {
    public final S2 h;
    public final C2036ud i;
    public boolean j;
    public AbstractC0106Dz k;
    public InterfaceC2312yp l = AbstractC0852cd.a;

    public S10(S2 s2, C2036ud c2036ud) {
        this.h = s2;
        this.i = c2036ud;
    }

    public final void a() {
        if (!this.j) {
            this.j = true;
            this.h.getView().setTag(R.id.wrapped_composition_tag, null);
            AbstractC0106Dz abstractC0106Dz = this.k;
            if (abstractC0106Dz != null) {
                abstractC0106Dz.b(this);
            }
        }
        C2036ud c2036ud = this.i;
        synchronized (c2036ud.k) {
            try {
                if (c2036ud.x.C) {
                    AbstractC1052fg.T("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                    throw null;
                }
                if (!c2036ud.y) {
                    c2036ud.y = true;
                    C0721ad c0721ad = AbstractC0787bd.b;
                    boolean z = c2036ud.m.i > 0;
                    if (!z) {
                        if (!c2036ud.l.h.g()) {
                        }
                        c2036ud.x.k();
                    }
                    C1970td c1970td = new C1970td(c2036ud.l);
                    if (z) {
                        C0972eS l = c2036ud.m.l();
                        try {
                            EB.S(l, c1970td);
                            l.e(true);
                            c2036ud.i.m();
                            c2036ud.i.H();
                            c1970td.e();
                        } catch (Throwable th) {
                            l.e(false);
                            throw th;
                        }
                    }
                    c1970td.d();
                    c2036ud.x.k();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C0901dM c0901dM = (C0901dM) c2036ud.h;
        synchronized (c0901dM.b) {
            c0901dM.e.remove(c2036ud);
            c0901dM.f = null;
            c0901dM.h.m(c2036ud);
            c0901dM.i.remove(c2036ud);
        }
    }

    public final void d(InterfaceC2312yp interfaceC2312yp) {
        this.h.setOnViewTreeOwnersAvailable(new C0810c0(this, 18, interfaceC2312yp));
    }

    @Override // o.InterfaceC0288Kz
    public final void j(InterfaceC0365Nz interfaceC0365Nz, EnumC0054Bz enumC0054Bz) {
        if (enumC0054Bz == EnumC0054Bz.ON_DESTROY) {
            a();
        } else {
            if (enumC0054Bz != EnumC0054Bz.ON_CREATE || this.j) {
                return;
            }
            d(this.l);
        }
    }
}
