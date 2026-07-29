package o;

/* renamed from: o.Hi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193Hi implements InterfaceC0771bN {
    public final InterfaceC2114vp a;
    public InterfaceC0219Ii b;

    public C0193Hi(InterfaceC2114vp interfaceC2114vp) {
        this.a = interfaceC2114vp;
    }

    @Override // o.InterfaceC0771bN
    public final void a() {
        this.b = (InterfaceC0219Ii) this.a.invoke(PX.i);
    }

    @Override // o.InterfaceC0771bN
    public final void c() {
        InterfaceC0219Ii interfaceC0219Ii = this.b;
        if (interfaceC0219Ii != null) {
            interfaceC0219Ii.a();
        }
        this.b = null;
    }

    @Override // o.InterfaceC0771bN
    public final void b() {
    }
}
