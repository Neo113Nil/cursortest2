package t;

import s.C0296d;

/* renamed from: t.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307i extends AbstractC0313o {
    @Override // t.InterfaceC0302d
    public final void a(InterfaceC0302d interfaceC0302d) {
        C0304f c0304f = this.h;
        if (c0304f.f3782c && !c0304f.f3786j) {
            c0304f.d((int) ((((C0304f) c0304f.f3788l.get(0)).f3785g * ((s.h) this.f3802b).f3752q0) + 0.5f));
        }
    }

    @Override // t.AbstractC0313o
    public final void d() {
        C0296d c0296d = this.f3802b;
        s.h hVar = (s.h) c0296d;
        int i = hVar.f3753r0;
        int i2 = hVar.f3754s0;
        int i3 = hVar.f3756u0;
        C0304f c0304f = this.h;
        if (i3 == 1) {
            if (i != -1) {
                c0304f.f3788l.add(c0296d.f3639T.d.h);
                this.f3802b.f3639T.d.h.f3787k.add(c0304f);
                c0304f.f3784f = i;
            } else if (i2 != -1) {
                c0304f.f3788l.add(c0296d.f3639T.d.i);
                this.f3802b.f3639T.d.i.f3787k.add(c0304f);
                c0304f.f3784f = -i2;
            } else {
                c0304f.f3781b = true;
                c0304f.f3788l.add(c0296d.f3639T.d.i);
                this.f3802b.f3639T.d.i.f3787k.add(c0304f);
            }
            m(this.f3802b.d.h);
            m(this.f3802b.d.i);
            return;
        }
        if (i != -1) {
            c0304f.f3788l.add(c0296d.f3639T.f3653e.h);
            this.f3802b.f3639T.f3653e.h.f3787k.add(c0304f);
            c0304f.f3784f = i;
        } else if (i2 != -1) {
            c0304f.f3788l.add(c0296d.f3639T.f3653e.i);
            this.f3802b.f3639T.f3653e.i.f3787k.add(c0304f);
            c0304f.f3784f = -i2;
        } else {
            c0304f.f3781b = true;
            c0304f.f3788l.add(c0296d.f3639T.f3653e.i);
            this.f3802b.f3639T.f3653e.i.f3787k.add(c0304f);
        }
        m(this.f3802b.f3653e.h);
        m(this.f3802b.f3653e.i);
    }

    @Override // t.AbstractC0313o
    public final void e() {
        C0296d c0296d = this.f3802b;
        int i = ((s.h) c0296d).f3756u0;
        C0304f c0304f = this.h;
        if (i == 1) {
            c0296d.f3644Y = c0304f.f3785g;
        } else {
            c0296d.f3645Z = c0304f.f3785g;
        }
    }

    @Override // t.AbstractC0313o
    public final void f() {
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
