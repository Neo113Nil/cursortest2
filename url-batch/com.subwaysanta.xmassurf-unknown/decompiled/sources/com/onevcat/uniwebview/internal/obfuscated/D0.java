package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class D0 extends Lambda implements Function1 {
    public static final D0 a = new D0();

    public D0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        C0092z c0092z = it.v;
        C0092z c0092z2 = c0092z.d.i;
        return Boolean.valueOf((c0092z2 != null ? c0092z2.canGoForward() : false) || c0092z.canGoForward());
    }
}
