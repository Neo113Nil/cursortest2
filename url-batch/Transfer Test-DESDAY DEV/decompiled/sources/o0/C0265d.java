package o0;

import android.view.ViewGroup;

/* renamed from: o0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0265d extends AbstractC0275n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3212a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f3213b;

    public C0265d(ViewGroup viewGroup) {
        this.f3213b = viewGroup;
    }

    @Override // o0.AbstractC0275n, o0.InterfaceC0272k
    public final void a() {
        h0.f.r(this.f3213b, false);
    }

    @Override // o0.AbstractC0275n, o0.InterfaceC0272k
    public final void c(AbstractC0274m abstractC0274m) {
        h0.f.r(this.f3213b, false);
        this.f3212a = true;
    }

    @Override // o0.InterfaceC0272k
    public final void d(AbstractC0274m abstractC0274m) {
        if (!this.f3212a) {
            h0.f.r(this.f3213b, false);
        }
        abstractC0274m.x(this);
    }

    @Override // o0.AbstractC0275n, o0.InterfaceC0272k
    public final void e() {
        h0.f.r(this.f3213b, true);
    }
}
