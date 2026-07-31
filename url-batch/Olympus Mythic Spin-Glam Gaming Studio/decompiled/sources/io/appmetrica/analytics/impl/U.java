package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes15.dex */
public final class U extends Lambda implements Function0 {
    public final /* synthetic */ W a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(W w) {
        super(0);
        this.a = w;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        W w = this.a;
        K k = w.g;
        Context context = w.a;
        k.getClass();
        return K.a(new I(k, context));
    }
}
