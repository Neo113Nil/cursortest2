package o;

import java.util.ArrayList;

/* renamed from: o.ad, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0721ad implements InterfaceC2312yp, InterfaceC2378zp, InterfaceC0018Ap, InterfaceC0044Bp, InterfaceC0070Cp, InterfaceC0096Dp, InterfaceC0122Ep, InterfaceC0148Fp, InterfaceC1521mp, InterfaceC1587np, InterfaceC1653op, InterfaceC1719pp, InterfaceC1785qp, InterfaceC1850rp, InterfaceC1916sp, InterfaceC1982tp, InterfaceC2048up, InterfaceC2180wp, InterfaceC2246xp {
    public final int h;
    public final boolean i;
    public InterfaceC2312yp j;
    public WL k;
    public ArrayList l;

    public C0721ad(int i, boolean z, InterfaceC2312yp interfaceC2312yp) {
        this.h = i;
        this.i = z;
        this.j = interfaceC2312yp;
    }

    public final Object a(Object obj, InterfaceC1377kd interfaceC1377kd, int i) {
        C1575nd c1575nd = (C1575nd) interfaceC1377kd;
        c1575nd.J(this.h);
        d(c1575nd);
        int f = c1575nd.d(this) ? AbstractC0946e20.f(2, 1) : AbstractC0946e20.f(1, 1);
        InterfaceC2312yp interfaceC2312yp = this.j;
        AbstractC1305jX.i(3, interfaceC2312yp);
        Object e = ((InterfaceC2378zp) interfaceC2312yp).e(obj, c1575nd, Integer.valueOf(f | i));
        WL o2 = c1575nd.o();
        if (o2 != null) {
            o2.d = new C0654Zc(i, 0, this, obj);
        }
        return e;
    }

    public final void d(InterfaceC1377kd interfaceC1377kd) {
        WL s;
        if (!this.i || (s = ((C1575nd) interfaceC1377kd).s()) == null) {
            return;
        }
        s.a |= 1;
        if (AbstractC0946e20.G(this.k, s)) {
            this.k = s;
            return;
        }
        ArrayList arrayList = this.l;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.l = arrayList2;
            arrayList2.add(s);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (AbstractC0946e20.G((WL) arrayList.get(i), s)) {
                arrayList.set(i, s);
                return;
            }
        }
        arrayList.add(s);
    }

    @Override // o.InterfaceC2378zp
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
        return a(obj, (InterfaceC1377kd) obj2, ((Number) obj3).intValue());
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj2).intValue();
        C1575nd c1575nd = (C1575nd) ((InterfaceC1377kd) obj);
        c1575nd.J(this.h);
        d(c1575nd);
        int f = intValue | (c1575nd.d(this) ? AbstractC0946e20.f(2, 0) : AbstractC0946e20.f(1, 0));
        InterfaceC2312yp interfaceC2312yp = this.j;
        AbstractC1305jX.i(2, interfaceC2312yp);
        Object invoke = interfaceC2312yp.invoke(c1575nd, Integer.valueOf(f));
        WL o2 = c1575nd.o();
        if (o2 != null) {
            AbstractC1305jX.i(2, this);
            o2.d = this;
        }
        return invoke;
    }
}
