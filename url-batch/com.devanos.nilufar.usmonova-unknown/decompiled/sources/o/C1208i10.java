package o;

import android.view.View;
import android.view.Window;

/* renamed from: o.i10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1208i10 extends PO {
    public final Window a;

    public C1208i10(Window window) {
        this.a = window;
    }

    @Override // o.PO
    public final void l(boolean z) {
        Window window = this.a;
        if (!z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
