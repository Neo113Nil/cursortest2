package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0083w extends Lambda implements Function0 {
    public final /* synthetic */ C0092z a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0083w(C0092z c0092z) {
        super(0);
        this.a = c0092z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.a.get_webClient$uniwebview_release().g;
    }
}
