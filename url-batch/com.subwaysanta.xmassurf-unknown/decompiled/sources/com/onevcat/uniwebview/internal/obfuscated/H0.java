package com.onevcat.uniwebview.internal.obfuscated;

import android.webkit.WebBackForwardList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class H0 extends Lambda implements Function1 {
    public static final H0 a = new H0();

    public H0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        WebBackForwardList copyBackForwardList = it.v.copyBackForwardList();
        Intrinsics.checkNotNullExpressionValue(copyBackForwardList, "it.webView.copyBackForwardList()");
        return AbstractC0022f.a(copyBackForwardList);
    }
}
