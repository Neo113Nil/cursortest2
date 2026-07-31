package yads;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* loaded from: classes3.dex */
public final class qy implements p01 {
    public final p01[] a;

    public qy(p01... p01VarArr) {
        this.a = p01VarArr;
    }

    @Override // yads.p01
    public final WebResourceResponse a(WebView webView, WebResourceRequest webResourceRequest) {
        for (p01 p01Var : this.a) {
            WebResourceResponse a = p01Var.a(webView, webResourceRequest);
            if (a != null) {
                return a;
            }
        }
        return null;
    }
}
