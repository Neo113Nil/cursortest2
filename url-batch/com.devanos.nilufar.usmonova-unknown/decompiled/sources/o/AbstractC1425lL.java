package o;

/* renamed from: o.lL, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1425lL {
    public final C2058uz a;

    public AbstractC1425lL(InterfaceC1455lp interfaceC1455lp) {
        this.a = new C2058uz(interfaceC1455lp);
    }

    public abstract C1491mL a(Object obj);

    /* JADX WARN: Code restructure failed: missing block: B:42:0x003f, code lost:
    
        if (r0 != false) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final NY b(C1491mL c1491mL, NY ny) {
        LT lt;
        Object obj;
        Object obj2 = null;
        if (ny instanceof C2306yj) {
            if (c1491mL.d) {
                C2306yj c2306yj = (C2306yj) ny;
                C2278yH c2278yH = c2306yj.a;
                if (c1491mL.b) {
                    obj = null;
                } else {
                    obj = c1491mL.e;
                    if (obj == null) {
                        EB.i("Unexpected form of a provided value");
                        throw null;
                    }
                }
                c2278yH.setValue(obj);
                lt = c2306yj;
            }
            lt = null;
        } else {
            if (ny instanceof LT) {
                boolean z = c1491mL.b;
                Object obj3 = c1491mL.e;
                if ((z || obj3 != null) && !c1491mL.d) {
                    if (z) {
                        obj3 = null;
                    } else if (obj3 == null) {
                        EB.i("Unexpected form of a provided value");
                        throw null;
                    }
                    LT lt2 = (LT) ny;
                    boolean h = AbstractC0048Bt.h(obj3, lt2.a);
                    lt = lt2;
                }
            }
            lt = null;
        }
        if (lt != null) {
            return lt;
        }
        boolean z2 = c1491mL.d;
        Object obj4 = c1491mL.e;
        if (z2) {
            InterfaceC2289yS interfaceC2289yS = c1491mL.c;
            if (interfaceC2289yS == null) {
                interfaceC2289yS = C1623oL.n;
            }
            int i = X1.b;
            return new C2306yj(new C2278yH(obj4, interfaceC2289yS));
        }
        if (!c1491mL.b) {
            if (obj4 == null) {
                EB.i("Unexpected form of a provided value");
                throw null;
            }
            obj2 = obj4;
        }
        return new LT(obj2);
    }
}
