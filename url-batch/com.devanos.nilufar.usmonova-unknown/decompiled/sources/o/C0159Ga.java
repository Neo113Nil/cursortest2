package o;

/* renamed from: o.Ga, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0159Ga extends AbstractC0133Fa {
    @Override // o.AbstractC0055Ca
    public final AbstractC0055Ca b(InterfaceC0189He interfaceC0189He, int i, H8 h8) {
        return new C0159Ga(i, h8, interfaceC0189He, this.k);
    }

    @Override // o.AbstractC0055Ca
    public final InterfaceC2243xm c() {
        return this.k;
    }

    @Override // o.AbstractC0133Fa
    public final Object d(InterfaceC2309ym interfaceC2309ym, InterfaceC2235xe interfaceC2235xe) {
        Object collect = this.k.collect(interfaceC2309ym, interfaceC2235xe);
        return collect == EnumC0448Re.h ? collect : C0782bY.a;
    }
}
