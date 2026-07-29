package o;

import java.util.Collection;

/* renamed from: o.Jw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259Jw extends AbstractC1330jw {
    public final Class i;
    public final SM j;

    public C0259Jw(Class cls) {
        AbstractC0048Bt.n(cls, "jClass");
        this.i = cls;
        this.j = new SM(new C0129Ew(this, 1));
    }

    @Override // o.InterfaceC0916db
    public final Class e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0259Jw) {
            return AbstractC0048Bt.h(this.i, ((C0259Jw) obj).i);
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    @Override // o.AbstractC1330jw
    public final Collection m() {
        return C1318jk.h;
    }

    @Override // o.AbstractC1330jw
    public final Collection n(C0827cE c0827cE) {
        RM rm = ((C0207Hw) this.j.invoke()).d;
        InterfaceC0937dx interfaceC0937dx = C0207Hw.g[1];
        Object invoke = rm.invoke();
        AbstractC0048Bt.m(invoke, "<get-scope>(...)");
        return ((WB) invoke).a(c0827cE, DE.i);
    }

    @Override // o.AbstractC1330jw
    public final PJ o(int i) {
        SM sm = ((C0207Hw) this.j.invoke()).f;
        InterfaceC0937dx interfaceC0937dx = C0207Hw.g[3];
        FW fw = (FW) sm.invoke();
        if (fw == null) {
            return null;
        }
        C1593nv c1593nv = (C1593nv) fw.h;
        C2281yK c2281yK = (C2281yK) fw.i;
        C1527mv c1527mv = (C1527mv) fw.j;
        C2049uq c2049uq = AbstractC0180Gv.n;
        AbstractC0048Bt.m(c2049uq, "packageLocalVariable");
        CK ck = (CK) AbstractC1305jX.t(c2281yK, c2049uq, i);
        if (ck == null) {
            return null;
        }
        SK sk = c2281yK.n;
        AbstractC0048Bt.m(sk, "packageProto.typeTable");
        return (PJ) JY.f(this.i, ck, c1593nv, new C0695aD(sk), c1527mv, C0233Iw.j);
    }

    @Override // o.AbstractC1330jw
    public final Class q() {
        SM sm = ((C0207Hw) this.j.invoke()).e;
        InterfaceC0937dx interfaceC0937dx = C0207Hw.g[2];
        Class cls = (Class) sm.invoke();
        return cls == null ? this.i : cls;
    }

    @Override // o.AbstractC1330jw
    public final Collection r(C0827cE c0827cE) {
        RM rm = ((C0207Hw) this.j.invoke()).d;
        InterfaceC0937dx interfaceC0937dx = C0207Hw.g[1];
        Object invoke = rm.invoke();
        AbstractC0048Bt.m(invoke, "<get-scope>(...)");
        return ((WB) invoke).c(c0827cE, DE.i);
    }

    public final String toString() {
        return "file class " + AbstractC1492mM.a(this.i).b();
    }
}
