package com.yandex.div.core.timer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: TimerController.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class TimerController$ticker$1 extends FunctionReferenceImpl implements Function1 {
    TimerController$ticker$1(Object obj) {
        super(1, obj, TimerController.class, "updateTimerVariable", "updateTimerVariable(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long j) {
        ((TimerController) this.receiver).updateTimerVariable(j);
    }
}
