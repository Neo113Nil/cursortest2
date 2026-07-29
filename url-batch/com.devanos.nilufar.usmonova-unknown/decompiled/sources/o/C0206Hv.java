package o;

import com.google.firebase.messaging.Constants;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.Hv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0206Hv {
    public static final C1649ol a;

    static {
        C1649ol c1649ol = new C1649ol();
        c1649ol.a(AbstractC0180Gv.a);
        c1649ol.a(AbstractC0180Gv.b);
        c1649ol.a(AbstractC0180Gv.c);
        c1649ol.a(AbstractC0180Gv.d);
        c1649ol.a(AbstractC0180Gv.e);
        c1649ol.a(AbstractC0180Gv.f);
        c1649ol.a(AbstractC0180Gv.g);
        c1649ol.a(AbstractC0180Gv.h);
        c1649ol.a(AbstractC0180Gv.i);
        c1649ol.a(AbstractC0180Gv.j);
        c1649ol.a(AbstractC0180Gv.k);
        c1649ol.a(AbstractC0180Gv.l);
        c1649ol.a(AbstractC0180Gv.m);
        c1649ol.a(AbstractC0180Gv.n);
        a = c1649ol;
    }

    public static C1461lv a(C1162hK c1162hK, InterfaceC0893dE interfaceC0893dE, C0695aD c0695aD) {
        String t0;
        AbstractC0048Bt.n(c1162hK, "proto");
        AbstractC0048Bt.n(interfaceC0893dE, "nameResolver");
        AbstractC0048Bt.n(c0695aD, "typeTable");
        C2049uq c2049uq = AbstractC0180Gv.a;
        AbstractC0048Bt.m(c2049uq, "constructorSignature");
        C2318yv c2318yv = (C2318yv) AbstractC1305jX.s(c1162hK, c2049uq);
        String string = (c2318yv == null || (c2318yv.i & 1) != 1) ? "<init>" : interfaceC0893dE.getString(c2318yv.j);
        if (c2318yv == null || (c2318yv.i & 2) != 2) {
            List<UK> list = c1162hK.l;
            AbstractC0048Bt.m(list, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(list));
            for (UK uk : list) {
                AbstractC0048Bt.m(uk, "it");
                String e = e(AbstractC0946e20.U(uk, c0695aD), interfaceC0893dE);
                if (e == null) {
                    return null;
                }
                arrayList.add(e);
            }
            t0 = AbstractC0720ac.t0(arrayList, "", "(", ")V", null, 56);
        } else {
            t0 = interfaceC0893dE.getString(c2318yv.k);
        }
        return new C1461lv(string, t0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 java.lang.String, still in use, count: 2, list:
          (r4v2 java.lang.String) from 0x0052: IF  (r4v2 java.lang.String) == (null java.lang.String)  -> B:23:0x0054 A[HIDDEN] (LINE:83)
          (r4v2 java.lang.String) from 0x0055: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:20:0x0052, B:15:0x0043] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static o.C1395kv b(o.CK r4, o.InterfaceC0893dE r5, o.C0695aD r6, boolean r7) {
        /*
            java.lang.String r0 = "proto"
            o.AbstractC0048Bt.n(r4, r0)
            java.lang.String r0 = "nameResolver"
            o.AbstractC0048Bt.n(r5, r0)
            java.lang.String r0 = "typeTable"
            o.AbstractC0048Bt.n(r6, r0)
            o.uq r0 = o.AbstractC0180Gv.d
            java.lang.String r1 = "propertySignature"
            o.AbstractC0048Bt.m(r0, r1)
            java.lang.Object r0 = o.AbstractC1305jX.s(r4, r0)
            o.Av r0 = (o.C0024Av) r0
            r1 = 0
            if (r0 != 0) goto L20
            goto L54
        L20:
            int r2 = r0.i
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L29
            o.xv r0 = r0.j
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 != 0) goto L2f
            if (r7 == 0) goto L2f
            goto L54
        L2f:
            if (r0 == 0) goto L39
            int r7 = r0.i
            r7 = r7 & r3
            if (r7 != r3) goto L39
            int r7 = r0.j
            goto L3b
        L39:
            int r7 = r4.m
        L3b:
            if (r0 == 0) goto L4a
            int r2 = r0.i
            r3 = 2
            r2 = r2 & r3
            if (r2 != r3) goto L4a
            int r4 = r0.k
            java.lang.String r4 = r5.getString(r4)
            goto L55
        L4a:
            o.MK r4 = o.AbstractC0946e20.M(r4, r6)
            java.lang.String r4 = e(r4, r5)
            if (r4 != 0) goto L55
        L54:
            return r1
        L55:
            o.kv r6 = new o.kv
            java.lang.String r5 = r5.getString(r7)
            r6.<init>(r5, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0206Hv.b(o.CK, o.dE, o.aD, boolean):o.kv");
    }

    public static C1461lv c(C2017uK c2017uK, InterfaceC0893dE interfaceC0893dE, C0695aD c0695aD) {
        String l;
        AbstractC0048Bt.n(c2017uK, "proto");
        AbstractC0048Bt.n(interfaceC0893dE, "nameResolver");
        AbstractC0048Bt.n(c0695aD, "typeTable");
        C2049uq c2049uq = AbstractC0180Gv.b;
        AbstractC0048Bt.m(c2049uq, "methodSignature");
        C2318yv c2318yv = (C2318yv) AbstractC1305jX.s(c2017uK, c2049uq);
        int i = (c2318yv == null || (c2318yv.i & 1) != 1) ? c2017uK.m : c2318yv.j;
        if (c2318yv == null || (c2318yv.i & 2) != 2) {
            List L = AbstractC0868ct.L(AbstractC0946e20.E(c2017uK, c0695aD));
            List<UK> list = c2017uK.v;
            AbstractC0048Bt.m(list, "proto.valueParameterList");
            ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(list));
            for (UK uk : list) {
                AbstractC0048Bt.m(uk, "it");
                arrayList.add(AbstractC0946e20.U(uk, c0695aD));
            }
            ArrayList A0 = AbstractC0720ac.A0(L, arrayList);
            ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(A0));
            Iterator it = A0.iterator();
            while (it.hasNext()) {
                String e = e((MK) it.next(), interfaceC0893dE);
                if (e == null) {
                    return null;
                }
                arrayList2.add(e);
            }
            String e2 = e(AbstractC0946e20.L(c2017uK, c0695aD), interfaceC0893dE);
            if (e2 == null) {
                return null;
            }
            l = AbstractC1888sN.l(new StringBuilder(), AbstractC0720ac.t0(arrayList2, "", "(", ")", null, 56), e2);
        } else {
            l = interfaceC0893dE.getString(c2318yv.k);
        }
        return new C1461lv(interfaceC0893dE.getString(i), l);
    }

    public static final boolean d(CK ck) {
        AbstractC0048Bt.n(ck, "proto");
        C1452lm c1452lm = AbstractC1001ev.a;
        Object k = ck.k(AbstractC0180Gv.e);
        AbstractC0048Bt.m(k, "proto.getExtension(JvmProtoBuf.flags)");
        return c1452lm.c(((Number) k).intValue()).booleanValue();
    }

    public static String e(MK mk, InterfaceC0893dE interfaceC0893dE) {
        if (mk.p()) {
            return AbstractC1771qb.b(interfaceC0893dE.z0(mk.p));
        }
        return null;
    }

    public static final C1619oH f(String[] strArr, String[] strArr2) {
        AbstractC0048Bt.n(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC1544n8.a(strArr));
        C1593nv g = g(byteArrayInputStream, strArr2);
        C2120vv c2120vv = C1030fK.R;
        c2120vv.getClass();
        C0523Ub c0523Ub = new C0523Ub(byteArrayInputStream);
        E e = (E) c2120vv.a(c0523Ub, a);
        try {
            c0523Ub.a(0);
            if (e.b()) {
                return new C1619oH(g, (C1030fK) e);
            }
            C0204Ht c0204Ht = new C0204Ht(new C0057Cc().getMessage());
            c0204Ht.h = e;
            throw c0204Ht;
        } catch (C0204Ht e2) {
            e2.h = e;
            throw e2;
        }
    }

    public static C1593nv g(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        C0154Fv c0154Fv = (C0154Fv) C0154Fv.f41o.b(byteArrayInputStream, a);
        AbstractC0048Bt.m(c0154Fv, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
        return new C1593nv(c0154Fv, strArr);
    }

    public static final C1619oH h(String[] strArr, String[] strArr2) {
        AbstractC0048Bt.n(strArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        AbstractC0048Bt.n(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC1544n8.a(strArr));
        C1593nv g = g(byteArrayInputStream, strArr2);
        C2120vv c2120vv = C2281yK.s;
        c2120vv.getClass();
        C0523Ub c0523Ub = new C0523Ub(byteArrayInputStream);
        E e = (E) c2120vv.a(c0523Ub, a);
        try {
            c0523Ub.a(0);
            if (e.b()) {
                return new C1619oH(g, (C2281yK) e);
            }
            C0204Ht c0204Ht = new C0204Ht(new C0057Cc().getMessage());
            c0204Ht.h = e;
            throw c0204Ht;
        } catch (C0204Ht e2) {
            e2.h = e;
            throw e2;
        }
    }
}
