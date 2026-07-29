package o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class SB {
    public final C0321Mh a;
    public final C2002u5 b;

    public SB(C0321Mh c0321Mh) {
        this.a = c0321Mh;
        C0296Lh c0296Lh = c0321Mh.a;
        this.b = new C2002u5(c0296Lh.b, c0296Lh.l);
    }

    public final AbstractC0900dL a(InterfaceC1118gg interfaceC1118gg) {
        if (interfaceC1118gg instanceof InterfaceC0961eH) {
            C2245xo c2245xo = ((AbstractC1027fH) ((InterfaceC0961eH) interfaceC1118gg)).l;
            C0321Mh c0321Mh = this.a;
            return new C0834cL(c2245xo, c0321Mh.b, c0321Mh.d, c0321Mh.g);
        }
        if (interfaceC1118gg instanceof C0581Wh) {
            return ((C0581Wh) interfaceC1118gg).C;
        }
        return null;
    }

    public final InterfaceC1738q4 b(AbstractC1917sq abstractC1917sq, int i, int i2) {
        return !AbstractC1650om.c.c(i).booleanValue() ? C0460Rq.t : new QE(this.a.a.a, new PB(this, abstractC1917sq, i2, 0));
    }

    public final InterfaceC1738q4 c(CK ck, boolean z) {
        return !AbstractC1650om.c.c(ck.k).booleanValue() ? C0460Rq.t : new QE(this.a.a.a, new C0348Ni(this, z, ck));
    }

    public final C0399Ph d(C1162hK c1162hK, boolean z) {
        C0321Mh a;
        C0321Mh c0321Mh = this.a;
        InterfaceC1118gg interfaceC1118gg = c0321Mh.c;
        AbstractC0048Bt.l(interfaceC1118gg, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        InterfaceC1245ib interfaceC1245ib = (InterfaceC1245ib) interfaceC1118gg;
        C0399Ph c0399Ph = new C0399Ph(interfaceC1245ib, null, b(c1162hK, c1162hK.k, 1), z, 1, c1162hK, c0321Mh.b, c0321Mh.d, c0321Mh.e, c0321Mh.g, null);
        a = c0321Mh.a(c0399Ph, C1318jk.h, c0321Mh.b, c0321Mh.d, c0321Mh.e, c0321Mh.f);
        SB sb = a.i;
        List list = c1162hK.l;
        AbstractC0048Bt.m(list, "proto.valueParameterList");
        c0399Ph.V0(sb.g(list, c1162hK, 1), PX.E((EnumC0703aL) AbstractC1650om.d.c(c1162hK.k)));
        c0399Ph.R0(interfaceC1245ib.i());
        c0399Ph.y = interfaceC1245ib.X();
        c0399Ph.C = !AbstractC1650om.n.c(c1162hK.k).booleanValue();
        return c0399Ph;
    }

    public final C1251ii e(C2017uK c2017uK) {
        int i;
        C0321Mh a;
        AbstractC1004ey g;
        C1672p4 c1672p4 = C0460Rq.t;
        C0321Mh c0321Mh = this.a;
        InterfaceC0893dE interfaceC0893dE = c0321Mh.b;
        C0695aD c0695aD = c0321Mh.d;
        AbstractC0048Bt.n(c2017uK, "proto");
        int i2 = 1;
        if ((c2017uK.j & 1) == 1) {
            i = c2017uK.k;
        } else {
            int i3 = c2017uK.l;
            i = ((i3 >> 8) << 6) + (i3 & 63);
        }
        InterfaceC1738q4 b = b(c2017uK, i, 1);
        int i4 = c2017uK.j;
        InterfaceC1738q4 c0347Nh = ((i4 & 32) == 32 || (i4 & 64) == 64) ? new C0347Nh(c0321Mh.a.a, new PB(this, c2017uK, i2, 1)) : c1672p4;
        int i5 = i;
        C1251ii c1251ii = new C1251ii(c0321Mh.c, null, b, AbstractC1052fg.C(interfaceC0893dE, c2017uK.m), PX.y0((EnumC2083vK) AbstractC1650om.f207o.c(i)), c2017uK, c0321Mh.b, c0695aD, AbstractC0192Hh.g(c0321Mh.c).c(AbstractC1052fg.C(interfaceC0893dE, c2017uK.m)).equals(AbstractC2093vU.a) ? C1097gL.p : c0321Mh.e, c0321Mh.g, null);
        List list = c2017uK.p;
        AbstractC0048Bt.m(list, "proto.typeParameterList");
        a = c0321Mh.a(c1251ii, list, c0321Mh.b, c0321Mh.d, c0321Mh.e, c0321Mh.f);
        XW xw = a.h;
        MK E = AbstractC0946e20.E(c2017uK, c0695aD);
        C0261Jy A = (E == null || (g = xw.g(E)) == null) ? null : AbstractC1807r8.A(c1251ii, g, c0347Nh);
        InterfaceC1118gg interfaceC1118gg = c0321Mh.c;
        InterfaceC1245ib interfaceC1245ib = interfaceC1118gg instanceof InterfaceC1245ib ? (InterfaceC1245ib) interfaceC1118gg : null;
        C0261Jy z0 = interfaceC1245ib != null ? interfaceC1245ib.z0() : null;
        List list2 = c2017uK.s;
        if (list2.isEmpty()) {
            list2 = null;
        }
        if (list2 == null) {
            List<Integer> list3 = c2017uK.t;
            AbstractC0048Bt.m(list3, "contextReceiverTypeIdList");
            ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(list3));
            for (Integer num : list3) {
                AbstractC0048Bt.m(num, "it");
                arrayList.add(c0695aD.a(num.intValue()));
            }
            list2 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i6 = 0;
        for (Object obj : list2) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                AbstractC0868ct.Y();
                throw null;
            }
            C0261Jy u = AbstractC1807r8.u(c1251ii, xw.g((MK) obj), null, c1672p4, i6);
            if (u != null) {
                arrayList2.add(u);
            }
            i6 = i7;
        }
        List b2 = xw.b();
        SB sb = a.i;
        List list4 = c2017uK.v;
        AbstractC0048Bt.m(list4, "proto.valueParameterList");
        c1251ii.V0(A, z0, arrayList2, b2, sb.g(list4, c2017uK, 1), xw.g(AbstractC0946e20.L(c2017uK, c0695aD)), C1097gL.G0((EnumC2149wK) AbstractC1650om.e.c(i5)), PX.E((EnumC0703aL) AbstractC1650om.d.c(i5)), C1384kk.h);
        c1251ii.t = AbstractC1650om.p.c(i5).booleanValue();
        c1251ii.u = AbstractC1650om.q.c(i5).booleanValue();
        c1251ii.v = AbstractC1650om.t.c(i5).booleanValue();
        c1251ii.w = AbstractC1650om.r.c(i5).booleanValue();
        c1251ii.x = AbstractC1650om.s.c(i5).booleanValue();
        c1251ii.B = AbstractC1650om.u.c(i5).booleanValue();
        c1251ii.y = AbstractC1650om.v.c(i5).booleanValue();
        c1251ii.C = !AbstractC1650om.w.c(i5).booleanValue();
        c0321Mh.a.m.getClass();
        return c1251ii;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0137  */
    /* JADX WARN: Type inference failed for: r2v15, types: [o.RA] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [o.WJ] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r7v0, types: [o.PJ, o.RJ, o.hi, o.jg, o.v9] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1186hi f(CK ck) {
        int i;
        C0321Mh a;
        SB sb;
        InterfaceC1738q4 interfaceC1738q4;
        List list;
        EnumC0703aL enumC0703aL;
        boolean z;
        int i2;
        C0321Mh c0321Mh;
        Throwable th;
        C0321Mh c0321Mh2;
        int i3;
        boolean z2;
        C1518mm c1518mm;
        C1452lm c1452lm;
        C1518mm c1518mm2;
        C1452lm c1452lm2;
        C1452lm c1452lm3;
        int i4;
        SB sb2;
        SJ sj;
        SJ sj2;
        ?? r6;
        C0321Mh a2;
        AbstractC1004ey g;
        C1672p4 c1672p4 = C0460Rq.t;
        C0321Mh c0321Mh3 = this.a;
        C0695aD c0695aD = c0321Mh3.d;
        AbstractC0048Bt.n(ck, "proto");
        if ((ck.j & 1) == 1) {
            i = ck.k;
        } else {
            int i5 = ck.l;
            i = ((i5 >> 8) << 6) + (i5 & 63);
        }
        int i6 = i;
        ?? c1186hi = new C1186hi(c0321Mh3.c, null, b(ck, i, 2), C1097gL.G0((EnumC2149wK) AbstractC1650om.e.c(i)), PX.E((EnumC0703aL) AbstractC1650om.d.c(i)), AbstractC1650om.x.c(i).booleanValue(), AbstractC1052fg.C(c0321Mh3.b, ck.m), PX.y0((EnumC2083vK) AbstractC1650om.f207o.c(i)), AbstractC1650om.B.c(i).booleanValue(), AbstractC1650om.A.c(i).booleanValue(), AbstractC1650om.D.c(i).booleanValue(), AbstractC1650om.E.c(i).booleanValue(), AbstractC1650om.F.c(i).booleanValue(), ck, c0321Mh3.b, c0695aD, c0321Mh3.e, c0321Mh3.g);
        List list2 = ck.p;
        AbstractC0048Bt.m(list2, "proto.typeParameterList");
        a = c0321Mh3.a(c1186hi, list2, c0321Mh3.b, c0321Mh3.d, c0321Mh3.e, c0321Mh3.f);
        XW xw = a.h;
        boolean booleanValue = AbstractC1650om.y.c(i6).booleanValue();
        int i7 = 3;
        if (booleanValue) {
            int i8 = ck.j;
            if ((i8 & 32) == 32 || (i8 & 64) == 64) {
                sb = this;
                interfaceC1738q4 = new C0347Nh(c0321Mh3.a.a, new PB(sb, ck, i7, 1));
                AbstractC1004ey g2 = xw.g(AbstractC0946e20.M(ck, c0695aD));
                List b = xw.b();
                InterfaceC1118gg interfaceC1118gg = c0321Mh3.c;
                InterfaceC1245ib interfaceC1245ib = !(interfaceC1118gg instanceof InterfaceC1245ib) ? (InterfaceC1245ib) interfaceC1118gg : null;
                C0261Jy z0 = interfaceC1245ib == null ? interfaceC1245ib.z0() : null;
                int i9 = ck.j;
                MK a3 = (i9 & 32) != 32 ? ck.q : (i9 & 64) == 64 ? c0695aD.a(ck.r) : null;
                C0261Jy A = (a3 != null || (g = xw.g(a3)) == null) ? null : AbstractC1807r8.A(c1186hi, g, interfaceC1738q4);
                list = ck.s;
                if (list.isEmpty()) {
                    list = null;
                }
                if (list == null) {
                    List<Integer> list3 = ck.t;
                    AbstractC0048Bt.m(list3, "contextReceiverTypeIdList");
                    ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(list3));
                    for (Integer num : list3) {
                        AbstractC0048Bt.m(num, "it");
                        arrayList.add(c0695aD.a(num.intValue()));
                        booleanValue = booleanValue;
                    }
                    list = arrayList;
                }
                boolean z3 = booleanValue;
                List list4 = b;
                ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(list));
                int i10 = 0;
                for (Object obj : list) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        AbstractC0868ct.Y();
                        throw null;
                    }
                    arrayList2.add(AbstractC1807r8.u(c1186hi, xw.g((MK) obj), null, c1672p4, i10));
                    list4 = list4;
                    i10 = i11;
                }
                c1186hi.O0(g2, list4, z0, A, arrayList2);
                C1452lm c1452lm4 = AbstractC1650om.c;
                boolean booleanValue2 = c1452lm4.c(i6).booleanValue();
                C1518mm c1518mm3 = AbstractC1650om.d;
                enumC0703aL = (EnumC0703aL) c1518mm3.c(i6);
                C1518mm c1518mm4 = AbstractC1650om.e;
                EnumC2149wK enumC2149wK = (EnumC2149wK) c1518mm4.c(i6);
                if (enumC0703aL != null) {
                    AbstractC1650om.a(10);
                    throw null;
                }
                if (enumC2149wK == null) {
                    AbstractC1650om.a(11);
                    throw null;
                }
                if (booleanValue2) {
                    z = true;
                    i2 = 1 << c1452lm4.a;
                } else {
                    z = true;
                    i2 = 0;
                }
                int number = i2 | (enumC2149wK.getNumber() << c1518mm4.a) | (enumC0703aL.getNumber() << c1518mm3.a);
                C1452lm c1452lm5 = AbstractC1650om.J;
                c1452lm5.getClass();
                C1452lm c1452lm6 = AbstractC1650om.K;
                c1452lm6.getClass();
                C1452lm c1452lm7 = AbstractC1650om.L;
                c1452lm7.getClass();
                C0140Fh c0140Fh = IS.e;
                if (z3) {
                    int i12 = (ck.j & 256) == 256 ? ck.w : number;
                    boolean booleanValue3 = c1452lm5.c(i12).booleanValue();
                    boolean booleanValue4 = c1452lm6.c(i12).booleanValue();
                    boolean booleanValue5 = c1452lm7.c(i12).booleanValue();
                    z2 = z;
                    InterfaceC1738q4 b2 = sb.b(ck, i12, 3);
                    if (booleanValue3) {
                        c0321Mh = c0321Mh3;
                        c1452lm3 = c1452lm7;
                        c1518mm = c1518mm3;
                        i3 = number;
                        c1452lm2 = c1452lm6;
                        th = null;
                        i4 = i6;
                        c1518mm2 = c1518mm4;
                        c0321Mh2 = a;
                        c1452lm = c1452lm5;
                        sb2 = this;
                        sj = new SJ(c1186hi, b2, C1097gL.G0((EnumC2149wK) c1518mm4.c(i12)), PX.E((EnumC0703aL) c1518mm3.c(i12)), !booleanValue3, booleanValue4, booleanValue5, c1186hi.M(), null, c0140Fh);
                    } else {
                        c0321Mh = c0321Mh3;
                        th = null;
                        c0321Mh2 = a;
                        i3 = number;
                        c1518mm = c1518mm3;
                        c1452lm = c1452lm5;
                        c1518mm2 = c1518mm4;
                        c1452lm2 = c1452lm6;
                        c1452lm3 = c1452lm7;
                        i4 = i6;
                        sb2 = sb;
                        sj = AbstractC1807r8.v(c1186hi, b2);
                    }
                    sj.K0(c1186hi.getReturnType());
                } else {
                    c0321Mh = c0321Mh3;
                    th = null;
                    c0321Mh2 = a;
                    i3 = number;
                    z2 = z;
                    c1518mm = c1518mm3;
                    c1452lm = c1452lm5;
                    c1518mm2 = c1518mm4;
                    c1452lm2 = c1452lm6;
                    c1452lm3 = c1452lm7;
                    i4 = i6;
                    sb2 = sb;
                    sj = null;
                }
                if (AbstractC1650om.z.c(i4).booleanValue()) {
                    int i13 = (ck.j & 512) == 512 ? ck.x : i3;
                    boolean booleanValue6 = c1452lm.c(i13).booleanValue();
                    boolean booleanValue7 = c1452lm2.c(i13).booleanValue();
                    boolean booleanValue8 = c1452lm3.c(i13).booleanValue();
                    InterfaceC1738q4 b3 = sb2.b(ck, i13, 4);
                    if (booleanValue6) {
                        sj2 = sj;
                        WJ wj = new WJ(c1186hi, b3, C1097gL.G0((EnumC2149wK) c1518mm2.c(i13)), PX.E((EnumC0703aL) c1518mm.c(i13)), !booleanValue6, booleanValue7, booleanValue8, c1186hi.M(), null, c0140Fh);
                        a2 = r8.a(wj, C1318jk.h, r8.b, r8.d, r8.e, c0321Mh2.f);
                        RY ry = (RY) AbstractC0720ac.D0(a2.i.g(AbstractC0868ct.J(ck.v), ck, 4));
                        if (ry == null) {
                            WJ.A0(6);
                            throw th;
                        }
                        wj.t = ry;
                        r6 = wj;
                    } else {
                        sj2 = sj;
                        r6 = AbstractC1807r8.w(c1186hi, b3);
                    }
                } else {
                    sj2 = sj;
                    r6 = th;
                }
                if (AbstractC1650om.C.c(i4).booleanValue()) {
                    c1186hi.M0(th, new QB(sb2, ck, c1186hi, 1));
                }
                InterfaceC1118gg interfaceC1118gg2 = c0321Mh.c;
                InterfaceC1245ib interfaceC1245ib2 = interfaceC1118gg2 instanceof InterfaceC1245ib ? (InterfaceC1245ib) interfaceC1118gg2 : null;
                if ((interfaceC1245ib2 != null ? interfaceC1245ib2.B() : 0) == 5) {
                    c1186hi.M0(null, new QB(sb2, ck, c1186hi, 3));
                }
                c1186hi.L0(sj2, r6, new C0325Ml(sb2.c(ck, false)), new C0325Ml(sb2.c(ck, z2)));
                return c1186hi;
            }
        }
        sb = this;
        interfaceC1738q4 = c1672p4;
        AbstractC1004ey g22 = xw.g(AbstractC0946e20.M(ck, c0695aD));
        List b4 = xw.b();
        InterfaceC1118gg interfaceC1118gg3 = c0321Mh3.c;
        if (!(interfaceC1118gg3 instanceof InterfaceC1245ib)) {
        }
        if (interfaceC1245ib == null) {
        }
        int i92 = ck.j;
        if ((i92 & 32) != 32) {
        }
        if (a3 != null) {
        }
        list = ck.s;
        if (list.isEmpty()) {
        }
        if (list == null) {
        }
        boolean z32 = booleanValue;
        List list42 = b4;
        ArrayList arrayList22 = new ArrayList(AbstractC0786bc.d0(list));
        int i102 = 0;
        while (r5.hasNext()) {
        }
        c1186hi.O0(g22, list42, z0, A, arrayList22);
        C1452lm c1452lm42 = AbstractC1650om.c;
        boolean booleanValue22 = c1452lm42.c(i6).booleanValue();
        C1518mm c1518mm32 = AbstractC1650om.d;
        enumC0703aL = (EnumC0703aL) c1518mm32.c(i6);
        C1518mm c1518mm42 = AbstractC1650om.e;
        EnumC2149wK enumC2149wK2 = (EnumC2149wK) c1518mm42.c(i6);
        if (enumC0703aL != null) {
        }
    }

    public final List g(List list, AbstractC1917sq abstractC1917sq, int i) {
        int i2;
        InterfaceC1738q4 interfaceC1738q4;
        SB sb = this;
        C0321Mh c0321Mh = sb.a;
        C0695aD c0695aD = c0321Mh.d;
        XW xw = c0321Mh.h;
        InterfaceC1118gg interfaceC1118gg = c0321Mh.c;
        AbstractC0048Bt.l(interfaceC1118gg, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        InterfaceC2072v9 interfaceC2072v9 = (InterfaceC2072v9) interfaceC1118gg;
        InterfaceC1118gg n = interfaceC2072v9.n();
        AbstractC0048Bt.m(n, "callableDescriptor.containingDeclaration");
        AbstractC0900dL a = sb.a(n);
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(list));
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            AbstractC1004ey abstractC1004ey = null;
            if (i3 < 0) {
                AbstractC0868ct.Y();
                throw null;
            }
            UK uk = (UK) obj;
            int i5 = (uk.j & 1) == 1 ? uk.k : 0;
            if (a == null || !AbstractC1650om.c.c(i5).booleanValue()) {
                i2 = i3;
                interfaceC1738q4 = C0460Rq.t;
            } else {
                i2 = i3;
                interfaceC1738q4 = new QE(c0321Mh.a.a, new RB(sb, a, abstractC1917sq, i, i2, uk));
            }
            C0827cE C = AbstractC1052fg.C(c0321Mh.b, uk.l);
            AbstractC1004ey g = xw.g(AbstractC0946e20.U(uk, c0695aD));
            boolean booleanValue = AbstractC1650om.G.c(i5).booleanValue();
            boolean booleanValue2 = AbstractC1650om.H.c(i5).booleanValue();
            boolean booleanValue3 = AbstractC1650om.I.c(i5).booleanValue();
            int i6 = uk.j;
            MK a2 = (i6 & 16) == 16 ? uk.f115o : (i6 & 32) == 32 ? c0695aD.a(uk.p) : null;
            if (a2 != null) {
                abstractC1004ey = xw.g(a2);
            }
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new RY(interfaceC2072v9, null, i2, interfaceC1738q4, C, g, booleanValue, booleanValue2, booleanValue3, abstractC1004ey, IS.e));
            arrayList = arrayList2;
            i3 = i4;
            sb = this;
        }
        return AbstractC0720ac.J0(arrayList);
    }
}
