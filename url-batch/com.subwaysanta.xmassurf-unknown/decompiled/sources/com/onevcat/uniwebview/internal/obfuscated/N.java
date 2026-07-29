package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class N extends Lambda implements Function0 {
    public final /* synthetic */ Exception a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Exception exc) {
        super(0);
        this.a = exc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Failed to process sync channel message: " + this.a.getMessage();
    }
}
