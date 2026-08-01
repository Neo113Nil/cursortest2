package t;

import java.util.Iterator;
import s.C0327a;

/* loaded from: classes.dex */
public final class j extends o {
    @Override // t.InterfaceC0333d
    public final void a(InterfaceC0333d interfaceC0333d) {
        C0327a c0327a = (C0327a) this.f3761b;
        int i = c0327a.f3479s0;
        C0335f c0335f = this.h;
        Iterator it = c0335f.f3747l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((C0335f) it.next()).f3744g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            c0335f.d(i3 + c0327a.f3481u0);
        } else {
            c0335f.d(i2 + c0327a.f3481u0);
        }
    }

    @Override // t.o
    public final void d() {
        s.d dVar = this.f3761b;
        if (dVar instanceof C0327a) {
            C0335f c0335f = this.h;
            c0335f.f3740b = true;
            C0327a c0327a = (C0327a) dVar;
            int i = c0327a.f3479s0;
            boolean z2 = c0327a.f3480t0;
            int i2 = 0;
            if (i == 0) {
                c0335f.f3742e = 4;
                while (i2 < c0327a.r0) {
                    s.d dVar2 = c0327a.f3639q0[i2];
                    if (z2 || dVar2.f3540g0 != 8) {
                        C0335f c0335f2 = dVar2.d.h;
                        c0335f2.f3746k.add(c0335f);
                        c0335f.f3747l.add(c0335f2);
                    }
                    i2++;
                }
                m(this.f3761b.d.h);
                m(this.f3761b.d.i);
                return;
            }
            if (i == 1) {
                c0335f.f3742e = 5;
                while (i2 < c0327a.r0) {
                    s.d dVar3 = c0327a.f3639q0[i2];
                    if (z2 || dVar3.f3540g0 != 8) {
                        C0335f c0335f3 = dVar3.d.i;
                        c0335f3.f3746k.add(c0335f);
                        c0335f.f3747l.add(c0335f3);
                    }
                    i2++;
                }
                m(this.f3761b.d.h);
                m(this.f3761b.d.i);
                return;
            }
            if (i == 2) {
                c0335f.f3742e = 6;
                while (i2 < c0327a.r0) {
                    s.d dVar4 = c0327a.f3639q0[i2];
                    if (z2 || dVar4.f3540g0 != 8) {
                        C0335f c0335f4 = dVar4.f3535e.h;
                        c0335f4.f3746k.add(c0335f);
                        c0335f.f3747l.add(c0335f4);
                    }
                    i2++;
                }
                m(this.f3761b.f3535e.h);
                m(this.f3761b.f3535e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            c0335f.f3742e = 7;
            while (i2 < c0327a.r0) {
                s.d dVar5 = c0327a.f3639q0[i2];
                if (z2 || dVar5.f3540g0 != 8) {
                    C0335f c0335f5 = dVar5.f3535e.i;
                    c0335f5.f3746k.add(c0335f);
                    c0335f.f3747l.add(c0335f5);
                }
                i2++;
            }
            m(this.f3761b.f3535e.h);
            m(this.f3761b.f3535e.i);
        }
    }

    @Override // t.o
    public final void e() {
        s.d dVar = this.f3761b;
        if (dVar instanceof C0327a) {
            int i = ((C0327a) dVar).f3479s0;
            C0335f c0335f = this.h;
            if (i == 0 || i == 1) {
                dVar.f3526Y = c0335f.f3744g;
            } else {
                dVar.f3527Z = c0335f.f3744g;
            }
        }
    }

    @Override // t.o
    public final void f() {
        this.f3762c = null;
        this.h.c();
    }

    @Override // t.o
    public final boolean k() {
        return false;
    }

    public final void m(C0335f c0335f) {
        C0335f c0335f2 = this.h;
        c0335f2.f3746k.add(c0335f);
        c0335f.f3747l.add(c0335f2);
    }
}
