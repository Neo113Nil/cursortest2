package t;

/* loaded from: classes.dex */
public final class i extends p {
    @Override // t.InterfaceC0367d
    public final void a(InterfaceC0367d interfaceC0367d) {
        f fVar = this.h;
        if (fVar.f4136c && !fVar.f4140j) {
            fVar.d((int) ((((f) fVar.f4142l.get(0)).f4139g * ((s.h) this.f4156b).f4085q0) + 0.5f));
        }
    }

    @Override // t.p
    public final void d() {
        s.d dVar = this.f4156b;
        s.h hVar = (s.h) dVar;
        int i = hVar.r0;
        int i2 = hVar.f4086s0;
        int i3 = hVar.f4088u0;
        f fVar = this.h;
        if (i3 == 1) {
            if (i != -1) {
                fVar.f4142l.add(dVar.f3972T.d.h);
                this.f4156b.f3972T.d.h.f4141k.add(fVar);
                fVar.f4138f = i;
            } else if (i2 != -1) {
                fVar.f4142l.add(dVar.f3972T.d.i);
                this.f4156b.f3972T.d.i.f4141k.add(fVar);
                fVar.f4138f = -i2;
            } else {
                fVar.f4135b = true;
                fVar.f4142l.add(dVar.f3972T.d.i);
                this.f4156b.f3972T.d.i.f4141k.add(fVar);
            }
            m(this.f4156b.d.h);
            m(this.f4156b.d.i);
            return;
        }
        if (i != -1) {
            fVar.f4142l.add(dVar.f3972T.f3986e.h);
            this.f4156b.f3972T.f3986e.h.f4141k.add(fVar);
            fVar.f4138f = i;
        } else if (i2 != -1) {
            fVar.f4142l.add(dVar.f3972T.f3986e.i);
            this.f4156b.f3972T.f3986e.i.f4141k.add(fVar);
            fVar.f4138f = -i2;
        } else {
            fVar.f4135b = true;
            fVar.f4142l.add(dVar.f3972T.f3986e.i);
            this.f4156b.f3972T.f3986e.i.f4141k.add(fVar);
        }
        m(this.f4156b.f3986e.h);
        m(this.f4156b.f3986e.i);
    }

    @Override // t.p
    public final void e() {
        s.d dVar = this.f4156b;
        int i = ((s.h) dVar).f4088u0;
        f fVar = this.h;
        if (i == 1) {
            dVar.f3977Y = fVar.f4139g;
        } else {
            dVar.f3978Z = fVar.f4139g;
        }
    }

    @Override // t.p
    public final void f() {
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
