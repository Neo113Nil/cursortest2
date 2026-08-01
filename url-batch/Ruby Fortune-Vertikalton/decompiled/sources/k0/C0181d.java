package k0;

import android.view.ViewGroup;

/* renamed from: k0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181d extends AbstractC0191n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2773a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f2774b;

    public C0181d(ViewGroup viewGroup) {
        this.f2774b = viewGroup;
    }

    @Override // k0.AbstractC0191n, k0.InterfaceC0188k
    public final void a() {
        i1.q.j(this.f2774b, false);
    }

    @Override // k0.InterfaceC0188k
    public final void b(AbstractC0190m abstractC0190m) {
        if (!this.f2773a) {
            i1.q.j(this.f2774b, false);
        }
        abstractC0190m.x(this);
    }

    @Override // k0.AbstractC0191n, k0.InterfaceC0188k
    public final void c() {
        i1.q.j(this.f2774b, true);
    }

    @Override // k0.AbstractC0191n, k0.InterfaceC0188k
    public final void e(AbstractC0190m abstractC0190m) {
        i1.q.j(this.f2774b, false);
        this.f2773a = true;
    }
}
