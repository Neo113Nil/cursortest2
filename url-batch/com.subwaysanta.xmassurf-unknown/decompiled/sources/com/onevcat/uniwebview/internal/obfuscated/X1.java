package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class X1 extends Lambda implements Function0 {
    public final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X1(boolean z) {
        super(0);
        this.a = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AbstractC0089y.c = this.a;
        return Unit.INSTANCE;
    }
}
