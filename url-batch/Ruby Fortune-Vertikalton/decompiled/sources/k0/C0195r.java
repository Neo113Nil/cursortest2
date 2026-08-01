package k0;

/* renamed from: k0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195r extends AbstractC0191n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2829a = 1;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0190m f2830b;

    public /* synthetic */ C0195r() {
    }

    @Override // k0.InterfaceC0188k
    public final void b(AbstractC0190m abstractC0190m) {
        switch (this.f2829a) {
            case 0:
                this.f2830b.z();
                abstractC0190m.x(this);
                break;
            default:
                C0178a c0178a = (C0178a) this.f2830b;
                int i = c0178a.f2769C - 1;
                c0178a.f2769C = i;
                if (i == 0) {
                    c0178a.f2770D = false;
                    c0178a.m();
                }
                abstractC0190m.x(this);
                break;
        }
    }

    @Override // k0.AbstractC0191n, k0.InterfaceC0188k
    public void d(AbstractC0190m abstractC0190m) {
        switch (this.f2829a) {
            case 1:
                C0178a c0178a = (C0178a) this.f2830b;
                if (!c0178a.f2770D) {
                    c0178a.G();
                    c0178a.f2770D = true;
                    break;
                }
                break;
        }
    }

    public C0195r(AbstractC0190m abstractC0190m) {
        this.f2830b = abstractC0190m;
    }
}
