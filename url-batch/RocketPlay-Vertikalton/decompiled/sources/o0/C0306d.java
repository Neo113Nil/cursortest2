package o0;

import a1.AbstractC0067d;
import android.view.ViewGroup;

/* renamed from: o0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306d extends n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3639a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f3640b;

    public C0306d(ViewGroup viewGroup) {
        this.f3640b = viewGroup;
    }

    @Override // o0.n, o0.k
    public final void a() {
        AbstractC0067d.u(this.f3640b, false);
    }

    @Override // o0.n, o0.k
    public final void c(m mVar) {
        AbstractC0067d.u(this.f3640b, false);
        this.f3639a = true;
    }

    @Override // o0.k
    public final void d(m mVar) {
        if (!this.f3639a) {
            AbstractC0067d.u(this.f3640b, false);
        }
        mVar.x(this);
    }

    @Override // o0.n, o0.k
    public final void e() {
        AbstractC0067d.u(this.f3640b, true);
    }
}
