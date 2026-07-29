package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class G extends Lambda implements Function0 {
    public final /* synthetic */ C0092z a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C0092z c0092z) {
        super(0);
        this.a = c0092z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Injecting channel message bridge script for: " + this.a.getName();
    }
}
