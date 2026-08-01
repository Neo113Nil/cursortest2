package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class om extends w90 {
    @Override // defpackage.xe
    public final void a(xe xeVar) {
        d7 d7Var = (d7) this.b;
        int i = d7Var.s0;
        ze zeVar = this.h;
        ArrayList arrayList = zeVar.l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i5 = ((ze) obj).g;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i == 0 || i == 2) {
            zeVar.d(i3 + d7Var.u0);
        } else {
            zeVar.d(i2 + d7Var.u0);
        }
    }

    @Override // defpackage.w90
    public final void d() {
        tc tcVar = this.b;
        if (tcVar instanceof d7) {
            ze zeVar = this.h;
            zeVar.b = true;
            ArrayList arrayList = zeVar.l;
            d7 d7Var = (d7) tcVar;
            int i = d7Var.s0;
            boolean z = d7Var.t0;
            int i2 = 0;
            if (i == 0) {
                zeVar.e = 4;
                while (i2 < d7Var.r0) {
                    tc tcVar2 = d7Var.q0[i2];
                    if (z || tcVar2.g0 != 8) {
                        ze zeVar2 = tcVar2.d.h;
                        zeVar2.k.add(zeVar);
                        arrayList.add(zeVar2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                zeVar.e = 5;
                while (i2 < d7Var.r0) {
                    tc tcVar3 = d7Var.q0[i2];
                    if (z || tcVar3.g0 != 8) {
                        ze zeVar3 = tcVar3.d.i;
                        zeVar3.k.add(zeVar);
                        arrayList.add(zeVar3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                zeVar.e = 6;
                while (i2 < d7Var.r0) {
                    tc tcVar4 = d7Var.q0[i2];
                    if (z || tcVar4.g0 != 8) {
                        ze zeVar4 = tcVar4.e.h;
                        zeVar4.k.add(zeVar);
                        arrayList.add(zeVar4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            zeVar.e = 7;
            while (i2 < d7Var.r0) {
                tc tcVar5 = d7Var.q0[i2];
                if (z || tcVar5.g0 != 8) {
                    ze zeVar5 = tcVar5.e.i;
                    zeVar5.k.add(zeVar);
                    arrayList.add(zeVar5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // defpackage.w90
    public final void e() {
        tc tcVar = this.b;
        if (tcVar instanceof d7) {
            int i = ((d7) tcVar).s0;
            ze zeVar = this.h;
            if (i == 0 || i == 1) {
                tcVar.Y = zeVar.g;
            } else {
                tcVar.Z = zeVar.g;
            }
        }
    }

    @Override // defpackage.w90
    public final void f() {
        this.c = null;
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
