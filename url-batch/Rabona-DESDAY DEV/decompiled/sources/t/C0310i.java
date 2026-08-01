package t;

import s.C0299d;

/* renamed from: t.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310i extends AbstractC0316o {
    @Override // t.InterfaceC0305d
    public final void a(InterfaceC0305d interfaceC0305d) {
        C0307f c0307f = this.h;
        if (c0307f.f3778c && !c0307f.f3782j) {
            c0307f.d((int) ((((C0307f) c0307f.f3784l.get(0)).f3781g * ((s.h) this.f3798b).f3747q0) + 0.5f));
        }
    }

    @Override // t.AbstractC0316o
    public final void d() {
        C0299d c0299d = this.f3798b;
        s.h hVar = (s.h) c0299d;
        int i = hVar.f3748r0;
        int i2 = hVar.f3749s0;
        int i3 = hVar.f3751u0;
        C0307f c0307f = this.h;
        if (i3 == 1) {
            if (i != -1) {
                c0307f.f3784l.add(c0299d.f3634T.d.h);
                this.f3798b.f3634T.d.h.f3783k.add(c0307f);
                c0307f.f3780f = i;
            } else if (i2 != -1) {
                c0307f.f3784l.add(c0299d.f3634T.d.i);
                this.f3798b.f3634T.d.i.f3783k.add(c0307f);
                c0307f.f3780f = -i2;
            } else {
                c0307f.f3777b = true;
                c0307f.f3784l.add(c0299d.f3634T.d.i);
                this.f3798b.f3634T.d.i.f3783k.add(c0307f);
            }
            m(this.f3798b.d.h);
            m(this.f3798b.d.i);
            return;
        }
        if (i != -1) {
            c0307f.f3784l.add(c0299d.f3634T.f3648e.h);
            this.f3798b.f3634T.f3648e.h.f3783k.add(c0307f);
            c0307f.f3780f = i;
        } else if (i2 != -1) {
            c0307f.f3784l.add(c0299d.f3634T.f3648e.i);
            this.f3798b.f3634T.f3648e.i.f3783k.add(c0307f);
            c0307f.f3780f = -i2;
        } else {
            c0307f.f3777b = true;
            c0307f.f3784l.add(c0299d.f3634T.f3648e.i);
            this.f3798b.f3634T.f3648e.i.f3783k.add(c0307f);
        }
        m(this.f3798b.f3648e.h);
        m(this.f3798b.f3648e.i);
    }

    @Override // t.AbstractC0316o
    public final void e() {
        C0299d c0299d = this.f3798b;
        int i = ((s.h) c0299d).f3751u0;
        C0307f c0307f = this.h;
        if (i == 1) {
            c0299d.f3639Y = c0307f.f3781g;
        } else {
            c0299d.f3640Z = c0307f.f3781g;
        }
    }

    @Override // t.AbstractC0316o
    public final void f() {
        this.h.c();
    }

    @Override // t.AbstractC0316o
    public final boolean k() {
        return false;
    }

    public final void m(C0307f c0307f) {
        C0307f c0307f2 = this.h;
        c0307f2.f3783k.add(c0307f);
        c0307f.f3784l.add(c0307f2);
    }
}
