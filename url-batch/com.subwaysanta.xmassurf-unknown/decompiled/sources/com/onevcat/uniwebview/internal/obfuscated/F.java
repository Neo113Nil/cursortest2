package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class F extends Lambda implements Function0 {
    public final /* synthetic */ C0092z a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(C0092z c0092z) {
        super(0);
        this.a = c0092z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "Enabling channel messaging for webview: " + this.a.getName();
    }
}
