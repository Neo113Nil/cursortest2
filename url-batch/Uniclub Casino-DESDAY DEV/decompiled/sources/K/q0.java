package K;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class q0 extends p0 {

    /* renamed from: m, reason: collision with root package name */
    public C.c f435m;

    public q0(w0 w0Var, WindowInsets windowInsets) {
        super(w0Var, windowInsets);
        this.f435m = null;
    }

    @Override // K.u0
    public w0 b() {
        return w0.g(null, this.f429c.consumeStableInsets());
    }

    @Override // K.u0
    public w0 c() {
        return w0.g(null, this.f429c.consumeSystemWindowInsets());
    }

    @Override // K.u0
    public final C.c h() {
        if (this.f435m == null) {
            WindowInsets windowInsets = this.f429c;
            this.f435m = C.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f435m;
    }

    @Override // K.u0
    public boolean m() {
        return this.f429c.isConsumed();
    }

    @Override // K.u0
    public void q(C.c cVar) {
        this.f435m = cVar;
    }
}
