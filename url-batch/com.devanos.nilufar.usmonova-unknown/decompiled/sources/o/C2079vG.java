package o;

import java.util.ArrayList;

/* renamed from: o.vG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2079vG extends JG {
    public static final C2079vG d;
    public static final C2079vG e;
    public static final C2079vG f;
    public static final C2079vG g;
    public final /* synthetic */ int c;

    static {
        int i = 1;
        d = new C2079vG(i, 2, 0);
        int i2 = 1;
        e = new C2079vG(i2, i2, 1);
        f = new C2079vG(i, 2, 2);
        int i3 = 1;
        g = new C2079vG(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2079vG(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }

    @Override // o.JG
    public final void a(C0575Wb c0575Wb, C0950e6 c0950e6, C0972eS c0972eS, C1970td c1970td) {
        int i;
        int i2;
        switch (this.c) {
            case 0:
                Object invoke = ((InterfaceC1455lp) c0575Wb.c(0)).invoke();
                C1471m2 c1471m2 = (C1471m2) c0575Wb.c(1);
                c0575Wb.b(0);
                c1471m2.getClass();
                c0972eS.K(c0972eS.c(c1471m2), invoke);
                c0950e6.getClass();
                c0950e6.v(invoke);
                return;
            case 1:
                C1471m2 c1471m22 = (C1471m2) c0575Wb.c(0);
                int b = c0575Wb.b(0);
                c0950e6.T();
                c1471m22.getClass();
                int p = c0972eS.p(c0972eS.c(c1471m22));
                Object obj = TM.f(c0972eS.b, p) ? c0972eS.c[c0972eS.g(c0972eS.f(c0972eS.b, p))] : null;
                c0950e6.getClass();
                C0027Ay c0027Ay = (C0027Ay) obj;
                C0027Ay c0027Ay2 = (C0027Ay) c0950e6.k;
                c0027Ay2.getClass();
                if (c0027Ay.i != null) {
                    StringBuilder sb = new StringBuilder("Cannot insert ");
                    sb.append(c0027Ay);
                    sb.append(" because it already has a parent. This tree: ");
                    sb.append(c0027Ay2.e(0));
                    sb.append(" Other tree: ");
                    C0027Ay c0027Ay3 = c0027Ay.i;
                    sb.append(c0027Ay3 != null ? c0027Ay3.e(0) : null);
                    AbstractC0868ct.W(sb.toString());
                    throw null;
                }
                if (c0027Ay.j != null) {
                    AbstractC0868ct.W("Cannot insert " + c0027Ay + " because it already has an owner. This tree: " + c0027Ay2.e(0) + " Other tree: " + c0027Ay.e(0));
                    throw null;
                }
                c0027Ay.i = c0027Ay2;
                C0208Hx c0208Hx = c0027Ay2.f;
                ((YD) c0208Hx.i).a(b, c0027Ay);
                ((C1139h0) c0208Hx.j).invoke();
                c0027Ay2.z();
                if (c0027Ay.b) {
                    c0027Ay2.e++;
                }
                c0027Ay2.u();
                ZG zg = c0027Ay2.j;
                if (zg != null) {
                    c0027Ay.b(zg);
                }
                if (c0027Ay.v.m > 0) {
                    C0209Hy c0209Hy = c0027Ay2.v;
                    c0209Hy.b(c0209Hy.m + 1);
                    return;
                }
                return;
            case 2:
                Object c = c0575Wb.c(0);
                C1471m2 c1471m23 = (C1471m2) c0575Wb.c(1);
                int b2 = c0575Wb.b(0);
                if (c instanceof C0836cN) {
                    ((ArrayList) c1970td.c).add(((C0836cN) c).a);
                }
                int c2 = c0972eS.c(c1471m23);
                int g2 = c0972eS.g(c0972eS.E(c2, b2));
                Object[] objArr = c0972eS.c;
                Object obj2 = objArr[g2];
                objArr[g2] = c;
                if (!(obj2 instanceof C0836cN)) {
                    if (obj2 instanceof WL) {
                        ((WL) obj2).d();
                        return;
                    }
                    return;
                }
                int o2 = c0972eS.o() - c0972eS.E(c2, b2);
                C0836cN c0836cN = (C0836cN) obj2;
                C1471m2 c1471m24 = c0836cN.b;
                if (c1471m24 == null || !c1471m24.a()) {
                    i = -1;
                    i2 = -1;
                } else {
                    i = c0972eS.c(c1471m24);
                    i2 = c0972eS.o() - c0972eS.f(c0972eS.b, c0972eS.p(c0972eS.q(i) + i));
                }
                c1970td.h(c0836cN.a, o2, i, i2);
                return;
            default:
                Object c3 = c0575Wb.c(0);
                int b3 = c0575Wb.b(0);
                if (c3 instanceof C0836cN) {
                    ((ArrayList) c1970td.c).add(((C0836cN) c3).a);
                }
                int g3 = c0972eS.g(c0972eS.E(c0972eS.t, b3));
                Object[] objArr2 = c0972eS.c;
                Object obj3 = objArr2[g3];
                objArr2[g3] = c3;
                if (obj3 instanceof C0836cN) {
                    c1970td.h(((C0836cN) obj3).a, c0972eS.o() - c0972eS.E(c0972eS.t, b3), -1, -1);
                    return;
                } else {
                    if (obj3 instanceof WL) {
                        ((WL) obj3).d();
                        return;
                    }
                    return;
                }
        }
    }

    @Override // o.JG
    public final String b(int i) {
        switch (this.c) {
            case 0:
                if (i != 0) {
                    break;
                }
                break;
            case 1:
                if (i != 0) {
                    break;
                }
                break;
            case 2:
                if (i != 0) {
                    break;
                }
                break;
            default:
                if (i != 0) {
                    break;
                }
                break;
        }
        return super.b(i);
    }

    @Override // o.JG
    public final String c(int i) {
        switch (this.c) {
            case 0:
                if (i != 0) {
                    if (i != 1) {
                        break;
                    }
                }
                break;
            case 1:
                if (i != 0) {
                    break;
                }
                break;
            case 2:
                if (i != 0) {
                    if (i != 1) {
                        break;
                    }
                }
                break;
            default:
                if (i != 0) {
                    break;
                }
                break;
        }
        return super.c(i);
    }
}
