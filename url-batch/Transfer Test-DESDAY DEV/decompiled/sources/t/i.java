package t;

/* loaded from: classes.dex */
public final class i extends o {
    @Override // t.InterfaceC0333d
    public final void a(InterfaceC0333d interfaceC0333d) {
        C0335f c0335f = this.h;
        if (c0335f.f3741c && !c0335f.f3745j) {
            c0335f.d((int) ((((C0335f) c0335f.f3747l.get(0)).f3744g * ((s.h) this.f3761b).f3634q0) + 0.5f));
        }
    }

    @Override // t.o
    public final void d() {
        s.d dVar = this.f3761b;
        s.h hVar = (s.h) dVar;
        int i = hVar.r0;
        int i2 = hVar.f3635s0;
        int i3 = hVar.f3637u0;
        C0335f c0335f = this.h;
        if (i3 == 1) {
            if (i != -1) {
                c0335f.f3747l.add(dVar.f3521T.d.h);
                this.f3761b.f3521T.d.h.f3746k.add(c0335f);
                c0335f.f3743f = i;
            } else if (i2 != -1) {
                c0335f.f3747l.add(dVar.f3521T.d.i);
                this.f3761b.f3521T.d.i.f3746k.add(c0335f);
                c0335f.f3743f = -i2;
            } else {
                c0335f.f3740b = true;
                c0335f.f3747l.add(dVar.f3521T.d.i);
                this.f3761b.f3521T.d.i.f3746k.add(c0335f);
            }
            m(this.f3761b.d.h);
            m(this.f3761b.d.i);
            return;
        }
        if (i != -1) {
            c0335f.f3747l.add(dVar.f3521T.f3535e.h);
            this.f3761b.f3521T.f3535e.h.f3746k.add(c0335f);
            c0335f.f3743f = i;
        } else if (i2 != -1) {
            c0335f.f3747l.add(dVar.f3521T.f3535e.i);
            this.f3761b.f3521T.f3535e.i.f3746k.add(c0335f);
            c0335f.f3743f = -i2;
        } else {
            c0335f.f3740b = true;
            c0335f.f3747l.add(dVar.f3521T.f3535e.i);
            this.f3761b.f3521T.f3535e.i.f3746k.add(c0335f);
        }
        m(this.f3761b.f3535e.h);
        m(this.f3761b.f3535e.i);
    }

    @Override // t.o
    public final void e() {
        s.d dVar = this.f3761b;
        int i = ((s.h) dVar).f3637u0;
        C0335f c0335f = this.h;
        if (i == 1) {
            dVar.f3526Y = c0335f.f3744g;
        } else {
            dVar.f3527Z = c0335f.f3744g;
        }
    }

    @Override // t.o
    public final void f() {
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
