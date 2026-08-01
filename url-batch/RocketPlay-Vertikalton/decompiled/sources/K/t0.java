package K;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class t0 extends s0 {

    /* renamed from: m, reason: collision with root package name */
    public C.d f713m;

    public t0(z0 z0Var, WindowInsets windowInsets) {
        super(z0Var, windowInsets);
        this.f713m = null;
    }

    @Override // K.x0
    public z0 b() {
        return z0.g(null, this.f709c.consumeStableInsets());
    }

    @Override // K.x0
    public z0 c() {
        return z0.g(null, this.f709c.consumeSystemWindowInsets());
    }

    @Override // K.x0
    public final C.d h() {
        if (this.f713m == null) {
            WindowInsets windowInsets = this.f709c;
            this.f713m = C.d.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f713m;
    }

    @Override // K.x0
    public boolean m() {
        return this.f709c.isConsumed();
    }

    @Override // K.x0
    public void q(C.d dVar) {
        this.f713m = dVar;
    }
}
