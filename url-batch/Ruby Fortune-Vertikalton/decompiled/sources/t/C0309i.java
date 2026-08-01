package t;

import s.C0298d;

/* renamed from: t.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309i extends AbstractC0315o {
    @Override // t.InterfaceC0304d
    public final void a(InterfaceC0304d interfaceC0304d) {
        C0306f c0306f = this.h;
        if (c0306f.f3772c && !c0306f.f3776j) {
            c0306f.d((int) ((((C0306f) c0306f.f3778l.get(0)).f3775g * ((s.h) this.f3792b).f3741q0) + 0.5f));
        }
    }

    @Override // t.AbstractC0315o
    public final void d() {
        C0298d c0298d = this.f3792b;
        s.h hVar = (s.h) c0298d;
        int i = hVar.f3742r0;
        int i2 = hVar.f3743s0;
        int i3 = hVar.f3745u0;
        C0306f c0306f = this.h;
        if (i3 == 1) {
            if (i != -1) {
                c0306f.f3778l.add(c0298d.f3628T.d.h);
                this.f3792b.f3628T.d.h.f3777k.add(c0306f);
                c0306f.f3774f = i;
            } else if (i2 != -1) {
                c0306f.f3778l.add(c0298d.f3628T.d.i);
                this.f3792b.f3628T.d.i.f3777k.add(c0306f);
                c0306f.f3774f = -i2;
            } else {
                c0306f.f3771b = true;
                c0306f.f3778l.add(c0298d.f3628T.d.i);
                this.f3792b.f3628T.d.i.f3777k.add(c0306f);
            }
            m(this.f3792b.d.h);
            m(this.f3792b.d.i);
            return;
        }
        if (i != -1) {
            c0306f.f3778l.add(c0298d.f3628T.f3642e.h);
            this.f3792b.f3628T.f3642e.h.f3777k.add(c0306f);
            c0306f.f3774f = i;
        } else if (i2 != -1) {
            c0306f.f3778l.add(c0298d.f3628T.f3642e.i);
            this.f3792b.f3628T.f3642e.i.f3777k.add(c0306f);
            c0306f.f3774f = -i2;
        } else {
            c0306f.f3771b = true;
            c0306f.f3778l.add(c0298d.f3628T.f3642e.i);
            this.f3792b.f3628T.f3642e.i.f3777k.add(c0306f);
        }
        m(this.f3792b.f3642e.h);
        m(this.f3792b.f3642e.i);
    }

    @Override // t.AbstractC0315o
    public final void e() {
        C0298d c0298d = this.f3792b;
        int i = ((s.h) c0298d).f3745u0;
        C0306f c0306f = this.h;
        if (i == 1) {
            c0298d.f3633Y = c0306f.f3775g;
        } else {
            c0298d.f3634Z = c0306f.f3775g;
        }
    }

    @Override // t.AbstractC0315o
    public final void f() {
        this.h.c();
    }

    @Override // t.AbstractC0315o
    public final boolean k() {
        return false;
    }

    public final void m(C0306f c0306f) {
        C0306f c0306f2 = this.h;
        c0306f2.f3777k.add(c0306f);
        c0306f.f3778l.add(c0306f2);
    }
}
