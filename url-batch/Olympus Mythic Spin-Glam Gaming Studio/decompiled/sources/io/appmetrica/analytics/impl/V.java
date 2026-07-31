package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes15.dex */
public final class V extends Lambda implements Function0 {
    public final /* synthetic */ W a;
    public final /* synthetic */ Ui b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(W w, C5241bo c5241bo) {
        super(0);
        this.a = w;
        this.b = c5241bo;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        W w = this.a;
        K k = w.h;
        Context context = w.a;
        Ui ui = this.b;
        k.getClass();
        return K.a(new J(k, context, ui));
    }
}
