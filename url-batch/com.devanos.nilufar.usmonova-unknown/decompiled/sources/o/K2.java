package o;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class K2 extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K2(Object obj, int i, Object obj2) {
        super(0);
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v104, types: [java.lang.Object, o.Iy] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, o.Iy] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, o.Iy] */
    /* JADX WARN: Type inference failed for: r2v55, types: [o.lp, o.ny] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, o.Iy] */
    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        boolean dispatchKeyEvent;
        C1990tx c1990tx;
        ZH placementScope;
        switch (this.h) {
            case 0:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) this.j);
                return Boolean.valueOf(dispatchKeyEvent);
            case 1:
                Class cls = (Class) this.i;
                Map map = (Map) this.j;
                StringBuilder sb = new StringBuilder();
                sb.append('@');
                sb.append(cls.getCanonicalName());
                AbstractC0720ac.s0(map.entrySet(), sb, ", ", "(", ")", I2.l, 48);
                String sb2 = sb.toString();
                AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            case 2:
                C1216i8 c1216i8 = (C1216i8) this.i;
                InterfaceC1738q4 annotations = ((InterfaceC1836rb) this.j).getAnnotations();
                AbstractC0048Bt.n(c1216i8, "<this>");
                AbstractC0048Bt.n(annotations, "additionalAnnotations");
                return ((C1198hu) c1216i8.i).q.b((C1987tu) c1216i8.l.getValue(), annotations);
            case 3:
                C1216i8 c1216i82 = (C1216i8) this.i;
                InterfaceC1738q4 interfaceC1738q4 = (InterfaceC1738q4) this.j;
                AbstractC0048Bt.n(c1216i82, "<this>");
                AbstractC0048Bt.n(interfaceC1738q4, "additionalAnnotations");
                return ((C1198hu) c1216i82.i).q.b((C1987tu) c1216i82.l.getValue(), interfaceC1738q4);
            case 4:
                C0581Wh c0581Wh = (C0581Wh) this.i;
                return AbstractC0720ac.J0(c0581Wh.s.a.e.g(c0581Wh.C, (C1688pK) this.j));
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                ((C1360kM) this.i).h = ((C0405Pn) this.j).q();
                return C0782bY.a;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                JR i = ((C1198hu) ((C1216i8) this.i).i).f177o.l().i(((C0437Qt) this.j).a).i();
                AbstractC0048Bt.m(i, "c.module.builtIns.getBui…qName(fqName).defaultType");
                return i;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                C0490Su c0490Su = (C0490Su) this.i;
                InterfaceC2114vp interfaceC2114vp = c0490Su.b;
                C0826cD c0826cD = c0490Su.a;
                InterfaceC1118gg interfaceC1118gg = (InterfaceC1118gg) interfaceC2114vp.invoke(c0826cD);
                C0827cE c0827cE = C0490Su.g;
                List J = AbstractC0868ct.J(c0826cD.k.e());
                VA va = (VA) this.j;
                C1441lb c1441lb = new C1441lb(interfaceC1118gg, c0827cE, 4, 2, J, va);
                c1441lb.w0(new C0238Jb(va, c1441lb), C1648ok.h, null);
                return c1441lb;
            case 8:
                C0568Vu c0568Vu = (C0568Vu) this.i;
                C0826cD k = c0568Vu.k();
                AbstractC0048Bt.m(k, "builtInsModule");
                return new C0672Zu(k, (VA) this.j, new C1139h0(17, c0568Vu));
            case 9:
                C0672Zu c0672Zu = (C0672Zu) this.i;
                C0826cD c0826cD2 = c0672Zu.d().a;
                C0490Su.d.getClass();
                return AbstractC1052fg.q(c0826cD2, C0490Su.h, new C1334k((VA) this.j, c0672Zu.d().a)).i();
            case 10:
                C0390Oy c0390Oy = (C0390Oy) this.i;
                InterfaceC1245ib interfaceC1245ib = (InterfaceC1245ib) this.j;
                C1216i8 c1216i83 = c0390Oy.q;
                C1198hu c1198hu = (C1198hu) c1216i83.i;
                C1216i8 c1216i84 = new C1216i8(new C1198hu(c1198hu.a, c1198hu.b, c1198hu.c, c1198hu.d, c1198hu.e, c1198hu.f, c1198hu.h, c1198hu.i, c1198hu.j, c1198hu.k, c1198hu.l, c1198hu.m, c1198hu.n, c1198hu.f177o, c1198hu.p, c1198hu.q, c1198hu.r, c1198hu.s, c1198hu.t, c1198hu.u, c1198hu.v, c1198hu.w), (InterfaceC1569nX) c1216i83.j, c1216i83.k);
                InterfaceC1118gg n = c0390Oy.n();
                AbstractC0048Bt.m(n, "containingDeclaration");
                return new C0390Oy(c1216i84, n, c0390Oy.f79o, interfaceC1245ib);
            case 11:
                C1528mw c1528mw = (C1528mw) this.i;
                AbstractC1330jw abstractC1330jw = c1528mw.m;
                String str = (String) this.j;
                String str2 = c1528mw.n;
                abstractC1330jw.getClass();
                AbstractC0048Bt.n(str2, "signature");
                Collection J0 = str.equals("<init>") ? AbstractC0720ac.J0(abstractC1330jw.m()) : abstractC1330jw.n(C0827cE.e(str));
                ArrayList arrayList = new ArrayList();
                for (Object obj : J0) {
                    if (AbstractC0048Bt.h(AbstractC0969eP.c((InterfaceC0381Op) obj).i(), str2)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() == 1) {
                    return (InterfaceC0381Op) AbstractC0720ac.D0(arrayList);
                }
                String t0 = AbstractC0720ac.t0(J0, "\n", null, null, C2316yt.n, 30);
                StringBuilder sb3 = new StringBuilder("Function '");
                sb3.append(str);
                sb3.append("' (JVM signature: ");
                sb3.append(str2);
                sb3.append(") not resolved in ");
                sb3.append(abstractC1330jw);
                sb3.append(':');
                sb3.append(t0.length() == 0 ? " no members found" : "\n".concat(t0));
                throw new C0526Ue(sb3.toString());
            case 12:
                C1661ox c1661ox = (C1661ox) this.i;
                List w0 = c1661ox.h.w0();
                if (w0.isEmpty()) {
                    return C1318jk.h;
                }
                InterfaceC0235Iy C = EB.C(EnumC1992tz.h, new C1595nx(c1661ox, 0));
                InterfaceC1455lp interfaceC1455lp = (InterfaceC1455lp) this.j;
                ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(w0));
                int i2 = 0;
                for (Object obj2 : w0) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC0868ct.Y();
                        throw null;
                    }
                    AbstractC1701pX abstractC1701pX = (AbstractC1701pX) obj2;
                    if (abstractC1701pX.c()) {
                        c1990tx = C1990tx.c;
                    } else {
                        AbstractC1004ey b = abstractC1701pX.b();
                        AbstractC0048Bt.m(b, "typeProjection.type");
                        C1661ox c1661ox2 = new C1661ox(b, interfaceC1455lp != null ? new PB(c1661ox, i2, C) : null);
                        int v = AbstractC1888sN.v(abstractC1701pX.a());
                        if (v == 0) {
                            c1990tx = new C1990tx(EnumC2056ux.h, c1661ox2);
                        } else if (v == 1) {
                            c1990tx = new C1990tx(EnumC2056ux.i, c1661ox2);
                        } else {
                            if (v != 2) {
                                throw new C0057Cc();
                            }
                            c1990tx = new C1990tx(EnumC2056ux.j, c1661ox2);
                        }
                    }
                    arrayList2.add(c1990tx);
                    i2 = i3;
                }
                return arrayList2;
            case 13:
                C1970td c1970td = ((C0027Ay) this.i).u;
                C1360kM c1360kM = (C1360kM) this.j;
                if ((((TC) c1970td.f).d & 8) != 0) {
                    for (TC tc = (IU) c1970td.e; tc != null; tc = tc.e) {
                        if ((tc.c & 8) != 0) {
                            for (Object obj3 = tc; obj3 != null; obj3 = null) {
                                if (obj3 instanceof InterfaceC2155wQ) {
                                    InterfaceC2155wQ interfaceC2155wQ = (InterfaceC2155wQ) obj3;
                                    if (interfaceC2155wQ.f()) {
                                        C2023uQ c2023uQ = new C2023uQ();
                                        c1360kM.h = c2023uQ;
                                        c2023uQ.j = true;
                                    }
                                    if (interfaceC2155wQ.g()) {
                                        ((C2023uQ) c1360kM.h).i = true;
                                    }
                                    interfaceC2155wQ.h((C2023uQ) c1360kM.h);
                                }
                            }
                        }
                    }
                }
                return C0782bY.a;
            case 14:
                C0209Hy c0209Hy = (C0209Hy) this.i;
                ME me = c0209Hy.a().n;
                if (me == null || (placementScope = me.i) == null) {
                    placementScope = ((S2) PX.J0(c0209Hy.a)).getPlacementScope();
                }
                C0157Fy c0157Fy = (C0157Fy) this.j;
                InterfaceC2114vp interfaceC2114vp2 = c0157Fy.x;
                if (interfaceC2114vp2 == null) {
                    ME a = c0209Hy.a();
                    long j = c0157Fy.y;
                    placementScope.getClass();
                    ZH.a(placementScope, a);
                    a.E(EB.L(j, a.f), 0.0f, null);
                } else {
                    ME a2 = c0209Hy.a();
                    long j2 = c0157Fy.y;
                    placementScope.getClass();
                    ZH.a(placementScope, a2);
                    a2.E(EB.L(j2, a2.f), 0.0f, interfaceC2114vp2);
                }
                return C0782bY.a;
            case 15:
                return new C0546Uy(((C0572Vy) this.i).a, (HM) this.j);
            case 16:
                C0853ce c0853ce = ((C1198hu) ((C1216i8) this.i).i).b;
                C2245xo c2245xo = ((C0743az) this.j).f140o.l;
                c0853ce.getClass();
                AbstractC0048Bt.n(c2245xo, "packageFqName");
                return null;
            case 17:
                C1398ky c1398ky = (C1398ky) this.i;
                InterfaceC1266iy interfaceC1266iy = (InterfaceC1266iy) ((C2124vz) this.j).j.invoke();
                c1398ky.getClass();
                AbstractC0048Bt.n(interfaceC1266iy, "type");
                return (AbstractC1004ey) interfaceC1266iy;
            case 18:
                InterfaceC2114vp m = ((C0831cI) this.i).b.m();
                if (m != null) {
                    m.invoke(new C1349kB((AbstractC1415lB) this.j));
                }
                return C0782bY.a;
            case 19:
                Iterable iterable = (List) ((C2077vE) this.i).e.getValue();
                if (iterable == null) {
                    iterable = C1318jk.h;
                }
                C1398ky c1398ky2 = (C1398ky) this.j;
                ArrayList arrayList3 = new ArrayList(AbstractC0786bc.d0(iterable));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((AbstractC2097vY) it.next()).D0(c1398ky2));
                }
                return arrayList3;
            case 20:
                QD qd = (QD) this.i;
                C2036ud c2036ud = (C2036ud) this.j;
                Object[] objArr = qd.b;
                long[] jArr = qd.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j3 = jArr[i4];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((255 & j3) < 128) {
                                    c2036ud.t(objArr[(i4 << 3) + i6]);
                                }
                                j3 >>= 8;
                            }
                            if (i5 != 8) {
                            }
                        }
                        if (i4 != length) {
                            i4++;
                        }
                    }
                }
                return C0782bY.a;
            case 21:
                LW lw = (LW) this.i;
                OT ot = lw.K;
                C1316ji c1316ji = lw.L;
                C0981eb c0981eb = (C0981eb) this.j;
                InterfaceC1738q4 annotations2 = c0981eb.getAnnotations();
                C0981eb c0981eb2 = (C0981eb) this.j;
                int M = c0981eb2.M();
                AbstractC1888sN.t(M, "underlyingConstructorDescriptor.kind");
                C1316ji c1316ji2 = lw.L;
                IS d = c1316ji2.d();
                AbstractC0048Bt.m(d, "typeAliasDescriptor.source");
                LW lw2 = new LW(ot, c1316ji, c0981eb, lw, annotations2, M, d);
                LW.N.getClass();
                C2096vX d2 = c1316ji2.H0() == null ? null : C2096vX.d(c1316ji2.I0());
                if (d2 == null) {
                    return null;
                }
                C0261Jy c0261Jy = c0981eb2.q;
                C0261Jy e = c0261Jy != null ? c0261Jy.e(d2) : null;
                List T = c0981eb2.T();
                AbstractC0048Bt.m(T, "underlyingConstructorDes…contextReceiverParameters");
                ArrayList arrayList4 = new ArrayList(AbstractC0786bc.d0(T));
                Iterator it2 = T.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((C0261Jy) it2.next()).e(d2));
                }
                List p = c1316ji2.p();
                List t02 = lw.t0();
                AbstractC1004ey abstractC1004ey = lw.n;
                AbstractC0048Bt.k(abstractC1004ey);
                lw2.M0(null, e, arrayList4, p, t02, abstractC1004ey, 1, c1316ji2.l);
                return lw2;
            case 22:
                C0321Mh c0321Mh = ((XW) this.i).a;
                return c0321Mh.a.e.d((MK) this.j, c0321Mh.b);
            default:
                ((J00) ((C1818rJ) this.i).i).a((C2376zn) this.j);
                return C0782bY.a;
        }
    }
}
