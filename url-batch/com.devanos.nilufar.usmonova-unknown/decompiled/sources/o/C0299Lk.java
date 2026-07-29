package o;

/* renamed from: o.Lk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299Lk extends AbstractC0551Vd {
    public final String b;

    public C0299Lk(String str) {
        super(C0782bY.a);
        this.b = str;
    }

    @Override // o.AbstractC0551Vd
    public final AbstractC1004ey a(InterfaceC0761bD interfaceC0761bD) {
        AbstractC0048Bt.n(interfaceC0761bD, "module");
        return C0273Kk.c(EnumC0247Jk.A, this.b);
    }

    @Override // o.AbstractC0551Vd
    public final Object b() {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC0551Vd
    public final String toString() {
        return this.b;
    }
}
