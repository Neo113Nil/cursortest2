package com.ogury.ad.internal;

import android.webkit.WebView;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class d8 extends z7 {
    public String a = "";
    public boolean b;
    public final /* synthetic */ e8 c;
    public final /* synthetic */ y7 d;

    public d8(e8 e8Var, y7 y7Var) {
        this.c = e8Var;
        this.d = y7Var;
    }

    @Override // com.ogury.ad.internal.z7
    public final void a(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        e8 e8Var = this.c;
        String str = this.a;
        xi xiVar = (xi) e8Var.c.get(w1.a(view));
        if (xiVar != null && !xiVar.f && e8Var.a.j.length() > 0 && e8Var.k.matcher(url).matches()) {
            g5 g5Var = g5.a;
            b bVar = e8Var.a;
            g5.a(new e(bVar, str, bVar.j, url));
            xiVar.f = true;
        }
    }

    @Override // com.ogury.ad.internal.z7
    public final void b(WebView webView, String url) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(url, "url");
        e8 e8Var = this.c;
        boolean z3 = this.b;
        f8 f8Var = e8Var.e;
        Iterator it = e8Var.b.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((y7) it.next()).canGoForward()) {
                z = true;
                break;
            }
        }
        Iterator it2 = e8Var.b.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            } else if (((y7) it2.next()).canGoBack()) {
                z2 = true;
                break;
            }
        }
        String webViewId = w1.a(webView);
        String title = webView.getTitle();
        String str = "finished";
        Intrinsics.checkNotNullParameter("finished", "event");
        Intrinsics.checkNotNullParameter(webViewId, "webViewId");
        Intrinsics.checkNotNullParameter(url, "url");
        ArrayList a = f8Var.a();
        int size = a.size();
        int i = 0;
        while (i < size) {
            b8.a((y7) a.get(i), x6.a(str, z, z2, webViewId, url, title));
            i++;
            size = size;
            a = a;
            str = str;
        }
        xi xiVar = (xi) e8Var.c.get(w1.a(webView));
        if (xiVar != null) {
            boolean z4 = !(xiVar.e && Intrinsics.areEqual(xiVar.c, url)) && xiVar.a;
            if (z3 && z4 && e8Var.a.j.length() == 0) {
                g5 g5Var = g5.a;
                g5.a(new e(e8Var.a, url, null, null));
            }
            xiVar.e = true;
        }
        this.b = false;
    }

    @Override // com.ogury.ad.internal.z7
    public final void c(WebView webView, String url) {
        int i;
        boolean z;
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(url, "url");
        this.a = url;
        boolean z2 = true;
        this.b = true;
        e8 e8Var = this.c;
        f8 f8Var = e8Var.e;
        Iterator it = e8Var.b.values().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((y7) it.next()).canGoForward()) {
                z = true;
                break;
            }
        }
        Iterator it2 = e8Var.b.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            } else if (((y7) it2.next()).canGoBack()) {
                break;
            }
        }
        String webViewId = w1.a(webView);
        Intrinsics.checkNotNullParameter(X3.i.d0, "event");
        Intrinsics.checkNotNullParameter(webViewId, "webViewId");
        Intrinsics.checkNotNullParameter(url, "url");
        ArrayList a = f8Var.a();
        int size = a.size();
        while (i < size) {
            Object obj = a.get(i);
            i++;
            b8.a((y7) obj, x6.a(X3.i.d0, z, z2, webViewId, url, ""));
        }
    }

    @Override // com.ogury.ad.internal.z7
    public final boolean d(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        return false;
    }

    @Override // com.ogury.ad.internal.z7
    public final void b(y7 webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        xi xiVar = (xi) this.c.c.get(w1.a((WebView) webView));
        if (xiVar != null) {
            xiVar.d = true;
        }
        y7 webView2 = this.d;
        t7 t7Var = webView2.p;
        t7Var.getClass();
        Intrinsics.checkNotNullParameter(webView2, "webView");
        t7Var.a.a(webView2.getMraidCommandExecutor());
    }
}
