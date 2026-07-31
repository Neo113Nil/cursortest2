package com.ogury.ad.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class la extends Lambda implements Function1 {
    public final /* synthetic */ oa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(oa oaVar) {
        super(1);
        this.a = oaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        df it = (df) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        this.a.a(it.d, it.e);
        return Unit.INSTANCE;
    }
}
