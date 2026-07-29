package o;

import java.util.List;

/* renamed from: o.Ak, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0013Ak extends C1441lb {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0013Ak(C0827cE c0827cE) {
        super(r2, c0827cE, 3, 1, r6, r7);
        C0273Kk c0273Kk = C0273Kk.a;
        C0091Dk c0091Dk = C0273Kk.b;
        MA ma = VA.e;
        List list = C1318jk.h;
        C0981eb c0981eb = new C0981eb(this, null, C0460Rq.t, true, 1, IS.e);
        c0981eb.V0(list, AbstractC0270Kh.d);
        String str = c0981eb.getName().h;
        AbstractC0048Bt.m(str, "errorConstructor.name.toString()");
        C0169Gk b = C0273Kk.b(9, str, "");
        EnumC0247Jk enumC0247Jk = EnumC0247Jk.C;
        c0981eb.n = new C0195Hk(C0273Kk.d(enumC0247Jk, new String[0]), b, enumC0247Jk, list, false, new String[0]);
        w0(b, AbstractC0773bP.i(c0981eb), c0981eb);
    }

    @Override // o.AbstractC1598o, o.InterfaceC1106gU
    public final InterfaceC1249ig e(C2096vX c2096vX) {
        AbstractC0048Bt.n(c2096vX, "substitutor");
        return this;
    }

    @Override // o.AbstractC1598o, o.YC
    public final WB h(AbstractC1964tX abstractC1964tX, C1398ky c1398ky) {
        String str = getName().h;
        AbstractC0048Bt.m(str, "name.toString()");
        return C0273Kk.b(9, str, abstractC1964tX.toString());
    }

    @Override // o.AbstractC1598o
    /* renamed from: q0 */
    public final InterfaceC1245ib e(C2096vX c2096vX) {
        AbstractC0048Bt.n(c2096vX, "substitutor");
        return this;
    }

    @Override // o.C1441lb
    public final String toString() {
        String b = getName().b();
        AbstractC0048Bt.m(b, "name.asString()");
        return b;
    }
}
