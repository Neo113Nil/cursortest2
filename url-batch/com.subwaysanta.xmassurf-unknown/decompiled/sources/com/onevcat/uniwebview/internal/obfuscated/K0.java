package com.onevcat.uniwebview.internal.obfuscated;

import android.graphics.Rect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class K0 extends Lambda implements Function1 {
    public final /* synthetic */ Rect a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(Rect rect) {
        super(1);
        this.a = rect;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0031h0 it = (C0031h0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        Rect rect = this.a;
        if (it.y.getHeight() > 0 && it.y.getWidth() > 0) {
            it.o = it.a(rect);
        }
        return Unit.INSTANCE;
    }
}
