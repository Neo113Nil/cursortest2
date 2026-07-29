package o;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class ZC {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final C0838cP a(Class cls) {
        Z1 z1;
        InterfaceC1160hI interfaceC1160hI;
        AbstractC0048Bt.n(cls, "<this>");
        ClassLoader d = AbstractC1492mM.d(cls);
        F00 f00 = new F00(d);
        ConcurrentHashMap concurrentHashMap = a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(f00);
        if (weakReference != null) {
            C0838cP c0838cP = (C0838cP) weakReference.get();
            if (c0838cP != null) {
                return c0838cP;
            }
            concurrentHashMap.remove(f00, weakReference);
        }
        C0853ce c0853ce = new C0853ce(d);
        ClassLoader classLoader = C0782bY.class.getClassLoader();
        AbstractC0048Bt.m(classLoader, "Unit::class.java.classLoader");
        C0853ce c0853ce2 = new C0853ce(classLoader);
        C0853ce c0853ce3 = new C0853ce(d);
        String str = "runtime module for " + d;
        C1623oL c1623oL = C1623oL.j;
        C1097gL c1097gL = C1097gL.j;
        AbstractC0048Bt.n(str, "moduleName");
        VA va = new VA("DeserializationComponentsForJava.ModuleData");
        C0568Vu c0568Vu = new C0568Vu(va);
        C0826cD c0826cD = new C0826cD(C0827cE.g("<" + str + '>'), va, c0568Vu, 56);
        IR ir = va.a;
        ir.lock();
        try {
            if (c0568Vu.a != null) {
                throw new AssertionError("Built-ins module is already set: " + c0568Vu.a + " (attempting to reset to " + c0826cD + ")");
            }
            c0568Vu.a = c0826cD;
            ir.unlock();
            c0568Vu.f = new C0542Uu(c0826cD, 0);
            C0659Zh c0659Zh = new C0659Zh();
            C1818rJ c1818rJ = new C1818rJ(15, false);
            C1334k c1334k = new C1334k(va, c0826cD);
            HO ho = HO.G;
            C1623oL c1623oL2 = C1623oL.l;
            C0460Rq c0460Rq = C0460Rq.I;
            C0218Ih c0218Ih = new C0218Ih(va);
            C1097gL c1097gL2 = C1097gL.m;
            HO ho2 = HO.D;
            YM ym = new YM(c0826cD, c1334k);
            C1790qu c1790qu = C1790qu.c;
            C1408l4 c1408l4 = new C1408l4(c1790qu);
            C0460Rq c0460Rq2 = C0460Rq.J;
            C0218Ih c0218Ih2 = new C0218Ih(new C0218Ih(8));
            C0460Rq c0460Rq3 = C0460Rq.H;
            InterfaceC2341zE.b.getClass();
            AE ae = C2275yE.b;
            C0572Vy c0572Vy = new C0572Vy(new C1198hu(va, c0853ce3, c0853ce, c0659Zh, c1623oL2, c1623oL, c0460Rq, c0218Ih, c1097gL, c1818rJ, ho, c1097gL2, ho2, c0826cD, ym, c1408l4, c0218Ih2, c0460Rq3, c0460Rq2, ae, c1790qu, new C0140Fh(2)));
            C1527mv c1527mv = C1527mv.g;
            AbstractC0048Bt.n(c1527mv, "jvmMetadataVersion");
            C2002u5 c2002u5 = new C2002u5(28, c0853ce, c0659Zh, false);
            C1343k5 c1343k5 = new C1343k5();
            c1343k5.h = c0853ce;
            c1343k5.i = va.b(new C1400l(0, c1343k5));
            c1343k5.j = c0826cD;
            c1343k5.k = c1334k;
            c1343k5.l = new C2002u5(c0826cD, c1334k);
            c1343k5.m = C1527mv.g;
            c1343k5.m = c1527mv;
            List J = AbstractC0868ct.J(C0528Ug.a);
            AbstractC0545Ux abstractC0545Ux = c0826cD.k;
            C0568Vu c0568Vu2 = abstractC0545Ux instanceof C0568Vu ? (C0568Vu) abstractC0545Ux : null;
            HO ho3 = HO.z;
            if (c0568Vu2 == null || (z1 = c0568Vu2.J()) == null) {
                z1 = HO.j;
            }
            Z1 z12 = z1;
            if (c0568Vu2 == null || (interfaceC1160hI = c0568Vu2.J()) == null) {
                interfaceC1160hI = C0460Rq.S;
            }
            C0296Lh c0296Lh = new C0296Lh(va, c0826cD, c2002u5, c1343k5, c0572Vy, c1623oL, ho3, C1318jk.h, c1334k, z12, interfaceC1160hI, C0206Hv.a, ae, new C0218Ih(va), J, 262144);
            c0659Zh.a = c0296Lh;
            c1818rJ.i = new C1590ns(4, c0572Vy);
            C0672Zu J2 = c0568Vu.J();
            C0672Zu J3 = c0568Vu.J();
            C0218Ih c0218Ih3 = new C0218Ih(va);
            AbstractC0048Bt.n(J2, "additionalClassPartsProvider");
            AbstractC0048Bt.n(J3, "platformDependentDeclarationFilter");
            C0739av c0739av = new C0739av(va, c0853ce2, c0826cD);
            Y1 y1 = new Y1(22, c0739av);
            Q8 q8 = Q8.m;
            c0739av.c = new C0296Lh(va, c0826cD, y1, new C2002u5(c0826cD, c1334k, q8), c0739av, InterfaceC0143Fk.c, HO.u, AbstractC0868ct.K(new P8(va, c0826cD), new C0490Su(va, c0826cD)), c1334k, J2, J3, q8.a, ae, c0218Ih3, null, 786432);
            c0826cD.n = new C0695aD(P6.t0(new C0826cD[]{c0826cD}));
            c0826cD.f145o = new C1707pd("CompositeProvider@RuntimeModuleData for " + c0826cD, AbstractC0868ct.K(c0572Vy, c0739av));
            C0838cP c0838cP2 = new C0838cP(c0296Lh, new C0950e6(c0659Zh, c0853ce));
            while (true) {
                WeakReference weakReference2 = (WeakReference) concurrentHashMap.putIfAbsent(f00, new WeakReference(c0838cP2));
                if (weakReference2 == null) {
                    return c0838cP2;
                }
                C0838cP c0838cP3 = (C0838cP) weakReference2.get();
                if (c0838cP3 != null) {
                    return c0838cP3;
                }
                concurrentHashMap.remove(f00, weakReference2);
            }
        } finally {
        }
    }
}
