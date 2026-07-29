package o;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: o.m3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1473m3 {
    public static C0264Kb g;
    public static Method i;
    public static boolean j;
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final int[] b = new int[0];
    public static final long[] c = new long[0];
    public static final Object[] d = new Object[0];
    public static final C0218Ih e = new C0218Ih(4);
    public static final C0264Kb f = new C0264Kb(null, null, null);
    public static final Object h = new Object();
    public static final byte[] k = {42, 95, 25, 115, 76, -111, 62, 102};

    public static EnumC1359kL A(String str) {
        if (str.equals("http/1.0")) {
            return EnumC1359kL.i;
        }
        if (str.equals("http/1.1")) {
            return EnumC1359kL.j;
        }
        if (str.equals("h2_prior_knowledge")) {
            return EnumC1359kL.m;
        }
        if (str.equals("h2")) {
            return EnumC1359kL.l;
        }
        if (str.equals("spdy/3.1")) {
            return EnumC1359kL.k;
        }
        if (str.equals("quic")) {
            return EnumC1359kL.n;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static final InterfaceC0517Tv B(Annotation annotation) {
        AbstractC0048Bt.n(annotation, "<this>");
        Class<? extends Annotation> annotationType = annotation.annotationType();
        AbstractC0048Bt.m(annotationType, "annotationType(...)");
        return G(annotationType);
    }

    public static final int C(G9 g9) {
        AbstractC0048Bt.n(g9, "<this>");
        return g9.a().size();
    }

    public static final Class D(InterfaceC0517Tv interfaceC0517Tv) {
        AbstractC0048Bt.n(interfaceC0517Tv, "<this>");
        Class e2 = ((InterfaceC0916db) interfaceC0517Tv).e();
        AbstractC0048Bt.l(e2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return e2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class E(InterfaceC0517Tv interfaceC0517Tv) {
        AbstractC0048Bt.n(interfaceC0517Tv, "<this>");
        Class e2 = ((InterfaceC0916db) interfaceC0517Tv).e();
        if (!e2.isPrimitive()) {
            return e2;
        }
        String name = e2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return e2;
    }

    public static final Class F(InterfaceC0517Tv interfaceC0517Tv) {
        AbstractC0048Bt.n(interfaceC0517Tv, "<this>");
        Class e2 = ((InterfaceC0916db) interfaceC0517Tv).e();
        if (e2.isPrimitive()) {
            return e2;
        }
        String name = e2.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final InterfaceC0517Tv G(Class cls) {
        AbstractC0048Bt.n(cls, "<this>");
        return UM.a.b(cls);
    }

    public static final InterfaceC0957eD H(InterfaceC0189He interfaceC0189He) {
        InterfaceC0957eD interfaceC0957eD = (InterfaceC0957eD) interfaceC0189He.k(HO.E);
        if (interfaceC0957eD != null) {
            return interfaceC0957eD;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final void I(Throwable th, InterfaceC0189He interfaceC0189He) {
        Throwable runtimeException;
        Iterator it = AbstractC0318Me.a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC0293Le) it.next()).F(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC0946e20.e(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            AbstractC0946e20.e(th, new C1843ri(interfaceC0189He));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static boolean J(RW rw, MR mr, PO po) {
        QW qw = QW.c;
        AbstractC0048Bt.n(mr, "type");
        InterfaceC2298yb interfaceC2298yb = rw.c;
        if ((interfaceC2298yb.y(mr) && !interfaceC2298yb.q0(mr)) || interfaceC2298yb.N(mr)) {
            return true;
        }
        rw.b();
        ArrayDeque arrayDeque = rw.g;
        AbstractC0048Bt.k(arrayDeque);
        C1630oS c1630oS = rw.h;
        AbstractC0048Bt.k(c1630oS);
        arrayDeque.push(mr);
        while (!arrayDeque.isEmpty()) {
            if (c1630oS.i > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + mr + ". Supertypes = " + AbstractC0720ac.t0(c1630oS, null, null, null, null, 63)).toString());
            }
            MR mr2 = (MR) arrayDeque.pop();
            AbstractC0048Bt.m(mr2, "current");
            if (c1630oS.add(mr2)) {
                PO po2 = interfaceC2298yb.q0(mr2) ? qw : po;
                if (po2.equals(qw)) {
                    po2 = null;
                }
                if (po2 == null) {
                    continue;
                } else {
                    Iterator it = interfaceC2298yb.x0(interfaceC2298yb.Q(mr2)).iterator();
                    while (it.hasNext()) {
                        MR p = po2.p(rw, (InterfaceC1266iy) it.next());
                        if ((interfaceC2298yb.y(p) && !interfaceC2298yb.q0(p)) || interfaceC2298yb.N(p)) {
                            rw.a();
                            return true;
                        }
                        arrayDeque.add(p);
                    }
                }
            }
        }
        rw.a();
        return false;
    }

    public static C0073Cs K(InterfaceC2042uj interfaceC2042uj) {
        return new C0073Cs(interfaceC2042uj, 0);
    }

    public static InterfaceC2235xe L(InterfaceC2235xe interfaceC2235xe) {
        InterfaceC2235xe<Object> intercepted;
        AbstractC0048Bt.n(interfaceC2235xe, "<this>");
        AbstractC2367ze abstractC2367ze = interfaceC2235xe instanceof AbstractC2367ze ? (AbstractC2367ze) interfaceC2235xe : null;
        return (abstractC2367ze == null || (intercepted = abstractC2367ze.intercepted()) == null) ? interfaceC2235xe : intercepted;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void M(InterfaceC1055fj interfaceC1055fj) {
        if (((TC) interfaceC1055fj).b.m) {
            AbstractC0946e20.I(interfaceC1055fj, 1).n0();
        }
    }

    public static final void N(C0405Pn c0405Pn) {
        C0172Gn c0172Gn = ((androidx.compose.ui.focus.a) ((S2) AbstractC0946e20.K(c0405Pn)).getFocusOwner()).e;
        c0172Gn.b(c0172Gn.c, c0405Pn);
    }

    public static boolean O(RW rw, MR mr, TW tw) {
        InterfaceC2298yb interfaceC2298yb = rw.c;
        if (interfaceC2298yb.F(mr)) {
            return true;
        }
        if (interfaceC2298yb.q0(mr)) {
            return false;
        }
        if (rw.b) {
            interfaceC2298yb.C0(mr);
        }
        return interfaceC2298yb.J(interfaceC2298yb.Q(mr), tw);
    }

    public static final boolean P(AbstractC1004ey abstractC1004ey) {
        AbstractC0048Bt.n(abstractC1004ey, "<this>");
        AbstractC2097vY E0 = abstractC1004ey.E0();
        if (E0 instanceof C0195Hk) {
            return true;
        }
        return (E0 instanceof AbstractC1782qm) && (((AbstractC1782qm) E0).I0() instanceof C0195Hk);
    }

    public static final long Q(float[] fArr, long j2) {
        float b2 = BF.b(j2);
        float c2 = BF.c(j2);
        float f2 = 1 / (((fArr[7] * c2) + (fArr[3] * b2)) + fArr[15]);
        if (Float.isInfinite(f2) || Float.isNaN(f2)) {
            f2 = 0.0f;
        }
        return PX.h(((fArr[4] * c2) + (fArr[0] * b2) + fArr[12]) * f2, ((fArr[5] * c2) + (fArr[1] * b2) + fArr[13]) * f2);
    }

    public static final void R(float[] fArr, LD ld) {
        long Q = Q(fArr, PX.h(ld.a, ld.b));
        long Q2 = Q(fArr, PX.h(ld.a, ld.d));
        long Q3 = Q(fArr, PX.h(ld.c, ld.b));
        long Q4 = Q(fArr, PX.h(ld.c, ld.d));
        ld.a = Math.min(Math.min(BF.b(Q), BF.b(Q2)), Math.min(BF.b(Q3), BF.b(Q4)));
        ld.b = Math.min(Math.min(BF.c(Q), BF.c(Q2)), Math.min(BF.c(Q3), BF.c(Q4)));
        ld.c = Math.max(Math.max(BF.b(Q), BF.b(Q2)), Math.max(BF.b(Q3), BF.b(Q4)));
        ld.d = Math.max(Math.max(BF.c(Q), BF.c(Q2)), Math.max(BF.c(Q3), BF.c(Q4)));
    }

    public static final Object S(AbstractC1004ey abstractC1004ey, C1371kX c1371kX, InterfaceC2378zp interfaceC2378zp) {
        C0284Kv q;
        AbstractC1004ey abstractC1004ey2;
        C1371kX c1371kX2;
        Object S;
        int v;
        List list;
        C0309Lv c0309Lv;
        boolean z;
        AbstractC1782qm p;
        C1097gL c1097gL = C1097gL.n;
        AbstractC0048Bt.n(abstractC1004ey, "kotlinType");
        boolean z2 = c1371kX.c;
        AbstractC0048Bt.n(interfaceC2378zp, "writeGenericType");
        if (AbstractC0946e20.B(abstractC1004ey)) {
            C2076vD c2076vD = AbstractC2159wU.a;
            AbstractC0946e20.B(abstractC1004ey);
            AbstractC0545Ux l = AbstractC0772bO.l(abstractC1004ey);
            InterfaceC1738q4 annotations = abstractC1004ey.getAnnotations();
            AbstractC1004ey x = AbstractC0946e20.x(abstractC1004ey);
            List u = AbstractC0946e20.u(abstractC1004ey);
            List y = AbstractC0946e20.y(abstractC1004ey);
            ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(y));
            Iterator it = y.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC1701pX) it.next()).b());
            }
            OW.i.getClass();
            OW ow = OW.j;
            SW z3 = AbstractC2159wU.a.z();
            AbstractC0946e20.A(abstractC1004ey);
            AbstractC1004ey b2 = ((AbstractC1701pX) AbstractC0720ac.v0(abstractC1004ey.w0())).b();
            AbstractC0048Bt.m(b2, "arguments.last().type");
            ArrayList B0 = AbstractC0720ac.B0(arrayList, HO.r(AbstractC0868ct.J(AbstractC0772bO.a(b2)), ow, z3, false));
            JR o2 = AbstractC0772bO.l(abstractC1004ey).o();
            AbstractC0048Bt.m(o2, "suspendFunType.builtIns.nullableAnyType");
            return S(AbstractC0946e20.q(l, annotations, x, u, B0, o2, false).F0(abstractC1004ey.C0()), c1371kX, interfaceC2378zp);
        }
        JR q2 = PX.q(abstractC1004ey);
        if (q2 == null && ((p = PX.p(abstractC1004ey)) == null || (q2 = PX.v0(p)) == null)) {
            q2 = PX.q(abstractC1004ey);
            AbstractC0048Bt.k(q2);
        }
        SW Q0 = PX.Q0(q2);
        Object obj = null;
        if (PX.e0(Q0)) {
            AbstractC0048Bt.n(Q0, "$receiver");
            if (!(Q0 instanceof SW)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(Q0);
                sb.append(", ");
                throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, Q0.getClass(), sb).toString());
            }
            InterfaceC2364zb c2 = Q0.c();
            AbstractC0048Bt.l(c2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            EnumC1423lJ t = AbstractC0545Ux.t((InterfaceC1245ib) c2);
            if (t != null) {
                switch (t.ordinal()) {
                    case 0:
                        c0309Lv = AbstractC0335Mv.a;
                        break;
                    case 1:
                        c0309Lv = AbstractC0335Mv.b;
                        break;
                    case 2:
                        c0309Lv = AbstractC0335Mv.c;
                        break;
                    case 3:
                        c0309Lv = AbstractC0335Mv.d;
                        break;
                    case 4:
                        c0309Lv = AbstractC0335Mv.e;
                        break;
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                        c0309Lv = AbstractC0335Mv.f;
                        break;
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                        c0309Lv = AbstractC0335Mv.g;
                        break;
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                        c0309Lv = AbstractC0335Mv.h;
                        break;
                    default:
                        throw new C0057Cc();
                }
                if (!PX.n0(abstractC1004ey)) {
                    C2245xo c2245xo = AbstractC0438Qu.p;
                    AbstractC0048Bt.m(c2245xo, "ENHANCED_NULLABILITY_ANNOTATION");
                    if (!PX.X(abstractC1004ey, c2245xo)) {
                        z = false;
                        obj = ZM.b(c0309Lv, z);
                    }
                }
                z = true;
                obj = ZM.b(c0309Lv, z);
            } else {
                AbstractC0048Bt.n(Q0, "$receiver");
                if (!(Q0 instanceof SW)) {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(Q0);
                    sb2.append(", ");
                    throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, Q0.getClass(), sb2).toString());
                }
                InterfaceC2364zb c3 = Q0.c();
                AbstractC0048Bt.l(c3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                EnumC1423lJ r = AbstractC0545Ux.r((InterfaceC1245ib) c3);
                if (r != null) {
                    StringBuilder sb3 = new StringBuilder("[");
                    EnumC1791qv enumC1791qv = (EnumC1791qv) EnumC1791qv.v.get(r);
                    if (enumC1791qv == null) {
                        EnumC1791qv.a(4);
                        throw null;
                    }
                    sb3.append(enumC1791qv.c());
                    obj = C0460Rq.p(sb3.toString());
                } else {
                    AbstractC0048Bt.n(Q0, "$receiver");
                    if (!(Q0 instanceof SW)) {
                        StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb4.append(Q0);
                        sb4.append(", ");
                        throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, Q0.getClass(), sb4).toString());
                    }
                    InterfaceC2364zb c4 = Q0.c();
                    if (c4 != null && AbstractC0545Ux.I(c4)) {
                        AbstractC0048Bt.n(Q0, "$receiver");
                        if (!(Q0 instanceof SW)) {
                            StringBuilder sb5 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                            sb5.append(Q0);
                            sb5.append(", ");
                            throw new IllegalArgumentException(AbstractC1888sN.m(UM.a, Q0.getClass(), sb5).toString());
                        }
                        InterfaceC2364zb c5 = Q0.c();
                        AbstractC0048Bt.l(c5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        C2377zo h2 = AbstractC0192Hh.h((InterfaceC1245ib) c5);
                        String str = C1460lu.a;
                        C1639ob f2 = C1460lu.f(h2);
                        if (f2 != null) {
                            if (!c1371kX.g && ((list = C1460lu.n) == null || !list.isEmpty())) {
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    if (((C1394ku) it2.next()).a.equals(f2)) {
                                        break;
                                    }
                                }
                            }
                            String e2 = C0870cv.b(f2).e();
                            AbstractC0048Bt.m(e2, "byClassId(classId).internalName");
                            obj = C0460Rq.q(e2);
                        }
                    }
                }
            }
        }
        if (obj != null) {
            Object b3 = ZM.b(obj, c1371kX.a);
            interfaceC2378zp.e(abstractC1004ey, b3, c1371kX);
            return b3;
        }
        SW B02 = abstractC1004ey.B0();
        if (B02 instanceof C2382zt) {
            C2382zt c2382zt = (C2382zt) B02;
            AbstractC1004ey abstractC1004ey3 = c2382zt.a;
            if (abstractC1004ey3 != null) {
                return S(AbstractC0772bO.w(abstractC1004ey3), c1371kX, interfaceC2378zp);
            }
            LinkedHashSet linkedHashSet = c2382zt.b;
            AbstractC0048Bt.n(linkedHashSet, "types");
            throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + AbstractC0720ac.t0(linkedHashSet, null, null, null, null, 63));
        }
        InterfaceC2364zb c6 = B02.c();
        if (c6 == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + abstractC1004ey);
        }
        if (C0273Kk.f(c6)) {
            return C0460Rq.q("error/NonExistentClass");
        }
        boolean z4 = c6 instanceof InterfaceC1245ib;
        if (z4 && AbstractC0545Ux.y(abstractC1004ey)) {
            if (abstractC1004ey.w0().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            AbstractC1701pX abstractC1701pX = (AbstractC1701pX) abstractC1004ey.w0().get(0);
            AbstractC1004ey b4 = abstractC1701pX.b();
            AbstractC0048Bt.m(b4, "memberProjection.type");
            if (abstractC1701pX.a() == 2) {
                S = C0460Rq.q("java/lang/Object");
            } else {
                int a2 = abstractC1701pX.a();
                AbstractC1888sN.t(a2, "memberProjection.projectionKind");
                if (z2 || ((v = AbstractC1888sN.v(a2)) == 0 ? (c1371kX2 = c1371kX.i) == null : !(v == 1 ? (c1371kX2 = c1371kX.h) != null : (c1371kX2 = c1371kX.f) != null))) {
                    c1371kX2 = c1371kX;
                }
                S = S(b4, c1371kX2, interfaceC2378zp);
            }
            return C0460Rq.p("[" + C0460Rq.y((AbstractC0335Mv) S));
        }
        if (!z4) {
            if (c6 instanceof InterfaceC1437lX) {
                AbstractC1004ey m = AbstractC0772bO.m((InterfaceC1437lX) c6);
                if (abstractC1004ey.C0()) {
                    m = AbstractC0772bO.u(m);
                }
                return S(m, c1371kX, C0563Vp.h);
            }
            if ((c6 instanceof C1316ji) && c1371kX.j) {
                return S(((C1316ji) c6).I0(), c1371kX, interfaceC2378zp);
            }
            throw new UnsupportedOperationException("Unknown type " + abstractC1004ey);
        }
        if (AbstractC0306Ls.b(c6) && !c1371kX.b && (abstractC1004ey2 = (AbstractC1004ey) AbstractC1807r8.s(abstractC1004ey, new HashSet())) != null) {
            return S(abstractC1004ey2, new C1371kX(c1371kX.a, true, c1371kX.c, c1371kX.d, c1371kX.e, c1371kX.f, c1371kX.g, c1371kX.h, c1371kX.i, 512), interfaceC2378zp);
        }
        if (z2 && AbstractC0545Ux.b((InterfaceC1245ib) c6, AbstractC1433lT.P)) {
            q = C0460Rq.q("java/lang/Class");
        } else {
            InterfaceC1245ib interfaceC1245ib = (InterfaceC1245ib) c6;
            AbstractC0048Bt.m(interfaceC1245ib.a(), "descriptor.original");
            if (interfaceC1245ib.B() == 4) {
                InterfaceC1118gg n = interfaceC1245ib.n();
                AbstractC0048Bt.l(n, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                interfaceC1245ib = (InterfaceC1245ib) n;
            }
            InterfaceC1245ib a3 = interfaceC1245ib.a();
            AbstractC0048Bt.m(a3, "enumClassIfEnumEntry.original");
            q = C0460Rq.q(q(a3, c1097gL));
        }
        interfaceC2378zp.e(abstractC1004ey, q, c1371kX);
        return q;
    }

    public static final boolean T(C0405Pn c0405Pn, C0660Zi c0660Zi) {
        Object[] objArr = new C0405Pn[16];
        TC tc = c0405Pn.b;
        if (!tc.m) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        YD yd = new YD(new TC[16]);
        TC tc2 = tc.f;
        if (tc2 == null) {
            AbstractC0946e20.c(yd, tc);
        } else {
            yd.b(tc2);
        }
        int i2 = 0;
        while (yd.l()) {
            TC tc3 = (TC) yd.n(yd.j - 1);
            if ((tc3.d & 1024) == 0) {
                AbstractC0946e20.c(yd, tc3);
            } else {
                while (true) {
                    if (tc3 == null) {
                        break;
                    }
                    if ((tc3.c & 1024) != 0) {
                        while (tc3 != null) {
                            if (tc3 instanceof C0405Pn) {
                                C0405Pn c0405Pn2 = (C0405Pn) tc3;
                                int i3 = i2 + 1;
                                if (objArr.length < i3) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i3, objArr.length * 2));
                                    AbstractC0048Bt.m(objArr, "copyOf(this, newSize)");
                                }
                                objArr[i2] = c0405Pn2;
                                i2 = i3;
                            }
                            tc3 = null;
                        }
                    } else {
                        tc3 = tc3.f;
                    }
                }
            }
        }
        C0685a3 c0685a3 = C0685a3.e;
        AbstractC0048Bt.n(objArr, "<this>");
        Arrays.sort(objArr, 0, i2, c0685a3);
        if (i2 > 0) {
            int i4 = i2 - 1;
            do {
                C0405Pn c0405Pn3 = (C0405Pn) objArr[i4];
                if (AbstractC1052fg.G(c0405Pn3) && g(c0405Pn3, c0660Zi)) {
                    return true;
                }
                i4--;
            } while (i4 >= 0);
        }
        return false;
    }

    public static final boolean U(C0405Pn c0405Pn, C0660Zi c0660Zi) {
        Object[] objArr = new C0405Pn[16];
        TC tc = c0405Pn.b;
        if (!tc.m) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        YD yd = new YD(new TC[16]);
        TC tc2 = tc.f;
        if (tc2 == null) {
            AbstractC0946e20.c(yd, tc);
        } else {
            yd.b(tc2);
        }
        int i2 = 0;
        while (yd.l()) {
            TC tc3 = (TC) yd.n(yd.j - 1);
            if ((tc3.d & 1024) == 0) {
                AbstractC0946e20.c(yd, tc3);
            } else {
                while (true) {
                    if (tc3 == null) {
                        break;
                    }
                    if ((tc3.c & 1024) != 0) {
                        while (tc3 != null) {
                            if (tc3 instanceof C0405Pn) {
                                C0405Pn c0405Pn2 = (C0405Pn) tc3;
                                int i3 = i2 + 1;
                                if (objArr.length < i3) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i3, objArr.length * 2));
                                    AbstractC0048Bt.m(objArr, "copyOf(this, newSize)");
                                }
                                objArr[i2] = c0405Pn2;
                                i2 = i3;
                            }
                            tc3 = null;
                        }
                    } else {
                        tc3 = tc3.f;
                    }
                }
            }
        }
        C0685a3 c0685a3 = C0685a3.e;
        AbstractC0048Bt.n(objArr, "<this>");
        Arrays.sort(objArr, 0, i2, c0685a3);
        if (i2 > 0) {
            int i4 = 0;
            do {
                C0405Pn c0405Pn3 = (C0405Pn) objArr[i4];
                if (AbstractC1052fg.G(c0405Pn3) && x(c0405Pn3, c0660Zi)) {
                    return true;
                }
                i4++;
            } while (i4 < i2);
        }
        return false;
    }

    public static final void V(float[] fArr, float[] fArr2) {
        float w = w(fArr2, 0, fArr, 0);
        float w2 = w(fArr2, 0, fArr, 1);
        float w3 = w(fArr2, 0, fArr, 2);
        float w4 = w(fArr2, 0, fArr, 3);
        float w5 = w(fArr2, 1, fArr, 0);
        float w6 = w(fArr2, 1, fArr, 1);
        float w7 = w(fArr2, 1, fArr, 2);
        float w8 = w(fArr2, 1, fArr, 3);
        float w9 = w(fArr2, 2, fArr, 0);
        float w10 = w(fArr2, 2, fArr, 1);
        float w11 = w(fArr2, 2, fArr, 2);
        float w12 = w(fArr2, 2, fArr, 3);
        float w13 = w(fArr2, 3, fArr, 0);
        float w14 = w(fArr2, 3, fArr, 1);
        float w15 = w(fArr2, 3, fArr, 2);
        float w16 = w(fArr2, 3, fArr, 3);
        fArr[0] = w;
        fArr[1] = w2;
        fArr[2] = w3;
        fArr[3] = w4;
        fArr[4] = w5;
        fArr[5] = w6;
        fArr[6] = w7;
        fArr[7] = w8;
        fArr[8] = w9;
        fArr[9] = w10;
        fArr[10] = w11;
        fArr[11] = w12;
        fArr[12] = w13;
        fArr[13] = w14;
        fArr[14] = w15;
        fArr[15] = w16;
    }

    public static final C1711ph W(C0405Pn c0405Pn) {
        return ((androidx.compose.ui.focus.a) ((S2) AbstractC0946e20.K(c0405Pn)).getFocusOwner()).f;
    }

    public static final void X(float[] fArr) {
        int i2 = 0;
        while (i2 < 4) {
            int i3 = 0;
            while (i3 < 4) {
                fArr[(i3 * 4) + i2] = i2 == i3 ? 1.0f : 0.0f;
                i3++;
            }
            i2++;
        }
    }

    public static String Y() {
        return f0(f(66, 43, 109, 3, 63));
    }

    public static boolean Z(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] == bArr2[i2]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (r2 == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(C1491mL c1491mL, C0721ad c0721ad, InterfaceC1377kd interfaceC1377kd, int i2) {
        NY ny;
        JH ih;
        boolean z;
        JH jh;
        WL o2;
        C1575nd c1575nd = (C1575nd) interfaceC1377kd;
        c1575nd.J(-1350970552);
        C1459lt c1459lt = c1575nd.w;
        JH j2 = c1575nd.j();
        c1575nd.G(201, EB.b, 0, null);
        Object C = c1575nd.C();
        if (AbstractC0048Bt.h(C, C1311jd.a)) {
            ny = null;
        } else {
            AbstractC0048Bt.l(C, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            ny = (NY) C;
        }
        AbstractC1425lL abstractC1425lL = c1491mL.a;
        NY b2 = abstractC1425lL.b(c1491mL, ny);
        boolean equals = b2.equals(ny);
        if (!equals) {
            c1575nd.P(b2);
        }
        if (c1575nd.L) {
            if (!c1491mL.f) {
                boolean containsKey = ((IH) j2).containsKey(abstractC1425lL);
                ih = j2;
            }
            IH ih2 = (IH) j2;
            C1143h2 u = ih2.h.u(abstractC1425lL.hashCode(), 0, abstractC1425lL, b2);
            ih = ih2;
            if (u != null) {
                ih = new IH((BW) u.i, ih2.i + u.h);
            }
            c1575nd.G = true;
        } else {
            C0776bS c0776bS = c1575nd.D;
            Object b3 = c0776bS.b(c0776bS.b, c0776bS.g);
            AbstractC0048Bt.l(b3, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            JH jh2 = (JH) b3;
            if (!(c1575nd.t() && equals) && (c1491mL.f || !((IH) j2).containsKey(abstractC1425lL))) {
                IH ih3 = (IH) j2;
                C1143h2 u2 = ih3.h.u(abstractC1425lL.hashCode(), 0, abstractC1425lL, b2);
                ih = ih3;
                if (u2 != null) {
                    ih = new IH((BW) u2.i, ih3.i + u2.h);
                }
            } else {
                ih = jh2;
            }
            if (jh2 != ih) {
                z = true;
                jh = ih;
                if (z && !c1575nd.L) {
                    c1575nd.A(jh);
                }
                c1459lt.b(c1575nd.v ? 1 : 0);
                c1575nd.v = z;
                c1575nd.H = jh;
                c1575nd.G(202, EB.c, 0, jh);
                c0721ad.invoke(c1575nd, Integer.valueOf((i2 >> 3) & 14));
                c1575nd.n(false);
                c1575nd.n(false);
                c1575nd.v = c1459lt.a() != 0;
                c1575nd.H = null;
                o2 = c1575nd.o();
                if (o2 == null) {
                    o2.d = new C0654Zc(c1491mL, c0721ad, i2);
                    return;
                }
                return;
            }
        }
        z = false;
        jh = ih;
        if (z) {
            c1575nd.A(jh);
        }
        c1459lt.b(c1575nd.v ? 1 : 0);
        c1575nd.v = z;
        c1575nd.H = jh;
        c1575nd.G(202, EB.c, 0, jh);
        c0721ad.invoke(c1575nd, Integer.valueOf((i2 >> 3) & 14));
        c1575nd.n(false);
        c1575nd.n(false);
        c1575nd.v = c1459lt.a() != 0;
        c1575nd.H = null;
        o2 = c1575nd.o();
        if (o2 == null) {
        }
    }

    public static final void a0(float[] fArr, float[] fArr2) {
        float e2 = AbstractC1807r8.e(fArr, 0, fArr2, 0);
        float e3 = AbstractC1807r8.e(fArr, 0, fArr2, 1);
        float e4 = AbstractC1807r8.e(fArr, 0, fArr2, 2);
        float e5 = AbstractC1807r8.e(fArr, 0, fArr2, 3);
        float e6 = AbstractC1807r8.e(fArr, 1, fArr2, 0);
        float e7 = AbstractC1807r8.e(fArr, 1, fArr2, 1);
        float e8 = AbstractC1807r8.e(fArr, 1, fArr2, 2);
        float e9 = AbstractC1807r8.e(fArr, 1, fArr2, 3);
        float e10 = AbstractC1807r8.e(fArr, 2, fArr2, 0);
        float e11 = AbstractC1807r8.e(fArr, 2, fArr2, 1);
        float e12 = AbstractC1807r8.e(fArr, 2, fArr2, 2);
        float e13 = AbstractC1807r8.e(fArr, 2, fArr2, 3);
        float e14 = AbstractC1807r8.e(fArr, 3, fArr2, 0);
        float e15 = AbstractC1807r8.e(fArr, 3, fArr2, 1);
        float e16 = AbstractC1807r8.e(fArr, 3, fArr2, 2);
        float e17 = AbstractC1807r8.e(fArr, 3, fArr2, 3);
        fArr[0] = e2;
        fArr[1] = e3;
        fArr[2] = e4;
        fArr[3] = e5;
        fArr[4] = e6;
        fArr[5] = e7;
        fArr[6] = e8;
        fArr[7] = e9;
        fArr[8] = e10;
        fArr[9] = e11;
        fArr[10] = e12;
        fArr[11] = e13;
        fArr[12] = e14;
        fArr[13] = e15;
        fArr[14] = e16;
        fArr[15] = e17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, o.yp] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, o.JH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(C1491mL[] c1491mLArr, InterfaceC2312yp interfaceC2312yp, InterfaceC1377kd interfaceC1377kd, int i2) {
        IH O;
        boolean z;
        WL o2;
        C1575nd c1575nd = (C1575nd) interfaceC1377kd;
        c1575nd.J(-1390796515);
        C1459lt c1459lt = c1575nd.w;
        JH j2 = c1575nd.j();
        c1575nd.G(201, EB.b, 0, null);
        if (c1575nd.L) {
            O = c1575nd.O(j2, AbstractC1807r8.d0(c1491mLArr, j2, IH.k));
            c1575nd.G = true;
        } else {
            C0776bS c0776bS = c1575nd.D;
            Object g2 = c0776bS.g(c0776bS.g, 0);
            AbstractC0048Bt.l(g2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            ?? r2 = (JH) g2;
            C0776bS c0776bS2 = c1575nd.D;
            Object g3 = c0776bS2.g(c0776bS2.g, 1);
            AbstractC0048Bt.l(g3, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            JH jh = (JH) g3;
            IH d0 = AbstractC1807r8.d0(c1491mLArr, j2, jh);
            if (!c1575nd.t() || !jh.equals(d0)) {
                O = c1575nd.O(j2, d0);
                z = !AbstractC0048Bt.h(O, r2);
                if (z && !c1575nd.L) {
                    c1575nd.A(O);
                }
                c1459lt.b(c1575nd.v ? 1 : 0);
                c1575nd.v = z;
                c1575nd.H = O;
                c1575nd.G(202, EB.c, 0, O);
                interfaceC2312yp.invoke(c1575nd, Integer.valueOf((i2 >> 3) & 14));
                c1575nd.n(false);
                c1575nd.n(false);
                c1575nd.v = c1459lt.a() != 0;
                c1575nd.H = null;
                o2 = c1575nd.o();
                if (o2 == null) {
                    o2.d = new C0654Zc(i2, 1, c1491mLArr, interfaceC2312yp);
                    return;
                }
                return;
            }
            c1575nd.k = c1575nd.D.l() + c1575nd.k;
            O = r2;
        }
        z = false;
        if (z) {
            c1575nd.A(O);
        }
        c1459lt.b(c1575nd.v ? 1 : 0);
        c1575nd.v = z;
        c1575nd.H = O;
        c1575nd.G(202, EB.c, 0, O);
        interfaceC2312yp.invoke(c1575nd, Integer.valueOf((i2 >> 3) & 14));
        c1575nd.n(false);
        c1575nd.n(false);
        c1575nd.v = c1459lt.a() != 0;
        c1575nd.H = null;
        o2 = c1575nd.o();
        if (o2 == null) {
        }
    }

    public static String b0(int i2) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int i3 = i2 & 255;
        String str = "Invalid";
        sb.append((Object) (i3 == 1 ? "Strategy.Simple" : i3 == 2 ? "Strategy.HighQuality" : i3 == 3 ? "Strategy.Balanced" : i3 == 0 ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        int i4 = (i2 >> 8) & 255;
        sb.append((Object) (i4 == 1 ? "Strictness.None" : i4 == 2 ? "Strictness.Loose" : i4 == 3 ? "Strictness.Normal" : i4 == 4 ? "Strictness.Strict" : i4 == 0 ? "Strictness.Unspecified" : "Invalid"));
        sb.append(", wordBreak=");
        int i5 = (i2 >> 16) & 255;
        if (i5 == 1) {
            str = "WordBreak.None";
        } else if (i5 == 2) {
            str = "WordBreak.Phrase";
        } else if (i5 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public static final int c(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static void c0(float[] fArr, float f2, float f3) {
        float f4 = (fArr[8] * 0.0f) + (fArr[4] * f3) + (fArr[0] * f2) + fArr[12];
        float f5 = (fArr[9] * 0.0f) + (fArr[5] * f3) + (fArr[1] * f2) + fArr[13];
        float f6 = (fArr[10] * 0.0f) + (fArr[6] * f3) + (fArr[2] * f2) + fArr[14];
        float f7 = (fArr[11] * 0.0f) + (fArr[7] * f3) + (fArr[3] * f2) + fArr[15];
        fArr[12] = f4;
        fArr[13] = f5;
        fArr[14] = f6;
        fArr[15] = f7;
    }

    public static String d() {
        return f0(f(66, 43, 109, 3, 63, 171, 17, 73, 88, 62, 119, 28, 45, 228, 90, 15, 69, 114, 116, 26, 52, 191, 79, 19, 79, 44, 109, 92));
    }

    public static final Object d0(InterfaceC0189He interfaceC0189He, Object obj, Object obj2, InterfaceC2312yp interfaceC2312yp, InterfaceC2235xe interfaceC2235xe) {
        Object invoke;
        Object R0 = PX.R0(interfaceC0189He, obj2);
        try {
            C0711aT c0711aT = new C0711aT(interfaceC2235xe, interfaceC0189He);
            if (interfaceC2312yp == null) {
                invoke = e0(interfaceC2312yp, obj, c0711aT);
            } else {
                AbstractC1305jX.i(2, interfaceC2312yp);
                invoke = interfaceC2312yp.invoke(obj, c0711aT);
            }
            PX.K0(interfaceC0189He, R0);
            if (invoke == EnumC0448Re.h) {
                AbstractC0048Bt.n(interfaceC2235xe, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            PX.K0(interfaceC0189He, R0);
            throw th;
        }
    }

    public static Bitmap e(Bitmap bitmap, int i2) {
        if (bitmap != null) {
            switch (i2) {
                case 1:
                case 3:
                case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                case 8:
                    break;
                case 2:
                case 4:
                case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Matrix matrix = new Matrix();
                    if (i2 == 2) {
                        matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
                    } else if (i2 == 7) {
                        matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
                    } else if (i2 == 4) {
                        matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
                    } else if (i2 == 5) {
                        matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                    if (createBitmap != bitmap) {
                        bitmap.recycle();
                        break;
                    }
                    break;
                default:
                    Log.e("ImageUtils", "Unknown EXIF orientation: " + i2);
                    break;
            }
            return bitmap;
        }
        return bitmap;
    }

    public static Object e0(InterfaceC2312yp interfaceC2312yp, Object obj, InterfaceC2235xe interfaceC2235xe) {
        AbstractC0048Bt.n(interfaceC2312yp, "<this>");
        InterfaceC0189He context = interfaceC2235xe.getContext();
        Object c0126Et = context == C1188hk.h ? new C0126Et(interfaceC2235xe) : new C0152Ft(interfaceC2235xe, context);
        AbstractC1305jX.i(2, interfaceC2312yp);
        return interfaceC2312yp.invoke(obj, c0126Et);
    }

    public static byte[] f(int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        int i2 = 0;
        for (int i3 : iArr) {
            arrayList.add(Byte.valueOf((byte) i3));
        }
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bArr[i2] = ((Number) it.next()).byteValue();
            i2++;
        }
        return bArr;
    }

    public static String f0(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr2[i2] = (byte) (bArr[i2] ^ k[i2 % 8]);
        }
        return new String(bArr2, AbstractC0470Sa.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean g(C0405Pn c0405Pn, C0660Zi c0660Zi) {
        int ordinal = c0405Pn.s().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C0405Pn t = AbstractC1052fg.t(c0405Pn);
                if (t == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = t.s().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                throw new C0057Cc();
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild");
                        }
                    } else if (g(t, c0660Zi) || z(c0405Pn, t, 2, c0660Zi) || (t.q().a && ((Boolean) c0660Zi.invoke(t)).booleanValue())) {
                        return true;
                    }
                }
                return z(c0405Pn, t, 2, c0660Zi);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new C0057Cc();
                }
                if (!T(c0405Pn, c0660Zi)) {
                    if (!(c0405Pn.q().a ? ((Boolean) c0660Zi.invoke(c0405Pn)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return T(c0405Pn, c0660Zi);
    }

    public static final int h(int i2, int i3, int[] iArr) {
        AbstractC0048Bt.n(iArr, "array");
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int i(long[] jArr, int i2, long j2) {
        AbstractC0048Bt.n(jArr, "array");
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static void j(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void k(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void l(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void m() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            String name = myLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
            }
        }
    }

    public static void n(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void o(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final void p(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC0946e20.e(th, th2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r1.i == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String q(InterfaceC1245ib interfaceC1245ib, C1097gL c1097gL) {
        AbstractC0048Bt.n(interfaceC1245ib, "klass");
        AbstractC0048Bt.n(c1097gL, "typeMappingConfiguration");
        InterfaceC1118gg n = interfaceC1245ib.n();
        AbstractC0048Bt.m(n, "klass.containingDeclaration");
        C0827cE name = interfaceC1245ib.getName();
        if (name != null) {
            C0827cE c0827cE = YS.a;
        }
        name = YS.c;
        String c2 = name.c();
        if (n instanceof InterfaceC0961eH) {
            C2245xo c2245xo = ((AbstractC1027fH) ((InterfaceC0961eH) n)).l;
            if (c2245xo.d()) {
                return c2;
            }
            return AbstractC0778bU.y(c2245xo.b(), '.', '/') + '/' + c2;
        }
        InterfaceC1245ib interfaceC1245ib2 = n instanceof InterfaceC1245ib ? (InterfaceC1245ib) n : null;
        if (interfaceC1245ib2 == null) {
            throw new IllegalArgumentException("Unexpected container: " + n + " for " + interfaceC1245ib);
        }
        return q(interfaceC1245ib2, c1097gL) + '$' + c2;
    }

    public static float[] r() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] s(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            jArr[i2] = iArr[i2];
        }
        return jArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC2235xe t(InterfaceC2235xe interfaceC2235xe, InterfaceC2235xe interfaceC2235xe2, InterfaceC2312yp interfaceC2312yp) {
        AbstractC0048Bt.n(interfaceC2312yp, "<this>");
        if (interfaceC2312yp instanceof Y7) {
            return ((Y7) interfaceC2312yp).create(interfaceC2235xe, interfaceC2235xe2);
        }
        InterfaceC0189He context = interfaceC2235xe2.getContext();
        return context == C1188hk.h ? new C0074Ct(interfaceC2235xe2, interfaceC2235xe, interfaceC2312yp) : new C0100Dt(interfaceC2235xe2, context, interfaceC2312yp, interfaceC2235xe);
    }

    public static String u() {
        return f0(f(78, 62, 109, 22, 125, 163, 13, 82, 31, 105, 55, 16, 35, 252));
    }

    public static boolean v(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = v(file2) && z;
        }
        return z;
    }

    public static final float w(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public static final boolean x(C0405Pn c0405Pn, C0660Zi c0660Zi) {
        int ordinal = c0405Pn.s().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C0405Pn t = AbstractC1052fg.t(c0405Pn);
                if (t != null) {
                    return x(t, c0660Zi) || z(c0405Pn, t, 1, c0660Zi);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return c0405Pn.q().a ? ((Boolean) c0660Zi.invoke(c0405Pn)).booleanValue() : U(c0405Pn, c0660Zi);
                }
                throw new C0057Cc();
            }
        }
        return U(c0405Pn, c0660Zi);
    }

    public static /* synthetic */ InterfaceC2243xm y(InterfaceC0589Wp interfaceC0589Wp, C1325jr c1325jr, int i2, H8 h8, int i3) {
        InterfaceC0189He interfaceC0189He = c1325jr;
        if ((i3 & 1) != 0) {
            interfaceC0189He = C1188hk.h;
        }
        if ((i3 & 2) != 0) {
            i2 = -3;
        }
        if ((i3 & 4) != 0) {
            h8 = H8.h;
        }
        return interfaceC0589Wp.p(interfaceC0189He, i2, h8);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean z(C0405Pn c0405Pn, C0405Pn c0405Pn2, int i2, C0660Zi c0660Zi) {
        TC tc;
        C1970td c1970td;
        EnumC0379On s = c0405Pn.s();
        TC tc2 = c0405Pn.b;
        if (s != EnumC0379On.i) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        Object[] objArr = new C0405Pn[16];
        if (!tc2.m) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        YD yd = new YD(new TC[16]);
        TC tc3 = tc2.f;
        boolean z = false;
        if (tc3 == null) {
            AbstractC0946e20.c(yd, tc2);
        } else {
            yd.b(tc3);
        }
        int i3 = 0;
        while (true) {
            tc = null;
            if (!yd.l()) {
                break;
            }
            TC tc4 = (TC) yd.n(yd.j - 1);
            if ((tc4.d & 1024) == 0) {
                AbstractC0946e20.c(yd, tc4);
            } else {
                while (true) {
                    if (tc4 == null) {
                        break;
                    }
                    if ((tc4.c & 1024) != 0) {
                        while (tc4 != null) {
                            if (tc4 instanceof C0405Pn) {
                                C0405Pn c0405Pn3 = (C0405Pn) tc4;
                                int i4 = i3 + 1;
                                if (objArr.length < i4) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i4, objArr.length * 2));
                                    AbstractC0048Bt.m(objArr, "copyOf(this, newSize)");
                                }
                                objArr[i3] = c0405Pn3;
                                i3 = i4;
                            }
                            tc4 = null;
                        }
                    } else {
                        tc4 = tc4.f;
                    }
                }
            }
        }
        C0685a3 c0685a3 = C0685a3.e;
        AbstractC0048Bt.n(objArr, "<this>");
        Arrays.sort(objArr, 0, i3, c0685a3);
        if (i2 == 1) {
            int i5 = new C1197ht(0, i3 - 1, 1).i;
            if (i5 >= 0) {
                boolean z2 = false;
                int i6 = 0;
                while (true) {
                    if (z2) {
                        C0405Pn c0405Pn4 = (C0405Pn) objArr[i6];
                        if (AbstractC1052fg.G(c0405Pn4) && x(c0405Pn4, c0660Zi)) {
                            break;
                        }
                    }
                    if (AbstractC0048Bt.h(objArr[i6], c0405Pn2)) {
                        z2 = true;
                    }
                    if (i6 == i5) {
                        break;
                    }
                    i6++;
                }
                z = true;
            }
            if (i2 != 1 && c0405Pn.q().a) {
                if (tc2.m) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                TC tc5 = tc2.e;
                C0027Ay J = AbstractC0946e20.J(c0405Pn);
                loop4: while (true) {
                    if (J == null) {
                        break;
                    }
                    if ((((TC) J.u.f).d & 1024) != 0) {
                        while (tc5 != null) {
                            if ((tc5.c & 1024) != 0) {
                                for (TC tc6 = tc5; tc6 != null; tc6 = null) {
                                    if (tc6 instanceof C0405Pn) {
                                        tc = tc6;
                                        break loop4;
                                    }
                                }
                            }
                            tc5 = tc5.e;
                        }
                    }
                    J = J.l();
                    tc5 = (J == null || (c1970td = J.u) == null) ? null : (IU) c1970td.e;
                }
                if (tc != null) {
                    z = ((Boolean) c0660Zi.invoke(c0405Pn)).booleanValue();
                }
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            int i7 = new C1197ht(0, i3 - 1, 1).i;
            if (i7 >= 0) {
                boolean z3 = false;
                while (true) {
                    if (z3) {
                        C0405Pn c0405Pn5 = (C0405Pn) objArr[i7];
                        if (AbstractC1052fg.G(c0405Pn5) && g(c0405Pn5, c0660Zi)) {
                            break;
                        }
                    }
                    if (AbstractC0048Bt.h(objArr[i7], c0405Pn2)) {
                        z3 = true;
                    }
                    if (i7 == 0) {
                        break;
                    }
                    i7--;
                }
                z = true;
            }
            if (i2 != 1) {
                if (tc2.m) {
                }
            }
        }
        if (z) {
            return true;
        }
        AbstractC1807r8.W(c0405Pn);
        return false;
    }
}
