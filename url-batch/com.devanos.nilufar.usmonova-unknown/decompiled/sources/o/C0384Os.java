package o;

import android.graphics.Paint;
import java.util.List;

/* renamed from: o.Os, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0384Os extends ME {
    public static final C1143h2 J;
    public final IU H;
    public C0358Ns I;

    static {
        C1143h2 b = AbstractC0946e20.b();
        ((Paint) b.i).setColor(AbstractC0022At.L(C1114gc.c));
        ((Paint) b.i).setStrokeWidth(1.0f);
        b.m(1);
        J = b;
    }

    public C0384Os(C0027Ay c0027Ay) {
        super(c0027Ay);
        IU iu = new IU();
        iu.d = 0;
        this.H = iu;
        iu.h = this;
        this.I = c0027Ay.d != null ? new C0358Ns(this) : null;
    }

    @Override // o.AbstractC0700aI
    public final void E(long j, float f, InterfaceC2114vp interfaceC2114vp) {
        v0(j, f, interfaceC2114vp);
        if (this.g) {
            return;
        }
        t0();
        this.l.v.q.K();
    }

    @Override // o.AbstractC1415lB
    public final int H(AbstractC2248xr abstractC2248xr) {
        C0358Ns c0358Ns = this.I;
        if (c0358Ns != null) {
            return c0358Ns.H(abstractC2248xr);
        }
        C0157Fy c0157Fy = this.l.v.q;
        C0053By c0053By = c0157Fy.q;
        C0209Hy c0209Hy = c0157Fy.B;
        if (c0209Hy.b == 1) {
            c0053By.d = true;
            if (c0053By.b) {
                c0209Hy.d = true;
                c0209Hy.e = true;
            }
        } else {
            c0053By.e = true;
        }
        c0157Fy.n().h = true;
        c0157Fy.r();
        c0157Fy.n().h = false;
        Integer num = (Integer) c0053By.g.get(abstractC2248xr);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // o.IB
    public final AbstractC0700aI a(long j) {
        List g;
        G(j);
        C0027Ay c0027Ay = this.l;
        YD o2 = c0027Ay.o();
        int i = o2.j;
        if (i > 0) {
            Object[] objArr = o2.h;
            int i2 = 0;
            do {
                ((C0027Ay) objArr[i2]).v.q.l = 3;
                i2++;
            } while (i2 < i);
        }
        LB lb = c0027Ay.p;
        C0157Fy c0157Fy = c0027Ay.v.q;
        YD yd = c0157Fy.r;
        C0027Ay c0027Ay2 = c0157Fy.B.a;
        c0027Ay2.L();
        if (c0157Fy.s) {
            YD o3 = c0027Ay2.o();
            int i3 = o3.j;
            if (i3 > 0) {
                Object[] objArr2 = o3.h;
                int i4 = 0;
                do {
                    C0027Ay c0027Ay3 = (C0027Ay) objArr2[i4];
                    if (yd.j <= i4) {
                        yd.b(c0027Ay3.v.q);
                    } else {
                        C0157Fy c0157Fy2 = c0027Ay3.v.q;
                        Object[] objArr3 = yd.h;
                        Object obj = objArr3[i4];
                        objArr3[i4] = c0157Fy2;
                    }
                    i4++;
                } while (i4 < i3);
            }
            yd.o(((VD) c0027Ay2.h()).h.j, yd.j);
            c0157Fy.s = false;
            g = yd.g();
        } else {
            g = yd.g();
        }
        x0(lb.a(this, g, j));
        s0();
        return this;
    }

    @Override // o.ME
    public final void c0() {
        if (this.I == null) {
            this.I = new C0358Ns(this);
        }
    }

    @Override // o.ME
    public final AbstractC1547nB f0() {
        return this.I;
    }

    @Override // o.ME
    public final TC h0() {
        return this.H;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    @Override // o.ME
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m0(IE ie, long j, C2182wr c2182wr, boolean z, boolean z2) {
        boolean z3;
        C0027Ay c0027Ay = this.l;
        boolean z4 = false;
        if (ie.d(c0027Ay)) {
            if (C0(j)) {
                z3 = z2;
            } else if (z) {
                float Y = Y(j, g0());
                if (!Float.isInfinite(Y) && !Float.isNaN(Y)) {
                    z3 = false;
                }
            }
            z4 = true;
            if (z4) {
                return;
            }
            int i = c2182wr.j;
            YD n = c0027Ay.n();
            int i2 = n.j;
            if (i2 > 0) {
                int i3 = i2 - 1;
                Object[] objArr = n.h;
                do {
                    C0027Ay c0027Ay2 = (C0027Ay) objArr[i3];
                    if (c0027Ay2.w()) {
                        ie.n(c0027Ay2, j, c2182wr, z, z3);
                        long j2 = c2182wr.j();
                        if (Float.intBitsToFloat((int) (j2 >> 32)) < 0.0f && ((int) (j2 & 4294967295L)) != 0) {
                            if (!c2182wr.l) {
                                break;
                            } else {
                                c2182wr.j = c2182wr.k - 1;
                            }
                        }
                    }
                    i3--;
                } while (i3 >= 0);
            }
            c2182wr.j = i;
            return;
        }
        z3 = z2;
        if (z4) {
        }
    }

    @Override // o.ME
    public final void u0(InterfaceC0980ea interfaceC0980ea, C0512Tq c0512Tq) {
        C0027Ay c0027Ay = this.l;
        ZG J0 = PX.J0(c0027Ay);
        YD n = c0027Ay.n();
        int i = n.j;
        if (i > 0) {
            Object[] objArr = n.h;
            int i2 = 0;
            do {
                C0027Ay c0027Ay2 = (C0027Ay) objArr[i2];
                if (c0027Ay2.w()) {
                    c0027Ay2.g(interfaceC0980ea, c0512Tq);
                }
                i2++;
            } while (i2 < i);
        }
        if (((S2) J0).getShowLayoutBounds()) {
            a0(interfaceC0980ea, J);
        }
    }
}
