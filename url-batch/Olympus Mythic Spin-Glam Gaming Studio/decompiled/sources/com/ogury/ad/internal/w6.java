package com.ogury.ad.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class w6 {
    public final y7 a;

    public w6(y7 webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.a = webView;
    }

    public final void a(d adExposure) {
        Intrinsics.checkNotNullParameter(adExposure, "adExposure");
        b8.a(this.a, x6.a(adExposure));
        if (adExposure.c < 50.0f) {
            b8.a(this.a, x6.a(false));
            return;
        }
        y7 y7Var = this.a;
        if (y7Var.l) {
            return;
        }
        b8.a(y7Var, x6.a(true));
    }
}
