package com.ogury.ad.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class q6 extends FunctionReferenceImpl implements Function0 {
    public q6(t6 t6Var) {
        super(0, t6Var, t6.class, "pauseAd", "pauseAd()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        ((t6) this.receiver).d();
        return Unit.INSTANCE;
    }
}
