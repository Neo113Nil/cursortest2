package t;

import s.C0299d;

/* renamed from: t.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310i extends AbstractC0316o {
    @Override // t.InterfaceC0305d
    public final void a(InterfaceC0305d interfaceC0305d) {
        C0307f c0307f = this.h;
        if (c0307f.f3756c && !c0307f.f3760j) {
            c0307f.d((int) ((((C0307f) c0307f.f3762l.get(0)).f3759g * ((s.h) this.f3776b).f3725q0) + 0.5f));
        }
    }

    @Override // t.AbstractC0316o
    public final void d() {
        C0299d c0299d = this.f3776b;
        s.h hVar = (s.h) c0299d;
        int i = hVar.f3726r0;
        int i2 = hVar.f3727s0;
        int i3 = hVar.f3729u0;
        C0307f c0307f = this.h;
        if (i3 == 1) {
            if (i != -1) {
                c0307f.f3762l.add(c0299d.f3612T.d.h);
                this.f3776b.f3612T.d.h.f3761k.add(c0307f);
                c0307f.f3758f = i;
            } else if (i2 != -1) {
                c0307f.f3762l.add(c0299d.f3612T.d.i);
                this.f3776b.f3612T.d.i.f3761k.add(c0307f);
                c0307f.f3758f = -i2;
            } else {
                c0307f.f3755b = true;
                c0307f.f3762l.add(c0299d.f3612T.d.i);
                this.f3776b.f3612T.d.i.f3761k.add(c0307f);
            }
            m(this.f3776b.d.h);
            m(this.f3776b.d.i);
            return;
        }
        if (i != -1) {
            c0307f.f3762l.add(c0299d.f3612T.f3626e.h);
            this.f3776b.f3612T.f3626e.h.f3761k.add(c0307f);
            c0307f.f3758f = i;
        } else if (i2 != -1) {
            c0307f.f3762l.add(c0299d.f3612T.f3626e.i);
            this.f3776b.f3612T.f3626e.i.f3761k.add(c0307f);
            c0307f.f3758f = -i2;
        } else {
            c0307f.f3755b = true;
            c0307f.f3762l.add(c0299d.f3612T.f3626e.i);
            this.f3776b.f3612T.f3626e.i.f3761k.add(c0307f);
        }
        m(this.f3776b.f3626e.h);
        m(this.f3776b.f3626e.i);
    }

    @Override // t.AbstractC0316o
    public final void e() {
        C0299d c0299d = this.f3776b;
        int i = ((s.h) c0299d).f3729u0;
        C0307f c0307f = this.h;
        if (i == 1) {
            c0299d.f3617Y = c0307f.f3759g;
        } else {
            c0299d.f3618Z = c0307f.f3759g;
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
        c0307f2.f3761k.add(c0307f);
        c0307f.f3762l.add(c0307f2);
    }
}
