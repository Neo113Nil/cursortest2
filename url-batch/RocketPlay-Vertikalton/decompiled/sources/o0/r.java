package o0;

/* loaded from: classes.dex */
public final class r extends n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3695a = 1;

    /* renamed from: b, reason: collision with root package name */
    public m f3696b;

    public /* synthetic */ r() {
    }

    @Override // o0.n, o0.k
    public void b(m mVar) {
        switch (this.f3695a) {
            case 1:
                C0303a c0303a = (C0303a) this.f3696b;
                if (!c0303a.f3636D) {
                    c0303a.G();
                    c0303a.f3636D = true;
                    break;
                }
                break;
        }
    }

    @Override // o0.k
    public final void d(m mVar) {
        switch (this.f3695a) {
            case 0:
                this.f3696b.z();
                mVar.x(this);
                break;
            default:
                C0303a c0303a = (C0303a) this.f3696b;
                int i = c0303a.f3635C - 1;
                c0303a.f3635C = i;
                if (i == 0) {
                    c0303a.f3636D = false;
                    c0303a.m();
                }
                mVar.x(this);
                break;
        }
    }

    public r(m mVar) {
        this.f3696b = mVar;
    }
}
