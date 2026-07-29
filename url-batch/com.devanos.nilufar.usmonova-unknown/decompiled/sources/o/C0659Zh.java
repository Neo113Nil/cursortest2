package o;

import java.util.Set;

/* renamed from: o.Zh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0659Zh {
    public static final Set b = AbstractC0773bP.i(EnumC0571Vx.CLASS);
    public static final Set c = P6.u0(new EnumC0571Vx[]{EnumC0571Vx.FILE_FACADE, EnumC0571Vx.MULTIFILE_CLASS_PART});
    public static final C1527mv d;
    public static final C1527mv e;
    public C0296Lh a;

    static {
        new C1527mv(new int[]{1, 1, 2}, false);
        d = new C1527mv(new int[]{1, 1, 11}, false);
        e = new C1527mv(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (o.C0659Zh.c.contains((o.EnumC0571Vx) r0.c) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1120gi a(InterfaceC0961eH interfaceC0961eH, OM om) {
        C1619oH c1619oH;
        AbstractC0048Bt.n(om, "kotlinClass");
        C0202Hr c0202Hr = om.b;
        String[] strArr = (String[]) c0202Hr.e;
        if (strArr == null) {
            strArr = (String[]) c0202Hr.f;
        }
        if (strArr != null) {
        }
        strArr = null;
        if (strArr != null) {
            C1527mv c1527mv = (C1527mv) c0202Hr.d;
            String[] strArr2 = (String[]) c0202Hr.g;
            if (strArr2 != null) {
                try {
                    try {
                        c1619oH = C0206Hv.h(strArr, strArr2);
                    } catch (C0204Ht e2) {
                        throw new IllegalStateException("Could not read data from " + om.a(), e2);
                    }
                } catch (Throwable th) {
                    c().c.getClass();
                    AbstractC0048Bt.n(c().c, "<this>");
                    if (c1527mv.b(C1527mv.g)) {
                        throw th;
                    }
                    c1619oH = null;
                }
                if (c1619oH != null) {
                    C1593nv c1593nv = (C1593nv) c1619oH.h;
                    C2281yK c2281yK = (C2281yK) c1619oH.i;
                    d(om);
                    e(om);
                    C1659ov c1659ov = new C1659ov(om, c2281yK, c1593nv, b(om));
                    return new C1120gi(interfaceC0961eH, c2281yK, c1593nv, c1527mv, c1659ov, c(), "scope for " + c1659ov + " in " + interfaceC0961eH, C2234xd.l);
                }
            }
        }
        return null;
    }

    public final int b(OM om) {
        c().c.getClass();
        int i = om.b.b;
        if ((i & 64) == 0 || (i & 32) != 0) {
            return ((i & 16) == 0 || (i & 32) != 0) ? 1 : 3;
        }
        return 2;
    }

    public final C0296Lh c() {
        C0296Lh c0296Lh = this.a;
        if (c0296Lh != null) {
            return c0296Lh;
        }
        AbstractC0048Bt.i0("components");
        throw null;
    }

    public final C2183ws d(OM om) {
        c().c.getClass();
        C1527mv c1527mv = (C1527mv) om.b.d;
        AbstractC0048Bt.n(c().c, "<this>");
        C1527mv c1527mv2 = C1527mv.g;
        if (c1527mv.b(c1527mv2)) {
            return null;
        }
        C1527mv c1527mv3 = (C1527mv) om.b.d;
        AbstractC0048Bt.n(c().c, "<this>");
        AbstractC0048Bt.n(c().c, "<this>");
        boolean z = c1527mv3.f;
        c1527mv2.getClass();
        C1527mv c1527mv4 = z ? c1527mv2 : C1527mv.h;
        int i = c1527mv4.b;
        int i2 = c1527mv2.b;
        return new C2183ws(c1527mv3, c1527mv2, c1527mv2, (i <= i2 && (i < i2 || c1527mv4.c <= c1527mv2.c)) ? c1527mv2 : c1527mv4, om.a(), AbstractC1492mM.a(om.a));
    }

    public final boolean e(OM om) {
        c().c.getClass();
        c().c.getClass();
        C0202Hr c0202Hr = om.b;
        return (c0202Hr.b & 2) != 0 && ((C1527mv) c0202Hr.d).equals(d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (o.C0659Zh.b.contains((o.EnumC0571Vx) r1.c) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1047fb f(OM om) {
        C1619oH c1619oH;
        C0202Hr c0202Hr = om.b;
        String[] strArr = (String[]) c0202Hr.e;
        if (strArr == null) {
            strArr = (String[]) c0202Hr.f;
        }
        if (strArr != null) {
        }
        strArr = null;
        if (strArr != null) {
            C1527mv c1527mv = (C1527mv) c0202Hr.d;
            String[] strArr2 = (String[]) c0202Hr.g;
            try {
            } catch (Throwable th) {
                c().c.getClass();
                AbstractC0048Bt.n(c().c, "<this>");
                if (c1527mv.b(C1527mv.g)) {
                    throw th;
                }
                c1619oH = null;
            }
            if (strArr2 != null) {
                try {
                    c1619oH = C0206Hv.f(strArr, strArr2);
                    if (c1619oH != null) {
                        C1593nv c1593nv = (C1593nv) c1619oH.h;
                        C1030fK c1030fK = (C1030fK) c1619oH.i;
                        d(om);
                        e(om);
                        return new C1047fb(c1593nv, c1030fK, c1527mv, new C0675Zx(om, b(om)));
                    }
                } catch (C0204Ht e2) {
                    throw new IllegalStateException("Could not read data from " + om.a(), e2);
                }
            }
        }
        return null;
    }
}
