package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class hm extends w90 {
    @Override // defpackage.xe
    public final void a(xe xeVar) {
        ze zeVar = this.h;
        if (zeVar.c && !zeVar.j) {
            zeVar.d((int) ((((ze) zeVar.l.get(0)).g * ((gm) this.b).q0) + 0.5f));
        }
    }

    @Override // defpackage.w90
    public final void d() {
        tc tcVar = this.b;
        gm gmVar = (gm) tcVar;
        int i = gmVar.r0;
        int i2 = gmVar.s0;
        int i3 = gmVar.u0;
        ze zeVar = this.h;
        if (i3 == 1) {
            if (i != -1) {
                zeVar.l.add(tcVar.T.d.h);
                this.b.T.d.h.k.add(zeVar);
                zeVar.f = i;
            } else if (i2 != -1) {
                zeVar.l.add(tcVar.T.d.i);
                this.b.T.d.i.k.add(zeVar);
                zeVar.f = -i2;
            } else {
                zeVar.b = true;
                zeVar.l.add(tcVar.T.d.i);
                this.b.T.d.i.k.add(zeVar);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            zeVar.l.add(tcVar.T.e.h);
            this.b.T.e.h.k.add(zeVar);
            zeVar.f = i;
        } else if (i2 != -1) {
            zeVar.l.add(tcVar.T.e.i);
            this.b.T.e.i.k.add(zeVar);
            zeVar.f = -i2;
        } else {
            zeVar.b = true;
            zeVar.l.add(tcVar.T.e.i);
            this.b.T.e.i.k.add(zeVar);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    @Override // defpackage.w90
    public final void e() {
        tc tcVar = this.b;
        int i = ((gm) tcVar).u0;
        ze zeVar = this.h;
        if (i == 1) {
            tcVar.Y = zeVar.g;
        } else {
            tcVar.Z = zeVar.g;
        }
    }

    @Override // defpackage.w90
    public final void f() {
        this.h.c();
    }

    @Override // defpackage.w90
    public final boolean k() {
        return false;
    }

    public final void m(ze zeVar) {
        ze zeVar2 = this.h;
        zeVar2.k.add(zeVar);
        zeVar.l.add(zeVar2);
    }
}
