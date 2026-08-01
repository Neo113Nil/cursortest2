package t;

import java.util.Iterator;
import s.C0361a;

/* loaded from: classes.dex */
public final class j extends p {
    @Override // t.InterfaceC0367d
    public final void a(InterfaceC0367d interfaceC0367d) {
        C0361a c0361a = (C0361a) this.f4156b;
        int i = c0361a.f3930s0;
        f fVar = this.h;
        Iterator it = fVar.f4142l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((f) it.next()).f4139g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            fVar.d(i3 + c0361a.f3932u0);
        } else {
            fVar.d(i2 + c0361a.f3932u0);
        }
    }

    @Override // t.p
    public final void d() {
        s.d dVar = this.f4156b;
        if (dVar instanceof C0361a) {
            f fVar = this.h;
            fVar.f4135b = true;
            C0361a c0361a = (C0361a) dVar;
            int i = c0361a.f3930s0;
            boolean z2 = c0361a.f3931t0;
            int i2 = 0;
            if (i == 0) {
                fVar.f4137e = 4;
                while (i2 < c0361a.r0) {
                    s.d dVar2 = c0361a.f4090q0[i2];
                    if (z2 || dVar2.f3991g0 != 8) {
                        f fVar2 = dVar2.d.h;
                        fVar2.f4141k.add(fVar);
                        fVar.f4142l.add(fVar2);
                    }
                    i2++;
                }
                m(this.f4156b.d.h);
                m(this.f4156b.d.i);
                return;
            }
            if (i == 1) {
                fVar.f4137e = 5;
                while (i2 < c0361a.r0) {
                    s.d dVar3 = c0361a.f4090q0[i2];
                    if (z2 || dVar3.f3991g0 != 8) {
                        f fVar3 = dVar3.d.i;
                        fVar3.f4141k.add(fVar);
                        fVar.f4142l.add(fVar3);
                    }
                    i2++;
                }
                m(this.f4156b.d.h);
                m(this.f4156b.d.i);
                return;
            }
            if (i == 2) {
                fVar.f4137e = 6;
                while (i2 < c0361a.r0) {
                    s.d dVar4 = c0361a.f4090q0[i2];
                    if (z2 || dVar4.f3991g0 != 8) {
                        f fVar4 = dVar4.f3986e.h;
                        fVar4.f4141k.add(fVar);
                        fVar.f4142l.add(fVar4);
                    }
                    i2++;
                }
                m(this.f4156b.f3986e.h);
                m(this.f4156b.f3986e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            fVar.f4137e = 7;
            while (i2 < c0361a.r0) {
                s.d dVar5 = c0361a.f4090q0[i2];
                if (z2 || dVar5.f3991g0 != 8) {
                    f fVar5 = dVar5.f3986e.i;
                    fVar5.f4141k.add(fVar);
                    fVar.f4142l.add(fVar5);
                }
                i2++;
            }
            m(this.f4156b.f3986e.h);
            m(this.f4156b.f3986e.i);
        }
    }

    @Override // t.p
    public final void e() {
        s.d dVar = this.f4156b;
        if (dVar instanceof C0361a) {
            int i = ((C0361a) dVar).f3930s0;
            f fVar = this.h;
            if (i == 0 || i == 1) {
                dVar.f3977Y = fVar.f4139g;
            } else {
                dVar.f3978Z = fVar.f4139g;
            }
        }
    }

    @Override // t.p
    public final void f() {
        this.f4157c = null;
        this.h.c();
    }

    @Override // t.p
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.h;
        fVar2.f4141k.add(fVar);
        fVar.f4142l.add(fVar2);
    }
}
