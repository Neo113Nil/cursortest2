package o;

/* loaded from: classes.dex */
public final class I4 implements InterfaceC0895dG {
    public final /* synthetic */ J4 a;

    public I4(J4 j4) {
        this.a = j4;
    }

    @Override // o.InterfaceC0895dG
    public final void a(AbstractActivityC0446Rc abstractActivityC0446Rc) {
        J4 j4 = this.a;
        V4 delegate = j4.getDelegate();
        delegate.a();
        j4.getSavedStateRegistry().a("androidx:appcompat");
        delegate.d();
    }
}
