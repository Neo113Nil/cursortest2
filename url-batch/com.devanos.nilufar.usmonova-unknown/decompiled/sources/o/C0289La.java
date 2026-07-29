package o;

/* renamed from: o.La, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0289La extends AbstractC0133Fa {
    public final AbstractC2225xU l;

    /* JADX WARN: Multi-variable type inference failed */
    public C0289La(InterfaceC2378zp interfaceC2378zp, InterfaceC2243xm interfaceC2243xm, InterfaceC0189He interfaceC0189He, int i, H8 h8) {
        super(i, h8, interfaceC0189He, interfaceC2243xm);
        this.l = (AbstractC2225xU) interfaceC2378zp;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [o.xU, o.zp] */
    @Override // o.AbstractC0055Ca
    public final AbstractC0055Ca b(InterfaceC0189He interfaceC0189He, int i, H8 h8) {
        return new C0289La(this.l, this.k, interfaceC0189He, i, h8);
    }

    @Override // o.AbstractC0133Fa
    public final Object d(InterfaceC2309ym interfaceC2309ym, InterfaceC2235xe interfaceC2235xe) {
        Object j = AbstractC1052fg.j(new C0263Ka(this, interfaceC2309ym, null), interfaceC2235xe);
        return j == EnumC0448Re.h ? j : C0782bY.a;
    }
}
