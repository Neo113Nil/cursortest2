package k0;

/* renamed from: k0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0196r extends AbstractC0192n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2835a = 1;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0191m f2836b;

    public /* synthetic */ C0196r() {
    }

    @Override // k0.InterfaceC0189k
    public final void b(AbstractC0191m abstractC0191m) {
        switch (this.f2835a) {
            case 0:
                this.f2836b.z();
                abstractC0191m.x(this);
                break;
            default:
                C0179a c0179a = (C0179a) this.f2836b;
                int i = c0179a.f2775C - 1;
                c0179a.f2775C = i;
                if (i == 0) {
                    c0179a.f2776D = false;
                    c0179a.m();
                }
                abstractC0191m.x(this);
                break;
        }
    }

    @Override // k0.AbstractC0192n, k0.InterfaceC0189k
    public void d(AbstractC0191m abstractC0191m) {
        switch (this.f2835a) {
            case 1:
                C0179a c0179a = (C0179a) this.f2836b;
                if (!c0179a.f2776D) {
                    c0179a.G();
                    c0179a.f2776D = true;
                    break;
                }
                break;
        }
    }

    public C0196r(AbstractC0191m abstractC0191m) {
        this.f2836b = abstractC0191m;
    }
}
