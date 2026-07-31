package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes10.dex */
public final class E7 implements FlowCollector {
    public final /* synthetic */ FlowCollector a;

    public E7(FlowCollector flowCollector) {
        this.a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        D7 d7;
        int i;
        if (continuation instanceof D7) {
            d7 = (D7) continuation;
            int i2 = d7.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d7.b = i2 - Integer.MIN_VALUE;
                Object obj2 = d7.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = d7.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.a;
                    if (((AbstractC4295qm) obj) instanceof C4243om) {
                        d7.b = 1;
                        if (flowCollector.emit(obj, d7) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }
        d7 = new D7(this, continuation);
        Object obj22 = d7.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = d7.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
