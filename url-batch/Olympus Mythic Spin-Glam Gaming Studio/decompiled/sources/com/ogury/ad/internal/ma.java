package com.ogury.ad.internal;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class ma extends Lambda implements Function1 {
    public final /* synthetic */ oa a;
    public final /* synthetic */ Activity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(oa oaVar, Activity activity) {
        super(1);
        this.a = oaVar;
        this.b = activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        df it = (df) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        this.a.a(this.b, new bb(it.a, it.b, it.c));
        return Unit.INSTANCE;
    }
}
