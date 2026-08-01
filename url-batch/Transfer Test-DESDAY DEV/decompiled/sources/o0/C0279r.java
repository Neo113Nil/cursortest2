package o0;

/* renamed from: o0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279r extends AbstractC0275n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3268a = 1;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0274m f3269b;

    public /* synthetic */ C0279r() {
    }

    @Override // o0.AbstractC0275n, o0.InterfaceC0272k
    public void b(AbstractC0274m abstractC0274m) {
        switch (this.f3268a) {
            case 1:
                C0262a c0262a = (C0262a) this.f3269b;
                if (!c0262a.f3209D) {
                    c0262a.G();
                    c0262a.f3209D = true;
                    break;
                }
                break;
        }
    }

    @Override // o0.InterfaceC0272k
    public final void d(AbstractC0274m abstractC0274m) {
        switch (this.f3268a) {
            case 0:
                this.f3269b.z();
                abstractC0274m.x(this);
                break;
            default:
                C0262a c0262a = (C0262a) this.f3269b;
                int i = c0262a.f3208C - 1;
                c0262a.f3208C = i;
                if (i == 0) {
                    c0262a.f3209D = false;
                    c0262a.m();
                }
                abstractC0274m.x(this);
                break;
        }
    }

    public C0279r(AbstractC0274m abstractC0274m) {
        this.f3269b = abstractC0274m;
    }
}
