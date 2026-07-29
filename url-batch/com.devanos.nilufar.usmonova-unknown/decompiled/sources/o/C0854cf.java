package o;

import java.io.Serializable;

/* renamed from: o.cf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0854cf extends AbstractC0868ct {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Serializable u;

    public /* synthetic */ C0854cf(Object obj, Serializable serializable, int i) {
        this.s = i;
        this.t = obj;
        this.u = serializable;
    }

    @Override // o.AbstractC0868ct
    public final Object R() {
        switch (this.s) {
            case 0:
                return Boolean.valueOf(((boolean[]) this.u)[0]);
            case 1:
                return (InterfaceC2204x9) ((C1360kM) this.t).h;
            default:
                EnumC0594Wu enumC0594Wu = (EnumC0594Wu) ((C1360kM) this.u).h;
                return enumC0594Wu == null ? EnumC0594Wu.j : enumC0594Wu;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [o.ny, o.vp] */
    @Override // o.AbstractC0868ct
    public void e(Object obj) {
        switch (this.s) {
            case 1:
                InterfaceC2204x9 interfaceC2204x9 = (InterfaceC2204x9) obj;
                AbstractC0048Bt.n(interfaceC2204x9, "current");
                C1360kM c1360kM = (C1360kM) this.t;
                if (c1360kM.h == null && ((Boolean) ((AbstractC1596ny) this.u).invoke(interfaceC2204x9)).booleanValue()) {
                    c1360kM.h = interfaceC2204x9;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, o.vp] */
    @Override // o.AbstractC0868ct
    public final boolean h(Object obj) {
        switch (this.s) {
            case 0:
                boolean[] zArr = (boolean[]) this.u;
                if (((Boolean) this.t.invoke(obj)).booleanValue()) {
                    zArr[0] = true;
                }
                return !zArr[0];
            case 1:
                AbstractC0048Bt.n((InterfaceC2204x9) obj, "current");
                return ((C1360kM) this.t).h == null;
            default:
                InterfaceC1245ib interfaceC1245ib = (InterfaceC1245ib) obj;
                C1360kM c1360kM = (C1360kM) this.u;
                AbstractC0048Bt.n(interfaceC1245ib, "javaClassDescriptor");
                String H = AbstractC1305jX.H(interfaceC1245ib, (String) this.t);
                if (C0805bv.b.contains(H)) {
                    c1360kM.h = EnumC0594Wu.h;
                } else if (C0805bv.c.contains(H)) {
                    c1360kM.h = EnumC0594Wu.i;
                } else if (C0805bv.a.contains(H)) {
                    c1360kM.h = EnumC0594Wu.k;
                }
                return c1360kM.h == null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0854cf(C1360kM c1360kM, InterfaceC2114vp interfaceC2114vp) {
        this.s = 1;
        this.t = c1360kM;
        this.u = (AbstractC1596ny) interfaceC2114vp;
    }
}
