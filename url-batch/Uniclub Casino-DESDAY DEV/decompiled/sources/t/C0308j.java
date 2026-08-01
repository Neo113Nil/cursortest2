package t;

import java.util.Iterator;
import s.C0293a;
import s.C0296d;

/* renamed from: t.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0308j extends AbstractC0313o {
    @Override // t.InterfaceC0302d
    public final void a(InterfaceC0302d interfaceC0302d) {
        C0293a c0293a = (C0293a) this.f3802b;
        int i = c0293a.f3597s0;
        C0304f c0304f = this.h;
        Iterator it = c0304f.f3788l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C0304f) it.next()).f3785g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c0304f.d(i3 + c0293a.f3599u0);
        } else {
            c0304f.d(i2 + c0293a.f3599u0);
        }
    }

    @Override // t.AbstractC0313o
    public final void d() {
        C0296d c0296d = this.f3802b;
        if (c0296d instanceof C0293a) {
            C0304f c0304f = this.h;
            c0304f.f3781b = true;
            C0293a c0293a = (C0293a) c0296d;
            int i = c0293a.f3597s0;
            boolean z2 = c0293a.f3598t0;
            int i2 = 0;
            if (i == 0) {
                c0304f.f3783e = 4;
                while (i2 < c0293a.f3759r0) {
                    C0296d c0296d2 = c0293a.f3758q0[i2];
                    if (z2 || c0296d2.f3658g0 != 8) {
                        C0304f c0304f2 = c0296d2.d.h;
                        c0304f2.f3787k.add(c0304f);
                        c0304f.f3788l.add(c0304f2);
                    }
                    i2++;
                }
                m(this.f3802b.d.h);
                m(this.f3802b.d.i);
                return;
            }
            if (i == 1) {
                c0304f.f3783e = 5;
                while (i2 < c0293a.f3759r0) {
                    C0296d c0296d3 = c0293a.f3758q0[i2];
                    if (z2 || c0296d3.f3658g0 != 8) {
                        C0304f c0304f3 = c0296d3.d.i;
                        c0304f3.f3787k.add(c0304f);
                        c0304f.f3788l.add(c0304f3);
                    }
                    i2++;
                }
                m(this.f3802b.d.h);
                m(this.f3802b.d.i);
                return;
            }
            if (i == 2) {
                c0304f.f3783e = 6;
                while (i2 < c0293a.f3759r0) {
                    C0296d c0296d4 = c0293a.f3758q0[i2];
                    if (z2 || c0296d4.f3658g0 != 8) {
                        C0304f c0304f4 = c0296d4.f3653e.h;
                        c0304f4.f3787k.add(c0304f);
                        c0304f.f3788l.add(c0304f4);
                    }
                    i2++;
                }
                m(this.f3802b.f3653e.h);
                m(this.f3802b.f3653e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            c0304f.f3783e = 7;
            while (i2 < c0293a.f3759r0) {
                C0296d c0296d5 = c0293a.f3758q0[i2];
                if (z2 || c0296d5.f3658g0 != 8) {
                    C0304f c0304f5 = c0296d5.f3653e.i;
                    c0304f5.f3787k.add(c0304f);
                    c0304f.f3788l.add(c0304f5);
                }
                i2++;
            }
            m(this.f3802b.f3653e.h);
            m(this.f3802b.f3653e.i);
        }
    }

    @Override // t.AbstractC0313o
    public final void e() {
        C0296d c0296d = this.f3802b;
        if (c0296d instanceof C0293a) {
            int i = ((C0293a) c0296d).f3597s0;
            C0304f c0304f = this.h;
            if (i == 0 || i == 1) {
                c0296d.f3644Y = c0304f.f3785g;
            } else {
                c0296d.f3645Z = c0304f.f3785g;
            }
        }
    }

    @Override // t.AbstractC0313o
    public final void f() {
        this.f3803c = null;
        this.h.c();
    }

    @Override // t.AbstractC0313o
    public final boolean k() {
        return false;
    }

    public final void m(C0304f c0304f) {
        C0304f c0304f2 = this.h;
        c0304f2.f3787k.add(c0304f);
        c0304f.f3788l.add(c0304f2);
    }
}
