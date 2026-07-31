package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final /* synthetic */ class Q extends FunctionReferenceImpl implements Function0 {
    public Q(Object obj) {
        super(0, obj, U.class, "calculateMetrics", "calculateMetrics()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        U u = (U) this.receiver;
        u.getClass();
        u.n = AbstractC4002fj.d.get();
        ExecutorC4101jc executorC4101jc = (ExecutorC4101jc) AbstractC4437w6.e.getValue();
        O runnable = u.m;
        executorC4101jc.getClass();
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        executorC4101jc.a.postAtFrontOfQueue(runnable);
        return Unit.INSTANCE;
    }
}
