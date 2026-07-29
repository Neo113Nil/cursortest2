package o;

/* renamed from: o.Mb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0315Mb implements AutoCloseable, InterfaceC0422Qe {
    public final InterfaceC0189He h;

    public C0315Mb(InterfaceC0189He interfaceC0189He) {
        AbstractC0048Bt.n(interfaceC0189He, "coroutineContext");
        this.h = interfaceC0189He;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        PX.s(this.h, null);
    }

    @Override // o.InterfaceC0422Qe
    public final InterfaceC0189He m() {
        return this.h;
    }
}
