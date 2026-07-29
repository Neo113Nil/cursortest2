package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class Q0 extends Lambda implements Function1 {
    public static final Q0 a = new Q0();

    public Q0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        C0092z c0092z = it.v;
        C0092z c0092z2 = c0092z.d.i;
        if (c0092z2 != null) {
            if (c0092z2.canGoForward()) {
                c0092z2.goForward();
            }
        } else if (c0092z.canGoForward()) {
            c0092z.goForward();
        }
        return Unit.INSTANCE;
    }
}
