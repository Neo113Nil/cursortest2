package o;

import android.content.Context;
import android.graphics.Typeface;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* renamed from: o.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0810c0 extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0810c0(Object obj, int i, Object obj2) {
        super(1);
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }

    private final Object a(Object obj) {
        C1662oy c1662oy = (C1662oy) this.i;
        Object obj2 = c1662oy.a;
        C0849ca c0849ca = (C0849ca) this.j;
        synchronized (obj2) {
            c1662oy.b.remove(c0849ca);
        }
        return C0782bY.a;
    }

    private final Object d(Object obj) {
        Throwable th = (Throwable) obj;
        C0901dM c0901dM = (C0901dM) this.i;
        Object obj2 = c0901dM.b;
        Throwable th2 = (Throwable) this.j;
        synchronized (obj2) {
            if (th2 == null) {
                th2 = null;
            } else if (th != null) {
                try {
                    if (th instanceof CancellationException) {
                        th = null;
                    }
                    if (th != null) {
                        AbstractC0946e20.e(th2, th);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            c0901dM.d = th2;
            ET et = c0901dM.r;
            XL xl = XL.h;
            et.getClass();
            et.f(null, xl);
        }
        return C0782bY.a;
    }

    private final Object f(Object obj) {
        LX lx = (LX) obj;
        KX kx = (KX) this.i;
        C0218Ih c0218Ih = (C0218Ih) kx.h;
        JX jx = (JX) this.j;
        synchronized (c0218Ih) {
            try {
                if (lx.i) {
                    ((C0557Vj) kx.i).b(jx, lx);
                } else {
                    ((C0557Vj) kx.i).c(jx);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return C0782bY.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:265:0x0571, code lost:
    
        if (r0.d != o.EnumC1212i4.m) goto L248;
     */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0472 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0473  */
    @Override // o.InterfaceC2114vp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        C1921su c1921su;
        Typeface m;
        C1590ns b;
        OM p;
        C0782bY c0782bY;
        SD B;
        int i = 2;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        char c = 1;
        char c2 = 1;
        LX lx = null;
        switch (this.h) {
            case 0:
                int intValue = ((Number) obj).intValue();
                ZW zw = (ZW) this.i;
                if (zw != null && (c1921su = (C1921su) zw.a.get(Integer.valueOf(intValue))) != null) {
                    return c1921su;
                }
                C1921su[] c1921suArr = (C1921su[]) this.j;
                return (intValue < 0 || intValue > c1921suArr.length - 1) ? C1921su.e : c1921suArr[intValue];
            case 1:
                AbstractC0048Bt.n(obj, "$this$extractNullability");
                DR dr = (DR) this.i;
                C1216i8 c1216i8 = dr.c;
                InterfaceC1266iy interfaceC1266iy = ((C0745b0) this.j).a;
                InterfaceC0948e4 interfaceC0948e4 = (InterfaceC0948e4) obj;
                if (interfaceC0948e4 instanceof NI) {
                }
                if (interfaceC0948e4 instanceof C0312Ly) {
                    ((C1198hu) c1216i8.i).t.getClass();
                    if (!((C0312Ly) interfaceC0948e4).g) {
                        break;
                    }
                    z = true;
                    return Boolean.valueOf(z);
                }
                if (interfaceC1266iy != null) {
                    C0827cE c0827cE = AbstractC0545Ux.e;
                    InterfaceC2364zb c3 = ((AbstractC1004ey) interfaceC1266iy).B0().c();
                    if (c3 != null && AbstractC0545Ux.r(c3) != null) {
                        ((C1198hu) c1216i8.i).q.getClass();
                        Object c4 = C1408l4.c(interfaceC0948e4, AbstractC1433lT.t);
                        if (c4 != null) {
                            ArrayList a = C1408l4.a(c4, false);
                            if (!a.isEmpty()) {
                                Iterator it = a.iterator();
                                while (it.hasNext()) {
                                    String str = (String) it.next();
                                    HashMap hashMap = EnumC0938dy.i;
                                    if (AbstractC0048Bt.h(str, "TYPE")) {
                                        ((C1198hu) c1216i8.i).t.getClass();
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 2:
                Context context = (Context) this.i;
                Context applicationContext = context.getApplicationContext();
                ComponentCallbacks2C1802r3 componentCallbacks2C1802r3 = (ComponentCallbacks2C1802r3) this.j;
                applicationContext.registerComponentCallbacks(componentCallbacks2C1802r3);
                return new C1737q3(context, z ? 1 : 0, componentCallbacks2C1802r3);
            case 3:
                Context context2 = (Context) this.i;
                Context applicationContext2 = context2.getApplicationContext();
                ComponentCallbacks2C1868s3 componentCallbacks2C1868s3 = (ComponentCallbacks2C1868s3) this.j;
                applicationContext2.registerComponentCallbacks(componentCallbacks2C1868s3);
                return new C1737q3(context2, c == true ? 1 : 0, componentCallbacks2C1868s3);
            case 4:
                N3 n3 = (N3) this.i;
                O3 o3 = (O3) this.j;
                synchronized (n3.l) {
                    n3.n.remove(o3);
                }
                return C0782bY.a;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                ((Choreographer) ((P3) this.i).i).removeFrameCallback((O3) this.j);
                return C0782bY.a;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                D8 d8 = (D8) this.i;
                Object obj2 = d8.i;
                C8 c8 = (C8) this.j;
                synchronized (obj2) {
                    d8.k.remove(c8);
                    if (d8.k.isEmpty()) {
                        d8.m.set(0);
                    }
                }
                return C0782bY.a;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                C0827cE c0827cE2 = (C0827cE) obj;
                AbstractC0048Bt.n(c0827cE2, "name");
                C1334k c1334k = (C1334k) this.i;
                C1688pK c1688pK = (C1688pK) ((LinkedHashMap) c1334k.i).get(c0827cE2);
                if (c1688pK == null) {
                    return null;
                }
                C0581Wh c0581Wh = (C0581Wh) this.j;
                C0321Mh c0321Mh = c0581Wh.s;
                return C2109vk.w0(c0321Mh.a.a, c0581Wh, c0827cE2, (SA) c1334k.k, new C0347Nh(c0321Mh.a.a, new K2(c0581Wh, 4, c1688pK)), IS.e);
            case 8:
                C0535Un c0535Un = (C0535Un) this.i;
                C0613Xn c0613Xn = c0535Un.b;
                JX jx = (JX) this.j;
                c0613Xn.getClass();
                FU fu = jx.a;
                InterfaceC2015uI interfaceC2015uI = (InterfaceC2015uI) c0535Un.c.i;
                int i2 = jx.c;
                C1586no c1586no = jx.b;
                if (!(fu != null ? fu instanceof AbstractC2237xg : true)) {
                    if (fu instanceof C2379zq) {
                        m = interfaceC2015uI.m((C2379zq) fu, c1586no, i2);
                    }
                    if (lx == null) {
                        return lx;
                    }
                    throw new IllegalStateException("Could not load font");
                }
                m = interfaceC2015uI.k(c1586no, i2);
                lx = new LX(m);
                if (lx == null) {
                }
            case 9:
                C0177Gs c0177Gs = (C0177Gs) this.i;
                C0099Ds c0099Ds = (C0099Ds) this.j;
                c0177Gs.a.b(c0099Ds);
                c0177Gs.b.setValue(Boolean.TRUE);
                return new C1737q3(c0177Gs, i, c0099Ds);
            case 10:
                return a(obj);
            case 11:
                C0827cE c0827cE3 = (C0827cE) obj;
                C0494Sy c0494Sy = (C0494Sy) this.j;
                AbstractC0048Bt.n(c0827cE3, "accessorName");
                HR hr = (HR) this.i;
                return AbstractC0048Bt.h(hr.getName(), c0827cE3) ? AbstractC0868ct.J(hr) : AbstractC0720ac.A0(C0494Sy.v(c0494Sy, c0827cE3), C0494Sy.w(c0494Sy, c0827cE3));
            case 12:
                C0827cE c0827cE4 = (C0827cE) obj;
                C1216i8 c1216i82 = (C1216i8) this.j;
                AbstractC0048Bt.n(c0827cE4, "name");
                C0494Sy c0494Sy2 = (C0494Sy) this.i;
                SA sa = c0494Sy2.r;
                InterfaceC1245ib interfaceC1245ib = c0494Sy2.n;
                if (((Set) sa.invoke()).contains(c0827cE4)) {
                    C0853ce c0853ce = ((C1198hu) c1216i82.i).b;
                    C1639ob f = AbstractC0192Hh.f(interfaceC1245ib);
                    AbstractC0048Bt.k(f);
                    C1639ob d = f.d(c0827cE4);
                    c0853ce.getClass();
                    C2245xo g = d.g();
                    AbstractC0048Bt.m(g, "classId.packageFqName");
                    String y = AbstractC0778bU.y(d.h().b(), '.', '$');
                    if (!g.d()) {
                        y = g.b() + '.' + y;
                    }
                    Class L = AbstractC1305jX.L(c0853ce.a, y);
                    C2217xM c2217xM = L != null ? new C2217xM(L) : null;
                    if (c2217xM == null) {
                        return null;
                    }
                    C0390Oy c0390Oy = new C0390Oy(c1216i82, interfaceC1245ib, c2217xM, null);
                    ((C1198hu) c1216i82.i).s.getClass();
                    return c0390Oy;
                }
                if (!((Set) c0494Sy2.s.invoke()).contains(c0827cE4)) {
                    DM dm = (DM) ((Map) c0494Sy2.t.invoke()).get(c0827cE4);
                    if (dm == null) {
                        return null;
                    }
                    C1198hu c1198hu = (C1198hu) c1216i82.i;
                    OT ot = c1198hu.a;
                    C0468Ry c0468Ry = new C0468Ry(c0494Sy2, i);
                    VA va = (VA) ot;
                    va.getClass();
                    return C2109vk.w0(c1198hu.a, c0494Sy2.n, c0827cE4, new SA(va, c0468Ry), AbstractC0022At.G(c1216i82, dm), c1198hu.j.H0(dm));
                }
                C0889dA c0889dA = new C0889dA(10);
                ((C1097gL) ((C1198hu) c1216i82.i).x).getClass();
                AbstractC0048Bt.n(c1216i82, "_context_receiver_0");
                AbstractC0048Bt.n(interfaceC1245ib, "thisDescriptor");
                AbstractC0048Bt.n(c0827cE4, "name");
                C0889dA j = AbstractC0868ct.j(c0889dA);
                int j2 = j.j();
                if (j2 == 0) {
                    return null;
                }
                if (j2 == 1) {
                    return (InterfaceC1245ib) AbstractC0720ac.D0(j);
                }
                throw new IllegalStateException(("Multiple classes with same name are generated: " + j).toString());
            case 13:
                C0598Wy c0598Wy = (C0598Wy) obj;
                C1216i8 c1216i83 = (C1216i8) this.j;
                C1198hu c1198hu2 = (C1198hu) c1216i83.i;
                AbstractC0048Bt.n(c0598Wy, "request");
                C0743az c0743az = (C0743az) this.i;
                C1216i8 c1216i84 = c0743az.b;
                C0546Uy c0546Uy = c0743az.f140o;
                C1639ob c1639ob = new C1639ob(c0546Uy.l, c0598Wy.a);
                C2217xM c2217xM2 = c0598Wy.b;
                if (c2217xM2 != null) {
                    C0853ce c0853ce2 = c1198hu2.c;
                    AbstractC0048Bt.n(((C1198hu) c1216i84.i).d.c().c, "<this>");
                    C1527mv c1527mv = C1527mv.g;
                    c0853ce2.getClass();
                    AbstractC0048Bt.n(c1527mv, "jvmMetadataVersion");
                    Class L2 = AbstractC1305jX.L(c0853ce2.a, c2217xM2.c().b());
                    b = (L2 == null || (p = AbstractC0946e20.p(L2)) == null) ? null : new C1590ns(8, p);
                } else {
                    C0853ce c0853ce3 = c1198hu2.c;
                    AbstractC0048Bt.n(((C1198hu) c1216i84.i).d.c().c, "<this>");
                    b = c0853ce3.b(c1639ob, C1527mv.g);
                }
                OM om = b != null ? (OM) b.i : null;
                C1639ob a2 = om != null ? AbstractC1492mM.a(om.a) : null;
                if (a2 != null && (!a2.b.e().d() || a2.c)) {
                    return null;
                }
                Object obj3 = C0650Yy.h;
                if (om != null) {
                    if (((EnumC0571Vx) om.b.c) == EnumC0571Vx.CLASS) {
                        C0659Zh c0659Zh = ((C1198hu) c1216i84.i).d;
                        c0659Zh.getClass();
                        C1047fb f2 = c0659Zh.f(om);
                        InterfaceC1245ib a3 = f2 == null ? null : c0659Zh.c().t.a(AbstractC1492mM.a(om.a), f2);
                        if (a3 != null) {
                            obj3 = new C0624Xy(a3);
                        }
                    } else {
                        obj3 = C0676Zy.h;
                    }
                }
                if (obj3 instanceof C0624Xy) {
                    return ((C0624Xy) obj3).h;
                }
                if (obj3 instanceof C0676Zy) {
                    return null;
                }
                if (!(obj3 instanceof C0650Yy)) {
                    throw new C0057Cc();
                }
                if (c2217xM2 == null) {
                    C0853ce c0853ce4 = c1198hu2.b;
                    c0853ce4.getClass();
                    C2245xo g2 = c1639ob.g();
                    AbstractC0048Bt.m(g2, "classId.packageFqName");
                    String y2 = AbstractC0778bU.y(c1639ob.h().b(), '.', '$');
                    if (!g2.d()) {
                        y2 = g2.b() + '.' + y2;
                    }
                    Class L3 = AbstractC1305jX.L(c0853ce4.a, y2);
                    c2217xM2 = L3 != null ? new C2217xM(L3) : null;
                }
                C2245xo c5 = c2217xM2 != null ? c2217xM2.c() : null;
                if (c5 == null || c5.d() || !c5.e().equals(c0546Uy.l)) {
                    return null;
                }
                C0390Oy c0390Oy2 = new C0390Oy(c1216i83, c0546Uy, c2217xM2, null);
                c1198hu2.s.getClass();
                return c0390Oy2;
            case 14:
                return d(obj);
            case 15:
                ((C2036ud) this.i).t(obj);
                QD qd = (QD) this.j;
                if (qd != null) {
                    qd.a(obj);
                }
                return C0782bY.a;
            case 16:
                C0782bY c0782bY2 = C0782bY.a;
                Throwable th = (Throwable) obj;
                ((C1400l) this.i).invoke(th);
                J8 j8 = (J8) ((C1334k) this.j).k;
                j8.j(th, false);
                do {
                    Object e = j8.e();
                    if (e instanceof C0340Na) {
                        e = null;
                    }
                    if (e != null) {
                        ((BC) e).b.N(new C0031Bc(th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th, false));
                        c0782bY = c0782bY2;
                    } else {
                        c0782bY = null;
                    }
                } while (c0782bY != null);
                return c0782bY2;
            case 17:
                return f(obj);
            default:
                H2 h2 = (H2) obj;
                InterfaceC2312yp interfaceC2312yp = (InterfaceC2312yp) this.j;
                S10 s10 = (S10) this.i;
                if (!s10.j) {
                    AbstractC0106Dz lifecycle = h2.a.getLifecycle();
                    s10.l = interfaceC2312yp;
                    if (s10.k == null) {
                        s10.k = lifecycle;
                        lifecycle.a(s10);
                    } else if (((C0417Pz) lifecycle).d.compareTo(EnumC0080Cz.j) >= 0) {
                        C2036ud c2036ud = s10.i;
                        C0721ad c0721ad = new C0721ad(-2000640158, true, new R10(s10, interfaceC2312yp, c2 == true ? 1 : 0));
                        if (c2036ud.y) {
                            AbstractC1052fg.T("The composition is disposed");
                            throw null;
                        }
                        C0901dM c0901dM = (C0901dM) c2036ud.h;
                        boolean z2 = c2036ud.x.C;
                        try {
                            C2084vL c2084vL = new C2084vL(i, c2036ud);
                            C0810c0 c0810c0 = new C0810c0(c2036ud, 15, lx);
                            AbstractC1696pS k = AbstractC2025uS.k();
                            SD sd = k instanceof SD ? (SD) k : null;
                            if (sd == null || (B = sd.B(c2084vL, c0810c0)) == null) {
                                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                            }
                            try {
                                AbstractC1696pS j3 = B.j();
                                try {
                                    c2036ud.i(c0721ad);
                                    if (!z2) {
                                        AbstractC2025uS.k().m();
                                    }
                                    synchronized (c0901dM.b) {
                                        if (((XL) c0901dM.r.getValue()).compareTo(XL.i) > 0 && !c0901dM.h().contains(c2036ud)) {
                                            c0901dM.e.add(c2036ud);
                                            c0901dM.f = null;
                                        }
                                    }
                                    try {
                                        synchronized (c0901dM.b) {
                                            ArrayList arrayList = c0901dM.j;
                                            if (arrayList.size() > 0) {
                                                ((AbstractC1549nD) arrayList.get(0)).getClass();
                                                throw null;
                                            }
                                        }
                                        try {
                                            c2036ud.d();
                                            c2036ud.f();
                                            if (!z2) {
                                                AbstractC2025uS.k().m();
                                            }
                                        } catch (Exception e2) {
                                            c0901dM.k(e2, null);
                                        }
                                    } catch (Exception e3) {
                                        c0901dM.k(e3, c2036ud);
                                    }
                                } finally {
                                    AbstractC1696pS.p(j3);
                                }
                            } finally {
                                C0901dM.c(B);
                            }
                        } catch (Exception e4) {
                            c0901dM.k(e4, c2036ud);
                        }
                    }
                }
                return C0782bY.a;
        }
    }
}
