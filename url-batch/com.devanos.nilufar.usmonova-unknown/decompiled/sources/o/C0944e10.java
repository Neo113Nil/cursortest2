package o;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: o.e10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0944e10 extends C0879d10 {
    public static final C1142h10 q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        q = C1142h10.c(windowInsets, null);
    }

    public C0944e10(C1142h10 c1142h10, WindowInsets windowInsets) {
        super(c1142h10, windowInsets);
    }

    @Override // o.AbstractC0682a10, o.C1010f10
    public boolean n(int i) {
        boolean isVisible;
        isVisible = this.c.isVisible(AbstractC1076g10.a(i));
        return isVisible;
    }

    @Override // o.AbstractC0682a10, o.C1010f10
    public final void d(View view) {
    }
}
