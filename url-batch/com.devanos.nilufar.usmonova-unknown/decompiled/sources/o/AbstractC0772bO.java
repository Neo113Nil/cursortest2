package o;

import android.view.View;
import com.devanos.nilufar.usmonova.R;
import java.io.EOFException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: o.bO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0772bO {
    public static Field a;
    public static boolean b;
    public static Class c;
    public static boolean d;
    public static Field e;
    public static boolean f;
    public static Field g;
    public static boolean h;

    public static final C1767qX a(AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC1004ey, "<this>");
        return new C1767qX(1, abstractC1004ey);
    }

    public static final boolean b(C1032fM c1032fM, C1032fM c1032fM2, C1032fM c1032fM3, int i) {
        float f2;
        float f3;
        boolean c2 = c(i, c1032fM3, c1032fM);
        float f4 = c1032fM3.b;
        float f5 = c1032fM3.d;
        float f6 = c1032fM3.a;
        float f7 = c1032fM3.c;
        float f8 = c1032fM.d;
        float f9 = c1032fM.b;
        float f10 = c1032fM.c;
        float f11 = c1032fM.a;
        if (c2 || !c(i, c1032fM2, c1032fM)) {
            return false;
        }
        if (i == 3) {
            if (f11 < f7) {
                return true;
            }
        } else if (i == 4) {
            if (f10 > f6) {
                return true;
            }
        } else if (i == 5) {
            if (f9 < f5) {
                return true;
            }
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (f8 > f4) {
                return true;
            }
        }
        if (i == 3 || i == 4) {
            return true;
        }
        if (i == 3) {
            f2 = f11 - c1032fM2.c;
        } else if (i == 4) {
            f2 = c1032fM2.a - f10;
        } else if (i == 5) {
            f2 = f9 - c1032fM2.d;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f2 = c1032fM2.b - f8;
        }
        float max = Math.max(0.0f, f2);
        if (i == 3) {
            f3 = f11 - f6;
        } else if (i == 4) {
            f3 = f7 - f10;
        } else if (i == 5) {
            f3 = f9 - f4;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f3 = f5 - f8;
        }
        return max < Math.max(1.0f, f3);
    }

    public static final boolean c(int i, C1032fM c1032fM, C1032fM c1032fM2) {
        if (i == 3 || i == 4) {
            return c1032fM.d > c1032fM2.b && c1032fM.b < c1032fM2.d;
        }
        if (i == 5 || i == 6) {
            return c1032fM.c > c1032fM2.a && c1032fM.a < c1032fM2.c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final void d(C0405Pn c0405Pn, YD yd) {
        TC tc = c0405Pn.b;
        if (!tc.m) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        YD yd2 = new YD(new TC[16]);
        TC tc2 = tc.f;
        if (tc2 == null) {
            AbstractC0946e20.c(yd2, tc);
        } else {
            yd2.b(tc2);
        }
        while (yd2.l()) {
            TC tc3 = (TC) yd2.n(yd2.j - 1);
            if ((tc3.d & 1024) == 0) {
                AbstractC0946e20.c(yd2, tc3);
            } else {
                while (true) {
                    if (tc3 == null) {
                        break;
                    }
                    if ((tc3.c & 1024) != 0) {
                        while (tc3 != null) {
                            if (tc3 instanceof C0405Pn) {
                                C0405Pn c0405Pn2 = (C0405Pn) tc3;
                                if (c0405Pn2.m && !AbstractC0946e20.J(c0405Pn2).B) {
                                    if (c0405Pn2.q().a) {
                                        yd.b(c0405Pn2);
                                    } else {
                                        d(c0405Pn2, yd);
                                    }
                                }
                            }
                            tc3 = null;
                        }
                    } else {
                        tc3 = tc3.f;
                    }
                }
            }
        }
    }

    public static final boolean e(AbstractC1004ey abstractC1004ey, SW sw, Set set) {
        boolean e2;
        if (AbstractC0048Bt.h(abstractC1004ey.B0(), sw)) {
            return true;
        }
        InterfaceC2364zb c2 = abstractC1004ey.B0().c();
        InterfaceC0004Ab interfaceC0004Ab = c2 instanceof InterfaceC0004Ab ? (InterfaceC0004Ab) c2 : null;
        List p = interfaceC0004Ab != null ? interfaceC0004Ab.p() : null;
        Iterable N0 = AbstractC0720ac.N0(abstractC1004ey.w0());
        if (!(N0 instanceof Collection) || !((Collection) N0).isEmpty()) {
            Iterator it = N0.iterator();
            do {
                C1779qj c1779qj = (C1779qj) it;
                if (c1779qj.i.hasNext()) {
                    C0021As c0021As = (C0021As) c1779qj.next();
                    int i = c0021As.a;
                    AbstractC1701pX abstractC1701pX = (AbstractC1701pX) c0021As.b;
                    InterfaceC1437lX interfaceC1437lX = p != null ? (InterfaceC1437lX) AbstractC0720ac.q0(i, p) : null;
                    if ((interfaceC1437lX == null || set == null || !set.contains(interfaceC1437lX)) && !abstractC1701pX.c()) {
                        AbstractC1004ey b2 = abstractC1701pX.b();
                        AbstractC0048Bt.m(b2, "argument.type");
                        e2 = e(b2, sw, set);
                    } else {
                        e2 = false;
                    }
                }
            } while (!e2);
            return true;
        }
        return false;
    }

    public static final C1767qX f(AbstractC1004ey abstractC1004ey, int i, InterfaceC1437lX interfaceC1437lX) {
        AbstractC0048Bt.n(abstractC1004ey, "type");
        AbstractC1888sN.p(i, "projectionKind");
        if ((interfaceC1437lX != null ? interfaceC1437lX.Y() : 0) == i) {
            i = 1;
        }
        return new C1767qX(i, abstractC1004ey);
    }

    public static String g(C1151h9 c1151h9) {
        StringBuilder sb = new StringBuilder(c1151h9.size());
        for (int i = 0; i < c1151h9.size(); i++) {
            byte j = c1151h9.j(i);
            if (j == 34) {
                sb.append("\\\"");
            } else if (j == 39) {
                sb.append("\\'");
            } else if (j != 92) {
                switch (j) {
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (j < 32 || j > 126) {
                            sb.append('\\');
                            sb.append((char) (((j >>> 6) & 3) + 48));
                            sb.append((char) (((j >>> 3) & 7) + 48));
                            sb.append((char) ((j & 7) + 48));
                            break;
                        } else {
                            sb.append((char) j);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final void h(AbstractC1004ey abstractC1004ey, JR jr, LinkedHashSet linkedHashSet, Set set) {
        InterfaceC2364zb c2 = abstractC1004ey.B0().c();
        if (c2 instanceof InterfaceC1437lX) {
            if (!AbstractC0048Bt.h(abstractC1004ey.B0(), jr.B0())) {
                linkedHashSet.add(c2);
                return;
            }
            for (AbstractC1004ey abstractC1004ey2 : ((InterfaceC1437lX) c2).getUpperBounds()) {
                AbstractC0048Bt.m(abstractC1004ey2, "upperBound");
                h(abstractC1004ey2, jr, linkedHashSet, set);
            }
            return;
        }
        InterfaceC2364zb c3 = abstractC1004ey.B0().c();
        InterfaceC0004Ab interfaceC0004Ab = c3 instanceof InterfaceC0004Ab ? (InterfaceC0004Ab) c3 : null;
        List p = interfaceC0004Ab != null ? interfaceC0004Ab.p() : null;
        int i = 0;
        for (AbstractC1701pX abstractC1701pX : abstractC1004ey.w0()) {
            int i2 = i + 1;
            InterfaceC1437lX interfaceC1437lX = p != null ? (InterfaceC1437lX) AbstractC0720ac.q0(i, p) : null;
            if ((interfaceC1437lX == null || set == null || !set.contains(interfaceC1437lX)) && !abstractC1701pX.c() && !AbstractC0720ac.j0(linkedHashSet, abstractC1701pX.b().B0().c()) && !AbstractC0048Bt.h(abstractC1701pX.b().B0(), jr.B0())) {
                AbstractC1004ey b2 = abstractC1701pX.b();
                AbstractC0048Bt.m(b2, "argument.type");
                h(b2, jr, linkedHashSet, set);
            }
            i = i2;
        }
    }

    public static final C0405Pn i(YD yd, C1032fM c1032fM, int i) {
        C1032fM d2;
        if (i == 3) {
            d2 = c1032fM.d(c1032fM.c() + 1, 0.0f);
        } else if (i == 4) {
            d2 = c1032fM.d(-(c1032fM.c() + 1), 0.0f);
        } else if (i == 5) {
            d2 = c1032fM.d(0.0f, c1032fM.b() + 1);
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            d2 = c1032fM.d(0.0f, -(c1032fM.b() + 1));
        }
        int i2 = yd.j;
        C0405Pn c0405Pn = null;
        if (i2 > 0) {
            Object[] objArr = yd.h;
            int i3 = 0;
            do {
                C0405Pn c0405Pn2 = (C0405Pn) objArr[i3];
                if (AbstractC1052fg.G(c0405Pn2)) {
                    C1032fM s = AbstractC1052fg.s(c0405Pn2);
                    if (q(i, s, c1032fM) && (!q(i, d2, c1032fM) || b(c1032fM, s, d2, i) || (!b(c1032fM, d2, s, i) && r(i, c1032fM, s) < r(i, c1032fM, d2)))) {
                        c0405Pn = c0405Pn2;
                        d2 = s;
                    }
                }
                i3++;
            } while (i3 < i2);
        }
        return c0405Pn;
    }

    public static final boolean j(C0405Pn c0405Pn, int i, InterfaceC2114vp interfaceC2114vp) {
        C1032fM c1032fM;
        YD yd = new YD(new C0405Pn[16]);
        d(c0405Pn, yd);
        if (yd.j <= 1) {
            C0405Pn c0405Pn2 = (C0405Pn) (yd.k() ? null : yd.h[0]);
            if (c0405Pn2 != null) {
                return ((Boolean) interfaceC2114vp.invoke(c0405Pn2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                C1032fM s = AbstractC1052fg.s(c0405Pn);
                float f2 = s.a;
                float f3 = s.b;
                c1032fM = new C1032fM(f2, f3, f2, f3);
            } else {
                if (i != 3 && i != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                C1032fM s2 = AbstractC1052fg.s(c0405Pn);
                float f4 = s2.c;
                float f5 = s2.d;
                c1032fM = new C1032fM(f4, f5, f4, f5);
            }
            C0405Pn i2 = i(yd, c1032fM, i);
            if (i2 != null) {
                return ((Boolean) interfaceC2114vp.invoke(i2)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean k(int i, C0660Zi c0660Zi, C0405Pn c0405Pn, C1032fM c1032fM) {
        if (x(i, c0660Zi, c0405Pn, c1032fM)) {
            return true;
        }
        AbstractC1807r8.W(c0405Pn);
        return false;
    }

    public static final AbstractC0545Ux l(AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC1004ey, "<this>");
        AbstractC0545Ux l = abstractC1004ey.B0().l();
        AbstractC0048Bt.m(l, "constructor.builtIns");
        return l;
    }

    public static final AbstractC1004ey m(InterfaceC1437lX interfaceC1437lX) {
        Object obj;
        List upperBounds = interfaceC1437lX.getUpperBounds();
        AbstractC0048Bt.m(upperBounds, "upperBounds");
        upperBounds.isEmpty();
        List upperBounds2 = interfaceC1437lX.getUpperBounds();
        AbstractC0048Bt.m(upperBounds2, "upperBounds");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC2364zb c2 = ((AbstractC1004ey) next).B0().c();
            InterfaceC1245ib interfaceC1245ib = c2 instanceof InterfaceC1245ib ? (InterfaceC1245ib) c2 : null;
            if (interfaceC1245ib != null && interfaceC1245ib.B() != 2 && interfaceC1245ib.B() != 5) {
                obj = next;
                break;
            }
        }
        AbstractC1004ey abstractC1004ey = (AbstractC1004ey) obj;
        if (abstractC1004ey != null) {
            return abstractC1004ey;
        }
        List upperBounds3 = interfaceC1437lX.getUpperBounds();
        AbstractC0048Bt.m(upperBounds3, "upperBounds");
        Object n0 = AbstractC0720ac.n0(upperBounds3);
        AbstractC0048Bt.m(n0, "upperBounds.first()");
        return (AbstractC1004ey) n0;
    }

    public static final AbstractC1760qQ n(Object obj) {
        if (obj != PX.h) {
            return (AbstractC1760qQ) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final Object o(XE xe, InterfaceC0937dx interfaceC0937dx) {
        AbstractC0048Bt.n(xe, "<this>");
        AbstractC0048Bt.n(interfaceC0937dx, "p");
        return xe.invoke();
    }

    public static final boolean p(InterfaceC1437lX interfaceC1437lX, SW sw, Set set) {
        AbstractC0048Bt.n(interfaceC1437lX, "typeParameter");
        List<AbstractC1004ey> upperBounds = interfaceC1437lX.getUpperBounds();
        AbstractC0048Bt.m(upperBounds, "typeParameter.upperBounds");
        if (upperBounds.isEmpty()) {
            return false;
        }
        for (AbstractC1004ey abstractC1004ey : upperBounds) {
            AbstractC0048Bt.m(abstractC1004ey, "upperBound");
            if (e(abstractC1004ey, interfaceC1437lX.i().B0(), set) && (sw == null || AbstractC0048Bt.h(abstractC1004ey.B0(), sw))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean q(int i, C1032fM c1032fM, C1032fM c1032fM2) {
        float f2 = c1032fM.b;
        float f3 = c1032fM.d;
        float f4 = c1032fM.a;
        float f5 = c1032fM.c;
        if (i == 3) {
            float f6 = c1032fM2.c;
            float f7 = c1032fM2.a;
            return (f6 > f5 || f7 >= f5) && f7 > f4;
        }
        if (i == 4) {
            float f8 = c1032fM2.a;
            float f9 = c1032fM2.c;
            return (f8 < f4 || f9 <= f4) && f9 < f5;
        }
        if (i == 5) {
            float f10 = c1032fM2.d;
            float f11 = c1032fM2.b;
            return (f10 > f3 || f11 >= f3) && f11 > f2;
        }
        if (i != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f12 = c1032fM2.b;
        float f13 = c1032fM2.d;
        return (f12 < f2 || f13 <= f2) && f13 < f3;
    }

    public static final long r(int i, C1032fM c1032fM, C1032fM c1032fM2) {
        float f2;
        float f3;
        float f4;
        float b2;
        float b3;
        float f5 = c1032fM2.b;
        float f6 = c1032fM2.a;
        if (i != 3) {
            if (i == 4) {
                f2 = f6 - c1032fM.c;
            } else if (i == 5) {
                f3 = c1032fM.b;
                f4 = c1032fM2.d;
            } else {
                if (i != 6) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                f2 = f5 - c1032fM.d;
            }
            long abs = (long) Math.abs(Math.max(0.0f, f2));
            if (i == 3 || i == 4) {
                float f7 = 2;
                b2 = (c1032fM.b() / f7) + c1032fM.b;
                b3 = (c1032fM2.b() / f7) + f5;
            } else {
                if (i != 5 && i != 6) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                float f8 = 2;
                b2 = (c1032fM.c() / f8) + c1032fM.a;
                b3 = (c1032fM2.c() / f8) + f6;
            }
            long abs2 = (long) Math.abs(b2 - b3);
            return (abs2 * abs2) + (13 * abs * abs);
        }
        f3 = c1032fM.a;
        f4 = c1032fM2.c;
        f2 = f3 - f4;
        long abs3 = (long) Math.abs(Math.max(0.0f, f2));
        if (i == 3) {
            if (i != 5) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f82 = 2;
            b2 = (c1032fM.c() / f82) + c1032fM.a;
            b3 = (c1032fM2.c() / f82) + f6;
            long abs22 = (long) Math.abs(b2 - b3);
            return (abs22 * abs22) + (13 * abs3 * abs3);
        }
        float f72 = 2;
        b2 = (c1032fM.b() / f72) + c1032fM.b;
        b3 = (c1032fM2.b() / f72) + f5;
        long abs222 = (long) Math.abs(b2 - b3);
        return (abs222 * abs222) + (13 * abs3 * abs3);
    }

    public static final boolean s(Object obj) {
        return obj == PX.h;
    }

    public static final boolean t(G8 g8) {
        G8 g82;
        int i;
        AbstractC0048Bt.n(g8, "<this>");
        try {
            g82 = new G8();
            long j = g8.i;
            long j2 = 64;
            if (j <= 64) {
                j2 = j;
            }
            g8.k(g82, 0L, j2);
        } catch (EOFException unused) {
        }
        for (i = 0; i < 16; i++) {
            if (g82.m()) {
                return true;
            }
            int I = g82.I();
            if (Character.isISOControl(I) && !Character.isWhitespace(I)) {
                return false;
            }
        }
        return true;
    }

    public static final AbstractC2097vY u(AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC1004ey, "<this>");
        AbstractC2097vY g2 = AbstractC2228xX.g(abstractC1004ey, true);
        AbstractC0048Bt.m(g2, "makeNullable(this)");
        return g2;
    }

    public static final AbstractC1004ey v(AbstractC1004ey abstractC1004ey, InterfaceC1738q4 interfaceC1738q4) {
        return (abstractC1004ey.getAnnotations().isEmpty() && interfaceC1738q4.isEmpty()) ? abstractC1004ey : abstractC1004ey.E0().H0(AbstractC1494mO.j(abstractC1004ey.A0(), interfaceC1738q4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [o.vY] */
    public static final AbstractC2097vY w(AbstractC1004ey abstractC1004ey) {
        JR jr;
        AbstractC0048Bt.n(abstractC1004ey, "<this>");
        AbstractC2097vY E0 = abstractC1004ey.E0();
        if (E0 instanceof AbstractC1782qm) {
            AbstractC1782qm abstractC1782qm = (AbstractC1782qm) E0;
            JR jr2 = abstractC1782qm.i;
            if (!jr2.B0().getParameters().isEmpty() && jr2.B0().c() != null) {
                List parameters = jr2.B0().getParameters();
                AbstractC0048Bt.m(parameters, "constructor.parameters");
                ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(parameters));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C1631oT((InterfaceC1437lX) it.next()));
                }
                jr2 = DY.p(jr2, arrayList, null, 2);
            }
            JR jr3 = abstractC1782qm.j;
            if (!jr3.B0().getParameters().isEmpty() && jr3.B0().c() != null) {
                List parameters2 = jr3.B0().getParameters();
                AbstractC0048Bt.m(parameters2, "constructor.parameters");
                ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(parameters2));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C1631oT((InterfaceC1437lX) it2.next()));
                }
                jr3 = DY.p(jr3, arrayList2, null, 2);
            }
            jr = HO.m(jr2, jr3);
        } else {
            if (!(E0 instanceof JR)) {
                throw new C0057Cc();
            }
            JR jr4 = (JR) E0;
            boolean isEmpty = jr4.B0().getParameters().isEmpty();
            jr = jr4;
            if (!isEmpty) {
                InterfaceC2364zb c2 = jr4.B0().c();
                jr = jr4;
                if (c2 != null) {
                    List parameters3 = jr4.B0().getParameters();
                    AbstractC0048Bt.m(parameters3, "constructor.parameters");
                    ArrayList arrayList3 = new ArrayList(AbstractC0786bc.d0(parameters3));
                    Iterator it3 = parameters3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new C1631oT((InterfaceC1437lX) it3.next()));
                    }
                    jr = DY.p(jr4, arrayList3, null, 2);
                }
            }
        }
        return AbstractC1494mO.h(jr, E0);
    }

    public static final boolean x(int i, C0660Zi c0660Zi, C0405Pn c0405Pn, C1032fM c1032fM) {
        C0405Pn i2;
        YD yd = new YD(new C0405Pn[16]);
        TC tc = c0405Pn.b;
        if (!tc.m) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        YD yd2 = new YD(new TC[16]);
        TC tc2 = tc.f;
        if (tc2 == null) {
            AbstractC0946e20.c(yd2, tc);
        } else {
            yd2.b(tc2);
        }
        while (yd2.l()) {
            TC tc3 = (TC) yd2.n(yd2.j - 1);
            if ((tc3.d & 1024) == 0) {
                AbstractC0946e20.c(yd2, tc3);
            } else {
                while (true) {
                    if (tc3 == null) {
                        break;
                    }
                    if ((tc3.c & 1024) != 0) {
                        while (tc3 != null) {
                            if (tc3 instanceof C0405Pn) {
                                C0405Pn c0405Pn2 = (C0405Pn) tc3;
                                if (c0405Pn2.m) {
                                    yd.b(c0405Pn2);
                                }
                            }
                            tc3 = null;
                        }
                    } else {
                        tc3 = tc3.f;
                    }
                }
            }
        }
        while (yd.l() && (i2 = i(yd, c1032fM, i)) != null) {
            if (i2.q().a) {
                return ((Boolean) c0660Zi.invoke(i2)).booleanValue();
            }
            if (k(i, c0660Zi, i2, c1032fM)) {
                return true;
            }
            yd.m(i2);
        }
        return false;
    }

    public static final void y(View view, ZF zf) {
        AbstractC0048Bt.n(view, "<this>");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, zf);
    }

    public static final Boolean z(int i, C0660Zi c0660Zi, C0405Pn c0405Pn, C1032fM c1032fM) {
        int ordinal = c0405Pn.s().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C0405Pn t = AbstractC1052fg.t(c0405Pn);
                if (t == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = t.s().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean z = z(i, c0660Zi, t, c1032fM);
                        if (!AbstractC0048Bt.h(z, Boolean.FALSE)) {
                            return z;
                        }
                        if (c1032fM == null) {
                            if (t.s() != EnumC0379On.i) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            C0405Pn m = AbstractC1052fg.m(t);
                            if (m == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            c1032fM = AbstractC1052fg.s(m);
                        }
                        return Boolean.valueOf(k(i, c0660Zi, c0405Pn, c1032fM));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            throw new C0057Cc();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (c1032fM == null) {
                    c1032fM = AbstractC1052fg.s(t);
                }
                return Boolean.valueOf(k(i, c0660Zi, c0405Pn, c1032fM));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return c0405Pn.q().a ? (Boolean) c0660Zi.invoke(c0405Pn) : c1032fM == null ? Boolean.valueOf(j(c0405Pn, i, c0660Zi)) : Boolean.valueOf(x(i, c0660Zi, c0405Pn, c1032fM));
                }
                throw new C0057Cc();
            }
        }
        return Boolean.valueOf(j(c0405Pn, i, c0660Zi));
    }
}
