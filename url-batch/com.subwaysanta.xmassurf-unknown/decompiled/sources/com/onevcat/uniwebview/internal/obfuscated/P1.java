package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class P1 extends Lambda implements Function1 {
    public final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P1(boolean z) {
        super(1);
        this.a = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z = this.a;
        it.y.removeView(it.w);
        if (z) {
            it.y.addView(it.w, 0);
        } else {
            it.y.addView(it.w);
        }
        return Unit.INSTANCE;
    }
}
