package o;

/* renamed from: o.ab, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0719ab extends AbstractC0179Gu implements InterfaceC0652Za {
    public final C0283Ku l;

    public C0719ab(C0283Ku c0283Ku) {
        this.l = c0283Ku;
    }

    @Override // o.InterfaceC0652Za
    public final boolean c(Throwable th) {
        return j().s(th);
    }

    @Override // o.AbstractC0179Gu
    public final boolean k() {
        return true;
    }

    @Override // o.AbstractC0179Gu
    public final void l(Throwable th) {
        this.l.n(j());
    }
}
