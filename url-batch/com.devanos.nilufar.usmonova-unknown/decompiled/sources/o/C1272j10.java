package o;

import android.view.View;
import android.view.Window;

/* renamed from: o.j10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1272j10 extends C1208i10 {
    @Override // o.PO
    public final void k(boolean z) {
        Window window = this.a;
        if (!z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }
}
