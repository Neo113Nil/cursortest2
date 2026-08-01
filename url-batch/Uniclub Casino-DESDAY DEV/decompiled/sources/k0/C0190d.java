package k0;

import android.view.ViewGroup;

/* renamed from: k0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190d extends n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2782a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f2783b;

    public C0190d(ViewGroup viewGroup) {
        this.f2783b = viewGroup;
    }

    @Override // k0.n, k0.k
    public final void a() {
        i1.r.i(this.f2783b, false);
    }

    @Override // k0.k
    public final void b(m mVar) {
        if (!this.f2782a) {
            i1.r.i(this.f2783b, false);
        }
        mVar.x(this);
    }

    @Override // k0.n, k0.k
    public final void c() {
        i1.r.i(this.f2783b, true);
    }

    @Override // k0.n, k0.k
    public final void e(m mVar) {
        i1.r.i(this.f2783b, false);
        this.f2782a = true;
    }
}
