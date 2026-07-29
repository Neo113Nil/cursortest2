package o;

/* renamed from: o.ax, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0741ax extends AbstractC1135gx implements InterfaceC2312yp {
    public final C0872cx p;

    public C0741ax(C0872cx c0872cx) {
        this.p = c0872cx;
    }

    @Override // o.InterfaceC0388Ow
    public final InterfaceC0937dx i() {
        return this.p;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o.Iy] */
    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0741ax) this.p.t.getValue()).call(obj, obj2);
    }

    @Override // o.AbstractC1003ex
    public final AbstractC1397kx t() {
        return this.p;
    }
}
