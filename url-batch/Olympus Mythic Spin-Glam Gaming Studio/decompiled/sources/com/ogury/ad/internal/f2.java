package com.ogury.ad.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class f2 implements x7 {
    public static final f2 b = new f2(new x7[0]);
    public final x7[] a;

    public f2(x7[] mraidUrlHandlers) {
        Intrinsics.checkNotNullParameter(mraidUrlHandlers, "mraidUrlHandlers");
        this.a = mraidUrlHandlers;
    }

    @Override // com.ogury.ad.internal.x7
    public final boolean a(String url, y7 webView, b ad) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(ad, "ad");
        for (x7 x7Var : this.a) {
            if (x7Var.a(url, webView, ad)) {
                return true;
            }
        }
        return false;
    }
}
