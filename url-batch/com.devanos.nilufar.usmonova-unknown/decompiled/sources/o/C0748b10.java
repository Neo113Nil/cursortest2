package o;

import android.view.WindowInsets;

/* renamed from: o.b10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0748b10 extends AbstractC0682a10 {
    public C0644Ys m;

    public C0748b10(C1142h10 c1142h10, WindowInsets windowInsets) {
        super(c1142h10, windowInsets);
        this.m = null;
    }

    @Override // o.C1010f10
    public C1142h10 b() {
        return C1142h10.c(this.c.consumeStableInsets(), null);
    }

    @Override // o.C1010f10
    public C1142h10 c() {
        return C1142h10.c(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // o.C1010f10
    public final C0644Ys g() {
        if (this.m == null) {
            WindowInsets windowInsets = this.c;
            this.m = C0644Ys.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.m;
    }

    @Override // o.C1010f10
    public boolean l() {
        return this.c.isConsumed();
    }

    @Override // o.C1010f10
    public void q(C0644Ys c0644Ys) {
        this.m = c0644Ys;
    }
}
