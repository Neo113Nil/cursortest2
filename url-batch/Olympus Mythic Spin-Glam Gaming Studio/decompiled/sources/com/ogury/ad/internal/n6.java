package com.ogury.ad.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class n6 extends FunctionReferenceImpl implements Function0 {
    public n6(t6 t6Var) {
        super(0, t6Var, t6.class, "resumeAd", "resumeAd()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        ((t6) this.receiver).e();
        return Unit.INSTANCE;
    }
}
