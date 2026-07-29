package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class W0 extends Lambda implements Function0 {
    public final /* synthetic */ U a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(U u) {
        super(0);
        this.a = u;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Unity method channel does not exist when invoking. Check implementation. Method: " + this.a;
    }
}
