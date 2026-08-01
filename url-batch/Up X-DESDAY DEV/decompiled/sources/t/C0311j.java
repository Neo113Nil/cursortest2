package t;

import java.util.Iterator;
import s.C0296a;
import s.C0299d;

/* renamed from: t.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311j extends AbstractC0316o {
    @Override // t.InterfaceC0305d
    public final void a(InterfaceC0305d interfaceC0305d) {
        C0296a c0296a = (C0296a) this.f3776b;
        int i = c0296a.f3570s0;
        C0307f c0307f = this.h;
        Iterator it = c0307f.f3762l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C0307f) it.next()).f3759g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c0307f.d(i3 + c0296a.f3572u0);
        } else {
            c0307f.d(i2 + c0296a.f3572u0);
        }
    }

    @Override // t.AbstractC0316o
    public final void d() {
        C0299d c0299d = this.f3776b;
        if (c0299d instanceof C0296a) {
            C0307f c0307f = this.h;
            c0307f.f3755b = true;
            C0296a c0296a = (C0296a) c0299d;
            int i = c0296a.f3570s0;
            boolean z2 = c0296a.f3571t0;
            int i2 = 0;
            if (i == 0) {
                c0307f.f3757e = 4;
                while (i2 < c0296a.f3732r0) {
                    C0299d c0299d2 = c0296a.f3731q0[i2];
                    if (z2 || c0299d2.f3631g0 != 8) {
                        C0307f c0307f2 = c0299d2.d.h;
                        c0307f2.f3761k.add(c0307f);
                        c0307f.f3762l.add(c0307f2);
                    }
                    i2++;
                }
                m(this.f3776b.d.h);
                m(this.f3776b.d.i);
                return;
            }
            if (i == 1) {
                c0307f.f3757e = 5;
                while (i2 < c0296a.f3732r0) {
                    C0299d c0299d3 = c0296a.f3731q0[i2];
                    if (z2 || c0299d3.f3631g0 != 8) {
                        C0307f c0307f3 = c0299d3.d.i;
                        c0307f3.f3761k.add(c0307f);
                        c0307f.f3762l.add(c0307f3);
                    }
                    i2++;
                }
                m(this.f3776b.d.h);
                m(this.f3776b.d.i);
                return;
            }
            if (i == 2) {
                c0307f.f3757e = 6;
                while (i2 < c0296a.f3732r0) {
                    C0299d c0299d4 = c0296a.f3731q0[i2];
                    if (z2 || c0299d4.f3631g0 != 8) {
                        C0307f c0307f4 = c0299d4.f3626e.h;
                        c0307f4.f3761k.add(c0307f);
                        c0307f.f3762l.add(c0307f4);
                    }
                    i2++;
                }
                m(this.f3776b.f3626e.h);
                m(this.f3776b.f3626e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            c0307f.f3757e = 7;
            while (i2 < c0296a.f3732r0) {
                C0299d c0299d5 = c0296a.f3731q0[i2];
                if (z2 || c0299d5.f3631g0 != 8) {
                    C0307f c0307f5 = c0299d5.f3626e.i;
                    c0307f5.f3761k.add(c0307f);
                    c0307f.f3762l.add(c0307f5);
                }
                i2++;
            }
            m(this.f3776b.f3626e.h);
            m(this.f3776b.f3626e.i);
        }
    }

    @Override // t.AbstractC0316o
    public final void e() {
        C0299d c0299d = this.f3776b;
        if (c0299d instanceof C0296a) {
            int i = ((C0296a) c0299d).f3570s0;
            C0307f c0307f = this.h;
            if (i == 0 || i == 1) {
                c0299d.f3617Y = c0307f.f3759g;
            } else {
                c0299d.f3618Z = c0307f.f3759g;
            }
        }
    }

    @Override // t.AbstractC0316o
    public final void f() {
        this.f3777c = null;
        this.h.c();
    }

    @Override // t.AbstractC0316o
    public final boolean k() {
        return false;
    }

    public final void m(C0307f c0307f) {
        C0307f c0307f2 = this.h;
        c0307f2.f3761k.add(c0307f);
        c0307f.f3762l.add(c0307f2);
    }
}
