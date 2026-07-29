package o;

import java.util.List;

/* renamed from: o.Ns, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0358Ns extends AbstractC1547nB {
    @Override // o.AbstractC1415lB
    public final int H(AbstractC2248xr abstractC2248xr) {
        C0131Ey c0131Ey = this.l.l.v.r;
        AbstractC0048Bt.k(c0131Ey);
        C0053By c0053By = c0131Ey.q;
        C0209Hy c0209Hy = c0131Ey.v;
        if (c0209Hy.b == 2) {
            c0053By.d = true;
            if (c0053By.b) {
                c0209Hy.g = true;
                c0209Hy.h = true;
            }
        } else {
            c0053By.e = true;
        }
        C0358Ns c0358Ns = c0131Ey.n().I;
        if (c0358Ns != null) {
            c0358Ns.h = true;
        }
        c0131Ey.r();
        C0358Ns c0358Ns2 = c0131Ey.n().I;
        if (c0358Ns2 != null) {
            c0358Ns2.h = false;
        }
        Integer num = (Integer) c0053By.g.get(abstractC2248xr);
        int intValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.q.put(abstractC2248xr, Integer.valueOf(intValue));
        return intValue;
    }

    @Override // o.AbstractC1547nB
    public final void W() {
        C0131Ey c0131Ey = this.l.l.v.r;
        AbstractC0048Bt.k(c0131Ey);
        c0131Ey.K();
    }

    @Override // o.IB
    public final AbstractC0700aI a(long j) {
        List g;
        G(j);
        ME me = this.l;
        YD o2 = me.l.o();
        int i = o2.j;
        if (i > 0) {
            Object[] objArr = o2.h;
            int i2 = 0;
            do {
                C0131Ey c0131Ey = ((C0027Ay) objArr[i2]).v.r;
                AbstractC0048Bt.k(c0131Ey);
                c0131Ey.j = 3;
                i2++;
            } while (i2 < i);
        }
        C0027Ay c0027Ay = me.l;
        LB lb = c0027Ay.p;
        C0131Ey c0131Ey2 = c0027Ay.v.r;
        AbstractC0048Bt.k(c0131Ey2);
        YD yd = c0131Ey2.r;
        C0209Hy c0209Hy = c0131Ey2.v;
        c0209Hy.a.h();
        if (c0131Ey2.s) {
            C0027Ay c0027Ay2 = c0209Hy.a;
            YD o3 = c0027Ay2.o();
            int i3 = o3.j;
            if (i3 > 0) {
                Object[] objArr2 = o3.h;
                int i4 = 0;
                do {
                    C0027Ay c0027Ay3 = (C0027Ay) objArr2[i4];
                    if (yd.j <= i4) {
                        C0131Ey c0131Ey3 = c0027Ay3.v.r;
                        AbstractC0048Bt.k(c0131Ey3);
                        yd.b(c0131Ey3);
                    } else {
                        C0131Ey c0131Ey4 = c0027Ay3.v.r;
                        AbstractC0048Bt.k(c0131Ey4);
                        Object[] objArr3 = yd.h;
                        Object obj = objArr3[i4];
                        objArr3[i4] = c0131Ey4;
                    }
                    i4++;
                } while (i4 < i3);
            }
            yd.o(((VD) c0027Ay2.h()).h.j, yd.j);
            c0131Ey2.s = false;
            g = yd.g();
        } else {
            g = yd.g();
        }
        AbstractC1547nB.V(this, lb.a(this, g, j));
        return this;
    }
}
