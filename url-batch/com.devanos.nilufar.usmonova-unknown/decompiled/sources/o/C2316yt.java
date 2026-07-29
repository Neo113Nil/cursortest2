package o;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: o.yt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2316yt extends AbstractC1596ny implements InterfaceC2114vp {
    public static final C2316yt A;
    public static final C2316yt B;
    public static final C2316yt C;
    public static final C2316yt D;
    public static final C2316yt E;
    public static final C2316yt F;
    public static final C2316yt G;
    public static final C2316yt H;
    public static final C2316yt I;
    public static final C2316yt J;
    public static final C2316yt K;
    public static final C2316yt L;
    public static final C2316yt i;
    public static final C2316yt j;
    public static final C2316yt k;
    public static final C2316yt l;
    public static final C2316yt m;
    public static final C2316yt n;

    /* renamed from: o, reason: collision with root package name */
    public static final C2316yt f249o;
    public static final C2316yt p;
    public static final C2316yt q;
    public static final C2316yt r;
    public static final C2316yt s;
    public static final C2316yt t;
    public static final C2316yt u;
    public static final C2316yt v;
    public static final C2316yt w;
    public static final C2316yt x;
    public static final C2316yt y;
    public static final C2316yt z;
    public final /* synthetic */ int h;

    static {
        int i2 = 1;
        i = new C2316yt(i2, 0);
        j = new C2316yt(i2, 1);
        k = new C2316yt(i2, 2);
        l = new C2316yt(i2, 3);
        m = new C2316yt(i2, 4);
        n = new C2316yt(i2, 5);
        f249o = new C2316yt(i2, 6);
        p = new C2316yt(i2, 7);
        q = new C2316yt(i2, 8);
        r = new C2316yt(i2, 9);
        s = new C2316yt(i2, 10);
        t = new C2316yt(i2, 11);
        u = new C2316yt(i2, 12);
        v = new C2316yt(i2, 13);
        w = new C2316yt(i2, 14);
        x = new C2316yt(i2, 15);
        y = new C2316yt(i2, 16);
        z = new C2316yt(i2, 17);
        A = new C2316yt(i2, 18);
        B = new C2316yt(i2, 19);
        C = new C2316yt(i2, 20);
        D = new C2316yt(i2, 21);
        E = new C2316yt(i2, 22);
        F = new C2316yt(i2, 23);
        G = new C2316yt(i2, 24);
        H = new C2316yt(i2, 25);
        I = new C2316yt(i2, 26);
        J = new C2316yt(i2, 27);
        K = new C2316yt(i2, 28);
        L = new C2316yt(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2316yt(int i2, int i3) {
        super(i2);
        this.h = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e2, code lost:
    
        if (r12 == false) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e8 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    @Override // o.InterfaceC2114vp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String valueOf;
        JR i2;
        AbstractC2097vY w2;
        AbstractC1004ey returnType;
        boolean z2;
        C1639ob f;
        AbstractC1004ey returnType2;
        int i3 = this.h;
        C0782bY c0782bY = C0782bY.a;
        switch (i3) {
            case 0:
                AbstractC1004ey abstractC1004ey = (AbstractC1004ey) obj;
                AbstractC0048Bt.n(abstractC1004ey, "it");
                return abstractC1004ey.toString();
            case 1:
                InterfaceC0761bD interfaceC0761bD = (InterfaceC0761bD) obj;
                AbstractC0048Bt.n(interfaceC0761bD, "module");
                RY w3 = AbstractC1052fg.w(AbstractC0463Rt.b, interfaceC0761bD.l().i(AbstractC1433lT.t));
                AbstractC1004ey c = w3 != null ? w3.c() : null;
                return c == null ? C0273Kk.c(EnumC0247Jk.J, new String[0]) : c;
            case 2:
                InterfaceC0761bD interfaceC0761bD2 = (InterfaceC0761bD) obj;
                AbstractC0048Bt.n(interfaceC0761bD2, "module");
                List list = (List) AbstractC0772bO.o(((C1465lz) interfaceC0761bD2.S(C0490Su.f)).l, C1465lz.f196o[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof W8) {
                        arrayList.add(obj2);
                    }
                }
                return (W8) AbstractC0720ac.n0(arrayList);
            case 3:
                Class<?> returnType3 = ((Method) obj).getReturnType();
                AbstractC0048Bt.m(returnType3, "it.returnType");
                return AbstractC1492mM.b(returnType3);
            case 4:
                Class cls = (Class) obj;
                AbstractC0048Bt.m(cls, "it");
                return AbstractC1492mM.b(cls);
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0381Op interfaceC0381Op = (InterfaceC0381Op) obj;
                AbstractC0048Bt.n(interfaceC0381Op, "descriptor");
                return C2304yh.e.w(interfaceC0381Op) + " | " + AbstractC0969eP.c(interfaceC0381Op).i();
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                PJ pj = (PJ) obj;
                AbstractC0048Bt.n(pj, "descriptor");
                return C2304yh.e.w(pj) + " | " + AbstractC0969eP.b(pj).g();
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC0048Bt.n((FM) obj, "it");
                return Boolean.valueOf(!Modifier.isStatic(r12.b().getModifiers()));
            case 8:
                HR hr = (HR) obj;
                AbstractC0048Bt.n(hr, "$this$selectMostSpecificInEachOverridableGroup");
                return hr;
            case 9:
                FM fm = (FM) obj;
                AbstractC0048Bt.n(fm, "it");
                return Boolean.valueOf(Modifier.isStatic(fm.b().getModifiers()));
            case 10:
                WB wb = (WB) obj;
                AbstractC0048Bt.n(wb, "it");
                return wb.e();
            case 11:
                InterfaceC2364zb c2 = ((AbstractC1004ey) obj).B0().c();
                if (c2 instanceof InterfaceC1245ib) {
                    return (InterfaceC1245ib) c2;
                }
                return null;
            case 12:
                C0831cI c0831cI = (C0831cI) obj;
                if (c0831cI.j()) {
                    c0831cI.c.I(c0831cI);
                }
                return c0782bY;
            case 13:
                AbstractC0048Bt.n((C0827cE) obj, "it");
                return Boolean.TRUE;
            case 14:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC0048Bt.n(entry, "entry");
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    byte[] bArr = (byte[]) value;
                    AbstractC0048Bt.n(bArr, "<this>");
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) "[");
                    int i4 = 0;
                    for (byte b : bArr) {
                        i4++;
                        if (i4 > 1) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) String.valueOf((int) b));
                    }
                    sb.append((CharSequence) "]");
                    valueOf = sb.toString();
                } else {
                    valueOf = String.valueOf(entry.getValue());
                }
                return "  " + ((YI) entry.getKey()).a + " = " + valueOf;
            case 15:
                YG yg = ((ME) obj).C;
                if (yg != null) {
                    yg.invalidate();
                }
                return c0782bY;
            case 16:
                ME me = (ME) obj;
                if (me.j()) {
                    C1925sy c1925sy = me.y;
                    if (c1925sy == null) {
                        me.B0(true);
                    } else {
                        C1925sy c1925sy2 = ME.E;
                        c1925sy2.getClass();
                        c1925sy2.a = c1925sy.a;
                        c1925sy2.b = c1925sy.b;
                        me.B0(true);
                        if (c1925sy2.a != c1925sy.a || c1925sy2.b != c1925sy.b) {
                            C0027Ay c0027Ay = me.l;
                            C0209Hy c0209Hy = c0027Ay.v;
                            if (c0209Hy.m > 0) {
                                if (c0209Hy.l || c0209Hy.k) {
                                    c0027Ay.D(false);
                                }
                                c0209Hy.q.J();
                            }
                            ZG zg = c0027Ay.j;
                            if (zg != null) {
                                S2 s2 = (S2) zg;
                                ((YD) s2.N.e.i).b(c0027Ay);
                                c0027Ay.A = true;
                                s2.C(null);
                            }
                        }
                    }
                }
                return c0782bY;
            case 17:
                AF af = (AF) obj;
                if (af.j()) {
                    af.b.c();
                }
                return c0782bY;
            case 18:
                InterfaceC0381Op interfaceC0381Op2 = (InterfaceC0381Op) obj;
                AbstractC0048Bt.n(interfaceC0381Op2, "$this$$receiver");
                List t0 = interfaceC0381Op2.t0();
                AbstractC0048Bt.m(t0, "valueParameters");
                RY ry = (RY) AbstractC0720ac.w0(t0);
                r6 = (ry == null || AbstractC0192Hh.a(ry) || ry.q != null) ? false : true;
                List list2 = LG.h;
                if (r6) {
                    return null;
                }
                return "last parameter should not have a default value or be a vararg";
            case 19:
                InterfaceC0381Op interfaceC0381Op3 = (InterfaceC0381Op) obj;
                AbstractC0048Bt.n(interfaceC0381Op3, "$this$$receiver");
                List list3 = LG.h;
                InterfaceC1118gg n2 = interfaceC0381Op3.n();
                AbstractC0048Bt.m(n2, "containingDeclaration");
                if (n2 instanceof InterfaceC1245ib) {
                    C0827cE c0827cE = AbstractC0545Ux.e;
                    if (AbstractC0545Ux.b((InterfaceC1245ib) n2, AbstractC1433lT.a)) {
                        return null;
                    }
                }
                Collection o2 = interfaceC0381Op3.o();
                AbstractC0048Bt.m(o2, "overriddenDescriptors");
                Collection collection = o2;
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        InterfaceC1118gg n3 = ((InterfaceC0381Op) it.next()).n();
                        AbstractC0048Bt.m(n3, "it.containingDeclaration");
                        if (n3 instanceof InterfaceC1245ib) {
                            C0827cE c0827cE2 = AbstractC0545Ux.e;
                            if (AbstractC0545Ux.b((InterfaceC1245ib) n3, AbstractC1433lT.a)) {
                                return null;
                            }
                        }
                    }
                }
                InterfaceC1118gg n4 = interfaceC0381Op3.n();
                InterfaceC1245ib interfaceC1245ib = n4 instanceof InterfaceC1245ib ? (InterfaceC1245ib) n4 : null;
                if (interfaceC1245ib != null) {
                    if (!AbstractC0306Ls.e(interfaceC1245ib)) {
                        interfaceC1245ib = null;
                    }
                    if (interfaceC1245ib != null && (i2 = interfaceC1245ib.i()) != null && (w2 = AbstractC0772bO.w(i2)) != null && (returnType = interfaceC0381Op3.getReturnType()) != null && AbstractC0048Bt.h(((AbstractC1184hg) interfaceC0381Op3).getName(), MG.d)) {
                        C0827cE c0827cE3 = AbstractC0545Ux.e;
                        if ((AbstractC0545Ux.B(returnType, AbstractC1433lT.h) || AbstractC0545Ux.E(returnType)) && interfaceC0381Op3.t0().size() == 1) {
                            AbstractC1004ey c3 = ((RY) interfaceC0381Op3.t0().get(0)).c();
                            AbstractC0048Bt.m(c3, "valueParameters[0].type");
                            if (AbstractC0048Bt.h(AbstractC0772bO.w(c3), w2) && interfaceC0381Op3.T().isEmpty() && interfaceC0381Op3.J() == null) {
                                return null;
                            }
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder("must override ''equals()'' in Any");
                InterfaceC1118gg n5 = interfaceC0381Op3.n();
                AbstractC0048Bt.m(n5, "containingDeclaration");
                if (AbstractC0306Ls.e(n5)) {
                    C2304yh c2304yh = C2304yh.d;
                    InterfaceC1118gg n6 = interfaceC0381Op3.n();
                    AbstractC0048Bt.l(n6, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    JR i5 = ((InterfaceC1245ib) n6).i();
                    AbstractC0048Bt.m(i5, "containingDeclaration as…ssDescriptor).defaultType");
                    sb2.append(" or define ''equals(other: " + c2304yh.Y(AbstractC0772bO.w(i5)) + "): Boolean''");
                }
                String sb3 = sb2.toString();
                AbstractC0048Bt.m(sb3, "StringBuilder().apply(builderAction).toString()");
                return sb3;
            case 20:
                InterfaceC0381Op interfaceC0381Op4 = (InterfaceC0381Op) obj;
                AbstractC0048Bt.n(interfaceC0381Op4, "$this$$receiver");
                C0261Jy x2 = interfaceC0381Op4.x();
                if (x2 == null) {
                    x2 = interfaceC0381Op4.J();
                }
                List list4 = LG.h;
                if (x2 != null) {
                    AbstractC1004ey returnType4 = interfaceC0381Op4.getReturnType();
                    if (!(returnType4 != null ? InterfaceC1136gy.a.b(returnType4, x2.c()) : false)) {
                        UL H0 = x2.H0();
                        AbstractC0048Bt.m(H0, "receiver.value");
                        if (H0 instanceof C2051us) {
                            InterfaceC1245ib interfaceC1245ib2 = ((C2051us) H0).h;
                            if (interfaceC1245ib2.X() && (f = AbstractC0192Hh.f(interfaceC1245ib2)) != null) {
                                InterfaceC2364zb p2 = AbstractC1052fg.p(AbstractC0192Hh.j(interfaceC1245ib2), f);
                                C1316ji c1316ji = p2 instanceof C1316ji ? (C1316ji) p2 : null;
                                if (c1316ji != null && (returnType2 = interfaceC0381Op4.getReturnType()) != null) {
                                    z2 = InterfaceC1136gy.a.b(returnType2, c1316ji.I0());
                                    break;
                                }
                            }
                        }
                        z2 = false;
                        break;
                    }
                    if (r6) {
                        return "receiver must be a supertype of the return type";
                    }
                    return null;
                }
                r6 = false;
                if (r6) {
                }
                break;
            case 21:
                C0027Ay c0027Ay2 = (C0027Ay) obj;
                if (c0027Ay2.v()) {
                    c0027Ay2.D(false);
                }
                return c0782bY;
            case 22:
                C0027Ay c0027Ay3 = (C0027Ay) obj;
                if (c0027Ay3.v()) {
                    c0027Ay3.D(false);
                }
                return c0782bY;
            case 23:
                C0027Ay c0027Ay4 = (C0027Ay) obj;
                if (c0027Ay4.v()) {
                    c0027Ay4.B(false);
                }
                return c0782bY;
            case 24:
                C0027Ay c0027Ay5 = (C0027Ay) obj;
                if (c0027Ay5.v()) {
                    c0027Ay5.B(false);
                }
                return c0782bY;
            case 25:
                C0027Ay c0027Ay6 = (C0027Ay) obj;
                if (c0027Ay6.v()) {
                    C0027Ay.C(c0027Ay6, false, 7);
                }
                return c0782bY;
            case 26:
                C0027Ay c0027Ay7 = (C0027Ay) obj;
                if (c0027Ay7.v()) {
                    C0027Ay.E(c0027Ay7, false, 7);
                }
                return c0782bY;
            case 27:
                C0027Ay c0027Ay8 = (C0027Ay) obj;
                if (c0027Ay8.v()) {
                    c0027Ay8.t();
                }
                return c0782bY;
            case 28:
                InterfaceC0961eH interfaceC0961eH = (InterfaceC0961eH) obj;
                AbstractC0048Bt.n(interfaceC0961eH, "it");
                return ((AbstractC1027fH) interfaceC0961eH).l;
            default:
                return c0782bY;
        }
    }
}
