package com.ogury.ad.internal;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class u6 {
    public final WeakReference a;
    public final y7 b;
    public final b c;
    public final long d;

    public u6(WeakReference oguryAdGatewayRef, y7 webView, b ad) {
        long currentTimeMillis = System.currentTimeMillis();
        Intrinsics.checkNotNullParameter(oguryAdGatewayRef, "oguryAdGatewayRef");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.a = oguryAdGatewayRef;
        this.b = webView;
        this.c = ad;
        this.d = currentTimeMillis;
    }
}
