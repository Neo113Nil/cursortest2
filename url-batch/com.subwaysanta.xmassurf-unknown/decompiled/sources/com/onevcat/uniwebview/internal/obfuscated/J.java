package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class J extends Lambda implements Function0 {
    public final /* synthetic */ V a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(V v) {
        super(0);
        this.a = v;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Channel method invoked with result: " + this.a;
    }
}
