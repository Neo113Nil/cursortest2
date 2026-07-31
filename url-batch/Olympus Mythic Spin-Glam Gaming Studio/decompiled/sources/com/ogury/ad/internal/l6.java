package com.ogury.ad.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes8.dex */
public final /* synthetic */ class l6 extends FunctionReferenceImpl implements Function0 {
    public l6(t6 t6Var) {
        super(0, t6Var, t6.class, "closeAd", "closeAd()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        t6 t6Var = (t6) this.receiver;
        t6Var.B.a(t6Var.f, t6Var);
        return Unit.INSTANCE;
    }
}
