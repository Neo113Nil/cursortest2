package yads;

import android.webkit.WebView;

/* loaded from: classes6.dex */
public final class cv3 implements Runnable {
    public final WebView b;

    public cv3(gv3 gv3Var) {
        this.b = gv3Var.g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.destroy();
    }
}
