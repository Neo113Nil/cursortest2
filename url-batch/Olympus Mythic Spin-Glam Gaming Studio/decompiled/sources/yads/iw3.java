package yads;

import android.webkit.WebView;

/* loaded from: classes10.dex */
public final class iw3 implements Runnable {
    public final /* synthetic */ WebView b;
    public final /* synthetic */ String c;
    public final /* synthetic */ kw3 d;

    public iw3(kw3 kw3Var, WebView webView, String str) {
        this.d = kw3Var;
        this.b = webView;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kw3 kw3Var = this.d;
        WebView webView = this.b;
        String str = this.c;
        kw3Var.getClass();
        kw3.a(webView, str);
    }
}
