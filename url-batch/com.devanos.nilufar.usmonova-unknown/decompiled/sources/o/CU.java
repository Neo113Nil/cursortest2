package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class CU implements InterfaceC0212Ib {
    public static CU a;

    @Override // o.InterfaceC0212Ib
    public long a() {
        return System.currentTimeMillis();
    }

    public void b(InterfaceC1738q4 interfaceC1738q4, InterfaceC1738q4 interfaceC1738q42) {
        HashSet hashSet = new HashSet();
        Iterator it = interfaceC1738q4.iterator();
        while (it.hasNext()) {
            hashSet.add(((InterfaceC0948e4) it.next()).e());
        }
        Iterator it2 = interfaceC1738q42.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((InterfaceC0948e4) it2.next()).e());
        }
    }

    public JR c(C1334k c1334k, OW ow, boolean z, int i, boolean z2) {
        OW I0;
        C1316ji c1316ji = (C1316ji) c1334k.j;
        AbstractC1701pX d = d(new C1767qX(1, c1316ji.J0()), c1334k, null, i);
        AbstractC1004ey b = d.b();
        AbstractC0048Bt.m(b, "expandedProjection.type");
        JR a2 = DY.a(b);
        if (AbstractC1473m3.P(a2)) {
            return a2;
        }
        d.a();
        b(a2.getAnnotations(), AbstractC1935t4.a(ow));
        if (!AbstractC1473m3.P(a2)) {
            if (AbstractC1473m3.P(a2)) {
                I0 = a2.A0();
            } else {
                OW A0 = a2.A0();
                C0208Hx c0208Hx = OW.i;
                AbstractC0048Bt.n(A0, "other");
                if (ow.isEmpty() && A0.isEmpty()) {
                    I0 = ow;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection values = ((ConcurrentHashMap) c0208Hx.i).values();
                    AbstractC0048Bt.m(values, "idPerType.values");
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        C1869s4 c1869s4 = (C1869s4) ow.h.get(intValue);
                        C1869s4 c1869s42 = (C1869s4) A0.h.get(intValue);
                        if (c1869s4 != null) {
                            if (c1869s42 != null) {
                                c1869s4 = new C1869s4(AbstractC0868ct.l(c1869s4.a, c1869s42.a));
                            }
                            c1869s42 = c1869s4;
                        } else if (c1869s42 == null) {
                            c1869s42 = null;
                        } else if (c1869s4 != null) {
                            c1869s42 = new C1869s4(AbstractC0868ct.l(c1869s42.a, c1869s4.a));
                        }
                        AbstractC1052fg.e(arrayList, c1869s42);
                    }
                    I0 = C0208Hx.I0(arrayList);
                }
            }
            a2 = DY.p(a2, null, I0, 1);
        }
        JR i2 = AbstractC2228xX.i(a2, z);
        if (!z2) {
            return i2;
        }
        C0876d0 c0876d0 = c1316ji.n;
        AbstractC0048Bt.m(c0876d0, "descriptor.typeConstructor");
        return TM.F(i2, HO.s((List) c1334k.k, VB.b, ow, c0876d0, z));
    }

    public AbstractC1701pX d(AbstractC1701pX abstractC1701pX, C1334k c1334k, InterfaceC1437lX interfaceC1437lX, int i) {
        int i2;
        C1316ji c1316ji = (C1316ji) c1334k.j;
        if (i > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + c1316ji.getName());
        }
        if (abstractC1701pX.c()) {
            AbstractC0048Bt.k(interfaceC1437lX);
            return AbstractC2228xX.j(interfaceC1437lX);
        }
        AbstractC1004ey b = abstractC1701pX.b();
        AbstractC0048Bt.m(b, "underlyingProjection.type");
        SW B0 = b.B0();
        AbstractC0048Bt.n(B0, "constructor");
        InterfaceC2364zb c = B0.c();
        AbstractC1701pX abstractC1701pX2 = c instanceof InterfaceC1437lX ? (AbstractC1701pX) ((Map) c1334k.l).get(c) : null;
        if (abstractC1701pX2 == null) {
            JR a2 = DY.a(abstractC1701pX.b().E0());
            if (!AbstractC1473m3.P(a2) && AbstractC2228xX.c(a2, RP.K, null)) {
                SW B02 = a2.B0();
                InterfaceC2364zb c2 = B02.c();
                B02.getParameters().size();
                a2.w0().size();
                if (!(c2 instanceof InterfaceC1437lX)) {
                    int i3 = 0;
                    if (!(c2 instanceof C1316ji)) {
                        JR f = f(a2, c1334k, i);
                        C2096vX.d(f);
                        for (Object obj : f.w0()) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                AbstractC0868ct.Y();
                                throw null;
                            }
                            AbstractC1701pX abstractC1701pX3 = (AbstractC1701pX) obj;
                            if (!abstractC1701pX3.c()) {
                                AbstractC1004ey b2 = abstractC1701pX3.b();
                                AbstractC0048Bt.m(b2, "substitutedArgument.type");
                                if (!AbstractC2228xX.c(b2, RP.J, null)) {
                                }
                            }
                            i3 = i4;
                        }
                        return new C1767qX(abstractC1701pX.a(), f);
                    }
                    C1316ji c1316ji2 = (C1316ji) c2;
                    if (c1334k.A(c1316ji2)) {
                        String str = c1316ji2.getName().h;
                        AbstractC0048Bt.m(str, "typeDescriptor.name.toString()");
                        return new C1767qX(1, C0273Kk.c(EnumC0247Jk.m, str));
                    }
                    List w0 = a2.w0();
                    ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(w0));
                    for (Object obj2 : w0) {
                        int i5 = i3 + 1;
                        if (i3 < 0) {
                            AbstractC0868ct.Y();
                            throw null;
                        }
                        arrayList.add(d((AbstractC1701pX) obj2, c1334k, (InterfaceC1437lX) B02.getParameters().get(i3), i + 1));
                        i3 = i5;
                    }
                    List parameters = c1316ji2.n.getParameters();
                    ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(parameters));
                    Iterator it = parameters.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((InterfaceC1437lX) it.next()).a());
                    }
                    return new C1767qX(abstractC1701pX.a(), TM.F(c(new C1334k(c1334k, c1316ji2, arrayList, EB.V(AbstractC0720ac.O0(arrayList2, arrayList)), 18), a2.A0(), a2.C0(), i + 1, false), f(a2, c1334k, i)));
                }
            }
            return abstractC1701pX;
        }
        if (abstractC1701pX2.c()) {
            AbstractC0048Bt.k(interfaceC1437lX);
            return AbstractC2228xX.j(interfaceC1437lX);
        }
        AbstractC2097vY E0 = abstractC1701pX2.b().E0();
        int a3 = abstractC1701pX2.a();
        AbstractC1888sN.t(a3, "argument.projectionKind");
        int a4 = abstractC1701pX.a();
        AbstractC1888sN.t(a4, "underlyingProjection.projectionKind");
        if (a4 != a3 && a4 != 1) {
            if (a3 == 1) {
                a3 = a4;
            } else {
                AbstractC0048Bt.n(c1316ji, "typeAlias");
            }
        }
        if (interfaceC1437lX == null || (i2 = interfaceC1437lX.Y()) == 0) {
            i2 = 1;
        }
        if (i2 != a3 && i2 != 1) {
            if (a3 == 1) {
                a3 = 1;
            } else {
                AbstractC0048Bt.n(c1316ji, "typeAlias");
            }
        }
        b(b.getAnnotations(), E0.getAnnotations());
        JR i6 = AbstractC2228xX.i(DY.a(E0), b.C0());
        OW A0 = b.A0();
        if (!AbstractC1473m3.P(i6)) {
            if (AbstractC1473m3.P(i6)) {
                A0 = i6.A0();
            } else {
                OW A02 = i6.A0();
                A0.getClass();
                C0208Hx c0208Hx = OW.i;
                AbstractC0048Bt.n(A02, "other");
                if (!A0.isEmpty() || !A02.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    Collection values = ((ConcurrentHashMap) c0208Hx.i).values();
                    AbstractC0048Bt.m(values, "idPerType.values");
                    Iterator it2 = values.iterator();
                    while (it2.hasNext()) {
                        int intValue = ((Number) it2.next()).intValue();
                        C1869s4 c1869s4 = (C1869s4) A0.h.get(intValue);
                        C1869s4 c1869s42 = (C1869s4) A02.h.get(intValue);
                        if (c1869s4 != null) {
                            if (c1869s42 != null) {
                                c1869s4 = new C1869s4(AbstractC0868ct.l(c1869s4.a, c1869s42.a));
                            }
                            c1869s42 = c1869s4;
                        } else if (c1869s42 == null) {
                            c1869s42 = null;
                        } else if (c1869s4 != null) {
                            c1869s42 = new C1869s4(AbstractC0868ct.l(c1869s42.a, c1869s4.a));
                        }
                        AbstractC1052fg.e(arrayList3, c1869s42);
                    }
                    A0 = C0208Hx.I0(arrayList3);
                }
            }
            i6 = DY.p(i6, null, A0, 1);
        }
        return new C1767qX(a3, i6);
    }

    public boolean e(CharSequence charSequence) {
        return false;
    }

    public JR f(JR jr, C1334k c1334k, int i) {
        SW B0 = jr.B0();
        List w0 = jr.w0();
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(w0));
        int i2 = 0;
        for (Object obj : w0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0868ct.Y();
                throw null;
            }
            AbstractC1701pX abstractC1701pX = (AbstractC1701pX) obj;
            AbstractC1701pX d = d(abstractC1701pX, c1334k, (InterfaceC1437lX) B0.getParameters().get(i2), i + 1);
            if (!d.c()) {
                d = new C1767qX(d.a(), AbstractC2228xX.h(d.b(), abstractC1701pX.b().C0()));
            }
            arrayList.add(d);
            i2 = i3;
        }
        return DY.p(jr, arrayList, null, 2);
    }
}
