package o;

/* renamed from: o.oT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1631oT extends AbstractC1701pX {
    public final InterfaceC1437lX a;
    public final Object b;

    public C1631oT(InterfaceC1437lX interfaceC1437lX) {
        AbstractC0048Bt.n(interfaceC1437lX, "typeParameter");
        this.a = interfaceC1437lX;
        this.b = EB.C(EnumC1992tz.h, new LE(10, this));
    }

    @Override // o.AbstractC1701pX
    public final int a() {
        return 3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o.Iy] */
    @Override // o.AbstractC1701pX
    public final AbstractC1004ey b() {
        return (AbstractC1004ey) this.b.getValue();
    }

    @Override // o.AbstractC1701pX
    public final boolean c() {
        return true;
    }

    @Override // o.AbstractC1701pX
    public final AbstractC1701pX d(C1398ky c1398ky) {
        AbstractC0048Bt.n(c1398ky, "kotlinTypeRefiner");
        return this;
    }
}
