package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.Gw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181Gw extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C0207Hw i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0181Gw(C0207Hw c0207Hw, int i) {
        super(0);
        this.h = i;
        this.i = c0207Hw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Iterable] */
    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        ?? J;
        switch (this.h) {
            case 0:
                RM rm = this.i.c;
                InterfaceC0937dx interfaceC0937dx = C0207Hw.g[0];
                OM om = (OM) rm.invoke();
                if (om != null) {
                    C0202Hr c0202Hr = om.b;
                    String[] strArr = (String[]) c0202Hr.e;
                    String[] strArr2 = (String[]) c0202Hr.g;
                    if (strArr != null && strArr2 != null) {
                        C1619oH h = C0206Hv.h(strArr, strArr2);
                        return new FW((C1593nv) h.h, (C2281yK) h.i, (C1527mv) c0202Hr.d);
                    }
                }
                return null;
            default:
                C0207Hw c0207Hw = this.i;
                RM rm2 = c0207Hw.c;
                InterfaceC0937dx interfaceC0937dx2 = C0207Hw.g[0];
                OM om2 = (OM) rm2.invoke();
                if (om2 == null) {
                    return VB.b;
                }
                RM rm3 = c0207Hw.a;
                InterfaceC0937dx interfaceC0937dx3 = AbstractC1200hw.b[0];
                Object invoke = rm3.invoke();
                AbstractC0048Bt.m(invoke, "<get-moduleData>(...)");
                C0950e6 c0950e6 = ((C0838cP) invoke).b;
                C0659Zh c0659Zh = (C0659Zh) c0950e6.i;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0950e6.k;
                Class cls = om2.a;
                C1639ob a = AbstractC1492mM.a(cls);
                Object obj = concurrentHashMap.get(a);
                if (obj == null) {
                    C2245xo g = AbstractC1492mM.a(cls).g();
                    AbstractC0048Bt.m(g, "fileClass.classId.packageFqName");
                    C0202Hr c0202Hr2 = om2.b;
                    EnumC0571Vx enumC0571Vx = (EnumC0571Vx) c0202Hr2.c;
                    EnumC0571Vx enumC0571Vx2 = EnumC0571Vx.MULTIFILE_CLASS;
                    if (enumC0571Vx == enumC0571Vx2) {
                        String[] strArr3 = (String[]) c0202Hr2.e;
                        if (enumC0571Vx != enumC0571Vx2) {
                            strArr3 = null;
                        }
                        List W = strArr3 != null ? P6.W(strArr3) : null;
                        if (W == null) {
                            W = C1318jk.h;
                        }
                        J = new ArrayList();
                        Iterator it = W.iterator();
                        while (it.hasNext()) {
                            C1639ob j = C1639ob.j(new C2245xo(C0870cv.d((String) it.next()).a.replace('/', '.')));
                            C0853ce c0853ce = (C0853ce) c0950e6.j;
                            AbstractC0048Bt.n(c0659Zh.c().c, "<this>");
                            OM s = AbstractC0946e20.s(c0853ce, j, C1527mv.g);
                            if (s != null) {
                                J.add(s);
                            }
                        }
                    } else {
                        J = AbstractC0868ct.J(om2);
                    }
                    C1450lk c1450lk = new C1450lk(c0659Zh.c().b, g, 0);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = J.iterator();
                    while (it2.hasNext()) {
                        C1120gi a2 = c0659Zh.a(c1450lk, (OM) it2.next());
                        if (a2 != null) {
                            arrayList.add(a2);
                        }
                    }
                    WB o2 = AbstractC0946e20.o("package " + g + " (" + om2 + ')', AbstractC0720ac.J0(arrayList));
                    Object putIfAbsent = concurrentHashMap.putIfAbsent(a, o2);
                    obj = putIfAbsent == null ? o2 : putIfAbsent;
                }
                AbstractC0048Bt.m(obj, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
                return (WB) obj;
        }
    }
}
