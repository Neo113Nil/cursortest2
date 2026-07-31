package com.ogury.ad.internal;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class l9 extends Lambda implements Function0 {
    public final /* synthetic */ n9 a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(n9 n9Var, Context context) {
        super(0);
        this.a = n9Var;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return this.a.c.a(this.b).b();
    }
}
