package o;

/* renamed from: o.Bh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036Bh {
    public Object a;
    public final /* synthetic */ C0062Ch b;

    public C0036Bh(Object obj, C0062Ch c0062Ch) {
        this.b = c0062Ch;
        this.a = obj;
    }

    public final Object a(Object obj, InterfaceC0937dx interfaceC0937dx) {
        AbstractC0048Bt.n(interfaceC0937dx, "property");
        return this.a;
    }

    public final void b(Object obj, InterfaceC0937dx interfaceC0937dx) {
        AbstractC0048Bt.n(interfaceC0937dx, "property");
        if (this.b.a) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
        this.a = obj;
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.a + ')';
    }
}
