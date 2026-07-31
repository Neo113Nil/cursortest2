package com.ogury.ad.internal;

import android.webkit.WebView;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class x4 implements ri {
    public final y7 a;
    public final b b;
    public v4 c;
    public final Pattern d;
    public boolean e;

    public x4(b ad, y7 webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.a = webView;
        this.b = ad;
        Pattern compile = Pattern.compile(ad.u);
        this.d = compile;
        webView.setClientAdapter(new w4(this, compile));
    }

    @Override // com.ogury.ad.internal.ri
    public final void a(v4 loadCallback, int i) {
        Intrinsics.checkNotNullParameter(loadCallback, "loadCallback");
        this.c = loadCallback;
        if (this.b.t) {
            this.a.getSettings().setJavaScriptEnabled(false);
        }
        this.a.loadUrl(this.b.s);
    }

    @Override // com.ogury.ad.internal.ri
    public final void destroy() {
        this.c = null;
        y7 y7Var = this.a;
        Pattern whitelistPattern = this.d;
        Intrinsics.checkNotNullExpressionValue(whitelistPattern, "whitelistPattern");
        y7Var.setClientAdapter(new u1(whitelistPattern));
        this.a.setDestroyed(true);
        zi.a((WebView) this.a);
    }

    @Override // com.ogury.ad.internal.ri
    public final boolean a() {
        return this.e;
    }
}
