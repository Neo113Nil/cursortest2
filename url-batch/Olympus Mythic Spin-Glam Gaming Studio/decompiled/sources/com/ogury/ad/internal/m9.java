package com.ogury.ad.internal;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class m9 extends Lambda implements Function1 {
    public final /* synthetic */ n9 a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(n9 n9Var, Context context) {
        super(1);
        this.a = n9Var;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        pf it = (pf) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        this.a.a(it, this.b);
        return Unit.INSTANCE;
    }
}
