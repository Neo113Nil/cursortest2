package k0;

/* loaded from: classes.dex */
public final class r extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2838a = 1;

    /* renamed from: b, reason: collision with root package name */
    public m f2839b;

    public /* synthetic */ r() {
    }

    @Override // k0.k
    public final void b(m mVar) {
        switch (this.f2838a) {
            case 0:
                this.f2839b.z();
                mVar.x(this);
                break;
            default:
                C0187a c0187a = (C0187a) this.f2839b;
                int i = c0187a.f2778C - 1;
                c0187a.f2778C = i;
                if (i == 0) {
                    c0187a.f2779D = false;
                    c0187a.m();
                }
                mVar.x(this);
                break;
        }
    }

    @Override // k0.n, k0.k
    public void d(m mVar) {
        switch (this.f2838a) {
            case 1:
                C0187a c0187a = (C0187a) this.f2839b;
                if (!c0187a.f2779D) {
                    c0187a.G();
                    c0187a.f2779D = true;
                    break;
                }
                break;
        }
    }

    public r(m mVar) {
        this.f2839b = mVar;
    }
}
